package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the various options for the connection type.
 * 
 * Specification Table 6.10
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface ConnectionType {

    /**
     * Unknown 
     */
    int UNKNOWN = 0;

    /**
     * Ethernet 
     */
    int ETHERNET = 1;
    
    /**
     * Wifi 
     */
    int WIFI = 2;
    
    /**
     * Cellular data – Unknown Generation 
     */
    int CELLULAR_DATA_UNKNOWN_GENERATION = 3;
    
    /**
     * Cellular data – 2G 
     */
    int CELLULAR_DATA_2G = 4;
    
    /**
     * Cellular data – 3G 
     */
    int CELLULAR_DATA_3G = 5;
    
    /**
     * Cellular data – 4G
     */
    int CELLULAR_DATA_4G = 6;
    
}
