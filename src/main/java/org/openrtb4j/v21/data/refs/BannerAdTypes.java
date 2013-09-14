package org.openrtb4j.v21.data.refs;

/**
 * The following table indicates the types of ads that can be accepted by the
 * exchange unless restricted by publisher site settings.
 * 
 * Specification Table 6.2
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface BannerAdTypes {

    /**
     * XHTML text ad. (usually mobile).
     */
    int XHTML_TEXT_AD = 1;

    /**
     * XHTML banner ad. (usually mobile).
     */
    int XHTML_BANNER_AD = 2;

    /**
     * JavaScript ad; must be valid XHTML (i.e., script tags included).
     */
    int JAVASCRIPT_AD = 3;

    /**
     * iFrame.
     */
    int IFRAME = 4;

}
