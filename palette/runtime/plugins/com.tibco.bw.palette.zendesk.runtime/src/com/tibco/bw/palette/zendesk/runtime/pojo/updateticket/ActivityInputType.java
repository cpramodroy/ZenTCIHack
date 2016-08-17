
package com.tibco.bw.palette.zendesk.runtime.pojo.updateticket;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activityInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activityInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}long" form="unqualified"/>
 *         &lt;element name="Requester" type="{http://www.example.org/UpdateTicket}requesterType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Collaborators" type="{http://www.example.org/UpdateTicket}collaboratorsType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Type" minOccurs="0" form="unqualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Task"/>
 *               &lt;enumeration value="Problem"/>
 *               &lt;enumeration value="Incident"/>
 *               &lt;enumeration value="Question"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Priority" minOccurs="0" form="unqualified">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Low"/>
 *               &lt;enumeration value="Normal"/>
 *               &lt;enumeration value="High"/>
 *               &lt;enumeration value="Urgent"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Tags" type="{http://www.example.org/UpdateTicket}tags" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CustomFields" type="{http://www.example.org/UpdateTicket}customFieldType" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activityInputType", namespace = "http://www.example.org/UpdateTicket", propOrder = {
    "ticketId",
    "requester",
    "subject",
    "description",
    "collaborators",
    "type",
    "priority",
    "tags",
    "customFields"
})
public class ActivityInputType {

    @XmlElement(name = "TicketId")
    protected long ticketId;
    @XmlElement(name = "Requester")
    protected RequesterType requester;
    @XmlElement(name = "Subject")
    protected String subject;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Collaborators")
    protected CollaboratorsType collaborators;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "Priority")
    protected String priority;
    @XmlElement(name = "Tags")
    protected Tags tags;
    @XmlElement(name = "CustomFields")
    protected CustomFieldType customFields;

    /**
     * Gets the value of the ticketId property.
     * 
     */
    public long getTicketId() {
        return ticketId;
    }

    /**
     * Sets the value of the ticketId property.
     * 
     */
    public void setTicketId(long value) {
        this.ticketId = value;
    }

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
     *     {@link CollaboratorsType }
     *     
     */
    public CollaboratorsType getCollaborators() {
        return collaborators;
    }

    /**
     * Sets the value of the collaborators property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaboratorsType }
     *     
     */
    public void setCollaborators(CollaboratorsType value) {
        this.collaborators = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriority(String value) {
        this.priority = value;
    }

    /**
     * Gets the value of the tags property.
     * 
     * @return
     *     possible object is
     *     {@link Tags }
     *     
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tags }
     *     
     */
    public void setTags(Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the customFields property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldType }
     *     
     */
    public CustomFieldType getCustomFields() {
        return customFields;
    }

    /**
     * Sets the value of the customFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldType }
     *     
     */
    public void setCustomFields(CustomFieldType value) {
        this.customFields = value;
    }

}
