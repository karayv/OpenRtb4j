package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the options to indicate markup types allowed for
 * video companion ads. This table is derived from IAB VAST 2.0+. See
 * www.iab.net/vast/ for more information.
 * 
 * Specification Table 6.17
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface VASTCompanionTypes {

    /**
     * Static Resource
     */
    int STATIC_RESOURCE = 1;

    /**
     * HTML Resource
     */
    int HTML_RESOURCE = 2;

    /**
     * iframe Resource
     */
    int IFRAME_RESOURCE = 3;

}
