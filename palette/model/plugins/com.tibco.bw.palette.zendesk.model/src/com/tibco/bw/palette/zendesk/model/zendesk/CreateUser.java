/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getProfilePhoto <em>Profile Photo</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateUser()
 * @model annotation="dkactivityconfig activitytype='Asynchronous' schemaType='XSD/WSDL' schemaFile='CreateUser.xsd' inputelementname='ActvityInput' outputelementname='ActivityOutput' faultelementname='' helpdocuuid='ff4ccacd-af1b-4d10-9068-41d8a88314a5'"
 * @generated
 */
public interface CreateUser extends EObject {
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateUser_CompanyUrl()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Company Url' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getCompanyUrl();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getCompanyUrl <em>Company Url</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateUser_UserId()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='User Id' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getUserId <em>User Id</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateUser_Password()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Password' isModelProperty='true' control='PasswordField' value=''"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Profile Photo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Profile Photo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Profile Photo</em>' attribute.
	 * @see #setProfilePhoto(String)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getCreateUser_ProfilePhoto()
	 * @model annotation="dkcontrolconfig sectionName='Advanced' isRequired='false' label='Profile Photo' isModelProperty='false' control='FilePickerField' value=''"
	 * @generated
	 */
	String getProfilePhoto();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getProfilePhoto <em>Profile Photo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Profile Photo</em>' attribute.
	 * @see #getProfilePhoto()
	 * @generated
	 */
	void setProfilePhoto(String value);

} // CreateUser
