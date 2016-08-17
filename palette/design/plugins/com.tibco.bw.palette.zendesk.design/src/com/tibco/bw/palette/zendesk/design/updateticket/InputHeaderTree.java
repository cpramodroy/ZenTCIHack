package com.tibco.bw.palette.zendesk.design.updateticket;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ContributionManager;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.field.SimpleSchemaTreeField;
import com.tibco.bw.design.field.actions.SimpleSchemaRemoveTypeAction;
import com.tibco.bw.design.field.actions.SimpleSchemaSelectTypeAction;
import com.tibco.bw.palette.zendesk.design.Messages;
import com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket;
import com.tibco.zion.common.component.xsdtree.action.AddSimpleElementAction;
import com.tibco.zion.common.component.xsdtree.action.XSDMoveAction;

public class InputHeaderTree extends SimpleSchemaTreeField {
	
	protected InputHeaderLabelProvider labelProvider;
	
	public InputHeaderTree(Composite parent) {
		super(parent);
	}

	@Override
	protected void createStandardActions(ContributionManager manager, TreeViewer viewer) {
		SimpleSchemaSelectTypeAction selectTypeAction = BWFieldFactory.getInstance().createSchemaSelectTypeAction(viewer, Messages.InputHeaderSelectTypeAction_tooltip, this);
		if (getSchemaCreationStrategy() != null) {
			selectTypeAction.setSchemaCreationStrategy(getSchemaCreationStrategy());
		}
		manager.add((IAction) selectTypeAction);
		manager.add((IAction) new AddSimpleElementAction(viewer));
		manager.add((IAction) new XSDMoveAction(viewer, SWT.UP));
		manager.add((IAction) new XSDMoveAction(viewer, SWT.DOWN));
		manager.add((IAction) new SimpleSchemaRemoveTypeAction(viewer, Messages.InputHeaderRemoveTypeAction_tooltip, this));
	}
	

	@Override
	public String getTreeLabel(Object rootItem) {
		if(rootItem instanceof UpdateTicket){
			UpdateTicket updateTicket = (UpdateTicket) rootItem;
			if (updateTicket.getInputHeadersQName() == null) {
				return super.getTreeLabel(null);
			}
		}
		return Messages.SendInputEditorSection_tree_label;
	}
	
	@Override
	protected LabelProvider getLabelProvider(Object inputData) {
		if (labelProvider == null) {
			labelProvider = new InputHeaderLabelProvider();
		}
		return labelProvider;
	}

	@Override
	public EObject getContainerInput() {
		// Empty method stub
		return null;
	}
	
}
