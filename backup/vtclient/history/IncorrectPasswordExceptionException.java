
/**
 * IncorrectPasswordExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.thomsonreuters.ce.vtclient.history;

public class IncorrectPasswordExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1409019477328L;
    
    private com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.IncorrectPasswordException1 faultMessage;

    
        public IncorrectPasswordExceptionException() {
            super("IncorrectPasswordExceptionException");
        }

        public IncorrectPasswordExceptionException(java.lang.String s) {
           super(s);
        }

        public IncorrectPasswordExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public IncorrectPasswordExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.IncorrectPasswordException1 msg){
       faultMessage = msg;
    }
    
    public com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.IncorrectPasswordException1 getFaultMessage(){
       return faultMessage;
    }
}
    