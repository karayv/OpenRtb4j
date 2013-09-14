package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the various video playback methods.
 * 
 * Specification Table 6.8
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface VideoPlaybackMethods {

    /**
     * Auto-play sound on
     */
    int AUTO_PLAY_SOUND_ON = 1;
    
    /**
     * Auto-play sound off
     */
    int AUTO_PLAY_SOUND_OFF = 2;
    
    /**
     * Click-to-play
     */
    int CLICK_TO_PLAY = 3;
    
    /**
     * Mouse-over
     */
    int MOUSE_OVER = 4;
    
}
