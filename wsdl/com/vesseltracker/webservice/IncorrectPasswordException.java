
package com.vesseltracker.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IncorrectPasswordException", targetNamespace = "http://webservice.vesseltracker.com/")
public class IncorrectPasswordException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private com.vesseltracker.web.webservice.IncorrectPasswordException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public IncorrectPasswordException(String message, com.vesseltracker.web.webservice.IncorrectPasswordException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public IncorrectPasswordException(String message, com.vesseltracker.web.webservice.IncorrectPasswordException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.vesseltracker.web.webservice.IncorrectPasswordException
     */
    public com.vesseltracker.web.webservice.IncorrectPasswordException getFaultInfo() {
        return faultInfo;
    }

}