package org.openrtb4j.v21.data.request;

import org.openrtb4j.v21.data.refs.ContentContext;
import org.openrtb4j.v21.data.refs.QAGMediaRatings;
import org.openrtb4j.v21.data.refs.VideoQuality;

/**
 * The content object itself and all of its parameters are optional, so default
 * values are not provided. If an optional parameter is not specified, it should
 * be considered unknown. This object describes the content in which the
 * impression will appear (may be syndicated or nonsyndicated content).
 * 
 * This object may be useful in the situation where syndicated content contains
 * impressions and does not necessarily match the publisher’s general content.
 * The exchange might or might not have knowledge of the page where the content
 * is running, as a result of the syndication method. (For example, video
 * impressions embedded in an iframe on an unknown web property or device.)
 * 
 * @author Andrey Karayvansky
 * 
 */
public class Content {

    /**
     * ID uniquely identifying the content.
     */
    private String id = null;

    /**
     * Content episode number (typically applies to video content).
     */
    private Integer episode = null;

    /**
     * Content title.
     * 
     * <b>Video examples:</b> “Search Committee” (television) or “A New Hope”
     * (movie) or “Endgame” (made for web)
     * 
     * <b>Non-video example:</b> “Why an Antarctic Glacier Is Melting So
     * Quickly” (Time magazine article)
     */
    private String title = null;

    /**
     * Content series.
     * 
     * <b>Video examples:</b> “The Office” (television) or “Star Wars” (movie)
     * or “Arby ‘N’ The Chief” (made for web)
     * 
     * <b>Non-video example:</b>: “Ecocentric” (Time magazine blog)
     */
    private String series = null;

    /**
     * Content season. E.g., “Season 3” (typically applies to video content).
     */
    private String season = null;

    /**
     * Original URL of the content, for buy-side contextualization or review.
     */
    private String url = null;

    /**
     * Array of IAB content categories for the content. See Specification Table
     * 6.1 Content Categories.
     */
    private String[] cat = null;

    /**
     * Video quality per the IAB’s classification. See Specification Table 6.14
     * Video Quality or {@link VideoQuality}.
     */
    private Integer videoquality = null;

    /**
     * Comma separated list of keywords describing the content.
     */
    private String keywords = null;

    /**
     * Content rating (e.g., MPAA).
     */
    private String contentrating = null;

    /**
     * User rating of the content (e.g., number of stars, likes, etc.).
     */
    private String userrating = null;

    /**
     * Specifies the type of content (game, video, text, etc.). See
     * Specification Table 6.13 Content Context or {@link ContentContext}.
     */
    private String context = null;

    /**
     * Is content live? E.g., live video stream, live blog. “1” means content is
     * live. “0” means it is not live.
     */
    private Integer livestream = null;

    /**
     * 1 for “direct”; 0 for “indirect”.
     */
    private Integer sourcerelationship = null;

    /**
     * See {@link Publisher} Object.
     */
    private Producer producer = null;

    /**
     * Length of content (appropriate for video or audio) in seconds.
     */
    private Integer len = null;

    /**
     * Media rating of the content, per QAG guidelines. See Specification Table
     * 6.18 QAG Media Ratings or {@link QAGMediaRatings} for list of possible
     * values.
     */
    private Integer qagmediarating = null;

    /**
     * From QAG Video Addendum. If content can be embedded (such as an
     * embeddable video player) this value should be set to “1”. If content
     * cannot be embedded, then this should be set to “0”.
     */
    private Integer embeddable = null;

    /**
     * Language of the content. Use alpha-2/ISO 639-1 codes.
     */
    private String language = null;

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
     * @return the episode
     */
    public Integer getEpisode() {
        return episode;
    }

    /**
     * @param episode the episode to set
     */
    public void setEpisode(Integer episode) {
        this.episode = episode;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the series
     */
    public String getSeries() {
        return series;
    }

    /**
     * @param series the series to set
     */
    public void setSeries(String series) {
        this.series = series;
    }

    /**
     * @return the season
     */
    public String getSeason() {
        return season;
    }

    /**
     * @param season the season to set
     */
    public void setSeason(String season) {
        this.season = season;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
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
     * @return the videoquality
     */
    public Integer getVideoquality() {
        return videoquality;
    }

    /**
     * @param videoquality the videoquality to set
     */
    public void setVideoquality(Integer videoquality) {
        this.videoquality = videoquality;
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
     * @return the contentrating
     */
    public String getContentrating() {
        return contentrating;
    }

    /**
     * @param contentrating the contentrating to set
     */
    public void setContentrating(String contentrating) {
        this.contentrating = contentrating;
    }

    /**
     * @return the userrating
     */
    public String getUserrating() {
        return userrating;
    }

    /**
     * @param userrating the userrating to set
     */
    public void setUserrating(String userrating) {
        this.userrating = userrating;
    }

    /**
     * @return the context
     */
    public String getContext() {
        return context;
    }

    /**
     * @param context the context to set
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * @return the livestream
     */
    public Integer getLivestream() {
        return livestream;
    }

    /**
     * @param livestream the livestream to set
     */
    public void setLivestream(Integer livestream) {
        this.livestream = livestream;
    }

    /**
     * @return the sourcerelationship
     */
    public Integer getSourcerelationship() {
        return sourcerelationship;
    }

    /**
     * @param sourcerelationship the sourcerelationship to set
     */
    public void setSourcerelationship(Integer sourcerelationship) {
        this.sourcerelationship = sourcerelationship;
    }

    /**
     * @return the producer
     */
    public Producer getProducer() {
        return producer;
    }

    /**
     * @param producer the producer to set
     */
    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    /**
     * @return the len
     */
    public Integer getLen() {
        return len;
    }

    /**
     * @param len the len to set
     */
    public void setLen(Integer len) {
        this.len = len;
    }

    /**
     * @return the qagmediarating
     */
    public Integer getQagmediarating() {
        return qagmediarating;
    }

    /**
     * @param qagmediarating the qagmediarating to set
     */
    public void setQagmediarating(Integer qagmediarating) {
        this.qagmediarating = qagmediarating;
    }

    /**
     * @return the embeddable
     */
    public Integer getEmbeddable() {
        return embeddable;
    }

    /**
     * @param embeddable the embeddable to set
     */
    public void setEmbeddable(Integer embeddable) {
        this.embeddable = embeddable;
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
