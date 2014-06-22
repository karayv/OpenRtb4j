package org.openrtb4j.v21.data.request;

import org.openrtb4j.v21.data.refs.ConnectionType;
import org.openrtb4j.v21.data.refs.DeviceType;

/**
 * The “device” object provides information pertaining to the device including
 * its hardware, platform, location, and carrier. This device can refer to a
 * mobile handset, a desktop computer, set top box or other digital device.
 * 
 * The device object itself and all of its parameters are optional, so default
 * values are not provided. If an optional parameter is not specified, it should
 * be considered unknown.
 * 
 * In general, the most essential fields are either the IP address (to enable
 * geo-lookup for the bidder), or providing geo information directly in the geo
 * object.
 * 
 * <i>BEST PRACTICE:</i> There are currently no prominent open source lists for
 * device makes, models, operating systems, or carriers. Exchanges typically use
 * commercial products or other proprietary lists for these attributes. Until
 * suitable open standards are available, exchanges are highly encouraged to
 * publish lists of their device make, model, operating system, and carrier
 * values to bidders. 
 * 
 * <i>BEST PRACTICE:</i> Proper device IP detection in mobile
 * is not straightforward. Typically it involves starting at the left of the
 * x-forwarded-for header, skipping private carrier networks (e.g., 10.x.x.x or
 * 192.x.x.x), and possibly scanning for known carrier IP ranges. Exchanges are
 * urged to research and implement this feature carefully when presenting device
 * IP values to bidders
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Device {

    /**
     * If “0”, then do not track Is set to false, if “1”, then do no track is
     * set to true in browser.
     * 
     * Recommended.
     */
    private Integer dnt;

    /**
     * Browser user agent string.
     * 
     * Recommended.
     */
    private String ua;

    /**
     * IPv4 address closest to device.
     * 
     * Recommended if geo object is not supplied.
     */
    private String ip;

    /**
     * Geography as derived from the device’s location services (e.g., cell
     * tower triangulation, GPS) or IP address. See Error! Reference source ot
     * found..
     * 
     * See {@link Geo} Object.
     * 
     * Recommended if IP is not supplied.
     */
    private Geo geo;

    /**
     * SHA1 hashed device ID; IMEI when available, else MEID or ESN. OpenRTB’s
     * preferred method for device ID hashing is SHA1.
     */
    private String didsha1 = null;

    /**
     * MD5 hashed device ID; IMEI when available, else MEID or ESN. Should be
     * interpreted as case insensitive.
     */
    private String didmd5 = null;

    /**
     * SHA1 hashed platform-specific ID (e.g., Android ID or UDID for iOS).
     * OpenRTB’s preferred method for device ID hash is SHA1.
     */
    private String dpidsha1 = null;

    /**
     * MD5 hashed platform-specific ID (e.g., Android ID or UDID for iOS).
     * Should be interpreted as case insensitive.
     */
    private String dpidmd5 = null;

    /**
     * IP address in IPv6.
     */
    private String ipv6 = null;

    /**
     * Carrier or ISP derived from the IP address. Should be specified using
     * Mobile Network Code (MNC)
     * http://en.wikipedia.org/wiki/Mobile_Network_Code
     */
    private String carrier = null;

    /**
     * Browser language; use alpha-2/ISO 639-1 codes.
     */
    private String language = null;

    /**
     * Device make (e.g., “Apple”).
     */
    private String make = null;

    /**
     * Device model (e.g., “iPhone”).
     */
    private String model = null;

    /**
     * Device operating system (e.g., “iOS”).
     */
    private String os = null;

    /**
     * Device operating system version (e.g., “3.1.2”).
     */
    private String osv = null;

    /**
     * “1” if the device supports JavaScript; else “0”.
     */
    private Integer js = null;

    /**
     * Return the detected data connection type for the device. See
     * Specification Table 6.10 Connection Type or {@link ConnectionType}.
     */
    private Integer connectiontype = null;

    /**
     * Return the device type being used. See Specification Table 6.16 Device
     * Type or {@link DeviceType}.
     */
    private Integer devicetype = null;

    /**
     * Return the Flash version detected.
     */
    private String flashver = null;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in this specification.
     */
    private Object ext = null;

    /**
     * @return the dnt
     */
    public Integer getDnt() {
        return dnt;
    }

    /**
     * @param dnt the dnt to set
     */
    public void setDnt(Integer dnt) {
        this.dnt = dnt;
    }

    /**
     * @return the ua
     */
    public String getUa() {
        return ua;
    }

    /**
     * @param ua the ua to set
     */
    public void setUa(String ua) {
        this.ua = ua;
    }

    /**
     * @return the ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(String ip) {
        this.ip = ip;
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
     * @return the didsha1
     */
    public String getDidsha1() {
        return didsha1;
    }

    /**
     * @param didsha1 the didsha1 to set
     */
    public void setDidsha1(String didsha1) {
        this.didsha1 = didsha1;
    }

    /**
     * @return the didmd5
     */
    public String getDidmd5() {
        return didmd5;
    }

    /**
     * @param didmd5 the didmd5 to set
     */
    public void setDidmd5(String didmd5) {
        this.didmd5 = didmd5;
    }

    /**
     * @return the dpidsha1
     */
    public String getDpidsha1() {
        return dpidsha1;
    }

    /**
     * @param dpidsha1 the dpidsha1 to set
     */
    public void setDpidsha1(String dpidsha1) {
        this.dpidsha1 = dpidsha1;
    }

    /**
     * @return the dpidmd5
     */
    public String getDpidmd5() {
        return dpidmd5;
    }

    /**
     * @param dpidmd5 the dpidmd5 to set
     */
    public void setDpidmd5(String dpidmd5) {
        this.dpidmd5 = dpidmd5;
    }

    /**
     * @return the ipv6
     */
    public String getIpv6() {
        return ipv6;
    }

    /**
     * @param ipv6 the ipv6 to set
     */
    public void setIpv6(String ipv6) {
        this.ipv6 = ipv6;
    }

    /**
     * @return the carrier
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * @param carrier the carrier to set
     */
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the os
     */
    public String getOs() {
        return os;
    }

    /**
     * @param os the os to set
     */
    public void setOs(String os) {
        this.os = os;
    }

    /**
     * @return the osv
     */
    public String getOsv() {
        return osv;
    }

    /**
     * @param osv the osv to set
     */
    public void setOsv(String osv) {
        this.osv = osv;
    }

    /**
     * @return the js
     */
    public Integer getJs() {
        return js;
    }

    /**
     * @param js the js to set
     */
    public void setJs(Integer js) {
        this.js = js;
    }

    /**
     * @return the connectiontype
     */
    public Integer getConnectiontype() {
        return connectiontype;
    }

    /**
     * @param connectiontype the connectiontype to set
     */
    public void setConnectiontype(Integer connectiontype) {
        this.connectiontype = connectiontype;
    }

    /**
     * @return the devicetype
     */
    public Integer getDevicetype() {
        return devicetype;
    }

    /**
     * @param devicetype the devicetype to set
     */
    public void setDevicetype(Integer devicetype) {
        this.devicetype = devicetype;
    }

    /**
     * @return the flashver
     */
    public String getFlashver() {
        return flashver;
    }

    /**
     * @param flashver the flashver to set
     */
    public void setFlashver(String flashver) {
        this.flashver = flashver;
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
