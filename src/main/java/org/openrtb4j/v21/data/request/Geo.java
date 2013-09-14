package org.openrtb4j.v21.data.request;

import org.openrtb4j.v21.data.refs.LocationType;

/**
 * The geo object itself and all of its parameters are optional, so default
 * values are not provided. If an optional parameter is not specified, it should
 * be considered unknown.
 * 
 * Note that the Geo Object may appear in one or both the Device Object and the
 * User Object. This is intentional, since the information may be derived from
 * either a device-oriented source (such as IP geo lookup), or by user
 * registration information (for example provided to a publisher through a user
 * registration). If the information is in conflict, it’s up to the bidder to
 * determine which information to use.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Geo {

    /**
     * Latitude from -90 to 90. South is negative. This should only be passed if
     * known to be accurate (For example, not the centroid of a postal code).
     */
    private Float lat = null;

    /**
     * Longitude from -180 to 180. West is negative. This should only be passed
     * if known to be accurate.
     */
    private Float lon = null;

    /**
     * Country using ISO-3166-1 Alpha-3.
     */
    private String country = null;

    /**
     * Region using ISO 3166-2.
     */
    private String region = null;

    /**
     * Region of a country using fips 10-4 notation (alternative to ISO 3166-2).
     */
    private String regionfips104 = null;

    /**
     * Pass the metro code (see
     * http://code.google.com/apis/adwords/docs/appendix/metrocodes.html). Metro
     * codes are similar to but not exactly the same as Nielsen DMAs.
     */
    private String metro = null;

    /**
     * City using United Nations Code for Trade and Transport Locations
     * (http://www.unece.org/cefact/locode/service/location.htm)
     */
    private String city = null;

    /**
     * Zip/postal code.
     */
    private String zip = null;

    /**
     * Indicate the source of the geo data (GPS, IP address, user provided). See
     * Specification Table 6.15 Location Type or {@link LocationType} for a list
     * of potential values. Type should be provided when lat/lon is provided.
     * 
     * Recommended.
     */
    private Integer type;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in this specification.
     */
    private String ext = null;

    /**
     * @return the lat
     */
    public Float getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(Float lat) {
        this.lat = lat;
    }

    /**
     * @return the lon
     */
    public Float getLon() {
        return lon;
    }

    /**
     * @param lon the lon to set
     */
    public void setLon(Float lon) {
        this.lon = lon;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return the regionfips104
     */
    public String getRegionfips104() {
        return regionfips104;
    }

    /**
     * @param regionfips104 the regionfips104 to set
     */
    public void setRegionfips104(String regionfips104) {
        this.regionfips104 = regionfips104;
    }

    /**
     * @return the metro
     */
    public String getMetro() {
        return metro;
    }

    /**
     * @param metro the metro to set
     */
    public void setMetro(String metro) {
        this.metro = metro;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @return the type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(Integer type) {
        this.type = type;
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
