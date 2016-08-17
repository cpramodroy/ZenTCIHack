/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk;

import javax.xml.namespace.QName;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#isHasCustomFields <em>Has Custom Fields</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#isHasAttachments <em>Has Attachments</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getAttachmentName <em>Attachment Name</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getInputHeadersQName <em>Input Headers QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateTicket()
 * @model annotation="dkactivityconfig activitytype='Synchronous' schemaType='XSD/WSDL' schemaFile='CreateTicket.xsd' inputelementname='ActvityInput' outputelementname='ActivityOutput' faultelementname='' helpdocuuid='e771e7cf-7bfc-4953-bd48-b3db82bd8e13'"
 * @generated
 */
public interface CreateTicket extends EObject {
	/**
	 * Returns the value of the '<em><b>Company Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Company Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Url</em>' attribute.
	 * @see #setCompanyUrl(String)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateTicket_CompanyUrl()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Company Url' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getCompanyUrl();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getCompanyUrl <em>Company Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Url</em>' attribute.
	 * @see #getCompanyUrl()
	 * @generated
	 */
	void setCompanyUrl(String value);

	/**
	 * Returns the value of the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Id</em>' attribute.
	 * @see #setUserId(String)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateTicket_UserId()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='User Id' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getUserId <em>User Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Id</em>' attribute.
	 * @see #getUserId()
	 * @generated
	 */
	void setUserId(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateTicket_Password()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Password' isModelProperty='true' control='PasswordField' value=''"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Has Custom Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Custom Fields</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Custom Fields</em>' attribute.
	 * @see #setHasCustomFields(boolean)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateTicket_HasCustomFields()
	 * @model annotation="dkcontrolconfig sectionName='Advanced' isRequired='false' label='Has Custom Fields' isModelProperty='false' control='CheckBox' value=''"
	 * @generated
	 */
	boolean isHasCustomFields();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#isHasCustomFields <em>Has Custom Fields</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Custom Fields</em>' attribute.
	 * @see #isHasCustomFields()
	 * @generated
	 */
	void setHasCustomFields(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Attachments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Attachments</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Attachments</em>' attribute.
	 * @see #setHasAttachments(boolean)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateTicket_HasAttachments()
	 * @model annotation="dkcontrolconfig sectionName='Advanced' isRequired='false' label='Has Attachments' isModelProperty='false' control='CheckBox' value=''"
	 * @generated
	 */
	boolean isHasAttachments();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#isHasAttachments <em>Has Attachments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Attachments</em>' attribute.
	 * @see #isHasAttachments()
	 * @generated
	 */
	void setHasAttachments(boolean value);

	/**
	 * Returns the value of the '<em><b>Attachment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachment Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachment Name</em>' attribute.
	 * @see #setAttachmentName(String)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateTicket_AttachmentName()
	 * @model annotation="dkcontrolconfig sectionName='Advanced' isRequired='false' label='Attachment Name' isModelProperty='false' control='FilePickerField' value=''"
	 * @generated
	 */
	String getAttachmentName();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getAttachmentName <em>Attachment Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attachment Name</em>' attribute.
	 * @see #getAttachmentName()
	 * @generated
	 */
	void setAttachmentName(String value);

	/**
	 * Returns the value of the '<em><b>Input Headers QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Headers QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Headers QName</em>' attribute.
	 * @see #setInputHeadersQName(QName)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateTicket_InputHeadersQName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getInputHeadersQName();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getInputHeadersQName <em>Input Headers QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Headers QName</em>' attribute.
	 * @see #getInputHeadersQName()
	 * @generated
	 */
	void setInputHeadersQName(QName value);

} // CreateTicket
