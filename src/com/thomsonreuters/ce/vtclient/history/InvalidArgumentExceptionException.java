
/**
 * InvalidArgumentExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.thomsonreuters.ce.vtclient.history;

public class InvalidArgumentExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1409019477318L;
    
    private com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.InvalidArgumentExceptionE faultMessage;

    
        public InvalidArgumentExceptionException() {
            super("InvalidArgumentExceptionException");
        }

        public InvalidArgumentExceptionException(java.lang.String s) {
           super(s);
        }

        public InvalidArgumentExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public InvalidArgumentExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.InvalidArgumentExceptionE msg){
       faultMessage = msg;
    }
    
    public com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.InvalidArgumentExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    