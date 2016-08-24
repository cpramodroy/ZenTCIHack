
package com.tibco.bw.palette.zendesk.runtime.pojo.gettickets;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityInputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketIds" type="{http://www.example.org/GetTickets}TicketIdsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInputType", namespace = "http://www.example.org/GetTickets", propOrder = {
    "ticketIds"
})
public class ActivityInputType {

    @XmlElement(name = "TicketIds", namespace = "http://www.example.org/GetTickets", required = true)
    protected TicketIdsType ticketIds;

    /**
     * Gets the value of the ticketIds property.
     * 
     * @return
     *     possible object is
     *     {@link TicketIdsType }
     *     
     */
    public TicketIdsType getTicketIds() {
        return ticketIds;
    }

    /**
     * Sets the value of the ticketIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketIdsType }
     *     
     */
    public void setTicketIds(TicketIdsType value) {
        this.ticketIds = value;
    }

}
