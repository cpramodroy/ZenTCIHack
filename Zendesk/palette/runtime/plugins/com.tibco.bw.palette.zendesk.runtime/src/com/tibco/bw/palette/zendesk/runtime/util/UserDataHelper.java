package com.tibco.bw.palette.zendesk.runtime.util;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;

import com.tibco.bw.palette.zendesk.runtime.UserData;

public class UserDataHelper {
	private static final String	PARAM_NAME			= "Name";
	private static final String	PARAM_EMAIL			= "Email";
	private static final String	PARAM_ROLE			= "Role";
	private static final String	PARAM_PHONE_NUMBER	= "PhoneNumber";
	private static final String	PARAM_ALIAS			= "Alias";
	private static final String	PARAM_EXTERNAL_ID	= "ExternalId";

	public static <N> UserData getUserInput(N input, ProcessingContext<N> pcx) {
		UserData userData = new UserData();

		String name = getName(input, pcx);
		if (name != null)
			userData.setName(name);

		String email = getEmail(input, pcx);
		if (email != null)
			userData.setEmail(email);

		String role = getRole(input, pcx);
		if (role != null)
			userData.setRole(role);

		String phoneNumber = getPhoneNumber(input, pcx);
		if (phoneNumber != null)
			userData.setPhoneNumber(phoneNumber);

		String alias = getAlias(input, pcx);
		if (alias != null)
			userData.setAlias(alias);

		String externalId = getExternalId(input, pcx);
		if (externalId != null)
			userData.setExternalId(externalId);

		return userData;
	}

	public static <N> String getName(final N input, final ProcessingContext<N> pcx) {
		return getChildElementStringValue(PARAM_NAME, input, pcx);
	}

	public static <N> String getEmail(final N input, final ProcessingContext<N> pcx) {
		return getChildElementStringValue(PARAM_EMAIL, input, pcx);
	}

	public static <N> String getRole(final N input, final ProcessingContext<N> pcx) {
		return getChildElementStringValue(PARAM_ROLE, input, pcx);
	}

	public static <N> String getPhoneNumber(final N input, final ProcessingContext<N> pcx) {
		return getChildElementStringValue(PARAM_PHONE_NUMBER, input, pcx);
	}

	public static <N> String getAlias(final N input, final ProcessingContext<N> pcx) {
		return getChildElementStringValue(PARAM_ALIAS, input, pcx);
	}

	public static <N> String getExternalId(final N input, final ProcessingContext<N> pcx) {
		return getChildElementStringValue(PARAM_EXTERNAL_ID, input, pcx);
	}

	private static <N> String getChildElementStringValue(final String elementName, final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N node = model.getFirstChildElementByName(input, null, elementName);
		String value = null;

		if (node != null) {
			value = model.getStringValue(node);
		}
		return value;
	}
}
