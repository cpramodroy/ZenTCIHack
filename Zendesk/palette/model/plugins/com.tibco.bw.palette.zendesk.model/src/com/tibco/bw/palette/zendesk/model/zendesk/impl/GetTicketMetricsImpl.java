/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk.impl;

import com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Ticket Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl#isSingleTicket <em>Single Ticket</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl#getMaxRows <em>Max Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetTicketMetricsImpl extends EObjectImpl implements GetTicketMetrics {
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
	 * The default value of the '{@link #isSingleTicket() <em>Single Ticket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleTicket()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SINGLE_TICKET_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSingleTicket() <em>Single Ticket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSingleTicket()
	 * @generated
	 * @ordered
	 */
	protected boolean singleTicket = SINGLE_TICKET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRows() <em>Max Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRows()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRows() <em>Max Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRows()
	 * @generated
	 * @ordered
	 */
	protected int maxRows = MAX_ROWS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetTicketMetricsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZendeskPackage.Literals.GET_TICKET_METRICS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKET_METRICS__COMPANY_URL, oldCompanyUrl, companyUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKET_METRICS__USER_ID, oldUserId, userId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKET_METRICS__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSingleTicket() {
		return singleTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleTicket(boolean newSingleTicket) {
		boolean oldSingleTicket = singleTicket;
		singleTicket = newSingleTicket;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKET_METRICS__SINGLE_TICKET, oldSingleTicket, singleTicket));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRows() {
		return maxRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRows(int newMaxRows) {
		int oldMaxRows = maxRows;
		maxRows = newMaxRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.GET_TICKET_METRICS__MAX_ROWS, oldMaxRows, maxRows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZendeskPackage.GET_TICKET_METRICS__COMPANY_URL:
				return getCompanyUrl();
			case ZendeskPackage.GET_TICKET_METRICS__USER_ID:
				return getUserId();
			case ZendeskPackage.GET_TICKET_METRICS__PASSWORD:
				return getPassword();
			case ZendeskPackage.GET_TICKET_METRICS__SINGLE_TICKET:
				return isSingleTicket();
			case ZendeskPackage.GET_TICKET_METRICS__MAX_ROWS:
				return getMaxRows();
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
			case ZendeskPackage.GET_TICKET_METRICS__COMPANY_URL:
				setCompanyUrl((String)newValue);
				return;
			case ZendeskPackage.GET_TICKET_METRICS__USER_ID:
				setUserId((String)newValue);
				return;
			case ZendeskPackage.GET_TICKET_METRICS__PASSWORD:
				setPassword((String)newValue);
				return;
			case ZendeskPackage.GET_TICKET_METRICS__SINGLE_TICKET:
				setSingleTicket((Boolean)newValue);
				return;
			case ZendeskPackage.GET_TICKET_METRICS__MAX_ROWS:
				setMaxRows((Integer)newValue);
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
			case ZendeskPackage.GET_TICKET_METRICS__COMPANY_URL:
				setCompanyUrl(COMPANY_URL_EDEFAULT);
				return;
			case ZendeskPackage.GET_TICKET_METRICS__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case ZendeskPackage.GET_TICKET_METRICS__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ZendeskPackage.GET_TICKET_METRICS__SINGLE_TICKET:
				setSingleTicket(SINGLE_TICKET_EDEFAULT);
				return;
			case ZendeskPackage.GET_TICKET_METRICS__MAX_ROWS:
				setMaxRows(MAX_ROWS_EDEFAULT);
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
			case ZendeskPackage.GET_TICKET_METRICS__COMPANY_URL:
				return COMPANY_URL_EDEFAULT == null ? companyUrl != null : !COMPANY_URL_EDEFAULT.equals(companyUrl);
			case ZendeskPackage.GET_TICKET_METRICS__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case ZendeskPackage.GET_TICKET_METRICS__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ZendeskPackage.GET_TICKET_METRICS__SINGLE_TICKET:
				return singleTicket != SINGLE_TICKET_EDEFAULT;
			case ZendeskPackage.GET_TICKET_METRICS__MAX_ROWS:
				return maxRows != MAX_ROWS_EDEFAULT;
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
		result.append(", singleTicket: ");
		result.append(singleTicket);
		result.append(", maxRows: ");
		result.append(maxRows);
		result.append(')');
		return result.toString();
	}

} //GetTicketMetricsImpl
