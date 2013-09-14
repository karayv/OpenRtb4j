package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the options for the video quality (as defined by
 * the IAB – http://www.iab.net/media/file/long-form-video-final.pdf).
 * 
 * Specification Table 6.14
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface VideoQuality {

    /**
     * Unknown
     */
    int UNKNOWN = 0;

    /**
     * Professionally Produced
     */
    int PROFESSIONALLY_PRODUCED = 1;

    /**
     * Prosumer
     */
    int PROSUMER = 2;

    /**
     * User Generated (UGC)
     */
    int USER_GENERATED = 3;

}
