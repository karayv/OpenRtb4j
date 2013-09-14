package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the various options for the video start delay. If
 * the start delay value is greater than 0 then the position is mid-roll, and
 * the value represents the number of seconds into the content that the ad will
 * be displayed. If the start delay time is not available, the exchange can
 * report the position of the ad in general terms using this table of negative
 * numbers.
 * 
 * Specification Table 6.9
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface VideoStartDelay {

    /**
     * Pre-roll
     */
    int PRE_ROLL = 0;

    /**
     * Generic mid-roll
     */
    int GENERIC_MID_ROLL = -1;

    /**
     * Generic Post-roll
     */
    int GENERIC_POST_ROLL = -2;

}
