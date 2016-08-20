
package com.tibco.bw.palette.zendesk.runtime.pojo.updateticket;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.tibco.bw.palette.zendesk.runtime.pojo.updateticket package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActvityInput_QNAME = new QName("http://www.example.org/UpdateTicket", "ActvityInput");
    private final static QName _ActivityOutput_QNAME = new QName("http://www.example.org/UpdateTicket", "ActivityOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tibco.bw.palette.zendesk.runtime.pojo.updateticket
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
     * Create an instance of {@link RequesterType }
     * 
     */
    public RequesterType createRequesterType() {
        return new RequesterType();
    }

    /**
     * Create an instance of {@link CCType }
     * 
     */
    public CCType createCCType() {
        return new CCType();
    }

    /**
     * Create an instance of {@link CustomFieldType }
     * 
     */
    public CustomFieldType createCustomFieldType() {
        return new CustomFieldType();
    }

    /**
     * Create an instance of {@link TagsType }
     * 
     */
    public TagsType createTagsType() {
        return new TagsType();
    }

    /**
     * Create an instance of {@link CollaboratorsType }
     * 
     */
    public CollaboratorsType createCollaboratorsType() {
        return new CollaboratorsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityInputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/UpdateTicket", name = "ActvityInput")
    public JAXBElement<ActivityInputType> createActvityInput(ActivityInputType value) {
        return new JAXBElement<ActivityInputType>(_ActvityInput_QNAME, ActivityInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityOutput }{@code >}}
     * 
     */

    @XmlElementDecl(namespace = "http://www.example.org/UpdateTicket", name = "ActivityOutput")
    public JAXBElement<ActivityOutputType> createActivityOutput(ActivityOutputType value) {
        return new JAXBElement<ActivityOutputType>(_ActivityOutput_QNAME, ActivityOutputType.class, null, value);
	}
}
