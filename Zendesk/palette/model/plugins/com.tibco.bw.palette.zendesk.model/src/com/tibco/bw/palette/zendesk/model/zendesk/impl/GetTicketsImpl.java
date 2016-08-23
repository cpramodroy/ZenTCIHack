/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk.impl;

import com.tibco.bw.palette.zendesk.model.zendesk.GetTickets;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Tickets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketsImpl#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketsImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketsImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketsImpl#getOutputHeadersQName <em>Output Headers QName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetTicketsImpl extends EObjectImpl implements GetTickets {
	/**
	 * The default value of the '{@link #getCompanyUrl() <em>Company Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyUrl() <em>Company Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyUrl()
	 * @generated
	 * @ordered
	 */
	protected String companyUrl = COMPANY_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserId() <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserId()
	 * @generated
	 * @ordered
	 */
	protected String userId = USER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputHeadersQName() <em>Output Headers QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputHeadersQName()
	 * @generated
	 * @ordered
	 */
	protected static final QName OUTPUT_HEADERS_QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputHeadersQName() <em>Output Headers QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputHeadersQName()
	 * @generated
	 * @ordered
	 */
	protected QName outputHeadersQName = OUTPUT_HEADERS_QNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetTicketsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZendeskPackage.Literals.GET_TICKETS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyUrl() {
		return companyUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyUrl(String newCompanyUrl) {
		String oldCompanyUrl = companyUrl;
		companyUrl = newCompanyUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKETS__COMPANY_URL, oldCompanyUrl, companyUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserId(String newUserId) {
		String oldUserId = userId;
		userId = newUserId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKETS__USER_ID, oldUserId, userId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKETS__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getOutputHeadersQName() {
		return outputHeadersQName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputHeadersQName(QName newOutputHeadersQName) {
		QName oldOutputHeadersQName = outputHeadersQName;
		outputHeadersQName = newOutputHeadersQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKETS__OUTPUT_HEADERS_QNAME, oldOutputHeadersQName, outputHeadersQName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZendeskPackage.GET_TICKETS__COMPANY_URL:
				return getCompanyUrl();
			case ZendeskPackage.GET_TICKETS__USER_ID:
				return getUserId();
			case ZendeskPackage.GET_TICKETS__PASSWORD:
				return getPassword();
			case ZendeskPackage.GET_TICKETS__OUTPUT_HEADERS_QNAME:
				return getOutputHeadersQName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ZendeskPackage.GET_TICKETS__COMPANY_URL:
				setCompanyUrl((String)newValue);
				return;
			case ZendeskPackage.GET_TICKETS__USER_ID:
				setUserId((String)newValue);
				return;
			case ZendeskPackage.GET_TICKETS__PASSWORD:
				setPassword((String)newValue);
				return;
			case ZendeskPackage.GET_TICKETS__OUTPUT_HEADERS_QNAME:
				setOutputHeadersQName((QName)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ZendeskPackage.GET_TICKETS__COMPANY_URL:
				setCompanyUrl(COMPANY_URL_EDEFAULT);
				return;
			case ZendeskPackage.GET_TICKETS__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case ZendeskPackage.GET_TICKETS__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ZendeskPackage.GET_TICKETS__OUTPUT_HEADERS_QNAME:
				setOutputHeadersQName(OUTPUT_HEADERS_QNAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ZendeskPackage.GET_TICKETS__COMPANY_URL:
				return COMPANY_URL_EDEFAULT == null ? companyUrl != null : !COMPANY_URL_EDEFAULT.equals(companyUrl);
			case ZendeskPackage.GET_TICKETS__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case ZendeskPackage.GET_TICKETS__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ZendeskPackage.GET_TICKETS__OUTPUT_HEADERS_QNAME:
				return OUTPUT_HEADERS_QNAME_EDEFAULT == null ? outputHeadersQName != null : !OUTPUT_HEADERS_QNAME_EDEFAULT.equals(outputHeadersQName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (companyUrl: ");
		result.append(companyUrl);
		result.append(", userId: ");
		result.append(userId);
		result.append(", password: ");
		result.append(password);
		result.append(", outputHeadersQName: ");
		result.append(outputHeadersQName);
		result.append(')');
		return result.toString();
	}

} //GetTicketsImpl
