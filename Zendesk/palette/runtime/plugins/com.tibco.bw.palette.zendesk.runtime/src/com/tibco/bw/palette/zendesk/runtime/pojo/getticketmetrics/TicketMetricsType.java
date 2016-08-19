
package com.tibco.bw.palette.zendesk.runtime.pojo.getticketmetrics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TicketMetricsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketMetricsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="UpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GroupStations" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AssigneeStations" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Reopens" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Replies" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AssigneeUpdateAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="RequesterUpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="StatusUpdatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InitiallyAssignedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AssignedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="SolvedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LatestCommentAddedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FirstResolutionTimeInMinutes" type="{http://www.example.org/GetTicketMetrics}ComboMinutesType"/>
 *         &lt;element name="FullResolutionTimeInMinutes" type="{http://www.example.org/GetTicketMetrics}ComboMinutesType"/>
 *         &lt;element name="AgentWaitTimeInMinutes" type="{http://www.example.org/GetTicketMetrics}ComboMinutesType"/>
 *         &lt;element name="RequesterWaitTimeInMinutes" type="{http://www.example.org/GetTicketMetrics}ComboMinutesType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketMetricsType", namespace = "http://www.example.org/GetTicketMetrics", propOrder = {
    "id",
    "ticketId",
    "createdAt",
    "updatedAt",
    "groupStations",
    "assigneeStations",
    "reopens",
    "replies",
    "assigneeUpdateAt",
    "requesterUpdatedAt",
    "statusUpdatedAt",
    "initiallyAssignedAt",
    "assignedAt",
    "solvedAt",
    "latestCommentAddedAt",
    "firstResolutionTimeInMinutes",
    "fullResolutionTimeInMinutes",
    "agentWaitTimeInMinutes",
    "requesterWaitTimeInMinutes"
})
public class TicketMetricsType {

    @XmlElement(name = "Id", namespace = "http://www.example.org/GetTicketMetrics")
    protected long id;
    @XmlElement(name = "TicketId", namespace = "http://www.example.org/GetTicketMetrics")
    protected long ticketId;
    @XmlElement(name = "CreatedAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlElement(name = "UpdatedAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedAt;
    @XmlElement(name = "GroupStations", namespace = "http://www.example.org/GetTicketMetrics")
    protected long groupStations;
    @XmlElement(name = "AssigneeStations", namespace = "http://www.example.org/GetTicketMetrics")
    protected long assigneeStations;
    @XmlElement(name = "Reopens", namespace = "http://www.example.org/GetTicketMetrics")
    protected long reopens;
    @XmlElement(name = "Replies", namespace = "http://www.example.org/GetTicketMetrics")
    protected long replies;
    @XmlElement(name = "AssigneeUpdateAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assigneeUpdateAt;
    @XmlElement(name = "RequesterUpdatedAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requesterUpdatedAt;
    @XmlElement(name = "StatusUpdatedAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar statusUpdatedAt;
    @XmlElement(name = "InitiallyAssignedAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initiallyAssignedAt;
    @XmlElement(name = "AssignedAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar assignedAt;
    @XmlElement(name = "SolvedAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar solvedAt;
    @XmlElement(name = "LatestCommentAddedAt", namespace = "http://www.example.org/GetTicketMetrics", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestCommentAddedAt;
    @XmlElement(name = "FirstResolutionTimeInMinutes", namespace = "http://www.example.org/GetTicketMetrics")
    protected ComboMinutesType firstResolutionTimeInMinutes;
    @XmlElement(name = "FullResolutionTimeInMinutes", namespace = "http://www.example.org/GetTicketMetrics")
    protected ComboMinutesType fullResolutionTimeInMinutes;
    @XmlElement(name = "AgentWaitTimeInMinutes", namespace = "http://www.example.org/GetTicketMetrics")
    protected ComboMinutesType agentWaitTimeInMinutes;
    @XmlElement(name = "RequesterWaitTimeInMinutes", namespace = "http://www.example.org/GetTicketMetrics")
    protected ComboMinutesType requesterWaitTimeInMinutes;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

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
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the updatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Sets the value of the updatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedAt(XMLGregorianCalendar value) {
        this.updatedAt = value;
    }

    /**
     * Gets the value of the groupStations property.
     * 
     */
    public long getGroupStations() {
        return groupStations;
    }

    /**
     * Sets the value of the groupStations property.
     * 
     */
    public void setGroupStations(long value) {
        this.groupStations = value;
    }

    /**
     * Gets the value of the assigneeStations property.
     * 
     */
    public long getAssigneeStations() {
        return assigneeStations;
    }

    /**
     * Sets the value of the assigneeStations property.
     * 
     */
    public void setAssigneeStations(long value) {
        this.assigneeStations = value;
    }

    /**
     * Gets the value of the reopens property.
     * 
     */
    public long getReopens() {
        return reopens;
    }

    /**
     * Sets the value of the reopens property.
     * 
     */
    public void setReopens(long value) {
        this.reopens = value;
    }

    /**
     * Gets the value of the replies property.
     * 
     */
    public long getReplies() {
        return replies;
    }

    /**
     * Sets the value of the replies property.
     * 
     */
    public void setReplies(long value) {
        this.replies = value;
    }

    /**
     * Gets the value of the assigneeUpdateAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssigneeUpdateAt() {
        return assigneeUpdateAt;
    }

    /**
     * Sets the value of the assigneeUpdateAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssigneeUpdateAt(XMLGregorianCalendar value) {
        this.assigneeUpdateAt = value;
    }

    /**
     * Gets the value of the requesterUpdatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequesterUpdatedAt() {
        return requesterUpdatedAt;
    }

    /**
     * Sets the value of the requesterUpdatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequesterUpdatedAt(XMLGregorianCalendar value) {
        this.requesterUpdatedAt = value;
    }

    /**
     * Gets the value of the statusUpdatedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusUpdatedAt() {
        return statusUpdatedAt;
    }

    /**
     * Sets the value of the statusUpdatedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusUpdatedAt(XMLGregorianCalendar value) {
        this.statusUpdatedAt = value;
    }

    /**
     * Gets the value of the initiallyAssignedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitiallyAssignedAt() {
        return initiallyAssignedAt;
    }

    /**
     * Sets the value of the initiallyAssignedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitiallyAssignedAt(XMLGregorianCalendar value) {
        this.initiallyAssignedAt = value;
    }

    /**
     * Gets the value of the assignedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssignedAt() {
        return assignedAt;
    }

    /**
     * Sets the value of the assignedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssignedAt(XMLGregorianCalendar value) {
        this.assignedAt = value;
    }

    /**
     * Gets the value of the solvedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSolvedAt() {
        return solvedAt;
    }

    /**
     * Sets the value of the solvedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSolvedAt(XMLGregorianCalendar value) {
        this.solvedAt = value;
    }

    /**
     * Gets the value of the latestCommentAddedAt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestCommentAddedAt() {
        return latestCommentAddedAt;
    }

    /**
     * Sets the value of the latestCommentAddedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestCommentAddedAt(XMLGregorianCalendar value) {
        this.latestCommentAddedAt = value;
    }

    /**
     * Gets the value of the firstResolutionTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link ComboMinutesType }
     *     
     */
    public ComboMinutesType getFirstResolutionTimeInMinutes() {
        return firstResolutionTimeInMinutes;
    }

    /**
     * Sets the value of the firstResolutionTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComboMinutesType }
     *     
     */
    public void setFirstResolutionTimeInMinutes(ComboMinutesType value) {
        this.firstResolutionTimeInMinutes = value;
    }

    /**
     * Gets the value of the fullResolutionTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link ComboMinutesType }
     *     
     */
    public ComboMinutesType getFullResolutionTimeInMinutes() {
        return fullResolutionTimeInMinutes;
    }

    /**
     * Sets the value of the fullResolutionTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComboMinutesType }
     *     
     */
    public void setFullResolutionTimeInMinutes(ComboMinutesType value) {
        this.fullResolutionTimeInMinutes = value;
    }

    /**
     * Gets the value of the agentWaitTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link ComboMinutesType }
     *     
     */
    public ComboMinutesType getAgentWaitTimeInMinutes() {
        return agentWaitTimeInMinutes;
    }

    /**
     * Sets the value of the agentWaitTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComboMinutesType }
     *     
     */
    public void setAgentWaitTimeInMinutes(ComboMinutesType value) {
        this.agentWaitTimeInMinutes = value;
    }

    /**
     * Gets the value of the requesterWaitTimeInMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link ComboMinutesType }
     *     
     */
    public ComboMinutesType getRequesterWaitTimeInMinutes() {
        return requesterWaitTimeInMinutes;
    }

    /**
     * Sets the value of the requesterWaitTimeInMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComboMinutesType }
     *     
     */
    public void setRequesterWaitTimeInMinutes(ComboMinutesType value) {
        this.requesterWaitTimeInMinutes = value;
    }

}
