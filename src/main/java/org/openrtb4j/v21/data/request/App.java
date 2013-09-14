package org.openrtb4j.v21.data.request;

/**
 * An “app” object should be included if the ad supported content is part of a
 * mobile application (as opposed to a mobile website). A bid request must not
 * contain both an “app” object and a “site” object.
 * 
 * The app object itself and all of its parameters are optional, so default
 * values are not provided. If an optional parameter is not specified, it should
 * be considered unknown. At a minimum, it’s useful to provide an App ID or
 * bundle, but this is not strictly required.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class App {

    /**
     * Application ID on the exchange.
     * 
     * Recommended.
     */
    private String id;

    /**
     * Application name (may be masked at publisher’s request).
     */
    private String name = null;

    /**
     * Domain of the application (e.g., “mygame.foo.com”).
     */
    private String domain = null;

    /**
     * Array of IAB content categories for the overall application. See
     * Specification Table 6.1 Content Categories.
     */
    private String[] cat = null;

    /**
     * Array of IAB content categories for the current subsection of the app.
     * See Specification Table 6.1 Content Categories.
     */
    private String[] sectioncat = null;

    /**
     * Array of IAB content categories for the current page/view of the app. See
     * Specification Table 6.1 Content Categories.
     */
    private String[] pagecat = null;

    /**
     * Application version.
     */
    private String ver = null;

    /**
     * Application bundle or package name (e.g., com.foo.mygame). This is
     * intended to be a unique ID across multiple exchanges.
     * 
     * Recommended.
     */
    private String bundle;

    /**
     * Specifies whether the app has a privacy policy. “1” means there is a
     * policy and “0” means there is not.
     */
    private Integer privacypolicy = null;

    /**
     * “1” if the application is a paid version; else “0” (i.e., free).
     */
    private Integer paid = null;

    /**
     * See {@link Publisher} Object.
     */
    private Publisher publisher = null;

    /**
     * See {@link Content} Object.
     */
    private Content content = null;

    /**
     * List of keywords describing this app in a comma separated string.
     */
    private String keywords = null;

    /**
     * For QAG 1.5 compliance, an app store URL for an installed app should be
     * passed in the bid request.
     */
    private String storeurl = null;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined in the specification.
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain the domain to set
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return the cat
     */
    public String[] getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(String[] cat) {
        this.cat = cat;
    }

    /**
     * @return the sectioncat
     */
    public String[] getSectioncat() {
        return sectioncat;
    }

    /**
     * @param sectioncat the sectioncat to set
     */
    public void setSectioncat(String[] sectioncat) {
        this.sectioncat = sectioncat;
    }

    /**
     * @return the pagecat
     */
    public String[] getPagecat() {
        return pagecat;
    }

    /**
     * @param pagecat the pagecat to set
     */
    public void setPagecat(String[] pagecat) {
        this.pagecat = pagecat;
    }

    /**
     * @return the ver
     */
    public String getVer() {
        return ver;
    }

    /**
     * @param ver the ver to set
     */
    public void setVer(String ver) {
        this.ver = ver;
    }

    /**
     * @return the bundle
     */
    public String getBundle() {
        return bundle;
    }

    /**
     * @param bundle the bundle to set
     */
    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    /**
     * @return the privacypolicy
     */
    public Integer getPrivacypolicy() {
        return privacypolicy;
    }

    /**
     * @param privacypolicy the privacypolicy to set
     */
    public void setPrivacypolicy(Integer privacypolicy) {
        this.privacypolicy = privacypolicy;
    }

    /**
     * @return the paid
     */
    public Integer getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(Integer paid) {
        this.paid = paid;
    }

    /**
     * @return the publisher
     */
    public Publisher getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the content
     */
    public Content getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(Content content) {
        this.content = content;
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
     * @return the storeurl
     */
    public String getStoreurl() {
        return storeurl;
    }

    /**
     * @param storeurl the storeurl to set
     */
    public void setStoreurl(String storeurl) {
        this.storeurl = storeurl;
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
