
package com.tibco.bw.palette.zendesk.runtime.pojo.gettickets;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tibco.bw.palette.zendesk.runtime.pojo.gettickets package. 
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

    private final static QName _ActivityInput_QNAME = new QName("http://www.example.org/GetTickets", "ActivityInput");
    private final static QName _ActivityOutput_QNAME = new QName("http://www.example.org/GetTickets", "ActivityOutput");
    private final static QName _TicketTypeType_QNAME = new QName("", "Type");
    private final static QName _TicketTypeCustomFields_QNAME = new QName("", "CustomFields");
    private final static QName _TicketTypePriority_QNAME = new QName("", "Priority");
    private final static QName _TicketTypeCollaborators_QNAME = new QName("", "Collaborators");
    private final static QName _TicketTypeTags_QNAME = new QName("", "Tags");
    private final static QName _CCTypeEmail_QNAME = new QName("", "Email");
    private final static QName _CCTypeName_QNAME = new QName("", "Name");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tibco.bw.palette.zendesk.runtime.pojo.gettickets
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
     * Create an instance of {@link TicketIdsType }
     * 
     */
    public TicketIdsType createTicketIdsType() {
        return new TicketIdsType();
    }

    /**
     * Create an instance of {@link TicketType }
     * 
     */
    public TicketType createTicketType() {
        return new TicketType();
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
    @XmlElementDecl(namespace = "http://www.example.org/GetTickets", name = "ActivityInput")
    public JAXBElement<ActivityInputType> createActivityInput(ActivityInputType value) {
        return new JAXBElement<ActivityInputType>(_ActivityInput_QNAME, ActivityInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActivityOutputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/GetTickets", name = "ActivityOutput")
    public JAXBElement<ActivityOutputType> createActivityOutput(ActivityOutputType value) {
        return new JAXBElement<ActivityOutputType>(_ActivityOutput_QNAME, ActivityOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Type", scope = TicketType.class)
    public JAXBElement<String> createTicketTypeType(String value) {
        return new JAXBElement<String>(_TicketTypeType_QNAME, String.class, TicketType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomFieldType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CustomFields", scope = TicketType.class)
    public JAXBElement<CustomFieldType> createTicketTypeCustomFields(CustomFieldType value) {
        return new JAXBElement<CustomFieldType>(_TicketTypeCustomFields_QNAME, CustomFieldType.class, TicketType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Priority", scope = TicketType.class)
    public JAXBElement<String> createTicketTypePriority(String value) {
        return new JAXBElement<String>(_TicketTypePriority_QNAME, String.class, TicketType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CollaboratorsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Collaborators", scope = TicketType.class)
    public JAXBElement<CollaboratorsType> createTicketTypeCollaborators(CollaboratorsType value) {
        return new JAXBElement<CollaboratorsType>(_TicketTypeCollaborators_QNAME, CollaboratorsType.class, TicketType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TagsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Tags", scope = TicketType.class)
    public JAXBElement<TagsType> createTicketTypeTags(TagsType value) {
        return new JAXBElement<TagsType>(_TicketTypeTags_QNAME, TagsType.class, TicketType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email", scope = CCType.class)
    public JAXBElement<String> createCCTypeEmail(String value) {
        return new JAXBElement<String>(_CCTypeEmail_QNAME, String.class, CCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name", scope = CCType.class)
    public JAXBElement<String> createCCTypeName(String value) {
        return new JAXBElement<String>(_CCTypeName_QNAME, String.class, CCType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Email", scope = RequesterType.class)
    public JAXBElement<String> createRequesterTypeEmail(String value) {
        return new JAXBElement<String>(_CCTypeEmail_QNAME, String.class, RequesterType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Name", scope = RequesterType.class)
    public JAXBElement<String> createRequesterTypeName(String value) {
        return new JAXBElement<String>(_CCTypeName_QNAME, String.class, RequesterType.class, value);
    }

}
