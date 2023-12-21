
package ch.ech.xmlns.ech_0008._2;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.ech.xmlns.ech_0008._2 package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.ech.xmlns.ech_0008._2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountryRoot }
     * 
     * @return
     *     the new instance of {@link CountryRoot }
     */
    public CountryRoot createCountryRoot() {
        return new CountryRoot();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     * @return
     *     the new instance of {@link CountryType }
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link CountryShortType }
     * 
     * @return
     *     the new instance of {@link CountryShortType }
     */
    public CountryShortType createCountryShortType() {
        return new CountryShortType();
    }

}
