package com.tibco.bw.palette.zendesk.design.gettickets;

import org.eclipse.swt.graphics.Image;

import com.tibco.bw.palette.zendesk.design.Messages;
import com.tibco.bw.palette.zendesk.design.Zendesk;
import com.tibco.bw.palette.zendesk.model.zendesk.GetTickets;
import com.tibco.zion.common.component.xsdtree.impl.SchemaLabelProvider;

public class OutputHeaderLabelProvider extends SchemaLabelProvider {

	@Override
	public Image getImage(Object object) {
		if (object instanceof GetTickets) {
			return Zendesk.getDefault().getImage("/icons/obj16/createTicket_input_header.gif");
		}
		return super.getImage(object);
	}

	@Override
	public String getText(Object object) {
		if (object instanceof GetTickets) {
			return Messages.OutputHeaderLabelProvider_getTickets_label;
		}
		return super.getText(object);
	}

}