package org.openrtb4j.v21.data.refs;

/**
 * The following table specifies the position of the ad as a relative measure of
 * visibility or prominence. Note to the reader: This OpenRTB table has values
 * derived from the IAB Quality Assurance Guidelines (QAG). Users of OpenRTB
 * should keep in sync with updates to the QAG values as published on IAB.net.
 * Values 3-6 apply to native apps per the mobile addendum to the version 1.5 of
 * the QAG.
 * 
 * Specification Table 6.5
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface AdPosition {

    /**
     * Unknown.
     */
    int UNKNOWN = 0;
    
    /**
     * Above the fold. 
     */
    int ABOVE_THE_FOLD = 1;
    
    /**
     * DEPRECATED - May or may not be immediately visible depending on screen size and resolution. 
     */
    int DEPRECATED = 2;
    
    /**
     * Below the fold.
     */
    int BELOW_THE_FOLD = 3;
    
    /**
     * Header.
     */
    int HEADER = 4;
    
    /**
     * Footer.
     */
    int FOOTER = 5;
    
    /**
     * Sidebar 
     */
    int SIDEBAR = 6;
    
    /**
     * Fullscreen
     */
    int FULLSCREEN = 7;
    
}
