
package com.vesseltracker.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for historyOrderInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="historyOrderInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="historyOrderId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="timeCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="imoList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shipIdList" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="region" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timeStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="timeEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="notificationEmail" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="downloadURL" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "historyOrderInfo")
public class HistoryOrderInfo {

    @XmlAttribute(name = "historyOrderId", required = true)
    protected int historyOrderId;
    @XmlAttribute(name = "timeCreated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeCreated;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "imoList")
    protected String imoList;
    @XmlAttribute(name = "shipIdList")
    protected String shipIdList;
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "timeStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStart;
    @XmlAttribute(name = "timeEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeEnd;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "notificationEmail")
    protected String notificationEmail;
    @XmlAttribute(name = "downloadURL")
    protected String downloadURL;

    /**
     * Gets the value of the historyOrderId property.
     * 
     */
    public int getHistoryOrderId() {
        return historyOrderId;
    }

    /**
     * Sets the value of the historyOrderId property.
     * 
     */
    public void setHistoryOrderId(int value) {
        this.historyOrderId = value;
    }

    /**
     * Gets the value of the timeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeCreated() {
        return timeCreated;
    }

    /**
     * Sets the value of the timeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeCreated(XMLGregorianCalendar value) {
        this.timeCreated = value;
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
     * Gets the value of the imoList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImoList() {
        return imoList;
    }

    /**
     * Sets the value of the imoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImoList(String value) {
        this.imoList = value;
    }

    /**
     * Gets the value of the shipIdList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipIdList() {
        return shipIdList;
    }

    /**
     * Sets the value of the shipIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipIdList(String value) {
        this.shipIdList = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the timeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStart() {
        return timeStart;
    }

    /**
     * Sets the value of the timeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStart(XMLGregorianCalendar value) {
        this.timeStart = value;
    }

    /**
     * Gets the value of the timeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeEnd() {
        return timeEnd;
    }

    /**
     * Sets the value of the timeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeEnd(XMLGregorianCalendar value) {
        this.timeEnd = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the notificationEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmail() {
        return notificationEmail;
    }

    /**
     * Sets the value of the notificationEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmail(String value) {
        this.notificationEmail = value;
    }

    /**
     * Gets the value of the downloadURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadURL() {
        return downloadURL;
    }

    /**
     * Sets the value of the downloadURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadURL(String value) {
        this.downloadURL = value;
    }

}
