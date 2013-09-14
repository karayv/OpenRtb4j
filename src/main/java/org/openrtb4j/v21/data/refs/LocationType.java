package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the options to indicate how the geographic
 * information was determined.
 * 
 * Specification Table 6.15
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface LocationType {

    /**
     * GPS/Location Services
     */
    int LOCATION_SERVICES = 1;

    /**
     * IP Address
     */
    int IP_ADDRESS = 2;

    /**
     * User provided (e.g., registration data)
     */
    int USER_PROVIDED = 3;

}
