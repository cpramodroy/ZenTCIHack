/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk;

import javax.xml.namespace.QName;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Tickets</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets#getOutputHeadersQName <em>Output Headers QName</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTickets()
 * @model annotation="dkactivityconfig activitytype='Synchronous' schemaType='XSD/WSDL' schemaFile='GetTickets.xsd' inputelementname='ActivityInput' outputelementname='ActivityOutput' faultelementname='' helpdocuuid='e416be09-79cc-42f1-9d9f-d61177d4f4a5'"
 * @generated
 */
public interface GetTickets extends EObject {
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTickets_CompanyUrl()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Company Url' isModelProperty='true' control='TextBox' value='null'"
	 * @generated
	 */
	String getCompanyUrl();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets#getCompanyUrl <em>Company Url</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTickets_UserId()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='User Id' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets#getUserId <em>User Id</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTickets_Password()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Password' isModelProperty='true' control='PasswordField' value=''"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Output Headers QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Headers QName</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Headers QName</em>' attribute.
	 * @see #setOutputHeadersQName(QName)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTickets_OutputHeadersQName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName"
	 * @generated
	 */
	QName getOutputHeadersQName();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTickets#getOutputHeadersQName <em>Output Headers QName</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Headers QName</em>' attribute.
	 * @see #getOutputHeadersQName()
	 * @generated
	 */
	void setOutputHeadersQName(QName value);

} // GetTickets
