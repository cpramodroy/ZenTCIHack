package com.tibco.bw.palette.zendesk.design.gettickets;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ContributionManager;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xsd.XSDTypeDefinition;

import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.field.SimpleSchemaTreeField;
import com.tibco.bw.design.field.actions.SimpleSchemaRemoveTypeAction;
import com.tibco.bw.design.field.actions.SimpleSchemaSelectTypeAction;
import com.tibco.bw.design.util.ModelHelper;
import com.tibco.bw.palette.zendesk.design.Messages;
import com.tibco.bw.palette.zendesk.model.zendesk.GetTickets;
import com.tibco.zion.common.component.xsdtree.action.AddSimpleElementAction;
import com.tibco.zion.common.component.xsdtree.action.XSDMoveAction;

public class OutputHeaderTree extends SimpleSchemaTreeField {
	
	protected OutputHeaderLabelProvider labelProvider;
	
	public OutputHeaderTree(Composite parent) {
		super(parent);
	}

	@Override
	protected void createStandardActions(ContributionManager manager, TreeViewer viewer) {
		SimpleSchemaSelectTypeAction selectTypeAction = BWFieldFactory.getInstance().createSchemaSelectTypeAction(viewer, Messages.OutputHeaderSelectTypeAction_tooltip, this);
		if (getSchemaCreationStrategy() != null) {
			selectTypeAction.setSchemaCreationStrategy(getSchemaCreationStrategy());
		}
		manager.add((IAction) selectTypeAction);
		manager.add((IAction) new AddSimpleElementAction(viewer));
		manager.add((IAction) new XSDMoveAction(viewer, SWT.UP));
		manager.add((IAction) new XSDMoveAction(viewer, SWT.DOWN));
		manager.add((IAction) new SimpleSchemaRemoveTypeAction(viewer, Messages.OutputHeaderRemoveTypeAction_tooltip, this));
	}
	

	@Override
	public String getTreeLabel(Object rootItem) {
		if (rootItem instanceof GetTickets) {
			GetTickets getTickets = (GetTickets) rootItem;
			if (null != getTickets.getOutputHeadersQName()) {
				XSDTypeDefinition type = ModelHelper.INSTANCE.getXSDTypeByQName(getTickets, getTickets.getOutputHeadersQName());
				return type.getName();
			}
		}
		return Messages.SendOutputEditorSection_tree_label;
	}
	
	@Override
	protected LabelProvider getLabelProvider(Object inputData) {
		if (labelProvider == null) {
			labelProvider = new OutputHeaderLabelProvider();
		}
		return labelProvider;
	}

	@Override
	public EObject getContainerInput() {
		// Empty method stub
		return null;
	}
	
}
