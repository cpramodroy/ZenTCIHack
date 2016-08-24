
package com.tibco.bw.palette.zendesk.runtime.pojo.getusers;

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
 *         &lt;element name="UserIds" type="{http://www.example.org/GetUsers}UserIdsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityInputType", namespace = "http://www.example.org/GetUsers", propOrder = {
    "userIds"
})
public class ActivityInputType {

    @XmlElement(name = "UserIds", namespace = "http://www.example.org/GetUsers", required = true)
    protected UserIdsType userIds;

    /**
     * Gets the value of the userIds property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdsType }
     *     
     */
    public UserIdsType getUserIds() {
        return userIds;
    }

    /**
     * Sets the value of the userIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdsType }
     *     
     */
    public void setUserIds(UserIdsType value) {
        this.userIds = value;
    }

}
