package org.openrtb4j.v21.data.request;

/**
 * Bid Request object due to OpenRTB 2.1 specification.
 * http://www.iab.net/media/file/OpenRTB-API-Specification-Version-2-1-FINAL.pdf
 * 
 * The top-level bid request object contains a globally unique bid request or
 * auction ID. This “id” attribute is required as is at least one “imp” (i.e.,
 * impression) object. Other attributes are optional since an exchange may
 * establish default values.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class BidRequest {

    /**
     * Unique ID of the bid request, provided by the exchange.
     * 
     * Required.
     */
    private String id;

    /**
     * Array of impression objects. Multiple impression auctions may be
     * specified in a single bid request. At least one {@link Impression} is required
     * for a valid bid request.
     * 
     * Required.
     */
    private Impression[] imp;

    /**
     * See {@link Site} Object. Recommended for websites.
     */
    private Site site;

    /**
     * See {@link App} Object. Recommended for native apps.
     */
    private App app;

    /**
     * See {@link Device} Object. Recommended.
     */
    private Device device;

    /**
     * See {@link User} Object. Recommended.
     */
    private User user;

    /**
     * Auction Type. If “1”, then first price auction. If “2”, then second price
     * auction. Additional auction types can be defined as per the exchange’s
     * business rules. Exchange specific rules should be numbered over 500.
     */
    private int at = 2;

    /**
     * Maximum amount of time in milliseconds to submit a bid (e.g., 120 means
     * the bidder has 120ms to submit a bid before the auction is complete). If
     * this value never changes across an exchange, then the exchange can supply
     * this information offline
     */
    private Integer tmax = null;

    /**
     * Array of buyer seats allowed to bid on this auction. Seats are an
     * optional feature of exchange. For example, [“4”,”34”,”82”,”A45”]
     * indicates that only advertisers using these exchange seats are allowed to
     * bid on the impressions in this auction.
     */
    private String[] wseat = null;

    /**
     * Flag to indicate whether Exchange can verify that all impressions offered
     * represent all of the impressions available in context (e.g., all
     * impressions available on the web page; all impressions available for a
     * video [pre, mid and postroll spots], etc.) to support road-blocking. A
     * true value should only be passed if the exchange is aware of all
     * impressions in context for the publisher. “0” means the exchange cannot
     * verify, and “1” means that all impressions represent all impressions
     * available.
     */
    private int allimps = 0;

    /**
     * Array of allowed currencies for bids on this bid request using ISO-4217
     * alphabetic codes. If only one currency is used by the exchange, this
     * parameter is not required.
     */
    private String[] cur = null;

    /**
     * Blocked Advertiser Categories. Note that there is no existing
     * categorization / taxonomy of advertiser industries. However, OPENRTB API
     * Specification Version 2.1 RTB Project Page 15 as a substitute exchanges
     * may decide to use IAB categories as an approximation (See Table 6.1
     * Content Categories)
     */
    private String[] bcat = null;

    /**
     * Array of strings of blocked toplevel domains of advertisers. For example,
     * {“company1.com”, “company2.com”}
     */
    private String[] badv = null;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in this specification.
     */
    private String ext = null;

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
     * @return the imp
     */
    public Impression[] getImp() {
        return imp;
    }

    /**
     * @param imp the imp to set
     */
    public void setImp(Impression[] imp) {
        this.imp = imp;
    }

    /**
     * @return the site
     */
    public Site getSite() {
        return site;
    }

    /**
     * @param site the site to set
     */
    public void setSite(Site site) {
        this.site = site;
    }

    /**
     * @return the app
     */
    public App getApp() {
        return app;
    }

    /**
     * @param app the app to set
     */
    public void setApp(App app) {
        this.app = app;
    }

    /**
     * @return the device
     */
    public Device getDevice() {
        return device;
    }

    /**
     * @param device the device to set
     */
    public void setDevice(Device device) {
        this.device = device;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the at
     */
    public int getAt() {
        return at;
    }

    /**
     * @param at the at to set
     */
    public void setAt(int at) {
        this.at = at;
    }

    /**
     * @return the tmax
     */
    public Integer getTmax() {
        return tmax;
    }

    /**
     * @param tmax the tmax to set
     */
    public void setTmax(Integer tmax) {
        this.tmax = tmax;
    }

    /**
     * @return the wseat
     */
    public String[] getWseat() {
        return wseat;
    }

    /**
     * @param wseat the wseat to set
     */
    public void setWseat(String[] wseat) {
        this.wseat = wseat;
    }

    /**
     * @return the allimps
     */
    public int getAllimps() {
        return allimps;
    }

    /**
     * @param allimps the allimps to set
     */
    public void setAllimps(int allimps) {
        this.allimps = allimps;
    }

    /**
     * @return the cur
     */
    public String[] getCur() {
        return cur;
    }

    /**
     * @param cur the cur to set
     */
    public void setCur(String[] cur) {
        this.cur = cur;
    }

    /**
     * @return the bcat
     */
    public String[] getBcat() {
        return bcat;
    }

    /**
     * @param bcat the bcat to set
     */
    public void setBcat(String[] bcat) {
        this.bcat = bcat;
    }

    /**
     * @return the badv
     */
    public String[] getBadv() {
        return badv;
    }

    /**
     * @param badv the badv to set
     */
    public void setBadv(String[] badv) {
        this.badv = badv;
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
    protected void validate() throws NullPointerException {
        if (getId() == null) {
            throw new NullPointerException("id cannot be null.");
        }
        if (getImp() == null) {
            throw new NullPointerException("imp cannot be null.");
        }
        
        for (Impression i : getImp()) {
            i.validate();
        }
    }
    
}
