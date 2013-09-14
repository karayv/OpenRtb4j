package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the various options for the content context; what
 * type of content is it.
 * 
 * <i>Note to the reader:</i> This OpenRTB table has values derived from the IAB
 * Quality Assurance Guidelines (QAG). Users of OpenRTB should keep in synch
 * with updates to the QAG values as published on IAB.net.
 * 
 * Specification Table 6.13
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface ContentContext {

    /**
     * Video (a video file or stream that is being watched by the user,
     * including (Internet) television broadcasts)
     */
    int VIDEO = 1;

    /**
     * Game (an interactive software game that is being played by the user)
     */
    int GAME = 2;

    /**
     * Music (an audio file or stream that is being listened to by the user,
     * including (Internet) radio broadcasts)
     */
    int MUSIC = 3;

    /**
     * Application (an interactive software application that is being used by
     * the user)
     */
    int APPLICATION = 4;

    /**
     * Text (a document that is primarily textual in nature that is being read
     * or viewed by the user, including web page, ebook, or news article)
     */
    int TEXT = 5;

    /**
     * Other (content type unknown or the user is consuming content which does
     * not fit into one of the categories above)
     */
    int OTHER = 6;

    /**
     * Unknown
     */
    int UNKNOWN = 7;

}
