[![Build Status](https://travis-ci.org/dsi-vd/xjc-non-null-getter.svg?branch=master)](https://travis-ci.org/dsi-vd/xjc-non-null-getter)

# xjc-non-null-getter

Maven JAXB2 Plugin that adds getters, creating the corresponding object, and adding it to the attribute if null.

It requires Java 17.

## Usage in maven pom.xml

In pom.xml, add the plugin:
```xml
<plugin>
    <groupId>org.jvnet.jaxb</groupId>
    <artifactId>jaxb-maven-plugin</artifactId>
    <version>3.0.1</version>
    <configuration>
        <strict>false</strict> <!-- see https://github.com/highsource/maven-jaxb2-plugin/wiki/Catalogs-in-Strict-Mode -->
        <schemaDirectory>src/main/resources/xsd</schemaDirectory>
        <schemaIncludes>
            <include>main.xsd</include>
        </schemaIncludes>
        <catalog>src/main/resources/catalog.xml</catalog>
        <bindingDirectory>src/main/resources</bindingDirectory>
        <bindingIncludes>
            <include>bindings.xml</include>
        </bindingIncludes>
        <args>
            <arg>-extension</arg>
            <arg>-Xvalue-constructor</arg>
            <arg>-XNonNullGetter-api</arg>
        </args>
    </configuration>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
        </execution>
    </executions>
    <dependencies>
        <dependency>
            <groupId>org.jvnet.jaxb</groupId>
            <artifactId>jaxb-plugins</artifactId>
            <version>${jaxb-plugins.version}</version>
        </dependency>
        <dependency>
            <groupId>ch.dsivd.jaxb-plugins</groupId>
            <artifactId>xjc-non-null-getter</artifactId>
            <version>${xjc-non-null-getter.version}</version>
        </dependency>
    </dependencies>
</plugin>
```

## Usage in Java code

```java
TheBean tb = new TheBean();
// empty list
List<ThePerson> people = tb.getPersons();
// creates a ThePerson instance and adds it to the people list
ThePerson person = tb.person();
// Get address Entity, creates it if null
person.address().setStreet("Over there 3");
person.address().setTown("Los Angeles");
person.address().setZipCode(12345);
```

## Configuring Maven to push to Maven Central

Create a user Token in oss.sonatype.org
Go to

User -> Profile -> User token -> Generate


Add this config in $HOME/.m2/settings.xml
```xml
    <servers>
      <server>
        <id>ossrh</id>
        <username>USER TOKEN</username>
        <password>PASSWORD TOKEN</password>
      </server>
    </servers>
```


## Releasing to Maven central

mvn release:prepare
mvn release:perform

Then to see errors:

https://oss.sonatype.org/

Login with your Sonatype JIRA account
