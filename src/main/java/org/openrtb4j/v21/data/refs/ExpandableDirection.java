package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the directions in which an expandable ad may
 * expand, given the positioning of the ad unit on the page and constraints
 * imposed by the content.
 * 
 * Specification Table 6.11
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface ExpandableDirection {

    /**
     * Left
     */
    int LEFT = 1;

    /**
     * Right
     */
    int RIGHT = 2;
    
    /**
     * Up
     */
    int UP = 3;
    
    /**
     * Down 
     */
    int DOWN = 4;
    
    /**
     * Fullscreen
     */
    int FULLSCREEN = 5;

}
