
/**
 * AccountLockedExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package com.thomsonreuters.ce.vtclient.history;

public class AccountLockedExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1409019477289L;
    
    private com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.AccountLockedException2 faultMessage;

    
        public AccountLockedExceptionException() {
            super("AccountLockedExceptionException");
        }

        public AccountLockedExceptionException(java.lang.String s) {
           super(s);
        }

        public AccountLockedExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public AccountLockedExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.AccountLockedException2 msg){
       faultMessage = msg;
    }
    
    public com.thomsonreuters.ce.vtclient.history.HistoryOrderServiceServiceStub.AccountLockedException2 getFaultMessage(){
       return faultMessage;
    }
}
    