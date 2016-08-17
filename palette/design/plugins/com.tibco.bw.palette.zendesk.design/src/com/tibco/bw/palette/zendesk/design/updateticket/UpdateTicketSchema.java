package com.tibco.bw.palette.zendesk.design.updateticket;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDCompositor;
import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDForm;
import org.eclipse.xsd.XSDModelGroup;
import org.eclipse.xsd.XSDParticle;
import org.eclipse.xsd.XSDSimpleTypeDefinition;
import org.eclipse.xsd.XSDTypeDefinition;

import com.tibco.bw.design.api.BWExtensionActivitySchema;
import com.tibco.bw.design.internal.base.BWDesign;
import com.tibco.bw.palette.zendesk.design.Messages;

import java.io.InputStream;
import java.util.Map;
import java.util.UUID;

import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.util.XSDConstants;

public class UpdateTicketSchema extends BWExtensionActivitySchema {
	
	private static String ATTRIBUTE_NAME = "source"; //$NON-NLS-1$
	private static String ATTRIBUTE_VALUE = "bw.zendesk.updateTicket"; //$NON-NLS-1$
	
	private static UpdateTicketSchema INSTANCE = new UpdateTicketSchema();
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * File location.
	 */
	private static final String SCHEMA_FILE_PATH = "/schema/UpdateTicket.xsd";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * The name of the input element.
	 */
	private static final String INPUT_TYPE_ELEMENT_NAME = "ActvityInput";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * The name of the output element.
	 */
	private static final String OUTPUT_TYPE_ELEMENT_NAME = "ActivityOutput";
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Get the input element according to the input name.
	 *
	 * @return input element
	 */
	public static XSDElementDeclaration getInputType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema();
		XSDElementDeclaration activityInputType = null;
		if (activitySignatureSchema != null) {
			activityInputType = activitySignatureSchema.resolveElementDeclaration(INPUT_TYPE_ELEMENT_NAME);
		}
		// begin-custom-code
        // end-custom-code
		return activityInputType;
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Get the output element according to the output name.
	 *
	 * @return output element
	 */
	public static XSDElementDeclaration getOutputType() {
     	XSDSchema activitySignatureSchema = INSTANCE.loadSchema(); 
		XSDElementDeclaration activityOutputType = null;
		if (activitySignatureSchema != null) {
			activityOutputType = activitySignatureSchema.resolveElementDeclaration(OUTPUT_TYPE_ELEMENT_NAME);
		}
		// begin-custom-code
        // end-custom-code
		return activityOutputType;
	}	
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Use the Java class loader to find and create a stream to the resource based on schema location in the workspace.
	 * @return stream to read the schema resource.	
	 */
	@Override
	protected InputStream getSchemaAsInputStream() {
		return this.getClass().getResourceAsStream(SCHEMA_FILE_PATH);
	}

	public XSDSchema createInputHeaderSchemaWithType() {
		String prefix = Messages.UpdateTicketSchema_inputHeader_tns_prefix;
		String namespace = Messages.UpdateTicketSchema_inputHeader_tns + "/" + UUID.randomUUID().toString();

		XSDSchema schema = xsdFactory.createXSDSchema();
		schema.setTargetNamespace(namespace);

		Map<String, String> qNamePrefixToNsMap = schema.getQNamePrefixToNamespaceMap();
		qNamePrefixToNsMap.put(schema.getSchemaForSchemaQNamePrefix(), XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001);
		qNamePrefixToNsMap.put(prefix, namespace);

		// root complex type
		XSDComplexTypeDefinition rootComplexType = xsdFactory.createXSDComplexTypeDefinition();
		rootComplexType.setTargetNamespace(namespace);
		rootComplexType.setName("customFieldType"); //$NON-NLS-1$

			// root complex type particle
			XSDParticle complexTypeParticle = xsdFactory.createXSDParticle();

				// particle's model group
				XSDModelGroup modelGroup = xsdFactory.createXSDModelGroup();
				modelGroup.setCompositor(XSDCompositor.SEQUENCE_LITERAL);

					// particle for "Field1" element
					XSDParticle field1ElementParticle = xsdFactory.createXSDParticle();
					field1ElementParticle.setMinOccurs(0);
					field1ElementParticle.setMaxOccurs(1);
				

						// "Field1" element with string type
						XSDElementDeclaration contentTypeElement = xsdFactory.createXSDElementDeclaration();
						contentTypeElement.setName("Field1"); //$NON-NLS-1$
						contentTypeElement.setForm(XSDForm.UNQUALIFIED_LITERAL);
							XSDSimpleTypeDefinition stringType = schema.resolveSimpleTypeDefinition(XSDConstants.SCHEMA_FOR_SCHEMA_URI_2001, "string"); //$NON-NLS-1$						

						contentTypeElement.setTypeDefinition(stringType);

						field1ElementParticle.setContent(contentTypeElement);

				modelGroup.getContents().add(field1ElementParticle);
	
			complexTypeParticle.setContent(modelGroup);

		rootComplexType.setContent(complexTypeParticle);
		rootComplexType.setContentType(complexTypeParticle);

		schema.getContents().add(rootComplexType);

		XSDSchema compiledSchema = compileSchema(schema);
		addExtensionAttribute(compiledSchema, rootComplexType, ATTRIBUTE_NAME, ATTRIBUTE_VALUE);
		return compiledSchema;
	}

	public IStatus validateInputHeaderType(XSDTypeDefinition xsdTypeDefinition, boolean matchExtension) {
		boolean isValid = false;
		XSDComplexTypeDefinition complexType = null;
		if (xsdTypeDefinition instanceof XSDComplexTypeDefinition) {
			complexType = (XSDComplexTypeDefinition) xsdTypeDefinition;
		}
		if (complexType != null) {
			XSDParticle particle = complexType.getComplexType();
			if (particle != null && particle.getTerm() instanceof XSDModelGroup) {
				if (matchExtension) {
					if (hasExtensionAttribute(xsdTypeDefinition, ATTRIBUTE_NAME, ATTRIBUTE_VALUE)) {
						isValid = true;
					} else {
						return BWDesign.createErrorStatus(Messages.UpdateTicketSchema_inputHeader_sourceError_label);
					}
				} else {
					isValid = true;
				}
			}
		}
		if (isValid) {
			return Status.OK_STATUS;
		} else {
			return BWDesign.createErrorStatus(Messages.UpdateTicketSchema_inputHeader_typeValidationError_label);
		}
	}
	
}
