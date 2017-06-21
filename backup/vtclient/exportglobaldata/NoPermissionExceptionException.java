
/**
 * NoPermissionExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.thomsonreuters.ce.vtclient.exportglobaldata;

public class NoPermissionExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1378782802969L;
    
    private com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.NoPermissionExceptionE faultMessage;

    
        public NoPermissionExceptionException() {
            super("NoPermissionExceptionException");
        }

        public NoPermissionExceptionException(java.lang.String s) {
           super(s);
        }

        public NoPermissionExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public NoPermissionExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.NoPermissionExceptionE msg){
       faultMessage = msg;
    }
    
    public com.thomsonreuters.ce.vtclient.exportglobaldata.GlobalSatExportServiceStub.NoPermissionExceptionE getFaultMessage(){
       return faultMessage;
    }
}
    