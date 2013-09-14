package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the media ratings using the QAG categorization. See
 * http://www.iab.net/ne_guidelines for more information.
 * 
 * Specification Table 6.18
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface QAGMediaRatings {

    /**
     * All Audiences
     */
    int ALL_AUDIENCES = 1;

    /**
     * Everyone over 12
     */
    int EVERYONE_OVER_12 = 2;

    /**
     * Mature Audiences
     */
    int MATURE_AUDIENCES = 3;

}
