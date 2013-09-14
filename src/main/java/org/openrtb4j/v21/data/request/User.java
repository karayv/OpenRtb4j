package org.openrtb4j.v21.data.request;

/**
 * The “user” object contains information known or derived about the human user
 * of the device. Note that the user ID is an exchange artifact (refer to the
 * {@link Device} object for hardware or platform derived IDs) and may be
 * subject to rotation policies. However, this user ID must be stable long
 * enough to serve reasonably as the basis for frequency capping.
 * 
 * The user object itself and all of its parameters are optional, so default
 * values are not provided. If an optional parameter is not specified, it should
 * be considered unknown.
 * 
 * If device ID is used as a proxy for unique user ID, use the device object.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class User {

    /**
     * Unique consumer ID of this user on the exchange.
     * 
     * Recommended (or buyeruid).
     */
    private String id;

    /**
     * Buyer’s user ID for this user as mapped by exchange for the buyer.
     * 
     * Recommended (or id).
     */
    private String buyeruid;

    /**
     * Year of birth as a 4-digit integer.
     */
    private Integer yob = null;

    /**
     * Gender as “M” male, “F” female, “O” Other. (Null indicates unknown).
     */
    private String gender = null;

    /**
     * Comma separated list of keywords of consumer interests or intent.
     */
    private String keywords = null;

    /**
     * If supported by the exchange, this is custom data that the bidder had
     * stored in the exchange’s cookie. The string may be in base85 cookie safe
     * characters, and be in any format. This may useful for storing user
     * features. Note: Proper JSON encoding must be used to include “escaped”
     * quotation marks.
     */
    private String customdata = null;

    /**
     * Home geo for the user (e.g., based off of registration data); this is
     * different from the current location of the access device (that is defined
     * by the geo object embedded in the Device Object); see {@link Geo} Object.
     */
    private Geo geo = null;

    /**
     * See {@link Data} Object.
     */
    private Data[] data = null;

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
     * @return the buyeruid
     */
    public String getBuyeruid() {
        return buyeruid;
    }

    /**
     * @param buyeruid the buyeruid to set
     */
    public void setBuyeruid(String buyeruid) {
        this.buyeruid = buyeruid;
    }

    /**
     * @return the yob
     */
    public Integer getYob() {
        return yob;
    }

    /**
     * @param yob the yob to set
     */
    public void setYob(Integer yob) {
        this.yob = yob;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the keywords
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * @param keywords the keywords to set
     */
    public void setKeywords(String keywords) {
        this.keywords = keywords;
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
     * @return the geo
     */
    public Geo getGeo() {
        return geo;
    }

    /**
     * @param geo the geo to set
     */
    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    /**
     * @return the data
     */
    public Data[] getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Data[] data) {
        this.data = data;
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

}
