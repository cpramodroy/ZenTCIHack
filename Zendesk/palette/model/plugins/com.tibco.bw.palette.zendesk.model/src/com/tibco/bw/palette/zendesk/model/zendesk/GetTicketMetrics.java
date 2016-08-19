/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get Ticket Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getCompanyUrl <em>Company Url</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getUserId <em>User Id</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getPassword <em>Password</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#isSingleTicket <em>Single Ticket</em>}</li>
 *   <li>{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getMaxRows <em>Max Rows</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTicketMetrics()
 * @model annotation="dkactivityconfig activitytype='Synchronous' schemaType='XSD/WSDL' schemaFile='GetTicketMetrics.xsd' inputelementname='ActvityInput' outputelementname='ActivityOutput' faultelementname='' helpdocuuid='6c3f1bdc-3b01-4cc0-84d4-f0bb911083df'"
 * @generated
 */
public interface GetTicketMetrics extends EObject {
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTicketMetrics_CompanyUrl()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Company Url' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getCompanyUrl();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getCompanyUrl <em>Company Url</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTicketMetrics_UserId()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='User Id' isModelProperty='true' control='TextBox' value=''"
	 * @generated
	 */
	String getUserId();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getUserId <em>User Id</em>}' attribute.
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
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTicketMetrics_Password()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='true' label='Password' isModelProperty='true' control='PasswordField' value=''"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Single Ticket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Ticket</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Ticket</em>' attribute.
	 * @see #setSingleTicket(boolean)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTicketMetrics_SingleTicket()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='false' label='Single Ticket' isModelProperty='false' control='CheckBox' value=''"
	 * @generated
	 */
	boolean isSingleTicket();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#isSingleTicket <em>Single Ticket</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Ticket</em>' attribute.
	 * @see #isSingleTicket()
	 * @generated
	 */
	void setSingleTicket(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Rows</em>' attribute.
	 * @see #setMaxRows(int)
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#getGetTicketMetrics_MaxRows()
	 * @model annotation="dkcontrolconfig sectionName='General' isRequired='false' label='Max Rows' isModelProperty='true' control='Spinner' value=''"
	 * @generated
	 */
	int getMaxRows();

	/**
	 * Sets the value of the '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getMaxRows <em>Max Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Rows</em>' attribute.
	 * @see #getMaxRows()
	 * @generated
	 */
	void setMaxRows(int value);

} // GetTicketMetrics
