
/**
 * BadFormatExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.thomsonreuters.ce.vtclient.exportglobaldata;

public class BadFormatExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1378782802985L;
    
    private com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.BadFormatExceptionE faultMessage;

    
        public BadFormatExceptionException() {
            super("BadFormatExceptionException");
        }

        public BadFormatExceptionException(java.lang.String s) {
           super(s);
        }

        public BadFormatExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public BadFormatExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.BadFormatExceptionE msg){
       faultMessage = msg;
    }
    
    public com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.BadFormatExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    