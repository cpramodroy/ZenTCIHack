/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk;

import javax.xml.namespace.QName;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#isAdditionalAttachment <em>Additional Attachment</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getAttachmentName <em>Attachment Name</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getInputHeadersQName <em>Input Headers QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getUpdateTicket()
 * @model annotation="dkactivityconfig activitytype='Synchronous' schemaType='XSD/WSDL' schemaFile='UpdateTicket.xsd' inputelementname='ActvityInput' outputelementname='ActivityOutput' faultelementname='' helpdocuuid='295cf630-12c3-412f-bc5a-418ac8f2b2fe'"
 * @generated
 */
public interface UpdateTicket extends EObject {
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getUpdateTicket_CompanyUrl()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Company Url' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getCompanyUrl();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getCompanyUrl <em>Company Url</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getUpdateTicket_UserId()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='User Id' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getUserId <em>User Id</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getUpdateTicket_Password()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Password' isModelProperty='true' control='PasswordField' value=''"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Additional Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Attachment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Attachment</em>' attribute.
	 * @see #setAdditionalAttachment(boolean)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getUpdateTicket_AdditionalAttachment()
	 * @model annotation="dkcontrolconfig sectionName='Advanced' isRequired='false' label='Attach Additional Attachment' isModelProperty='false' control='CheckBox' value=''"
	 * @generated
	 */
	boolean isAdditionalAttachment();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#isAdditionalAttachment <em>Additional Attachment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Attachment</em>' attribute.
	 * @see #isAdditionalAttachment()
	 * @generated
	 */
	void setAdditionalAttachment(boolean value);

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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getUpdateTicket_AttachmentName()
	 * @model annotation="dkcontrolconfig sectionName='Advanced' isRequired='false' label='Attachment Name' isModelProperty='false' control='FilePickerField' value=''"
	 * @generated
	 */
	String getAttachmentName();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getAttachmentName <em>Attachment Name</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getUpdateTicket_InputHeadersQName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getInputHeadersQName();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getInputHeadersQName <em>Input Headers QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Headers QName</em>' attribute.
	 * @see #getInputHeadersQName()
	 * @generated
	 */
	void setInputHeadersQName(QName value);

} // UpdateTicket
