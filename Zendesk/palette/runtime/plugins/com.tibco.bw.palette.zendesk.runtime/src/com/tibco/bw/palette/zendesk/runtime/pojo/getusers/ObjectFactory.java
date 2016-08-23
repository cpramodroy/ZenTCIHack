
package com.tibco.bw.palette.zendesk.runtime.pojo.getusers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tibco.bw.palette.zendesk.runtime.pojo.getusers package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _ActivityOutut_QNAME = new QName("http://www.example.org/GetUsers", "ActivityOutut");
    private final static QName _ActivityInput_QNAME = new QName("http://www.example.org/GetUsers", "ActivityInput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tibco.bw.palette.zendesk.runtime.pojo.getusers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActivityOutputType }
     * 
     */
    public ActivityOutputType createActivityOutputType() {
        return new ActivityOutputType();
    }

    /**
     * Create an instance of {@link ActivityInputType }
     * 
     */
    public ActivityInputType createActivityInputType() {
        return new ActivityInputType();
    }

    /**
     * Create an instance of {@link UsersType }
     * 
     */
    public UsersType createUsersType() {
        return new UsersType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/GetUsers", name = "ActivityOutut")
    public JAXBElement<ActivityOutputType> createActivityOutut(ActivityOutputType value) {
        return new JAXBElement<ActivityOutputType>(_ActivityOutut_QNAME, ActivityOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/GetUsers", name = "ActivityInput")
    public JAXBElement<ActivityInputType> createActivityInput(ActivityInputType value) {
        return new JAXBElement<ActivityInputType>(_ActivityInput_QNAME, ActivityInputType.class, null, value);
    }

}
