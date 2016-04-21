
package com.thomsonreuters.ce.vtclient.history.jdk;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.thomsonreuters.ce.vtclient.history.jdk package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetDataByImoList_QNAME = new QName("http://webservice.vesseltracker.com/", "getDataByImoList");
    private final static QName _NoPermissionException_QNAME = new QName("http://webservice.vesseltracker.com/", "NoPermissionException");
    private final static QName _GetDataByRegion_QNAME = new QName("http://webservice.vesseltracker.com/", "getDataByRegion");
    private final static QName _IncorrectPasswordException_QNAME = new QName("http://webservice.vesseltracker.com/", "IncorrectPasswordException");
    private final static QName _InvalidArgumentException_QNAME = new QName("http://webservice.vesseltracker.com/", "InvalidArgumentException");
    private final static QName _GetDataByShipIdList_QNAME = new QName("http://webservice.vesseltracker.com/", "getDataByShipIdList");
    private final static QName _GetDataByRegionResponse_QNAME = new QName("http://webservice.vesseltracker.com/", "getDataByRegionResponse");
    private final static QName _AccountLockedException_QNAME = new QName("http://webservice.vesseltracker.com/", "AccountLockedException");
    private final static QName _GetDataByImoListResponse_QNAME = new QName("http://webservice.vesseltracker.com/", "getDataByImoListResponse");
    private final static QName _UserNotFoundException_QNAME = new QName("http://webservice.vesseltracker.com/", "UserNotFoundException");
    private final static QName _GetDataByShipIdListResponse_QNAME = new QName("http://webservice.vesseltracker.com/", "getDataByShipIdListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.thomsonreuters.ce.vtclient.history.jdk
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountLockedException }
     * 
     */
    public AccountLockedException createAccountLockedException() {
        return new AccountLockedException();
    }

    /**
     * Create an instance of {@link UserNotFoundException }
     * 
     */
    public UserNotFoundException createUserNotFoundException() {
        return new UserNotFoundException();
    }

    /**
     * Create an instance of {@link NoPermissionException }
     * 
     */
    public NoPermissionException createNoPermissionException() {
        return new NoPermissionException();
    }

    /**
     * Create an instance of {@link IncorrectPasswordException }
     * 
     */
    public IncorrectPasswordException createIncorrectPasswordException() {
        return new IncorrectPasswordException();
    }

    /**
     * Create an instance of {@link GetDataByImoListResponse }
     * 
     */
    public GetDataByImoListResponse createGetDataByImoListResponse() {
        return new GetDataByImoListResponse();
    }

    /**
     * Create an instance of {@link GetDataByRegionResponse }
     * 
     */
    public GetDataByRegionResponse createGetDataByRegionResponse() {
        return new GetDataByRegionResponse();
    }

    /**
     * Create an instance of {@link GetDataByShipIdListResponse }
     * 
     */
    public GetDataByShipIdListResponse createGetDataByShipIdListResponse() {
        return new GetDataByShipIdListResponse();
    }

    /**
     * Create an instance of {@link GetDataByImoList }
     * 
     */
    public GetDataByImoList createGetDataByImoList() {
        return new GetDataByImoList();
    }

    /**
     * Create an instance of {@link GetDataByShipIdList }
     * 
     */
    public GetDataByShipIdList createGetDataByShipIdList() {
        return new GetDataByShipIdList();
    }

    /**
     * Create an instance of {@link InvalidArgumentException }
     * 
     */
    public InvalidArgumentException createInvalidArgumentException() {
        return new InvalidArgumentException();
    }

    /**
     * Create an instance of {@link GetDataByRegion }
     * 
     */
    public GetDataByRegion createGetDataByRegion() {
        return new GetDataByRegion();
    }

    /**
     * Create an instance of {@link HistoryOrderInfo }
     * 
     */
    public HistoryOrderInfo createHistoryOrderInfo() {
        return new HistoryOrderInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataByImoList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "getDataByImoList")
    public JAXBElement<GetDataByImoList> createGetDataByImoList(GetDataByImoList value) {
        return new JAXBElement<GetDataByImoList>(_GetDataByImoList_QNAME, GetDataByImoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoPermissionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "NoPermissionException")
    public JAXBElement<NoPermissionException> createNoPermissionException(NoPermissionException value) {
        return new JAXBElement<NoPermissionException>(_NoPermissionException_QNAME, NoPermissionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataByRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "getDataByRegion")
    public JAXBElement<GetDataByRegion> createGetDataByRegion(GetDataByRegion value) {
        return new JAXBElement<GetDataByRegion>(_GetDataByRegion_QNAME, GetDataByRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncorrectPasswordException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "IncorrectPasswordException")
    public JAXBElement<IncorrectPasswordException> createIncorrectPasswordException(IncorrectPasswordException value) {
        return new JAXBElement<IncorrectPasswordException>(_IncorrectPasswordException_QNAME, IncorrectPasswordException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidArgumentException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "InvalidArgumentException")
    public JAXBElement<InvalidArgumentException> createInvalidArgumentException(InvalidArgumentException value) {
        return new JAXBElement<InvalidArgumentException>(_InvalidArgumentException_QNAME, InvalidArgumentException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataByShipIdList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "getDataByShipIdList")
    public JAXBElement<GetDataByShipIdList> createGetDataByShipIdList(GetDataByShipIdList value) {
        return new JAXBElement<GetDataByShipIdList>(_GetDataByShipIdList_QNAME, GetDataByShipIdList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataByRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "getDataByRegionResponse")
    public JAXBElement<GetDataByRegionResponse> createGetDataByRegionResponse(GetDataByRegionResponse value) {
        return new JAXBElement<GetDataByRegionResponse>(_GetDataByRegionResponse_QNAME, GetDataByRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountLockedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "AccountLockedException")
    public JAXBElement<AccountLockedException> createAccountLockedException(AccountLockedException value) {
        return new JAXBElement<AccountLockedException>(_AccountLockedException_QNAME, AccountLockedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataByImoListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "getDataByImoListResponse")
    public JAXBElement<GetDataByImoListResponse> createGetDataByImoListResponse(GetDataByImoListResponse value) {
        return new JAXBElement<GetDataByImoListResponse>(_GetDataByImoListResponse_QNAME, GetDataByImoListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "UserNotFoundException")
    public JAXBElement<UserNotFoundException> createUserNotFoundException(UserNotFoundException value) {
        return new JAXBElement<UserNotFoundException>(_UserNotFoundException_QNAME, UserNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDataByShipIdListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.vesseltracker.com/", name = "getDataByShipIdListResponse")
    public JAXBElement<GetDataByShipIdListResponse> createGetDataByShipIdListResponse(GetDataByShipIdListResponse value) {
        return new JAXBElement<GetDataByShipIdListResponse>(_GetDataByShipIdListResponse_QNAME, GetDataByShipIdListResponse.class, null, value);
    }

}
