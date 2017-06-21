
/**
 * UserNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.thomsonreuters.ce.vtclient.exportglobaldata;

public class UserNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1378782802938L;
    
    private com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.UserNotFoundExceptionE faultMessage;

    
        public UserNotFoundExceptionException() {
            super("UserNotFoundExceptionException");
        }

        public UserNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public UserNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public UserNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.UserNotFoundExceptionE msg){
       faultMessage = msg;
    }
    
    public com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.UserNotFoundExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    