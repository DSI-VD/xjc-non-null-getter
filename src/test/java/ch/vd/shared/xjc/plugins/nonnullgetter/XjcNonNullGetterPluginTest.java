package ch.vd.shared.xjc.plugins.nonnullgetter;

import com.sun.tools.xjc.Driver;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.text.MessageFormat;


public class XjcNonNullGetterPluginTest {

    /*
Extensions:
  -XNonNullGetter-api        :  non null getter api for generated code
  -Xlocator          :  enable source location support for generated code
  -Xsync-methods     :  generate accessor methods with the 'synchronized' keyword
  -mark-generated    :  mark the generated code as @javax.annotation.Generated
  -episode <FILE>    :  generate the episode file for separate compilation
     */

    @Test
    public void test() throws Throwable {

        final String dir = "target/jaxbResult";
        new File(dir).mkdirs();

        String basePath = "src/test/resources";

        String[] argsDef = new String[] {
                "-httpproxy", "webproxy.vd.ch:8080",
                "-XNonNullGetter-api",
                "-catalog", "{0}/schemas/ech-catalog.xml",
                "-b", "{0}/binding.xjb",
                "-extension",
                "-no-header",
                "-d", dir,

            "{0}/schemas/eCH-0099/1/eCH-0099-1-1.xsd"
        };

        String[] args = new String[argsDef.length];
        for (int i = 0; i < argsDef.length; ++i) {
            args[i] = MessageFormat.format(argsDef[i], basePath);
        }

        File testResultDir = new File(dir);
        boolean ok = deleteTree(testResultDir, false);
        Assert.assertTrue(ok);

        Driver.run(args, System.out, System.out);

        compareTree(testResultDir, new File("src/test/resources/ref"));
    }

    private boolean deleteTree(File aRoot, boolean aDeleteRoot) {
        boolean ok = true;
        File[] listFiles = aRoot.listFiles();
        if (null != listFiles) {
            for (File file : listFiles) {
                if (!".svn".equals(file.getName())) {
                    ok &= deleteTree(file, true);
                }
            }
        }
        if (ok && aDeleteRoot) {
            ok &= aRoot.delete();
        }
        return ok;
    }

    private static final FileFilter fileFilter = new FileFilter() {
        public boolean accept(File aPathname) {
            return (    !".svn".equals(aPathname.getName())
                     && !"ObjectFactory.java".equals(aPathname.getName()));
        }
    };

    private void compareTree(File aRoot, File aRefRoot) {

        File[] listFiles = aRoot.listFiles(fileFilter);
        File[] listRef = aRefRoot.listFiles(fileFilter);

        Assert.assertEquals(aRoot.getName(), listFiles.length, listRef.length);

        for (File file : listFiles) {
            File refFile = findFile(listRef, file);
            Assert.assertNotNull(file.getName(), refFile);
            compare(file, refFile);
        }
    }

    private void compare(File aFile, File aRefFile) {
        if (aFile.isDirectory() && aRefFile.isDirectory()) {
            compareTree(aFile, aRefFile);
        } else if (aFile.isFile() && aRefFile.isFile()) {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(
                        new FileInputStream(aFile), "UTF-8"));
                BufferedReader refReader = new BufferedReader(new InputStreamReader(
                        new FileInputStream(aRefFile), "UTF-8"));
                String line = null;
                String refLine = null;
                do {
                    line = reader.readLine();
                    refLine = refReader.readLine();
                    Assert.assertTrue(aFile.getName(), (null == line) == (null == refLine));
                    if (null != line) {
                        if (line.startsWith("// Generated on: ")) {
                            Assert.assertTrue(refLine.startsWith("// Generated on: "));
                        } else {
                            Assert.assertEquals(aFile.getName(), refLine, line);
                        }
                    }
                } while (null != line);
            } catch (Exception e) {
                e.printStackTrace();
                Assert.fail(aFile.getName());
            }
        } else {
            Assert.fail(aFile.getName());
        }
    }

    private File findFile(File[] aRefFiles, File aModel) {
        File found = null;
        for (int i = 0; (null == found) && (i < aRefFiles.length); ++i) {
            found = aRefFiles[i];
            if (    !found.getName().equals(aModel.getName())
                 || (found.isDirectory() != aModel.isDirectory())
                 || (found.isFile() != aModel.isFile())) {
                found = null;
            }
        }
        return found;
    }
}
