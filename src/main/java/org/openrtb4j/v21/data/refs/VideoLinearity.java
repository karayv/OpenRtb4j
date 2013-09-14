package org.openrtb4j.v21.data.refs;

/**
 * The following table indicates the options for video linearity. "In-stream" or
 * "linear" video refers to pre-roll, post-roll, or mid-roll video ads where the
 * user is forced to watch ad in order to see the video content. “Overlay” or
 * “non-linear” refer to ads that are shown on top of the video content. Note to
 * the reader: This OpenRTB table has values derived from the IAB Quality
 * Assurance Guidelines (QAG). Users of OpenRTB should keep in synch with
 * updates to the QAG values as published on IAB.net.
 * 
 * Specification Table 6.6
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface VideoLinearity {
    
    /**
     * Linear/In-stream 
     */
    int LINEAR = 1;
    
    /**
     * Non-Linear/Overlay
     */
    int NON_LINEAR = 2;
}
