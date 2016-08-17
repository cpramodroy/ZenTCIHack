/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk.impl;

import com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket;
import com.tibco.bw.palette.zendesk.model.zendesk.CreateUser;
import com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskFactory;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZendeskPackageImpl extends EPackageImpl implements ZendeskPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createTicketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTicketEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ZendeskPackageImpl() {
		super(eNS_URI, ZendeskFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ZendeskPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ZendeskPackage init() {
		if (isInited) return (ZendeskPackage)EPackage.Registry.INSTANCE.getEPackage(ZendeskPackage.eNS_URI);

		// Obtain or create and register package
		ZendeskPackageImpl theZendeskPackage = (ZendeskPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ZendeskPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ZendeskPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theZendeskPackage.createPackageContents();

		// Initialize created meta-data
		theZendeskPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theZendeskPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ZendeskPackage.eNS_URI, theZendeskPackage);
		return theZendeskPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateTicket() {
		return createTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateTicket_CompanyUrl() {
		return (EAttribute)createTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateTicket_UserId() {
		return (EAttribute)createTicketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateTicket_Password() {
		return (EAttribute)createTicketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateTicket_HasCustomFields() {
		return (EAttribute)createTicketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateTicket_HasAttachments() {
		return (EAttribute)createTicketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateTicket_AttachmentName() {
		return (EAttribute)createTicketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateTicket_InputHeadersQName() {
		return (EAttribute)createTicketEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateUser() {
		return createUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUser_CompanyUrl() {
		return (EAttribute)createUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUser_UserId() {
		return (EAttribute)createUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUser_Password() {
		return (EAttribute)createUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateUser_ProfilePhoto() {
		return (EAttribute)createUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateTicket() {
		return updateTicketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTicket_CompanyUrl() {
		return (EAttribute)updateTicketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTicket_UserId() {
		return (EAttribute)updateTicketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTicket_Password() {
		return (EAttribute)updateTicketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTicket_AdditionalAttachment() {
		return (EAttribute)updateTicketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTicket_AttachmentName() {
		return (EAttribute)updateTicketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateTicket_InputHeadersQName() {
		return (EAttribute)updateTicketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZendeskFactory getZendeskFactory() {
		return (ZendeskFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		createTicketEClass = createEClass(CREATE_TICKET);
		createEAttribute(createTicketEClass, CREATE_TICKET__COMPANY_URL);
		createEAttribute(createTicketEClass, CREATE_TICKET__USER_ID);
		createEAttribute(createTicketEClass, CREATE_TICKET__PASSWORD);
		createEAttribute(createTicketEClass, CREATE_TICKET__HAS_CUSTOM_FIELDS);
		createEAttribute(createTicketEClass, CREATE_TICKET__HAS_ATTACHMENTS);
		createEAttribute(createTicketEClass, CREATE_TICKET__ATTACHMENT_NAME);
		createEAttribute(createTicketEClass, CREATE_TICKET__INPUT_HEADERS_QNAME);

		createUserEClass = createEClass(CREATE_USER);
		createEAttribute(createUserEClass, CREATE_USER__COMPANY_URL);
		createEAttribute(createUserEClass, CREATE_USER__USER_ID);
		createEAttribute(createUserEClass, CREATE_USER__PASSWORD);
		createEAttribute(createUserEClass, CREATE_USER__PROFILE_PHOTO);

		updateTicketEClass = createEClass(UPDATE_TICKET);
		createEAttribute(updateTicketEClass, UPDATE_TICKET__COMPANY_URL);
		createEAttribute(updateTicketEClass, UPDATE_TICKET__USER_ID);
		createEAttribute(updateTicketEClass, UPDATE_TICKET__PASSWORD);
		createEAttribute(updateTicketEClass, UPDATE_TICKET__ADDITIONAL_ATTACHMENT);
		createEAttribute(updateTicketEClass, UPDATE_TICKET__ATTACHMENT_NAME);
		createEAttribute(updateTicketEClass, UPDATE_TICKET__INPUT_HEADERS_QNAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(createTicketEClass, CreateTicket.class, "CreateTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateTicket_CompanyUrl(), ecorePackage.getEString(), "companyUrl", null, 0, 1, CreateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateTicket_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, CreateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateTicket_Password(), ecorePackage.getEString(), "password", null, 0, 1, CreateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateTicket_HasCustomFields(), ecorePackage.getEBoolean(), "hasCustomFields", null, 0, 1, CreateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateTicket_HasAttachments(), ecorePackage.getEBoolean(), "hasAttachments", null, 0, 1, CreateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateTicket_AttachmentName(), ecorePackage.getEString(), "attachmentName", null, 0, 1, CreateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateTicket_InputHeadersQName(), theXMLTypePackage.getQName(), "inputHeadersQName", null, 0, 1, CreateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(createUserEClass, CreateUser.class, "CreateUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreateUser_CompanyUrl(), ecorePackage.getEString(), "companyUrl", null, 0, 1, CreateUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUser_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, CreateUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUser_Password(), ecorePackage.getEString(), "password", null, 0, 1, CreateUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCreateUser_ProfilePhoto(), ecorePackage.getEString(), "profilePhoto", null, 0, 1, CreateUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateTicketEClass, UpdateTicket.class, "UpdateTicket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateTicket_CompanyUrl(), ecorePackage.getEString(), "companyUrl", null, 0, 1, UpdateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateTicket_UserId(), ecorePackage.getEString(), "userId", null, 0, 1, UpdateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateTicket_Password(), ecorePackage.getEString(), "password", null, 0, 1, UpdateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateTicket_AdditionalAttachment(), ecorePackage.getEBoolean(), "additionalAttachment", null, 0, 1, UpdateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateTicket_AttachmentName(), ecorePackage.getEString(), "attachmentName", null, 0, 1, UpdateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateTicket_InputHeadersQName(), theXMLTypePackage.getQName(), "inputHeadersQName", null, 0, 1, UpdateTicket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// dkactivityconfig
		createDkactivityconfigAnnotations();
		// dkcontrolconfig
		createDkcontrolconfigAnnotations();
		// http://tns.tibco.com/bw/annotations/semantictype/password
		createPasswordAnnotations();
	}

	/**
	 * Initializes the annotations for <b>dkactivityconfig</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkactivityconfigAnnotations() {
		String source = "dkactivityconfig";	
		addAnnotation
		  (createTicketEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Synchronous",
			 "schemaType", "XSD/WSDL",
			 "schemaFile", "CreateTicket.xsd",
			 "inputelementname", "ActvityInput",
			 "outputelementname", "ActivityOutput",
			 "faultelementname", "",
			 "helpdocuuid", "e771e7cf-7bfc-4953-bd48-b3db82bd8e13"
		   });	
		addAnnotation
		  (createUserEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Asynchronous",
			 "schemaType", "XSD/WSDL",
			 "schemaFile", "CreateUser.xsd",
			 "inputelementname", "ActvityInput",
			 "outputelementname", "ActivityOutput",
			 "faultelementname", "",
			 "helpdocuuid", "ff4ccacd-af1b-4d10-9068-41d8a88314a5"
		   });	
		addAnnotation
		  (updateTicketEClass, 
		   source, 
		   new String[] {
			 "activitytype", "Synchronous",
			 "schemaType", "XSD/WSDL",
			 "schemaFile", "UpdateTicket.xsd",
			 "inputelementname", "ActvityInput",
			 "outputelementname", "ActivityOutput",
			 "faultelementname", "",
			 "helpdocuuid", "295cf630-12c3-412f-bc5a-418ac8f2b2fe"
		   });
	}

	/**
	 * Initializes the annotations for <b>dkcontrolconfig</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDkcontrolconfigAnnotations() {
		String source = "dkcontrolconfig";	
		addAnnotation
		  (getCreateTicket_CompanyUrl(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Company Url",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateTicket_UserId(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "User Id",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateTicket_Password(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Password",
			 "isModelProperty", "true",
			 "control", "PasswordField",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateTicket_HasCustomFields(), 
		   source, 
		   new String[] {
			 "sectionName", "Advanced",
			 "isRequired", "false",
			 "label", "Has Custom Fields",
			 "isModelProperty", "false",
			 "control", "CheckBox",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateTicket_HasAttachments(), 
		   source, 
		   new String[] {
			 "sectionName", "Advanced",
			 "isRequired", "false",
			 "label", "Has Attachments",
			 "isModelProperty", "false",
			 "control", "CheckBox",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateTicket_AttachmentName(), 
		   source, 
		   new String[] {
			 "sectionName", "Advanced",
			 "isRequired", "false",
			 "label", "Attachment Name",
			 "isModelProperty", "false",
			 "control", "FilePickerField",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateUser_CompanyUrl(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Company Url",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateUser_UserId(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "User Id",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateUser_Password(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Password",
			 "isModelProperty", "true",
			 "control", "PasswordField",
			 "value", ""
		   });	
		addAnnotation
		  (getCreateUser_ProfilePhoto(), 
		   source, 
		   new String[] {
			 "sectionName", "Advanced",
			 "isRequired", "false",
			 "label", "Profile Photo",
			 "isModelProperty", "false",
			 "control", "FilePickerField",
			 "value", ""
		   });	
		addAnnotation
		  (getUpdateTicket_CompanyUrl(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Company Url",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getUpdateTicket_UserId(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "User Id",
			 "isModelProperty", "true",
			 "control", "TextBox",
			 "value", ""
		   });	
		addAnnotation
		  (getUpdateTicket_Password(), 
		   source, 
		   new String[] {
			 "sectionName", "General",
			 "isRequired", "true",
			 "label", "Password",
			 "isModelProperty", "true",
			 "control", "PasswordField",
			 "value", ""
		   });	
		addAnnotation
		  (getUpdateTicket_AdditionalAttachment(), 
		   source, 
		   new String[] {
			 "sectionName", "Advanced",
			 "isRequired", "false",
			 "label", "Attach Additional Attachment",
			 "isModelProperty", "false",
			 "control", "CheckBox",
			 "value", ""
		   });	
		addAnnotation
		  (getUpdateTicket_AttachmentName(), 
		   source, 
		   new String[] {
			 "sectionName", "Advanced",
			 "isRequired", "false",
			 "label", "Attachment Name",
			 "isModelProperty", "false",
			 "control", "FilePickerField",
			 "value", ""
		   });
	}

	/**
	 * Initializes the annotations for <b>http://tns.tibco.com/bw/annotations/semantictype/password</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPasswordAnnotations() {
		String source = "http://tns.tibco.com/bw/annotations/semantictype/password";	
		addAnnotation
		  (getCreateTicket_Password(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getCreateUser_Password(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getUpdateTicket_Password(), 
		   source, 
		   new String[] {
		   });
	}

} //ZendeskPackageImpl