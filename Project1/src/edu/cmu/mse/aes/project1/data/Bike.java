
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 06:00:41 PM EDT 
//


package edu.cmu.mse.aes.project1.data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="forkmaterial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="framematerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="framesize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="componentinfo" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "brand",
    "forkmaterial",
    "framematerial",
    "framesize",
    "model",
    "price",
    "rating",
    "componentinfo"
})
@XmlRootElement(name = "bike")
public class Bike {

    protected String brand;
    protected String forkmaterial;
    protected String framematerial;
    protected String framesize;
    protected String model;
    protected String price;
    protected String rating;
    protected Object componentinfo;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the forkmaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForkmaterial() {
        return forkmaterial;
    }

    /**
     * Sets the value of the forkmaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForkmaterial(String value) {
        this.forkmaterial = value;
    }

    /**
     * Gets the value of the framematerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramematerial() {
        return framematerial;
    }

    /**
     * Sets the value of the framematerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramematerial(String value) {
        this.framematerial = value;
    }

    /**
     * Gets the value of the framesize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFramesize() {
        return framesize;
    }

    /**
     * Sets the value of the framesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFramesize(String value) {
        this.framesize = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
    }

    /**
     * Gets the value of the componentinfo property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getComponentinfo() {
        return componentinfo;
    }

    /**
     * Sets the value of the componentinfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setComponentinfo(Object value) {
        this.componentinfo = value;
    }
    
    public void printinfo(){
    	System.out.println("brand"+getBrand());
    	System.out.println("forkmaterial"+getForkmaterial());
    	System.out.println("framesize"+getFramesize());
    	System.out.println("model"+getModel());
    	System.out.println("rating"+getRating());
    	System.out.println("componentInfo"+getComponentinfo());
    	System.out.println("price"+getPrice());
    }

}
