
/**
 * IncorrectPasswordExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.thomsonreuters.ce.vtclient.exportglobaldata;

public class IncorrectPasswordExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1378782803001L;
    
    private com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.IncorrectPasswordExceptionE faultMessage;

    
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
    

    public void setFaultMessage(com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.IncorrectPasswordExceptionE msg){
       faultMessage = msg;
    }
    
    public com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.IncorrectPasswordExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    