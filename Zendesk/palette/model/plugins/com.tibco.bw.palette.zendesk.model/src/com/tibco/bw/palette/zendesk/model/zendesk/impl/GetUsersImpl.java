/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk.impl;

import com.tibco.bw.palette.zendesk.model.zendesk.GetUsers;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Users</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetUsersImpl#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetUsersImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetUsersImpl#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetUsersImpl extends EObjectImpl implements GetUsers {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetUsersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZendeskPackage.Literals.GET_USERS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_USERS__COMPANY_URL, oldCompanyUrl, companyUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_USERS__USER_ID, oldUserId, userId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_USERS__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZendeskPackage.GET_USERS__COMPANY_URL:
				return getCompanyUrl();
			case ZendeskPackage.GET_USERS__USER_ID:
				return getUserId();
			case ZendeskPackage.GET_USERS__PASSWORD:
				return getPassword();
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
			case ZendeskPackage.GET_USERS__COMPANY_URL:
				setCompanyUrl((String)newValue);
				return;
			case ZendeskPackage.GET_USERS__USER_ID:
				setUserId((String)newValue);
				return;
			case ZendeskPackage.GET_USERS__PASSWORD:
				setPassword((String)newValue);
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
			case ZendeskPackage.GET_USERS__COMPANY_URL:
				setCompanyUrl(COMPANY_URL_EDEFAULT);
				return;
			case ZendeskPackage.GET_USERS__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case ZendeskPackage.GET_USERS__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case ZendeskPackage.GET_USERS__COMPANY_URL:
				return COMPANY_URL_EDEFAULT == null ? companyUrl != null : !COMPANY_URL_EDEFAULT.equals(companyUrl);
			case ZendeskPackage.GET_USERS__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case ZendeskPackage.GET_USERS__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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
		result.append(')');
		return result.toString();
	}

} //GetUsersImpl
