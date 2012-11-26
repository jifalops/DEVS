//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.08.24 at 11:06:30 PM MST 
//


package com.acims.coupled;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigraphType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DigraphType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Models" type="{http://www.saurabh-mittal.com/CoupledDevs}ModelsType"/>
 *         &lt;element ref="{http://www.saurabh-mittal.com/CoupledDevs}Couplings"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="host" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigraphType", propOrder = {
    "models",
    "couplings"
})
@XmlRootElement
public class DigraphType {

    @XmlElement(name = "Models", required = true)
    protected ModelsType models;
    @XmlElement(name = "Couplings", required = true)
    protected CouplingsType couplings;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected String host;

    /**
     * Gets the value of the models property.
     * 
     * @return
     *     possible object is
     *     {@link ModelsType }
     *     
     */
    public ModelsType getModels() {
        return models;
    }

    /**
     * Sets the value of the models property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelsType }
     *     
     */
    public void setModels(ModelsType value) {
        this.models = value;
    }

    /**
     * Gets the value of the couplings property.
     * 
     * @return
     *     possible object is
     *     {@link CouplingsType }
     *     
     */
    public CouplingsType getCouplings() {
        return couplings;
    }

    /**
     * Sets the value of the couplings property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouplingsType }
     *     
     */
    public void setCouplings(CouplingsType value) {
        this.couplings = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the host property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Sets the value of the host property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

}