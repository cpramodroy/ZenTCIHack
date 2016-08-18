
package com.tibco.bw.palette.zendesk.runtime.pojo.search;

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
 *         &lt;element name="Id" type="{http://www.example.org/Search}IdsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityOutputType", namespace = "http://www.example.org/Search", propOrder = {
    "id"
})
public class ActivityOutputType {

    @XmlElement(name = "Id", namespace = "http://www.example.org/Search", required = true)
    protected IdsType id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link IdsType }
     *     
     */
    public IdsType getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdsType }
     *     
     */
    public void setId(IdsType value) {
        this.id = value;
    }

}
