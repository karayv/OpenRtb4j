package org.openrtb4j.v21.data.request;

/**
 * The producer is useful when content where the ad is shown is syndicated, and
 * may appear on a completely different publisher. The producer object itself
 * and all of its parameters are optional, so default values are not provided.
 * If an optional parameter is not specified, it should be considered unknown.
 * This object is optional, but useful if the content producer is different from
 * the site publisher.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Producer {

    /**
     * Content producer or originator ID. Useful if content is syndicated, and
     * may be posted on a site using embed tags.
     */
    private String id = null;

    /**
     * Content producer or originator name (e.g., “Warner Bros”).
     */
    private String name = null;

    /**
     * Array of IAB content categories for the content producer. See Specification Table 6.1
     * Content Categories.
     */
    private String[] cat = null;

    /**
     * URL of the content producer.
     */
    private String domain = null;

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
     * @return the cat
     */
    public String[] getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(String[] cat) {
        this.cat = cat;
    }

    /**
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain the domain to set
     */
    public void setDomain(String domain) {
        this.domain = domain;
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
