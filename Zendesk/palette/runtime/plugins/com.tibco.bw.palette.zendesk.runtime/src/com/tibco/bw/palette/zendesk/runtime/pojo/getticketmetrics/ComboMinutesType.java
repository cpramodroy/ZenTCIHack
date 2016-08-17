
package com.tibco.bw.palette.zendesk.runtime.pojo.getticketmetrics;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComboMinutesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComboMinutesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalendarMinutes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BusinessMinutes" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComboMinutesType", namespace = "http://www.example.org/GetTicketMetrics", propOrder = {
    "calendarMinutes",
    "businessMinutes"
})
public class ComboMinutesType {

    @XmlElement(name = "CalendarMinutes", namespace = "http://www.example.org/GetTicketMetrics")
    protected long calendarMinutes;
    @XmlElement(name = "BusinessMinutes", namespace = "http://www.example.org/GetTicketMetrics")
    protected long businessMinutes;

    /**
     * Gets the value of the calendarMinutes property.
     * 
     */
    public long getCalendarMinutes() {
        return calendarMinutes;
    }

    /**
     * Sets the value of the calendarMinutes property.
     * 
     */
    public void setCalendarMinutes(long value) {
        this.calendarMinutes = value;
    }

    /**
     * Gets the value of the businessMinutes property.
     * 
     */
    public long getBusinessMinutes() {
        return businessMinutes;
    }

    /**
     * Sets the value of the businessMinutes property.
     * 
     */
    public void setBusinessMinutes(long value) {
        this.businessMinutes = value;
    }

}
