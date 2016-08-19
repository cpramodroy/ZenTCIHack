/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskFactory
 * @model kind="package"
 * @generated
 */
public interface ZendeskPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "zendesk";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ns.tibco.com/bw/palette/zendesk";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zendesk";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZendeskPackage eINSTANCE = com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl <em>Create Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getCreateTicket()
	 * @generated
	 */
	int CREATE_TICKET = 0;

	/**
	 * The feature id for the '<em><b>Company Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TICKET__COMPANY_URL = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TICKET__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TICKET__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Has Custom Fields</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TICKET__HAS_CUSTOM_FIELDS = 3;

	/**
	 * The feature id for the '<em><b>Has Attachments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TICKET__HAS_ATTACHMENTS = 4;

	/**
	 * The feature id for the '<em><b>Attachment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TICKET__ATTACHMENT_NAME = 5;

	/**
	 * The feature id for the '<em><b>Input Headers QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TICKET__INPUT_HEADERS_QNAME = 6;

	/**
	 * The number of structural features of the '<em>Create Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_TICKET_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateUserImpl <em>Create User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateUserImpl
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getCreateUser()
	 * @generated
	 */
	int CREATE_USER = 1;

	/**
	 * The feature id for the '<em><b>Company Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_USER__COMPANY_URL = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_USER__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_USER__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Profile Photo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_USER__PROFILE_PHOTO = 3;

	/**
	 * The number of structural features of the '<em>Create User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_USER_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl <em>Update Ticket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getUpdateTicket()
	 * @generated
	 */
	int UPDATE_TICKET = 2;

	/**
	 * The feature id for the '<em><b>Company Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TICKET__COMPANY_URL = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TICKET__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TICKET__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Additional Attachment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TICKET__ADDITIONAL_ATTACHMENT = 3;

	/**
	 * The feature id for the '<em><b>Attachment Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TICKET__ATTACHMENT_NAME = 4;

	/**
	 * The feature id for the '<em><b>Input Headers QName</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TICKET__INPUT_HEADERS_QNAME = 5;

	/**
	 * The number of structural features of the '<em>Update Ticket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_TICKET_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.DeleteImpl <em>Delete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.DeleteImpl
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getDelete()
	 * @generated
	 */
	int DELETE = 3;

	/**
	 * The feature id for the '<em><b>Company Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__COMPANY_URL = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Delete Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE__DELETE_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Delete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl <em>Get Ticket Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getGetTicketMetrics()
	 * @generated
	 */
	int GET_TICKET_METRICS = 4;

	/**
	 * The feature id for the '<em><b>Company Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TICKET_METRICS__COMPANY_URL = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TICKET_METRICS__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TICKET_METRICS__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Single Ticket</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TICKET_METRICS__SINGLE_TICKET = 3;

	/**
	 * The feature id for the '<em><b>Max Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TICKET_METRICS__MAX_ROWS = 4;

	/**
	 * The number of structural features of the '<em>Get Ticket Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TICKET_METRICS_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.SearchImpl <em>Search</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.SearchImpl
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getSearch()
	 * @generated
	 */
	int SEARCH = 5;

	/**
	 * The feature id for the '<em><b>Company Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__COMPANY_URL = 0;

	/**
	 * The feature id for the '<em><b>User Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__USER_ID = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Search Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__SEARCH_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Max Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH__MAX_ROWS = 4;

	/**
	 * The number of structural features of the '<em>Search</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEARCH_FEATURE_COUNT = 5;


	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket <em>Create Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Ticket</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket
	 * @generated
	 */
	EClass getCreateTicket();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getCompanyUrl <em>Company Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Url</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getCompanyUrl()
	 * @see #getCreateTicket()
	 * @generated
	 */
	EAttribute getCreateTicket_CompanyUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getUserId()
	 * @see #getCreateTicket()
	 * @generated
	 */
	EAttribute getCreateTicket_UserId();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getPassword()
	 * @see #getCreateTicket()
	 * @generated
	 */
	EAttribute getCreateTicket_Password();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#isHasCustomFields <em>Has Custom Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Custom Fields</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#isHasCustomFields()
	 * @see #getCreateTicket()
	 * @generated
	 */
	EAttribute getCreateTicket_HasCustomFields();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#isHasAttachments <em>Has Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Attachments</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#isHasAttachments()
	 * @see #getCreateTicket()
	 * @generated
	 */
	EAttribute getCreateTicket_HasAttachments();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getAttachmentName <em>Attachment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment Name</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getAttachmentName()
	 * @see #getCreateTicket()
	 * @generated
	 */
	EAttribute getCreateTicket_AttachmentName();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getInputHeadersQName <em>Input Headers QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Headers QName</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket#getInputHeadersQName()
	 * @see #getCreateTicket()
	 * @generated
	 */
	EAttribute getCreateTicket_InputHeadersQName();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser <em>Create User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create User</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateUser
	 * @generated
	 */
	EClass getCreateUser();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getCompanyUrl <em>Company Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Url</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getCompanyUrl()
	 * @see #getCreateUser()
	 * @generated
	 */
	EAttribute getCreateUser_CompanyUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getUserId()
	 * @see #getCreateUser()
	 * @generated
	 */
	EAttribute getCreateUser_UserId();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getPassword()
	 * @see #getCreateUser()
	 * @generated
	 */
	EAttribute getCreateUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getProfilePhoto <em>Profile Photo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Profile Photo</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.CreateUser#getProfilePhoto()
	 * @see #getCreateUser()
	 * @generated
	 */
	EAttribute getCreateUser_ProfilePhoto();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket <em>Update Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Ticket</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket
	 * @generated
	 */
	EClass getUpdateTicket();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getCompanyUrl <em>Company Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Url</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getCompanyUrl()
	 * @see #getUpdateTicket()
	 * @generated
	 */
	EAttribute getUpdateTicket_CompanyUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getUserId()
	 * @see #getUpdateTicket()
	 * @generated
	 */
	EAttribute getUpdateTicket_UserId();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getPassword()
	 * @see #getUpdateTicket()
	 * @generated
	 */
	EAttribute getUpdateTicket_Password();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#isAdditionalAttachment <em>Additional Attachment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Attachment</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#isAdditionalAttachment()
	 * @see #getUpdateTicket()
	 * @generated
	 */
	EAttribute getUpdateTicket_AdditionalAttachment();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getAttachmentName <em>Attachment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attachment Name</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getAttachmentName()
	 * @see #getUpdateTicket()
	 * @generated
	 */
	EAttribute getUpdateTicket_AttachmentName();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getInputHeadersQName <em>Input Headers QName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Headers QName</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket#getInputHeadersQName()
	 * @see #getUpdateTicket()
	 * @generated
	 */
	EAttribute getUpdateTicket_InputHeadersQName();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Delete
	 * @generated
	 */
	EClass getDelete();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getCompanyUrl <em>Company Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Url</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Delete#getCompanyUrl()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_CompanyUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Delete#getUserId()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_UserId();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Delete#getPassword()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_Password();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Delete#getDeleteType <em>Delete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete Type</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Delete#getDeleteType()
	 * @see #getDelete()
	 * @generated
	 */
	EAttribute getDelete_DeleteType();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics <em>Get Ticket Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Ticket Metrics</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics
	 * @generated
	 */
	EClass getGetTicketMetrics();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getCompanyUrl <em>Company Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Url</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getCompanyUrl()
	 * @see #getGetTicketMetrics()
	 * @generated
	 */
	EAttribute getGetTicketMetrics_CompanyUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getUserId()
	 * @see #getGetTicketMetrics()
	 * @generated
	 */
	EAttribute getGetTicketMetrics_UserId();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getPassword()
	 * @see #getGetTicketMetrics()
	 * @generated
	 */
	EAttribute getGetTicketMetrics_Password();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#isSingleTicket <em>Single Ticket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Ticket</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#isSingleTicket()
	 * @see #getGetTicketMetrics()
	 * @generated
	 */
	EAttribute getGetTicketMetrics_SingleTicket();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getMaxRows <em>Max Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Rows</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics#getMaxRows()
	 * @see #getGetTicketMetrics()
	 * @generated
	 */
	EAttribute getGetTicketMetrics_MaxRows();

	/**
	 * Returns the meta object for class '{@link com.tibco.bw.palette.zendesk.model.zendesk.Search <em>Search</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Search</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Search
	 * @generated
	 */
	EClass getSearch();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Search#getCompanyUrl <em>Company Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Url</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Search#getCompanyUrl()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_CompanyUrl();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Search#getUserId <em>User Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Id</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Search#getUserId()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_UserId();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Search#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Search#getPassword()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_Password();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Search#getSearchType <em>Search Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Search Type</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Search#getSearchType()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_SearchType();

	/**
	 * Returns the meta object for the attribute '{@link com.tibco.bw.palette.zendesk.model.zendesk.Search#getMaxRows <em>Max Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Rows</em>'.
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.Search#getMaxRows()
	 * @see #getSearch()
	 * @generated
	 */
	EAttribute getSearch_MaxRows();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ZendeskFactory getZendeskFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl <em>Create Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateTicketImpl
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getCreateTicket()
		 * @generated
		 */
		EClass CREATE_TICKET = eINSTANCE.getCreateTicket();

		/**
		 * The meta object literal for the '<em><b>Company Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TICKET__COMPANY_URL = eINSTANCE.getCreateTicket_CompanyUrl();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TICKET__USER_ID = eINSTANCE.getCreateTicket_UserId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TICKET__PASSWORD = eINSTANCE.getCreateTicket_Password();

		/**
		 * The meta object literal for the '<em><b>Has Custom Fields</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TICKET__HAS_CUSTOM_FIELDS = eINSTANCE.getCreateTicket_HasCustomFields();

		/**
		 * The meta object literal for the '<em><b>Has Attachments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TICKET__HAS_ATTACHMENTS = eINSTANCE.getCreateTicket_HasAttachments();

		/**
		 * The meta object literal for the '<em><b>Attachment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TICKET__ATTACHMENT_NAME = eINSTANCE.getCreateTicket_AttachmentName();

		/**
		 * The meta object literal for the '<em><b>Input Headers QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_TICKET__INPUT_HEADERS_QNAME = eINSTANCE.getCreateTicket_InputHeadersQName();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateUserImpl <em>Create User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.CreateUserImpl
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getCreateUser()
		 * @generated
		 */
		EClass CREATE_USER = eINSTANCE.getCreateUser();

		/**
		 * The meta object literal for the '<em><b>Company Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_USER__COMPANY_URL = eINSTANCE.getCreateUser_CompanyUrl();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_USER__USER_ID = eINSTANCE.getCreateUser_UserId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_USER__PASSWORD = eINSTANCE.getCreateUser_Password();

		/**
		 * The meta object literal for the '<em><b>Profile Photo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_USER__PROFILE_PHOTO = eINSTANCE.getCreateUser_ProfilePhoto();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl <em>Update Ticket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.UpdateTicketImpl
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getUpdateTicket()
		 * @generated
		 */
		EClass UPDATE_TICKET = eINSTANCE.getUpdateTicket();

		/**
		 * The meta object literal for the '<em><b>Company Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TICKET__COMPANY_URL = eINSTANCE.getUpdateTicket_CompanyUrl();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TICKET__USER_ID = eINSTANCE.getUpdateTicket_UserId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TICKET__PASSWORD = eINSTANCE.getUpdateTicket_Password();

		/**
		 * The meta object literal for the '<em><b>Additional Attachment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TICKET__ADDITIONAL_ATTACHMENT = eINSTANCE.getUpdateTicket_AdditionalAttachment();

		/**
		 * The meta object literal for the '<em><b>Attachment Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TICKET__ATTACHMENT_NAME = eINSTANCE.getUpdateTicket_AttachmentName();

		/**
		 * The meta object literal for the '<em><b>Input Headers QName</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_TICKET__INPUT_HEADERS_QNAME = eINSTANCE.getUpdateTicket_InputHeadersQName();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.DeleteImpl <em>Delete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.DeleteImpl
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getDelete()
		 * @generated
		 */
		EClass DELETE = eINSTANCE.getDelete();

		/**
		 * The meta object literal for the '<em><b>Company Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__COMPANY_URL = eINSTANCE.getDelete_CompanyUrl();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__USER_ID = eINSTANCE.getDelete_UserId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__PASSWORD = eINSTANCE.getDelete_Password();

		/**
		 * The meta object literal for the '<em><b>Delete Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE__DELETE_TYPE = eINSTANCE.getDelete_DeleteType();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl <em>Get Ticket Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.GetTicketMetricsImpl
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getGetTicketMetrics()
		 * @generated
		 */
		EClass GET_TICKET_METRICS = eINSTANCE.getGetTicketMetrics();

		/**
		 * The meta object literal for the '<em><b>Company Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TICKET_METRICS__COMPANY_URL = eINSTANCE.getGetTicketMetrics_CompanyUrl();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TICKET_METRICS__USER_ID = eINSTANCE.getGetTicketMetrics_UserId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TICKET_METRICS__PASSWORD = eINSTANCE.getGetTicketMetrics_Password();

		/**
		 * The meta object literal for the '<em><b>Single Ticket</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TICKET_METRICS__SINGLE_TICKET = eINSTANCE.getGetTicketMetrics_SingleTicket();

		/**
		 * The meta object literal for the '<em><b>Max Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_TICKET_METRICS__MAX_ROWS = eINSTANCE.getGetTicketMetrics_MaxRows();

		/**
		 * The meta object literal for the '{@link com.tibco.bw.palette.zendesk.model.zendesk.impl.SearchImpl <em>Search</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.SearchImpl
		 * @see com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskPackageImpl#getSearch()
		 * @generated
		 */
		EClass SEARCH = eINSTANCE.getSearch();

		/**
		 * The meta object literal for the '<em><b>Company Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__COMPANY_URL = eINSTANCE.getSearch_CompanyUrl();

		/**
		 * The meta object literal for the '<em><b>User Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__USER_ID = eINSTANCE.getSearch_UserId();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__PASSWORD = eINSTANCE.getSearch_Password();

		/**
		 * The meta object literal for the '<em><b>Search Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__SEARCH_TYPE = eINSTANCE.getSearch_SearchType();

		/**
		 * The meta object literal for the '<em><b>Max Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEARCH__MAX_ROWS = eINSTANCE.getSearch_MaxRows();

	}

} //ZendeskPackage
