
package com.tibco.bw.palette.zendesk.runtime.pojo.gettickets;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketIdsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketIdsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketId" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketIdsType", namespace = "http://www.example.org/GetTickets", propOrder = {
    "ticketId"
})
public class TicketIdsType {

    @XmlElement(name = "TicketId", namespace = "http://www.example.org/GetTickets", type = Long.class)
    protected List<Long> ticketId;

    /**
     * Gets the value of the ticketId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getTicketId() {
        if (ticketId == null) {
            ticketId = new ArrayList<Long>();
        }
        return this.ticketId;
    }

}
