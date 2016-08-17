package com.tibco.bw.palette.zendesk.design.createticket;

import org.eclipse.swt.graphics.Image;

import com.tibco.bw.palette.zendesk.design.Messages;
import com.tibco.bw.palette.zendesk.design.Zendesk;
import com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket;
import com.tibco.zion.common.component.xsdtree.impl.SchemaLabelProvider;

public class InputHeaderLabelProvider extends SchemaLabelProvider {

	@Override
	public Image getImage(Object object) {
		if (object instanceof CreateTicket) {
			return Zendesk.getDefault().getImage("/icons/obj16/createTicket_input_header.gif");
		}
		return super.getImage(object);
	}

	@Override
	public String getText(Object object) {
		if (object instanceof CreateTicket) {
			return Messages.InputHeaderLabelProvider_createTicket_label;
		}
		return super.getText(object);
	}

}