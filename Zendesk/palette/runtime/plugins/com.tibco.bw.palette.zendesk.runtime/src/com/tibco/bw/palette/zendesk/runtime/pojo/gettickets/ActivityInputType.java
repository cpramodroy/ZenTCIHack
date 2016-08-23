
package com.tibco.bw.palette.zendesk.runtime.pojo.gettickets;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="TicketIds" type="{http://www.example.org/GetTickets}TicketIdsType" maxOccurs="unbounded"/>
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
    protected List<TicketIdsType> ticketIds;

    /**
     * Gets the value of the ticketIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketIdsType }
     * 
     * 
     */
    public List<TicketIdsType> getTicketIds() {
        if (ticketIds == null) {
            ticketIds = new ArrayList<TicketIdsType>();
        }
        return this.ticketIds;
    }

}
