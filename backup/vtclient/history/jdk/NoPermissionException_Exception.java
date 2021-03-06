
package com.thomsonreuters.ce.vtclient.history.jdk;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NoPermissionException", targetNamespace = "http://webservice.vesseltracker.com/")
public class NoPermissionException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NoPermissionException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public NoPermissionException_Exception(String message, NoPermissionException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public NoPermissionException_Exception(String message, NoPermissionException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.thomsonreuters.ce.vtclient.history.jdk.NoPermissionException
     */
    public NoPermissionException getFaultInfo() {
        return faultInfo;
    }

}
