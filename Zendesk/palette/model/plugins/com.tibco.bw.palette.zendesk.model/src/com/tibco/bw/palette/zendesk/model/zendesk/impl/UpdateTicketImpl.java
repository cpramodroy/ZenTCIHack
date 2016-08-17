/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk.impl;

import com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;

import javax.xml.namespace.QName;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Ticket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl#isAdditionalAttachment <em>Additional Attachment</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl#getAttachmentName <em>Attachment Name</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl#getInputHeadersQName <em>Input Headers QName</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UpdateTicketImpl extends EObjectImpl implements UpdateTicket {
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
	 * The default value of the '{@link #isAdditionalAttachment() <em>Additional Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditionalAttachment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADDITIONAL_ATTACHMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdditionalAttachment() <em>Additional Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditionalAttachment()
	 * @generated
	 * @ordered
	 */
	protected boolean additionalAttachment = ADDITIONAL_ATTACHMENT_EDEFAULT;

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
	protected UpdateTicketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZendeskPackage.Literals.UPDATE_TICKET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.UPDATE_TICKET__COMPANY_URL, oldCompanyUrl, companyUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.UPDATE_TICKET__USER_ID, oldUserId, userId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.UPDATE_TICKET__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdditionalAttachment() {
		return additionalAttachment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalAttachment(boolean newAdditionalAttachment) {
		boolean oldAdditionalAttachment = additionalAttachment;
		additionalAttachment = newAdditionalAttachment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.UPDATE_TICKET__ADDITIONAL_ATTACHMENT, oldAdditionalAttachment, additionalAttachment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.UPDATE_TICKET__ATTACHMENT_NAME, oldAttachmentName, attachmentName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZendeskPackage.UPDATE_TICKET__INPUT_HEADERS_QNAME, oldInputHeadersQName, inputHeadersQName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ZendeskPackage.UPDATE_TICKET__COMPANY_URL:
				return getCompanyUrl();
			case ZendeskPackage.UPDATE_TICKET__USER_ID:
				return getUserId();
			case ZendeskPackage.UPDATE_TICKET__PASSWORD:
				return getPassword();
			case ZendeskPackage.UPDATE_TICKET__ADDITIONAL_ATTACHMENT:
				return isAdditionalAttachment();
			case ZendeskPackage.UPDATE_TICKET__ATTACHMENT_NAME:
				return getAttachmentName();
			case ZendeskPackage.UPDATE_TICKET__INPUT_HEADERS_QNAME:
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
			case ZendeskPackage.UPDATE_TICKET__COMPANY_URL:
				setCompanyUrl((String)newValue);
				return;
			case ZendeskPackage.UPDATE_TICKET__USER_ID:
				setUserId((String)newValue);
				return;
			case ZendeskPackage.UPDATE_TICKET__PASSWORD:
				setPassword((String)newValue);
				return;
			case ZendeskPackage.UPDATE_TICKET__ADDITIONAL_ATTACHMENT:
				setAdditionalAttachment((Boolean)newValue);
				return;
			case ZendeskPackage.UPDATE_TICKET__ATTACHMENT_NAME:
				setAttachmentName((String)newValue);
				return;
			case ZendeskPackage.UPDATE_TICKET__INPUT_HEADERS_QNAME:
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
			case ZendeskPackage.UPDATE_TICKET__COMPANY_URL:
				setCompanyUrl(COMPANY_URL_EDEFAULT);
				return;
			case ZendeskPackage.UPDATE_TICKET__USER_ID:
				setUserId(USER_ID_EDEFAULT);
				return;
			case ZendeskPackage.UPDATE_TICKET__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ZendeskPackage.UPDATE_TICKET__ADDITIONAL_ATTACHMENT:
				setAdditionalAttachment(ADDITIONAL_ATTACHMENT_EDEFAULT);
				return;
			case ZendeskPackage.UPDATE_TICKET__ATTACHMENT_NAME:
				setAttachmentName(ATTACHMENT_NAME_EDEFAULT);
				return;
			case ZendeskPackage.UPDATE_TICKET__INPUT_HEADERS_QNAME:
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
			case ZendeskPackage.UPDATE_TICKET__COMPANY_URL:
				return COMPANY_URL_EDEFAULT == null ? companyUrl != null : !COMPANY_URL_EDEFAULT.equals(companyUrl);
			case ZendeskPackage.UPDATE_TICKET__USER_ID:
				return USER_ID_EDEFAULT == null ? userId != null : !USER_ID_EDEFAULT.equals(userId);
			case ZendeskPackage.UPDATE_TICKET__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ZendeskPackage.UPDATE_TICKET__ADDITIONAL_ATTACHMENT:
				return additionalAttachment != ADDITIONAL_ATTACHMENT_EDEFAULT;
			case ZendeskPackage.UPDATE_TICKET__ATTACHMENT_NAME:
				return ATTACHMENT_NAME_EDEFAULT == null ? attachmentName != null : !ATTACHMENT_NAME_EDEFAULT.equals(attachmentName);
			case ZendeskPackage.UPDATE_TICKET__INPUT_HEADERS_QNAME:
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
		result.append(", additionalAttachment: ");
		result.append(additionalAttachment);
		result.append(", attachmentName: ");
		result.append(attachmentName);
		result.append(", inputHeadersQName: ");
		result.append(inputHeadersQName);
		result.append(')');
		return result.toString();
	}

} //UpdateTicketImpl
