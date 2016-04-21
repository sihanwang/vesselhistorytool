
package com.thomsonreuters.ce.vtclient.history.jdk;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HistoryOrderService", targetNamespace = "http://webservice.vesseltracker.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HistoryOrderService {


    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @param arg6
     * @param arg7
     * @param arg8
     * @return
     *     returns com.thomsonreuters.ce.vtclient.history.jdk.HistoryOrderInfo
     * @throws AccountLockedException_Exception
     * @throws InvalidArgumentException_Exception
     * @throws IncorrectPasswordException_Exception
     * @throws NoPermissionException_Exception
     * @throws UserNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDataByRegion", targetNamespace = "http://webservice.vesseltracker.com/", className = "com.thomsonreuters.ce.vtclient.history.jdk.GetDataByRegion")
    @ResponseWrapper(localName = "getDataByRegionResponse", targetNamespace = "http://webservice.vesseltracker.com/", className = "com.thomsonreuters.ce.vtclient.history.jdk.GetDataByRegionResponse")
    @Action(input = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByRegionRequest", output = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByRegionResponse", fault = {
        @FaultAction(className = UserNotFoundException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByRegion/Fault/UserNotFoundException"),
        @FaultAction(className = IncorrectPasswordException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByRegion/Fault/IncorrectPasswordException"),
        @FaultAction(className = AccountLockedException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByRegion/Fault/AccountLockedException"),
        @FaultAction(className = NoPermissionException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByRegion/Fault/NoPermissionException"),
        @FaultAction(className = InvalidArgumentException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByRegion/Fault/InvalidArgumentException")
    })
    public HistoryOrderInfo getDataByRegion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        Double arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        Double arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        Double arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        Double arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        XMLGregorianCalendar arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        XMLGregorianCalendar arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        String arg8)
        throws AccountLockedException_Exception, IncorrectPasswordException_Exception, InvalidArgumentException_Exception, NoPermissionException_Exception, UserNotFoundException_Exception
    ;

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.thomsonreuters.ce.vtclient.history.jdk.HistoryOrderInfo
     * @throws InvalidArgumentException_Exception
     * @throws AccountLockedException_Exception
     * @throws IncorrectPasswordException_Exception
     * @throws NoPermissionException_Exception
     * @throws UserNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDataByImoList", targetNamespace = "http://webservice.vesseltracker.com/", className = "com.thomsonreuters.ce.vtclient.history.jdk.GetDataByImoList")
    @ResponseWrapper(localName = "getDataByImoListResponse", targetNamespace = "http://webservice.vesseltracker.com/", className = "com.thomsonreuters.ce.vtclient.history.jdk.GetDataByImoListResponse")
    @Action(input = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByImoListRequest", output = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByImoListResponse", fault = {
        @FaultAction(className = UserNotFoundException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByImoList/Fault/UserNotFoundException"),
        @FaultAction(className = IncorrectPasswordException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByImoList/Fault/IncorrectPasswordException"),
        @FaultAction(className = AccountLockedException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByImoList/Fault/AccountLockedException"),
        @FaultAction(className = NoPermissionException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByImoList/Fault/NoPermissionException"),
        @FaultAction(className = InvalidArgumentException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByImoList/Fault/InvalidArgumentException")
    })
    public HistoryOrderInfo getDataByImoList(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        XMLGregorianCalendar arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        XMLGregorianCalendar arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5)
        throws AccountLockedException_Exception, IncorrectPasswordException_Exception, InvalidArgumentException_Exception, NoPermissionException_Exception, UserNotFoundException_Exception
    ;

    /**
     * 
     * @param arg5
     * @param arg4
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns com.thomsonreuters.ce.vtclient.history.jdk.HistoryOrderInfo
     * @throws InvalidArgumentException_Exception
     * @throws AccountLockedException_Exception
     * @throws IncorrectPasswordException_Exception
     * @throws NoPermissionException_Exception
     * @throws UserNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDataByShipIdList", targetNamespace = "http://webservice.vesseltracker.com/", className = "com.thomsonreuters.ce.vtclient.history.jdk.GetDataByShipIdList")
    @ResponseWrapper(localName = "getDataByShipIdListResponse", targetNamespace = "http://webservice.vesseltracker.com/", className = "com.thomsonreuters.ce.vtclient.history.jdk.GetDataByShipIdListResponse")
    @Action(input = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByShipIdListRequest", output = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByShipIdListResponse", fault = {
        @FaultAction(className = UserNotFoundException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByShipIdList/Fault/UserNotFoundException"),
        @FaultAction(className = IncorrectPasswordException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByShipIdList/Fault/IncorrectPasswordException"),
        @FaultAction(className = AccountLockedException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByShipIdList/Fault/AccountLockedException"),
        @FaultAction(className = NoPermissionException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByShipIdList/Fault/NoPermissionException"),
        @FaultAction(className = InvalidArgumentException_Exception.class, value = "http://webservice.vesseltracker.com/HistoryOrderService/getDataByShipIdList/Fault/InvalidArgumentException")
    })
    public HistoryOrderInfo getDataByShipIdList(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        XMLGregorianCalendar arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        XMLGregorianCalendar arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5)
        throws AccountLockedException_Exception, IncorrectPasswordException_Exception, InvalidArgumentException_Exception, NoPermissionException_Exception, UserNotFoundException_Exception
    ;

}
