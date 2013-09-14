package org.openrtb4j.v21.data.refs;

/**
 * The following table lists the options for video bid response protocols that
 * could be supported by an exchange.
 * 
 * Specification Table 6.7
 * 
 * @author Andrey Karayvansky
 * 
 */
public interface VideoBidResponseProtocols {
    
    /**
     * VAST 1.0 
     */
    int VAST_10 = 1;
    
    /**
     * VAST 2.0 
     */
    int VAST_20 = 2;
    
    /**
     * VAST 3.0 
     */
    int VAST_30 = 3;
    
    /**
     * VAST 1.0 Wrapper 
     */
    int VAST_10_WRAPPER = 4;
    
    /**
     * VAST 2.0 Wrapper
     */
    int VAST_20_WRAPPER = 5;
    
    /**
     * VAST 3.0 Wrapper
     */
    int VAST_30_WRAPPER = 6;
    
}
