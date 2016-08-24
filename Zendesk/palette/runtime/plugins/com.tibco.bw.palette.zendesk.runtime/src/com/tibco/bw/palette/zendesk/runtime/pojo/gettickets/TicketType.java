
package com.tibco.bw.palette.zendesk.runtime.pojo.gettickets;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requester" type="{http://www.example.org/GetTickets}RequesterType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Collaborators" type="{http://www.example.org/GetTickets}CollaboratorsType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Tags" type="{http://www.example.org/GetTickets}TagsType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CustomFields" type="{http://www.example.org/GetTickets}CustomFieldType" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketType", namespace = "http://www.example.org/GetTickets", propOrder = {
    "requester",
    "subject",
    "description",
    "collaborators",
    "type",
    "priority",
    "tags",
    "customFields"
})
public class TicketType {

    @XmlElement(name = "Requester")
    protected RequesterType requester;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "Collaborators", type = JAXBElement.class, required = false)
    protected JAXBElement<CollaboratorsType> collaborators;
    @XmlElementRef(name = "Type", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;
    @XmlElementRef(name = "Priority", type = JAXBElement.class, required = false)
    protected JAXBElement<String> priority;
    @XmlElementRef(name = "Tags", type = JAXBElement.class, required = false)
    protected JAXBElement<TagsType> tags;
    @XmlElementRef(name = "CustomFields", type = JAXBElement.class, required = false)
    protected JAXBElement<CustomFieldType> customFields;

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link RequesterType }
     *     
     */
    public RequesterType getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequesterType }
     *     
     */
    public void setRequester(RequesterType value) {
        this.requester = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the collaborators property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CollaboratorsType }{@code >}
     *     
     */
    public JAXBElement<CollaboratorsType> getCollaborators() {
        return collaborators;
    }

    /**
     * Sets the value of the collaborators property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CollaboratorsType }{@code >}
     *     
     */
    public void setCollaborators(JAXBElement<CollaboratorsType> value) {
        this.collaborators = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPriority(JAXBElement<String> value) {
        this.priority = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TagsType }{@code >}
     *     
     */
    public JAXBElement<TagsType> getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TagsType }{@code >}
     *     
     */
    public void setTags(JAXBElement<TagsType> value) {
        this.tags = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CustomFieldType }{@code >}
     *     
     */
    public JAXBElement<CustomFieldType> getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CustomFieldType }{@code >}
     *     
     */
    public void setCustomFields(JAXBElement<CustomFieldType> value) {
        this.customFields = value;
    }

}
