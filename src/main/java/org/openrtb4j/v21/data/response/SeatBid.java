package org.openrtb4j.v21.data.response;


/**
 * A {@link BidResponse} can contain multiple “seatbid” objects, each on behalf
 * of a different bidder seat. Since a bid request can include multiple
 * impressions, each “seatbid” object can contain multiple bids each pertaining
 * to a different impression on behalf of a seat. Thus, each “bid” object must
 * include the impression ID to which it pertains as well as the bid price. The
 * “group” attribute can be used to specify if a seat is willing to accept any
 * impressions that it can win (default) or if it is only interested in winning
 * any if it can win them all (i.e., all or nothing).
 * 
 * @author Andrey Karayvansky
 * 
 */
public class SeatBid {

    /**
     * Array of {@link Bid} objects; each bid object relates to an imp object in
     * the bid request. Note that, if supported by an exchange, one imp object
     * can have many bid objects.
     * 
     * Required.
     */
    private Bid[] bid;

    /**
     * ID of the bidder seat on whose behalf this bid is made.
     */
    private String seat = null;

    /**
     * “1” means impressions must be won-lost as a group; default is “0”.
     */
    private Integer group = null;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in this specification.
     */
    private String ext = null;

    /**
     * @return the bid
     */
    public Bid[] getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(Bid[] bid) {
        this.bid = bid;
    }

    /**
     * @return the seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @return the group
     */
    public Integer getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(Integer group) {
        this.group = group;
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
        if (getBid() == null) {
            throw new NullPointerException("bid cannot be null.");
        }
        
        for (Bid b : getBid()) {
            b.validate();
        }
    }

}
