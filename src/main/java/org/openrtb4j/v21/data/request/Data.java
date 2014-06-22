package org.openrtb4j.v21.data.request;

/**
 * The data and segment objects together allow data about the user to be passed
 * to bidders in the bid request. This data may be from multiple sources (e.g.,
 * the exchange itself, third party providers) as specified by the data object
 * ID field. A bid request can mix data objects from multiple providers.
 * 
 * The data object itself and all of its parameters are optional, so default
 * values are not provided. If an optional parameter is not specified, it should
 * be considered unknown.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Data {

    /**
     * Exchange specific ID for the data provider.
     */
    private String id = null;

    /**
     * Data provider name.
     */
    private String name = null;

    /**
     * Array of {@link Segment} objects.
     */
    private Segment[] segment = null;

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
     * @return the segment
     */
    public Segment[] getSegment() {
        return segment;
    }

    /**
     * @param segment the segment to set
     */
    public void setSegment(Segment[] segment) {
        this.segment = segment;
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
