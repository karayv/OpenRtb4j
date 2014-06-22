package org.openrtb4j.v21.data.request;

/**
 * A site object should be included if the ad supported content is part of a
 * website (as opposed to an application). <b>A bid request must not contain
 * both a site object and an app object.</b>
 * 
 * The site object itself and all of its parameters are optional, so default
 * values are not provided. If an optional parameter is not specified, it should
 * be considered unknown. At a minimum, it’s useful to provide a page URL or a
 * site ID, but this is not strictly required.
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Site {

    /**
     * Site ID on the exchange.
     * 
     * Recommended.
     */
    private String id;

    /**
     * Site name (may be masked at publisher’s request).
     */
    private String name = null;

    /**
     * g Domain of the site, used for advertiser side blocking. For example,
     * “foo.com”.
     */
    private String domain = null;

    /**
     * Array of IAB content categories for the overall site. See Specification Table 6.1
     * Content Categories.
     */
    private String[] cat = null;

    /**
     * Array of IAB content categories for the current subsection of the site.
     * See Specification Table 6.1 Content Categories.
     */
    private String[] sectioncat = null;

    /**
     * Array of IAB content categories for the current page. See Specification Table 6.1
     * Content Categories.
     */
    private String[] pagecat = null;

    /**
     * URL of the page where the impression will be shown.
     */
    private String page = null;

    /**
     * Specifies whether the site has a privacy policy. “1” means there is a
     * policy. “0” means there is not.
     */
    private Integer privacypolicy = null;

    /**
     * Referrer URL that caused navigation to the current page.
     */
    private String ref = null;

    /**
     * Search string that caused navigation to the current page.
     */
    private String search = null;

    /**
     * See {@link Publisher} Object.
     */
    private Publisher publisher = null;

    /**
     * See {@link Content} Object.
     */
    private Content content = null;

    /**
     * List of keywords describing this site in a comma separated string.
     */
    private String keywords = null;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by
     * the parties in an OpenRTB transaction to support flexibility beyond the
     * standard defined.
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
     * @return the page
     */
    public String getPage() {
        return page;
    }

    /**
     * @param page the page to set
     */
    public void setPage(String page) {
        this.page = page;
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
     * @return the ref
     */
    public String getRef() {
        return ref;
    }

    /**
     * @param ref the ref to set
     */
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * @return the search
     */
    public String getSearch() {
        return search;
    }

    /**
     * @param search the search to set
     */
    public void setSearch(String search) {
        this.search = search;
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
