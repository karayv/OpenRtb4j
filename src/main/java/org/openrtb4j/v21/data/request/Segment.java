package org.openrtb4j.v21.data.request;

/**
 * The {@link Data} and segment objects together allow data about the user to be
 * passed to bidders in the bid request. Segment objects convey specific units
 * of information from the provider identified in the parent data object.
 * 
 * The segment object itself and all of its parameters are optional, so default
 * values are not provided; if an optional parameter is not specified, it should
 * be considered unknown.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Segment {

    /**
     * ID of a data provider’s segment applicable to the user.
     */
    private String id = null;

    /**
     * Name of a data provider’s segment applicable to the user.
     */
    private String name = null;

    /**
     * String representing the value of the segment. The method for transmitting
     * this data should be negotiated offline with the data provider. For
     * example for gender, “male”, or “female”, for age, “30-40”.
     */
    private String value = null;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in this specification.
     */
    private Object ext = null;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the ext
     */
    public Object getExt() {
        return ext;
    }

    /**
     * @param ext the ext to set
     */
    public void setExt(Object ext) {
        this.ext = ext;
    }

}
