
package com.vesseltracker.web.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vesseltracker.web.webservice package. 
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

    private final static QName _IncorrectPasswordException_QNAME = new QName("http://webservice.web.vesseltracker.com", "IncorrectPasswordException");
    private final static QName _NoPermissionException_QNAME = new QName("http://webservice.web.vesseltracker.com", "NoPermissionException");
    private final static QName _UserNotFoundException_QNAME = new QName("http://webservice.web.vesseltracker.com", "UserNotFoundException");
    private final static QName _AccountLockedException_QNAME = new QName("http://webservice.web.vesseltracker.com", "AccountLockedException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vesseltracker.web.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserNotFoundException }
     * 
     */
    public UserNotFoundException createUserNotFoundException() {
        return new UserNotFoundException();
    }

    /**
     * Create an instance of {@link AccountLockedException }
     * 
     */
    public AccountLockedException createAccountLockedException() {
        return new AccountLockedException();
    }

    /**
     * Create an instance of {@link IncorrectPasswordException }
     * 
     */
    public IncorrectPasswordException createIncorrectPasswordException() {
        return new IncorrectPasswordException();
    }

    /**
     * Create an instance of {@link NoPermissionException }
     * 
     */
    public NoPermissionException createNoPermissionException() {
        return new NoPermissionException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncorrectPasswordException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.web.vesseltracker.com", name = "IncorrectPasswordException")
    public JAXBElement<IncorrectPasswordException> createIncorrectPasswordException(IncorrectPasswordException value) {
        return new JAXBElement<IncorrectPasswordException>(_IncorrectPasswordException_QNAME, IncorrectPasswordException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoPermissionException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.web.vesseltracker.com", name = "NoPermissionException")
    public JAXBElement<NoPermissionException> createNoPermissionException(NoPermissionException value) {
        return new JAXBElement<NoPermissionException>(_NoPermissionException_QNAME, NoPermissionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.web.vesseltracker.com", name = "UserNotFoundException")
    public JAXBElement<UserNotFoundException> createUserNotFoundException(UserNotFoundException value) {
        return new JAXBElement<UserNotFoundException>(_UserNotFoundException_QNAME, UserNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountLockedException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.web.vesseltracker.com", name = "AccountLockedException")
    public JAXBElement<AccountLockedException> createAccountLockedException(AccountLockedException value) {
        return new JAXBElement<AccountLockedException>(_AccountLockedException_QNAME, AccountLockedException.class, null, value);
    }

}
