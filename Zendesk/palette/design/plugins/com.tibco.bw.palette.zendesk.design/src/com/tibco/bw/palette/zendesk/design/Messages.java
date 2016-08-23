package com.tibco.bw.palette.zendesk.design;

import java.util.ResourceBundle;

import org.eclipse.osgi.util.NLS;

@SuppressWarnings("javadoc")
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.tibco.bw.palette.zendesk.design.messages"; //$NON-NLS-1$
	
	public static String SendInputEditorSection_tree_label;
	public static String InputHeaderSelectTypeAction_tooltip;
	public static String InputHeaderRemoveTypeAction_tooltip;
	
	// CreateTicket messages
	public static String InputHeaderLabelProvider_createTicket_label;
	public static String CreateTicketSchema_inputHeader_tns_prefix;
	public static String CreateTicketSchema_inputHeader_tns;
	public static String CreateTicketSchema_inputHeader_typeValidationError_label;
	public static String CreateTicketSchema_inputHeader_sourceError_label;

	// UpdateTicket messages
	public static String InputHeaderLabelProvider_updateTicket_label;
	public static String UpdateTicketSchema_inputHeader_tns_prefix;
	public static String UpdateTicketSchema_inputHeader_tns;
	public static String UpdateTicketSchema_inputHeader_typeValidationError_label;
	public static String UpdateTicketSchema_inputHeader_sourceError_label;
	
	// GetTickets messages
	public static String OutputHeaderLabelProvider_getTickets_label;
	public static String GetTicketsSchema_outputHeader_tns_prefix;
	public static String GetTicketsSchema_outputHeader_tns;
	public static String GetTicketsSchema_outputHeader_typeValidationError_label;
	public static String GetTicketsSchema_outputHeader_sourceError_label;
	
	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	@SuppressWarnings("javadoc")
	protected static ResourceBundle getBundle() {
		return ResourceBundle.getBundle(Messages.BUNDLE_NAME);
	}
}
