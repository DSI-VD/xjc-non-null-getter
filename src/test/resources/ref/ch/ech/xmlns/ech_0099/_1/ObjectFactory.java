
package ch.ech.xmlns.ech_0099._1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.ech.xmlns.ech_0099._1 package. 
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

    private static final QName _ValidationReport_QNAME = new QName("http://www.ech.ch/xmlns/eCH-0099/1", "validationReport");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.ech.xmlns.ech_0099._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ValidationReportType }
     * 
     * @return
     *     the new instance of {@link ValidationReportType }
     */
    public ValidationReportType createValidationReportType() {
        return new ValidationReportType();
    }

    /**
     * Create an instance of {@link Delivery }
     * 
     * @return
     *     the new instance of {@link Delivery }
     */
    public Delivery createDelivery() {
        return new Delivery();
    }

    /**
     * Create an instance of {@link Receipt }
     * 
     * @return
     *     the new instance of {@link Receipt }
     */
    public Receipt createReceipt() {
        return new Receipt();
    }

    /**
     * Create an instance of {@link ErrorInfoType }
     * 
     * @return
     *     the new instance of {@link ErrorInfoType }
     */
    public ErrorInfoType createErrorInfoType() {
        return new ErrorInfoType();
    }

    /**
     * Create an instance of {@link ValidationReportType.PersonError }
     * 
     * @return
     *     the new instance of {@link ValidationReportType.PersonError }
     */
    public ValidationReportType.PersonError createValidationReportTypePersonError() {
        return new ValidationReportType.PersonError();
    }

    /**
     * Create an instance of {@link ValidationReportType.EgidAttribution }
     * 
     * @return
     *     the new instance of {@link ValidationReportType.EgidAttribution }
     */
    public ValidationReportType.EgidAttribution createValidationReportTypeEgidAttribution() {
        return new ValidationReportType.EgidAttribution();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationReportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidationReportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ech.ch/xmlns/eCH-0099/1", name = "validationReport")
    public JAXBElement<ValidationReportType> createValidationReport(ValidationReportType value) {
        return new JAXBElement<>(_ValidationReport_QNAME, ValidationReportType.class, null, value);
    }

}
