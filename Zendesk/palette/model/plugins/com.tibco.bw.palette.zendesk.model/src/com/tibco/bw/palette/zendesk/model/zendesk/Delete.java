/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getDeleteType <em>Delete Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getDelete()
 * @model annotation="dkactivityconfig activitytype='Synchronous' schemaType='XSD/WSDL' schemaFile='DeleteObject.xsd' inputelementname='ActvityInput' outputelementname='ActivityOutput' faultelementname='' helpdocuuid='d35f9c32-6993-4df6-9732-f9b4d739d7fd'"
 * @generated
 */
public interface Delete extends EObject {
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getDelete_CompanyUrl()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Company Url' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getCompanyUrl();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getCompanyUrl <em>Company Url</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getDelete_UserId()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='User Id' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getUserId <em>User Id</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getDelete_Password()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Password' isModelProperty='true' control='PasswordField' value=''"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Delete Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Type</em>' attribute.
	 * @see #setDeleteType(String)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getDelete_DeleteType()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Delete Type' isModelProperty='false' control='ComboViewer' value='Ticket'"
	 * @generated
	 */
	String getDeleteType();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getDeleteType <em>Delete Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Type</em>' attribute.
	 * @see #getDeleteType()
	 * @generated
	 */
	void setDeleteType(String value);

} // Delete
