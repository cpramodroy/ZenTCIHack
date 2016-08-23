package com.tibco.bw.palette.zendesk.design.gettickets;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;

import com.tibco.bw.design.field.SimpleSchemaTreeField;
import com.tibco.bw.design.field.dialogs.SchemaCreationStrategy;
import com.tibco.bw.design.field.utils.QNameDataType;
import com.tibco.bw.design.internal.base.BWDesign;
import com.tibco.bw.design.propertysection.AbstractInlineSchemaSection;
import com.tibco.bw.palette.zendesk.design.Messages;
import com.tibco.bw.palette.zendesk.model.zendesk.GetTickets;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;
import com.tibco.zion.common.component.xsdtree.SimpleXsdTree;


/**
 * Input Editor tab for Get Tickets activity.
 */
public class GetTicketsOutputEditorSection extends AbstractInlineSchemaSection {

	@Override
	protected QNameDataType getQNameDataType() {
		return QNameDataType.XSD_TYPE;
	}

	@Override
	protected Class<?> getModelClass() {
		return GetTickets.class;
	}

	@Override
	protected EStructuralFeature getBindingFeature() {
		return ZendeskPackage.Literals.GET_TICKETS__OUTPUT_HEADERS_QNAME;
	}

	@Override
	protected SimpleSchemaTreeField createSchemaTree(Composite parent) {
		// provide information for schema creation dialog.
		SchemaCreationStrategy schemaCreationDelegate = new SchemaCreationStrategy() {
			@Override
			public String getDefaultResourceName() {
				return "GetTicketsSchema"; //$NON-NLS-1$
			}

			@Override
			public int getSchemaTreeStandardActions() {
				return SimpleXsdTree.ADD_SIMPLE_ELEMENT | SimpleXsdTree.XSD_MOVE_UP | SimpleXsdTree.XSD_MOVE_DOWN | SimpleXsdTree.XSD_REMOVE;
			}

			@Override
			public XSDSchema createSchema() {
				return new GetTicketsSchema().createOutputHeaderSchemaWithType();
			}

			@Override
			public XSDNamedComponent getSchemaEditorInput(Object data) {
				if (data instanceof XSDSchema) {
					return new GetTicketsSchema().getDefaultComplexType((XSDSchema) data);
				}
				return null;
			}

			@Override
			public IStatus validateSchemaNamedComponent(XSDNamedComponent namedComponent, boolean matchExtension) {
				if (namedComponent instanceof XSDTypeDefinition) {
					return new GetTicketsSchema().validateOutputHeaderType((XSDTypeDefinition) namedComponent, matchExtension);
				}
				return BWDesign.createErrorStatus(Messages.GetTicketsSchema_outputHeader_typeValidationError_label);
			}
		};

		OutputHeaderTree schemaTree = new OutputHeaderTree(parent) {
			@Override
			public EObject getContainerInput() {
				return GetTicketsOutputEditorSection.this.getInput();
			}
		};
		schemaTree.setSchemaCreationStrategy(schemaCreationDelegate);

		return schemaTree;
	}
}
