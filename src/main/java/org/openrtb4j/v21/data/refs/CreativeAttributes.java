package org.openrtb4j.v21.data.refs;

/**
 * The following table specifies a standard list of creative attributes that can
 * describe an ad being served or serve as restrictions of thereof.
 * 
 * Specification Table 6.3
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface CreativeAttributes {

    /**
     * Audio Ad (Auto Play)
     */
    int AUDIO_AD_AUTO_PLAY = 1;

    /**
     * Audio Ad (User Initiated)
     */
    int AUDIO_AD_USER_INITIATED = 2;

    /**
     * Expandable (Automatic)
     */
    int EXPANDABLE_AUTOMATIC = 3;

    /**
     * Expandable (User Initiated - Click)
     */
    int EXPANDABLE_USER_INITIATED_CLICK = 4;

    /**
     * Expandable (User Initiated - Rollover)
     */
    int EXPANDABLE_USER_INITIATED_ROLLOVER = 5;

    /**
     * In-Banner Video Ad (Auto Play)
     */
    int IN_BANNER_VIDEO_AD_AUTO_PLAY = 6;

    /**
     * In-Banner Video Ad (User Initiated)
     */
    int IN_BANNER_VIDEO_AD_USER_INITIATED = 7;

    /**
     * Pop (e.g., Over, Under, or upon Exit)
     */
    int POP = 8;

    /**
     * Provocative or Suggestive Imagery
     */
    int PROVOCATIVE_OR_SUGGESTIVE_IMAGERY = 9;

    /**
     * Shaky, Flashing, Flickering, Extreme Animation, Smileys
     */
    int SHAKY_FLASHING_FLICKERING_EXTREME_ANIMATION_SMILEYS = 10;

    /**
     * Surveys
     */
    int SURVEYS = 11;

    /**
     * Text Only
     */
    int TEXT_ONLY = 12;

    /**
     * User Interactive (e.g., Embedded Games)
     */
    int USER_INTERACTIVE = 13;

    /**
     * Windows Dialog or Alert Style
     */
    int WINDOWS_DIALOG_OR_ALERT_STYLE = 14;

    /**
     * Has audio on/off button
     */
    int HAS_AUDIO_ON_OFF_BUTTON = 15;

    /**
     * Ad can be skipped (e.g., skip button on preroll video)
     */
    int AD_CAN_BE_SKIPPED = 16;

}
