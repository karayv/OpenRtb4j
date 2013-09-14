package org.openrtb4j.v21.data.request;

/**
 * The “imp” object describes the ad position or impression being auctioned. A
 * single bid request can include multiple “imp” objects, a use case for which
 * might be an exchange that supports selling all ad positions on a given page
 * as a bundle. Each “imp” object has a required ID so that bids can reference
 * them individually. An exchange can also conduct private auctions by
 * restricting involvement to specific subsets of seats within bidders.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Impression {

    /**
     * A unique identifier for this impression within the context of the bid
     * request (typically, value starts with 1, and increments up to n for n
     * impressions).
     * 
     * Required.
     */
    private String id;

    /**
     * A reference to a banner object. Either a banner or video object (or both
     * if the impression could be either) must be included in an impression
     * object. See {@link Banner} Object.
     * 
     * Required for banner impressions.
     */
    private Banner banner;

    /**
     * A reference to a video object. Either a banner or video object (or both
     * if the impression could be either) must be included in an impression
     * object. See {@link Video} Object.
     * 
     * Required for video impressions.
     */
    private Video video;

    /**
     * Name of ad mediation partner, SDK technology, or native player
     * responsible for rendering ad (typically video or mobile). Used by some ad
     * servers to customize ad code by partner.
     * 
     * Recommended for video and native apps.
     */
    private String displaymanager;

    /**
     * Version of ad mediation partner, SDK technology, or native player
     * responsible for rendering ad (typically video or mobile). Used by some ad
     * servers to customize ad code by partner.
     * 
     * Recommended for video and native apps.
     */
    private String displaymanagerver;

    /**
     * 1 if the ad is interstitial or full screen; else 0 (i.e., no).
     */
    private int instl = 0;

    /**
     * Identifier for specific ad placement or ad tag that was used to initiate
     * the auction. This can be useful for debugging of any issues, or for
     * optimization by the buyer.
     */
    private String tagid = null;

    /**
     * Bid floor for this impression (in CPM of bidfloorcur).
     */
    private float bidfloor = 0;

    /**
     * If bid floor is specified and multiple currencies supported per bid
     * request, then currency should be specified here using ISO-4217 alphabetic
     * codes. Note, this may be different from bid currency returned by bidder,
     * if this is allowed on an exchange.
     */
    private String bidfloorcur = "USD";

    /**
     * Array of names for supported iframe busters. Exchange specific.
     */
    private String[] iframebuster;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in this specification.
     */
    private String ext;

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
     * @return the banner
     */
    public Banner getBanner() {
        return banner;
    }

    /**
     * @param banner the banner to set
     */
    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    /**
     * @return the video
     */
    public Video getVideo() {
        return video;
    }

    /**
     * @param video the video to set
     */
    public void setVideo(Video video) {
        this.video = video;
    }

    /**
     * @return the displaymanager
     */
    public String getDisplaymanager() {
        return displaymanager;
    }

    /**
     * @param displaymanager the displaymanager to set
     */
    public void setDisplaymanager(String displaymanager) {
        this.displaymanager = displaymanager;
    }

    /**
     * @return the displaymanagerver
     */
    public String getDisplaymanagerver() {
        return displaymanagerver;
    }

    /**
     * @param displaymanagerver the displaymanagerver to set
     */
    public void setDisplaymanagerver(String displaymanagerver) {
        this.displaymanagerver = displaymanagerver;
    }

    /**
     * @return the instl
     */
    public int getInstl() {
        return instl;
    }

    /**
     * @param instl the instl to set
     */
    public void setInstl(int instl) {
        this.instl = instl;
    }

    /**
     * @return the tagid
     */
    public String getTagid() {
        return tagid;
    }

    /**
     * @param tagid the tagid to set
     */
    public void setTagid(String tagid) {
        this.tagid = tagid;
    }

    /**
     * @return the bidfloor
     */
    public float getBidfloor() {
        return bidfloor;
    }

    /**
     * @param bidfloor the bidfloor to set
     */
    public void setBidfloor(float bidfloor) {
        this.bidfloor = bidfloor;
    }

    /**
     * @return the bidfloorcur
     */
    public String getBidfloorcur() {
        return bidfloorcur;
    }

    /**
     * @param bidfloorcur the bidfloorcur to set
     */
    public void setBidfloorcur(String bidfloorcur) {
        this.bidfloorcur = bidfloorcur;
    }

    /**
     * @return the iframebuster
     */
    public String[] getIframebuster() {
        return iframebuster;
    }

    /**
     * @param iframebuster the iframebuster to set
     */
    public void setIframebuster(String[] iframebuster) {
        this.iframebuster = iframebuster;
    }

    /**
     * @return the ext
     */
    public String getExt() {
        return ext;
    }

    /**
     * @param ext the ext to set
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * Validate the required fields.
     * 
     * @throws NullPointerException
     */
    protected void validate() {
        if (getId() == null) {
            throw new NullPointerException("id cannot be null.");
        }
        if (getVideo() != null) {
            getVideo().validate();
        }
    }
    
}
