
package com.tibco.bw.palette.zendesk.runtime.pojo.getticketmetrics;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActivityOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityOutputType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketMetrics" type="{http://www.example.org/GetTicketMetrics}TicketMetricsType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityOutputType", namespace = "http://www.example.org/GetTicketMetrics", propOrder = {
    "ticketMetrics"
})
public class ActivityOutputType {

    @XmlElement(name = "TicketMetrics", namespace = "http://www.example.org/GetTicketMetrics", required = true)
    protected List<TicketMetricsType> ticketMetrics;

    /**
     * Gets the value of the ticketMetrics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketMetrics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketMetrics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketMetricsType }
     * 
     * 
     */
    public List<TicketMetricsType> getTicketMetrics() {
        if (ticketMetrics == null) {
            ticketMetrics = new ArrayList<TicketMetricsType>();
        }
        return this.ticketMetrics;
    }

}
