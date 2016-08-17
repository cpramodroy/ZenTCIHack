/*
 * This software is confidential and proprietary information of TIBCO Software Inc.
 * Overridable true
 */
package com.tibco.bw.palette.zendesk.model.utils;

import java.util.ResourceBundle;
import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "com.tibco.bw.palette.zendesk.model.utils.messages";

	static {
		// initialize resource bundle
		NLS.initializeMessages(Messages.BUNDLE_NAME, Messages.class);
	}

	public static ResourceBundle getBundle() {
		return ResourceBundle.getBundle(BUNDLE_NAME);
	}
    
	
	public static String CREATETICKET_COMPANYURL;
	public static String CREATETICKET_USERID;
	public static String CREATETICKET_PASSWORD;
	public static String CREATETICKET_HASCUSTOMFIELDS;
	public static String CREATETICKET_HASATTACHMENTS;
	public static String CREATETICKET_ATTACHMENTNAME;
	public static String CREATEUSER_COMPANYURL;
	public static String CREATEUSER_USERID;
	public static String CREATEUSER_PASSWORD;
	public static String CREATEUSER_PROFILEPHOTO;
	public static String UPDATETICKET_COMPANYURL;
	public static String UPDATETICKET_USERID;
	public static String UPDATETICKET_PASSWORD;
	public static String UPDATETICKET_ADDITIONALATTACHMENT;
	public static String UPDATETICKET_ATTACHMENTNAME;
	public static String PALETTE_PARAMETER_VALUE_INVALID;	
}
