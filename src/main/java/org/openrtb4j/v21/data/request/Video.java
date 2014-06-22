package org.openrtb4j.v21.data.request;

import org.openrtb4j.v21.data.refs.APIFrameworks;
import org.openrtb4j.v21.data.refs.AdPosition;
import org.openrtb4j.v21.data.refs.ContentDeliveryMethods;
import org.openrtb4j.v21.data.refs.CreativeAttributes;
import org.openrtb4j.v21.data.refs.VASTCompanionTypes;
import org.openrtb4j.v21.data.refs.VideoBidResponseProtocols;
import org.openrtb4j.v21.data.refs.VideoLinearity;
import org.openrtb4j.v21.data.refs.VideoPlaybackMethods;
import org.openrtb4j.v21.data.refs.VideoStartDelay;

/**
 * The “video” object must be included directly in the impression object if the
 * impression offered for auction is an in-stream video ad opportunity.
 * 
 * Note that for the video object, many of the fields are non-essential for a
 * minimally viable exchange interfaces. These parameters do not necessarily
 * need to be specified to the bidder, if they are always the same for all
 * impression, of if the exchange chooses not to supply the additional
 * information to the bidder.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Video {

    /**
     * Content MIME types supported. Popular MIME types include, but are not
     * limited to “video/x-mswmv” for Windows Media, and “video/x-flv” for Flash
     * Video.
     * 
     * Required.
     */
    private String[] mimes;

    /**
     * Indicates whether the ad impression is linear or non-linear. See
     * Specification Table 6.6 Video Linearity or {@link VideoLinearity} for a
     * list of the possible values.
     *
     * Required.
     */
    private Integer linearity;

    /**
     * Minimum video ad duration in seconds.
     * 
     * Required.
     */
    private Integer minduration;

    /**
     * Maximum video ad duration in seconds.
     * 
     * Required.
     */
    private Integer maxduration;

    /**
     * Video bid response protocols. See Specification Table 6.7 Video Bid
     * Response Protocols or {@link VideoBidResponseProtocols} for a list of
     * possible values.
     * 
     * Required.
     */
    private Integer protocol;

    /**
     * Width of the player in pixels. This field is not required, but it’s
     * highly recommended that this information be included.
     */
    private Integer w;

    /**
     * Height of the player in pixels. This field is not required, but it’s
     * highly recommended that this information be included.
     */
    private Integer h;

    /**
     * Indicates the start delay in seconds for preroll, midroll, or postroll ad
     * placement. See Specification Table 6.9 Video Start Delay
     * {@link VideoStartDelay} for generic placement values.
     */
    private Integer startdelay;

    /**
     * If multiple ad impressions are offered in the same bid request, the
     * sequence number will allow for the coordinated delivery of multiple
     * creatives.
     */
    private int sequence = 1;

    /**
     * Blocked creative attributes. See Specification Table 6.3 Creative
     * Attributes or {@link CreativeAttributes}. If blank assume all types are
     * allowed.
     */
    private Integer[] battr = null;

    /**
     * Maximum extended video ad duration, if extension is allowed. If blank or
     * 0, extension is not allowed. If -1, extension is allowed, and there is no
     * time limit imposed. If greater than 0, then the value represents the
     * number of seconds of extended play supported beyond the maxduration
     * value.
     */
    private Integer maxextended = null;

    /**
     * Minimum bit rate in Kbps. Exchange may set this dynamically, or
     * universally across their set of publishers.
     */
    private Integer minbitrate = null;

    /**
     * Maximum bit rate in Kbps. Exchange may set this dynamically, or
     * universally across their set of publishers.
     */
    private Integer maxbitrate = null;

    /**
     * If exchange publisher has rules preventing letter boxing of 4x3 content
     * to play in a 16x9 window, then this should be set to false. Default
     * setting is true, which assumes that boxing of content to fit into a
     * window is allowed. “1” indicates boxing is allowed. “0” indicates it is
     * not allowed.
     */
    private int boxingallowed = 1;

    /**
     * List of allowed playback methods. If blank, assume that all are allowed.
     * See Specification Table 6.8 Video Playback Methods or
     * {@link VideoPlaybackMethods} for a list of possible values.
     */
    private Integer[] playbackmethod = null;

    /**
     * List of supported delivery methods (streaming, progressive). If blank,
     * assume all are supported. See Specification Table 6.12 Content Delivery
     * Methods {@link ContentDeliveryMethods} for a list of possible values.
     */
    private Integer[] delivery = null;

    /**
     * Ad Position (see specification table 6.5 or {@link AdPosition})
     */
    private Integer pos = null;

    /**
     * If companion ads are available, they can be listed as an array of banner
     * objects. See {@link Banner} Object.
     */
    private Banner[] companionad = null;

    /**
     * List of supported API frameworks for this impression. (See Specification
     * Table 6.4 API Frameworks or {@link APIFrameworks}). If an API is not
     * explicitly listed it is assumed not to be supported.
     */
    private Integer[] api = null;

    /**
     * Recommended if companion objects are included. See Specification Table
     * 6.17 VAST Companion Types or {@link VASTCompanionTypes} for a list of possible values.
     */
    private Integer[] companiontype = null;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in this specification.
     */
    private Object ext = null;

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
     * @return the linearity
     */
    public Integer getLinearity() {
        return linearity;
    }

    /**
     * @param linearity the linearity to set
     */
    public void setLinearity(Integer linearity) {
        this.linearity = linearity;
    }

    /**
     * @return the minduration
     */
    public Integer getMinduration() {
        return minduration;
    }

    /**
     * @param minduration the minduration to set
     */
    public void setMinduration(Integer minduration) {
        this.minduration = minduration;
    }

    /**
     * @return the maxduration
     */
    public Integer getMaxduration() {
        return maxduration;
    }

    /**
     * @param maxduration the maxduration to set
     */
    public void setMaxduration(Integer maxduration) {
        this.maxduration = maxduration;
    }

    /**
     * @return the protocol
     */
    public Integer getProtocol() {
        return protocol;
    }

    /**
     * @param protocol the protocol to set
     */
    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

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
     * @return the startdelay
     */
    public Integer getStartdelay() {
        return startdelay;
    }

    /**
     * @param startdelay the startdelay to set
     */
    public void setStartdelay(Integer startdelay) {
        this.startdelay = startdelay;
    }

    /**
     * @return the sequence
     */
    public int getSequence() {
        return sequence;
    }

    /**
     * @param sequence the sequence to set
     */
    public void setSequence(int sequence) {
        this.sequence = sequence;
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
     * @return the maxextended
     */
    public Integer getMaxextended() {
        return maxextended;
    }

    /**
     * @param maxextended the maxextended to set
     */
    public void setMaxextended(Integer maxextended) {
        this.maxextended = maxextended;
    }

    /**
     * @return the minbitrate
     */
    public Integer getMinbitrate() {
        return minbitrate;
    }

    /**
     * @param minbitrate the minbitrate to set
     */
    public void setMinbitrate(Integer minbitrate) {
        this.minbitrate = minbitrate;
    }

    /**
     * @return the maxbitrate
     */
    public Integer getMaxbitrate() {
        return maxbitrate;
    }

    /**
     * @param maxbitrate the maxbitrate to set
     */
    public void setMaxbitrate(Integer maxbitrate) {
        this.maxbitrate = maxbitrate;
    }

    /**
     * @return the boxingallowed
     */
    public int getBoxingallowed() {
        return boxingallowed;
    }

    /**
     * @param boxingallowed the boxingallowed to set
     */
    public void setBoxingallowed(int boxingallowed) {
        this.boxingallowed = boxingallowed;
    }

    /**
     * @return the playbackmethod
     */
    public Integer[] getPlaybackmethod() {
        return playbackmethod;
    }

    /**
     * @param playbackmethod the playbackmethod to set
     */
    public void setPlaybackmethod(Integer[] playbackmethod) {
        this.playbackmethod = playbackmethod;
    }

    /**
     * @return the delivery
     */
    public Integer[] getDelivery() {
        return delivery;
    }

    /**
     * @param delivery the delivery to set
     */
    public void setDelivery(Integer[] delivery) {
        this.delivery = delivery;
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
     * @return the companionad
     */
    public Banner[] getCompanionad() {
        return companionad;
    }

    /**
     * @param companionad the companionad to set
     */
    public void setCompanionad(Banner[] companionad) {
        this.companionad = companionad;
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
     * @return the companiontype
     */
    public Integer[] getCompaniontype() {
        return companiontype;
    }

    /**
     * @param companiontype the companiontype to set
     */
    public void setCompaniontype(Integer[] companiontype) {
        this.companiontype = companiontype;
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

    /**
     * Validate the required fields.
     * 
     * @throws NullPointerException
     */
    protected void validate() {
        if (getMimes() == null) {
            throw new NullPointerException("mimes cannot be null.");
        }
        if (getLinearity() == null) {
            throw new NullPointerException("linearity cannot be null.");
        }
        if (getMinduration() == null) {
            throw new NullPointerException("minduration cannot be null.");
        }
        if (getMaxduration() == null) {
            throw new NullPointerException("maxduration cannot be null.");
        }
        if (getProtocol() == null) {
            throw new NullPointerException("protocol cannot be null.");
        }
    }
    
}
