
package ch.ech.xmlns.ech_0010._3;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.ech.xmlns.ech_0010._3 package. 
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

    private static final QName _PersonMailAddress_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0010/3", "personMailAddress");
    private static final QName _OrganisationMailAdress_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0010/3", "organisationMailAdress");
    private static final QName _MailAddress_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0010/3", "mailAddress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.ech.xmlns.ech_0010._3
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PersonMailAddressType }
     * 
     * @return
     *     the new instance of {@link PersonMailAddressType }
     */
    public PersonMailAddressType createPersonMailAddressType() {
        return new PersonMailAddressType();
    }

    /**
     * Create an instance of {@link OrganisationMailAddressType }
     * 
     * @return
     *     the new instance of {@link OrganisationMailAddressType }
     */
    public OrganisationMailAddressType createOrganisationMailAddressType() {
        return new OrganisationMailAddressType();
    }

    /**
     * Create an instance of {@link MailAddressType }
     * 
     * @return
     *     the new instance of {@link MailAddressType }
     */
    public MailAddressType createMailAddressType() {
        return new MailAddressType();
    }

    /**
     * Create an instance of {@link PersonMailAddressInfoType }
     * 
     * @return
     *     the new instance of {@link PersonMailAddressInfoType }
     */
    public PersonMailAddressInfoType createPersonMailAddressInfoType() {
        return new PersonMailAddressInfoType();
    }

    /**
     * Create an instance of {@link OrganisationMailAddressInfoType }
     * 
     * @return
     *     the new instance of {@link OrganisationMailAddressInfoType }
     */
    public OrganisationMailAddressInfoType createOrganisationMailAddressInfoType() {
        return new OrganisationMailAddressInfoType();
    }

    /**
     * Create an instance of {@link AddressInformationType }
     * 
     * @return
     *     the new instance of {@link AddressInformationType }
     */
    public AddressInformationType createAddressInformationType() {
        return new AddressInformationType();
    }

    /**
     * Create an instance of {@link SwissAddressInformationType }
     * 
     * @return
     *     the new instance of {@link SwissAddressInformationType }
     */
    public SwissAddressInformationType createSwissAddressInformationType() {
        return new SwissAddressInformationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonMailAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonMailAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0010/3", name = "personMailAddress")
    public JAXBElement<PersonMailAddressType> createPersonMailAddress(PersonMailAddressType value) {
        return new JAXBElement<>(_PersonMailAddress_QNAME, PersonMailAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationMailAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationMailAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0010/3", name = "organisationMailAdress")
    public JAXBElement<OrganisationMailAddressType> createOrganisationMailAdress(OrganisationMailAddressType value) {
        return new JAXBElement<>(_OrganisationMailAdress_QNAME, OrganisationMailAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MailAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MailAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0010/3", name = "mailAddress")
    public JAXBElement<MailAddressType> createMailAddress(MailAddressType value) {
        return new JAXBElement<>(_MailAddress_QNAME, MailAddressType.class, null, value);
    }

}
