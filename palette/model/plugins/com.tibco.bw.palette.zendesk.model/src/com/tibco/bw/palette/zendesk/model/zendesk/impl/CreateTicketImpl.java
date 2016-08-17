/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk.impl;

import com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Create Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl#isHasCustomFields <em>Has Custom Fields</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl#isHasAttachments <em>Has Attachments</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl#getAttachmentName <em>Attachment Name</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl#getInputHeadersQName <em>Input Headers QName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreateTicketImpl extends EObjectImpl implements CreateTicket {
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
	 * The default value of the '{@link #isHasCustomFields() <em>Has Custom Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasCustomFields()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_CUSTOM_FIELDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasCustomFields() <em>Has Custom Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasCustomFields()
	 * @generated
	 * @ordered
	 */
	protected boolean hasCustomFields = HAS_CUSTOM_FIELDS_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasAttachments() <em>Has Attachments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAttachments()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_ATTACHMENTS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasAttachments() <em>Has Attachments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasAttachments()
	 * @generated
	 * @ordered
	 */
	protected boolean hasAttachments = HAS_ATTACHMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttachmentName() <em>Attachment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACHMENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttachmentName() <em>Attachment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachmentName()
	 * @generated
	 * @ordered
	 */
	protected String attachmentName = ATTACHMENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputHeadersQName() <em>Input Headers QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputHeadersQName()
	 * @generated
	 * @ordered
	 */
	protected static final QName INPUT_HEADERS_QNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputHeadersQName() <em>Input Headers QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputHeadersQName()
	 * @generated
	 * @ordered
	 */
	protected QName inputHeadersQName = INPUT_HEADERS_QNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreateTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZendeskPackage.Literals.CREATE_TICKET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.CREATE_TICKET__COMPANY_URL, oldCompanyUrl, companyUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.CREATE_TICKET__USER_ID, oldUserId, userId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.CREATE_TICKET__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasCustomFields() {
		return hasCustomFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasCustomFields(boolean newHasCustomFields) {
		boolean oldHasCustomFields = hasCustomFields;
		hasCustomFields = newHasCustomFields;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.CREATE_TICKET__HAS_CUSTOM_FIELDS, oldHasCustomFields, hasCustomFields));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasAttachments() {
		return hasAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasAttachments(boolean newHasAttachments) {
		boolean oldHasAttachments = hasAttachments;
		hasAttachments = newHasAttachments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.CREATE_TICKET__HAS_ATTACHMENTS, oldHasAttachments, hasAttachments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttachmentName() {
		return attachmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttachmentName(String newAttachmentName) {
		String oldAttachmentName = attachmentName;
		attachmentName = newAttachmentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.CREATE_TICKET__ATTACHMENT_NAME, oldAttachmentName, attachmentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QName getInputHeadersQName() {
		return inputHeadersQName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputHeadersQName(QName newInputHeadersQName) {
		QName oldInputHeadersQName = inputHeadersQName;
		inputHeadersQName = newInputHeadersQName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.CREATE_TICKET__INPUT_HEADERS_QNAME, oldInputHeadersQName, inputHeadersQName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZendeskPackage.CREATE_TICKET__COMPANY_URL:
				return getCompanyUrl();
			case ZendeskPackage.CREATE_TICKET__USER_ID:
				return getUserId();
			case ZendeskPackage.CREATE_TICKET__PASSWORD:
				return getPassword();
			case ZendeskPackage.CREATE_TICKET__HAS_CUSTOM_FIELDS:
				return isHasCustomFields();
			case ZendeskPackage.CREATE_TICKET__HAS_ATTACHMENTS:
				return isHasAttachments();
			case ZendeskPackage.CREATE_TICKET__ATTACHMENT_NAME:
				return getAttachmentName();
			case ZendeskPackage.CREATE_TICKET__INPUT_HEADERS_QNAME:
				return getInputHeadersQName();
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
			case ZendeskPackage.CREATE_TICKET__COMPANY_URL:
				setCompanyUrl((String)newValue);
				return;
			case ZendeskPackage.CREATE_TICKET__USER_ID:
				setUserId((String)newValue);
				return;
			case ZendeskPackage.CREATE_TICKET__PASSWORD:
				setPassword((String)newValue);
				return;
			case ZendeskPackage.CREATE_TICKET__HAS_CUSTOM_FIELDS:
				setHasCustomFields((Boolean)newValue);
				return;
			case ZendeskPackage.CREATE_TICKET__HAS_ATTACHMENTS:
				setHasAttachments((Boolean)newValue);
				return;
			case ZendeskPackage.CREATE_TICKET__ATTACHMENT_NAME:
				setAttachmentName((String)newValue);
				return;
			case ZendeskPackage.CREATE_TICKET__INPUT_HEADERS_QNAME:
				setInputHeadersQName((QName)newValue);
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
			case ZendeskPackage.CREATE_TICKET__COMPANY_URL:
				setCompanyUrl(COMPANY_URL_EDEFAULT);
				return;
			case ZendeskPackage.CREATE_TICKET__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case ZendeskPackage.CREATE_TICKET__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ZendeskPackage.CREATE_TICKET__HAS_CUSTOM_FIELDS:
				setHasCustomFields(HAS_CUSTOM_FIELDS_EDEFAULT);
				return;
			case ZendeskPackage.CREATE_TICKET__HAS_ATTACHMENTS:
				setHasAttachments(HAS_ATTACHMENTS_EDEFAULT);
				return;
			case ZendeskPackage.CREATE_TICKET__ATTACHMENT_NAME:
				setAttachmentName(ATTACHMENT_NAME_EDEFAULT);
				return;
			case ZendeskPackage.CREATE_TICKET__INPUT_HEADERS_QNAME:
				setInputHeadersQName(INPUT_HEADERS_QNAME_EDEFAULT);
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
			case ZendeskPackage.CREATE_TICKET__COMPANY_URL:
				return COMPANY_URL_EDEFAULT == null ? companyUrl != null : !COMPANY_URL_EDEFAULT.equals(companyUrl);
			case ZendeskPackage.CREATE_TICKET__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case ZendeskPackage.CREATE_TICKET__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ZendeskPackage.CREATE_TICKET__HAS_CUSTOM_FIELDS:
				return hasCustomFields != HAS_CUSTOM_FIELDS_EDEFAULT;
			case ZendeskPackage.CREATE_TICKET__HAS_ATTACHMENTS:
				return hasAttachments != HAS_ATTACHMENTS_EDEFAULT;
			case ZendeskPackage.CREATE_TICKET__ATTACHMENT_NAME:
				return ATTACHMENT_NAME_EDEFAULT == null ? attachmentName != null : !ATTACHMENT_NAME_EDEFAULT.equals(attachmentName);
			case ZendeskPackage.CREATE_TICKET__INPUT_HEADERS_QNAME:
				return INPUT_HEADERS_QNAME_EDEFAULT == null ? inputHeadersQName != null : !INPUT_HEADERS_QNAME_EDEFAULT.equals(inputHeadersQName);
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
		result.append(", hasCustomFields: ");
		result.append(hasCustomFields);
		result.append(", hasAttachments: ");
		result.append(hasAttachments);
		result.append(", attachmentName: ");
		result.append(attachmentName);
		result.append(", inputHeadersQName: ");
		result.append(inputHeadersQName);
		result.append(')');
		return result.toString();
	}

} //CreateTicketImpl
