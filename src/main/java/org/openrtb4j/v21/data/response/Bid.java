package org.openrtb4j.v21.data.response;

import org.openrtb4j.v21.data.refs.CreativeAttributes;

/**
 * For each {@link Bid}, the “nurl” attribute contains the win notice URL. If
 * the bidder wins the impression, the exchange calls this notice URL a) to
 * inform the bidder of the win and b) to convey certain information using
 * substitution macros (see Specification Section 4.6 Substitution Macros).
 * 
 * The “adomain” attribute can be used to check advertiser block list
 * compliance. The “iurl” attribute can provide a link to an image that is
 * representative of the campaign’s content (irrespective of whether the
 * campaign may have multiple creatives). This enables human review for spotting
 * inappropriate content. The “cid” attribute can be used to block ads that were
 * previously identified as inappropriate; essentially a safety net beyond the
 * block lists. The “crid” attribute can be helpful in reporting creative issues
 * back to bidders. Finally, the “attr” array indicates the creative attributes
 * that describe the ad to be served.
 * 
 * 
 * <i>BEST PRACTICE:</i> Substitution macros may allow a bidder to use a static
 * notice URL for all of its bids. Thus, exchanges should offer the option of a
 * default notice URL that can be pre-configured per bidder to reduce redundant
 * data transfer.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Bid {

    /**
     * ID for the bid object chosen by the bidder for tracking and debugging
     * purposes. Useful when multiple bids are submitted for a single impression
     * for a given seat. 
     * 
     * Required.
     */
    private String id;

    /**
     * ID of the impression object to which this bid applies. 
     * 
     * Required.
     */
    private String impid;

    /**
     * Bid price in CPM. WARNING/Best Practice Note: Although this value is a
     * float, OpenRTB strongly suggests using integer math for accounting to
     * avoid rounding errors.
     * 
     * Required.
     */
    private Float price;

    /**
     * ID that references the ad to be served if the bid wins.
     */
    private String adid = null;

    /**
     * Win notice URL. Note that ad markup is also typically, but not
     * necessarily, returned via this URL.
     */
    private String nurl = null;

    /**
     * Actual ad markup. XHTML if a response to a banner object, or VAST XML if
     * a response to a video object.
     */
    private String adm = null;

    /**
     * Advertiser’s primary or top-level domain for advertiser checking. This
     * can be a list of domains if there is a rotating creative. However,
     * exchanges may mandate that only one landing domain is allowed.
     */
    private String[] adomain = null;

    /**
     * Sample image URL (without cache busting) for content checking.
     */
    private String iurl = null;

    /**
     * Campaign ID or similar that appears within the ad markup.
     */
    private String cid = null;

    /**
     * Creative ID for reporting content issues or defects. This could also be
     * used as a reference to a creative ID that is posted with an exchange.
     */
    private String crid = null;

    /**
     * Array of creative attributes. See Specification Table 6.3 Creative
     * Attributes or {@link CreativeAttributes}.
     */
    private Integer[] attr = null;

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
     * @return the impid
     */
    public String getImpid() {
        return impid;
    }

    /**
     * @param impid the impid to set
     */
    public void setImpid(String impid) {
        this.impid = impid;
    }

    /**
     * @return the price
     */
    public Float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * @return the adid
     */
    public String getAdid() {
        return adid;
    }

    /**
     * @param adid the adid to set
     */
    public void setAdid(String adid) {
        this.adid = adid;
    }

    /**
     * @return the nurl
     */
    public String getNurl() {
        return nurl;
    }

    /**
     * @param nurl the nurl to set
     */
    public void setNurl(String nurl) {
        this.nurl = nurl;
    }

    /**
     * @return the adm
     */
    public String getAdm() {
        return adm;
    }

    /**
     * @param adm the adm to set
     */
    public void setAdm(String adm) {
        this.adm = adm;
    }

    /**
     * @return the adomain
     */
    public String[] getAdomain() {
        return adomain;
    }

    /**
     * @param adomain the adomain to set
     */
    public void setAdomain(String[] adomain) {
        this.adomain = adomain;
    }

    /**
     * @return the iurl
     */
    public String getIurl() {
        return iurl;
    }

    /**
     * @param iurl the iurl to set
     */
    public void setIurl(String iurl) {
        this.iurl = iurl;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the crid
     */
    public String getCrid() {
        return crid;
    }

    /**
     * @param crid the crid to set
     */
    public void setCrid(String crid) {
        this.crid = crid;
    }

    /**
     * @return the attr
     */
    public Integer[] getAttr() {
        return attr;
    }

    /**
     * @param attr the attr to set
     */
    public void setAttr(Integer[] attr) {
        this.attr = attr;
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
        if (getImpid() == null) {
            throw new NullPointerException("impid cannot be null.");
        }
        if (getPrice() == null) {
            throw new NullPointerException("price cannot be null.");
        }
    }

}
