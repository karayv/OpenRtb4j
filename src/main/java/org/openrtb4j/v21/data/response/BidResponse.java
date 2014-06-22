package org.openrtb4j.v21.data.response;

/**
 * The top-level bid response object. The “id” attribute is a reflection of the
 * bid request ID for logging purposes. Similarly, “bidid” is an optional
 * response tracking ID for bidders. If specified, it can be included in the
 * subsequent win notice call if the bidder wins. At least one “seatbid” object
 * is required, which contains a bid on at least one impression. Other
 * attributes are optional since an exchange may establish default values.
 * 
 * No-Bids on all impressions should be indicated as a HTTP 204 response. For
 * no-bids on specific impressions, the bidder should omit these from the bid
 * response.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class BidResponse {

    /**
     * ID of the bid request. 
     * 
     * Required.
     */
    private String id;

    /**
     * Array of {@link SeatBid} objects. 
     * 
     * Required.
     */
    private SeatBid[] seatbid;

    /**
     * Bid response ID to assist tracking for bidders. This value is chosen by
     * the bidder for cross-reference.
     */
    private String bidid = null;

    /**
     * Bid currency using ISO-4217 alphabetic codes; default is “USD”.
     */
    private String cur = "USD";

    /**
     * This is an optional feature, which allows a bidder to set data in the
     * exchange’s cookie. The string may be in base85 cookie safe characters,
     * and be in any format. This may be useful for storing user features. Note:
     * Proper JSON encoding must be used to include “escaped” quotation marks.
     */
    private String customdata = null;

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
     * @return the seatbid
     */
    public SeatBid[] getSeatbid() {
        return seatbid;
    }

    /**
     * @param seatbid the seatbid to set
     */
    public void setSeatbid(SeatBid[] seatbid) {
        this.seatbid = seatbid;
    }

    /**
     * @return the bidid
     */
    public String getBidid() {
        return bidid;
    }

    /**
     * @param bidid the bidid to set
     */
    public void setBidid(String bidid) {
        this.bidid = bidid;
    }

    /**
     * @return the cur
     */
    public String getCur() {
        return cur;
    }

    /**
     * @param cur the cur to set
     */
    public void setCur(String cur) {
        this.cur = cur;
    }

    /**
     * @return the customdata
     */
    public String getCustomdata() {
        return customdata;
    }

    /**
     * @param customdata the customdata to set
     */
    public void setCustomdata(String customdata) {
        this.customdata = customdata;
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
    protected void validate() throws NullPointerException {
        if (getId() == null) {
            throw new NullPointerException("id cannot be null.");
        }
        
        if (getSeatbid() == null) {
            throw new NullPointerException("seatbid cannot be null.");
        }
        
        for (SeatBid sb : getSeatbid()) {
            sb.validate();
        }
    }

}
