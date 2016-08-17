package com.tibco.bw.palette.zendesk.design.updateticket;

import org.eclipse.swt.graphics.Image;

import com.tibco.bw.palette.zendesk.design.Messages;
import com.tibco.bw.palette.zendesk.design.Zendesk;
import com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket;
import com.tibco.zion.common.component.xsdtree.impl.SchemaLabelProvider;

public class InputHeaderLabelProvider extends SchemaLabelProvider {

	@Override
	public Image getImage(Object object) {
		if (object instanceof UpdateTicket) {
			return Zendesk.getDefault().getImage("/icons/obj16/createTicket_input_header.gif");
		}
		return super.getImage(object);
	}

	@Override
	public String getText(Object object) {
		if (object instanceof UpdateTicket) {
			return Messages.InputHeaderLabelProvider_updateTicket_label;
		}
		return super.getText(object);
	}

}