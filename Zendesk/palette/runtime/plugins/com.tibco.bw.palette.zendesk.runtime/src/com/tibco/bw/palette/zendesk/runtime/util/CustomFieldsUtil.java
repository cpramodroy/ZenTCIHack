package com.tibco.bw.palette.zendesk.runtime.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.CustomFieldValue;
import org.zendesk.client.v2.model.Field;
import org.zendesk.client.v2.model.Field.Option;

/**
 * @author tvuppala, pramod
 *
 */

/**
 * Utility class to get all custom fields from zendesk portal and validate the
 * input custom fields.
 *
 */
public class CustomFieldsUtil {
	// storing custom field title and id
	static ConcurrentHashMap<String, Long> customFieldIDStore = new ConcurrentHashMap<String, Long>();
	// storing custom field name and it's option values
	static HashMap<String, HashMap<String, String>> customOptionsMap = new HashMap<String, HashMap<String, String>>();

	/**
	 * Used to get all custom fields from zendesk portal
	 * @param zendesk
	 *            Zendesk instance
	 * @param type
	 *            custom fields type
	 */
	private static void getZendeskCustomFields(Zendesk zendesk, String type) {
		List<Field> fields = null;
		switch (type) {
			case "ticket":
				fields = zendesk.getTicketFields();
				for (Field field : fields) {
					Long fieldID = field.getId();
					String fieldType = field.getType();
					HashMap<String, String> optionValues = new HashMap<String, String>();
					// Tagger custom field will have options to choose value
					if (fieldType.equals("tagger")) {
						for (Option option : field.getCustomFieldOptions()) {
							optionValues.put(option.getName().toLowerCase(), option.getValue().toLowerCase());
						}
					}
					String fieldTitle = field.getTitle().replaceAll("\\s+", "");
					customOptionsMap.put(fieldTitle.toLowerCase(), optionValues);
					customFieldIDStore.put(fieldTitle.toLowerCase(), fieldID);
				}
				break;
			// TODO: Further enhancements
			case "user":
				break;
			case "group":
				break;
			case "organization":
				break;
			default:
				break;
		}

	}

	/**
	 * Used to validate custom fields against custom fields in zendesk portal.
	 * @param customFieldValues
	 * @param zendesk
	 * @param type
	 * @return
	 */
	public static List<CustomFieldValue> verifyAndGetCustomFields(Map<String, String> customFieldValues, Zendesk zendesk, String type) {
		Long custom_id = null;
		String custom_value = null;
		List<CustomFieldValue> customFields = new ArrayList<CustomFieldValue>();
		getZendeskCustomFields(zendesk, type);
		for (Entry<String, String> custom : customFieldValues.entrySet()) {
			String customKey = custom.getKey().toLowerCase();
			String customValue = custom.getValue().toLowerCase();
			if (customOptionsMap.containsKey(customKey)) {
				if (customOptionsMap.get(customKey).size() > 0) {
					if (customOptionsMap.get(customKey).containsKey(customValue)) {
						if (customFieldIDStore.containsKey(customKey)) {
							custom_id = customFieldIDStore.get(customKey);
							custom_value = customOptionsMap.get(customKey).get(customValue);
						}
					}
				} else {
					custom_id = customFieldIDStore.get(customKey);
					custom_value = customValue;
				}
				CustomFieldValue customField = new CustomFieldValue(custom_id, custom_value);
				customFields.add(customField);
			}
		}
		return customFields;
	}
}
