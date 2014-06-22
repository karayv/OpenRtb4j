package org.openrtb4j.v21.data.request;

import org.openrtb4j.v21.data.refs.APIFrameworks;
import org.openrtb4j.v21.data.refs.AdPosition;
import org.openrtb4j.v21.data.refs.BannerAdTypes;
import org.openrtb4j.v21.data.refs.CreativeAttributes;
import org.openrtb4j.v21.data.refs.ExpandableDirection;

/**
 * The “banner” object must be included directly in the impression object if the
 * impression offered for auction is display or rich media, or it may be
 * optionally embedded in the video object to describe the companion banners
 * available for the linear or non-linear video ad. The banner object may
 * include a unique identifier; this can be useful if these IDs can be leveraged
 * in the VAST response to dictate placement of the companion creatives when
 * multiple companion ad opportunities of the same size are available on a page.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Banner {

    /**
     * Width of the impression in pixels. Since some ad types are not restricted
     * by size this field is not required, but it’s highly recommended that this
     * information be included when possible. Recommended.
     */
    private Integer w;

    /**
     * Height of the impression in pixels. Since some ad types are not
     * restricted by size this field is not required, but it’s highly
     * recommended that this information be included when possible. Recommended.
     */
    private Integer h;

    /**
     * Unique identifier for this banner object. Useful for tracking multiple
     * banner objects (e.g., in companion banner array). Usually starts with 1,
     * increasing with each object. Combination of impression id banner object
     * should be unique.
     */
    private String id;

    /**
     * Ad Position. Use Specification Table 6.5 or {@link AdPosition}
     */
    private Integer pos = null;

    /**
     * Blocked creative types. See Specification Table 6.2 Banner Ad Types or {@link BannerAdTypes}. If
     * blank, assume all types are allowed.
     */
    private Integer[] btype = null;

    /**
     * Blocked creative attributes. See Specification Table 6.3 Creative
     * Attributes or {@link CreativeAttributes}. If blank assume all types are allowed
     */
    private Integer[] battr = null;

    /**
     * Whitelist of content MIME types supported. Popular MIME types include,
     * but are not limited to “image/jpg”, “image/gif” and
     * “application/x-shockwave-flash”.
     */
    private String[] mimes = null;

    /**
     * Specify if the banner is delivered in the top frame or in an iframe. “0”
     * means it is not in the top frame, and “1” means that it is.
     */
    private int topframe = 0;

    /**
     * Specify properties for an expandable ad. See Specification Table 6.11
     * Expandable Direction or {@link ExpandableDirection} for possible values.
     */
    private Integer[] expdir = null;

    /**
     * List of supported API frameworks for this banner. (See Specification
     * Table 6.4 API Frameworks or {@link APIFrameworks}). If an API is not explicitly listed it is
     * assumed not to be supported.
     */
    private Integer[] api = null;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in this specification.
     */
    private Object ext = null;

    /**
     * @return the w
     */
    public Integer getW() {
        return w;
    }

    /**
     * @param w the w to set
     */
    public void setW(Integer w) {
        this.w = w;
    }

    /**
     * @return the h
     */
    public Integer getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(Integer h) {
        this.h = h;
    }

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
     * @return the pos
     */
    public Integer getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(Integer pos) {
        this.pos = pos;
    }

    /**
     * @return the btype
     */
    public Integer[] getBtype() {
        return btype;
    }

    /**
     * @param btype the btype to set
     */
    public void setBtype(Integer[] btype) {
        this.btype = btype;
    }

    /**
     * @return the battr
     */
    public Integer[] getBattr() {
        return battr;
    }

    /**
     * @param battr the battr to set
     */
    public void setBattr(Integer[] battr) {
        this.battr = battr;
    }

    /**
     * @return the mimes
     */
    public String[] getMimes() {
        return mimes;
    }

    /**
     * @param mimes the mimes to set
     */
    public void setMimes(String[] mimes) {
        this.mimes = mimes;
    }

    /**
     * @return the topframe
     */
    public int getTopframe() {
        return topframe;
    }

    /**
     * @param topframe the topframe to set
     */
    public void setTopframe(int topframe) {
        this.topframe = topframe;
    }

    /**
     * @return the expdir
     */
    public Integer[] getExpdir() {
        return expdir;
    }

    /**
     * @param expdir the expdir to set
     */
    public void setExpdir(Integer[] expdir) {
        this.expdir = expdir;
    }

    /**
     * @return the api
     */
    public Integer[] getApi() {
        return api;
    }

    /**
     * @param api the api to set
     */
    public void setApi(Integer[] api) {
        this.api = api;
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
