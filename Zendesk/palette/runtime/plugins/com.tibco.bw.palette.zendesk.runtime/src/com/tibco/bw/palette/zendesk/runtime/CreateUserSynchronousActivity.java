package com.tibco.bw.palette.zendesk.runtime;

/**
 * @author tvuppala
 * @author pcheruku
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import com.tibco.bw.palette.zendesk.runtime.RuntimeMessageBundle;
import com.tibco.bw.palette.zendesk.model.zendesk.CreateUser;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.util.XMLUtils;

import org.genxdm.ProcessingContext;

import com.tibco.neo.localized.LocalizedMessage;

import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Attachment;
import org.zendesk.client.v2.model.Attachment.Upload;
import org.zendesk.client.v2.model.Role;
import org.zendesk.client.v2.model.Ticket;
import org.zendesk.client.v2.model.User;

import com.tibco.bw.palette.zendesk.runtime.util.PaletteUtil;
import com.tibco.bw.palette.zendesk.runtime.util.UserDataHelper;
import com.tibco.bw.palette.zendesk.runtime.pojo.createuser.ActivityOutputType;
import com.tibco.bw.runtime.annotation.Property;

public class CreateUserSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants {
	@Property
	public CreateUser activityConfig;

	/**
	 * @generated
	 * 
	 *            This method is called to initialize the activity. It is called by the
	 *            BusinessWorks Engine once for a particular activity lifetime.
	 * 
	 * @throws ActivityLifecycleFault
	 *             Thrown if the activity initialization is unsuccessful or encounters an error.
	 */
	@Override
	public void init() throws ActivityLifecycleFault {
		if (this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(
					RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED,
					new Object[] { "init()", activityContext.getActivityName(), activityContext.getProcessName(),
							activityContext.getDeploymentUnitName(), activityContext.getDeploymentUnitVersion() });
		}
		super.init();
	}

	/**
	 * @generated
	 * 
	 *            This method is called when an activity is destroyed. It is called by the
	 *            BusinessWorks Engine and the method must be implemented to release or cleanup any
	 *            resources held by this activity.
	 */
	@Override
	public void destroy() {
		if (this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(
					RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED,
					new Object[] { "destroy()", activityContext.getActivityName(), activityContext.getProcessName(),
							activityContext.getDeploymentUnitName(), activityContext.getDeploymentUnitVersion() });
		}
		super.destroy();
	}

	/**
	 * @generated
	 *
	 *            The implementation of this method defines the execution behavior of the
	 *            synchronous activity. This method is called by the BusinessWorks Engine on a
	 *            engine thread to perform the activity essential functions.
	 * 
	 * @param input
	 *            This is the activity input data. It is an XML Element which adheres to the input
	 *            schema of the activity or <code>null</code> if the activity does not require an
	 *            input. The activity input data should be processed using the XML processing
	 *            context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
	 * @param processContext
	 *            Context that is associated with a BusinessWorks Process instance. This context is
	 *            unique per BusinessWorks Process instance and it is not visible to other
	 *            BusinessWorks Process instances. Also this context is valid only within the
	 *            BusinessWorks Engine thread on which this method is invoked. Therefore this
	 *            context must not be saved or used by a different thread that is created or managed
	 *            by the activity implementation.
	 * @return An XML Element which adheres to the output schema of the activity or may return
	 *         <code>null</code> if the activity does not require an output. This is the activity
	 *         output data and it should be created using the XML processing context obtained from
	 *         the method {@link ProcessContext#getXMLProcessingContext()}.
	 * @throws ActivityFault
	 *             Thrown if the activity execution is unsuccessful or encounters an error.
	 */
	@Override
	public N execute(N input, ProcessContext<N> processContext) throws ActivityFault {
		if (getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(
					RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED,
					new Object[] { "execute()", activityContext.getActivityName(), activityContext.getProcessName(),
							activityContext.getDeploymentUnitName(), activityContext.getDeploymentUnitVersion() });
			String serializedInputNode = XMLUtils.serializeNode(input, processContext.getXMLProcessingContext());
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_INPUT, new Object[] { activityContext.getActivityName(),
					serializedInputNode });
		}

		N result = null;
		UserData userData = null;
		long userId;

		try {
			// Reading activity input to create zendesk user
			userData = UserDataHelper.getUserInput(input, processContext.getXMLProcessingContext());
			userId = createZendeskUser(userData);
		} catch (Exception e) {
			throw new ActivityFault(activityContext, e);
		}
		try {
			// create output data according the output structure
			result = evalOutput(input, processContext.getXMLProcessingContext(), userId);
		} catch (Exception e) {
			throw new ActivityFault(activityContext, new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_RETRIEVE_RESULT,
					new Object[] { activityContext.getActivityName() }));
		}

		if (getActivityLogger().isDebugEnabled()) {
			String serializedOutputNode = XMLUtils.serializeNode(result, processContext.getXMLProcessingContext());
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_OUTPUT, new Object[] { activityContext.getActivityName(),
					serializedOutputNode, activityContext.getActivityName() });
		}
		return result;
	}

	/**
	 * Connects to the zendesk account to create a user.
	 * 
	 * @param userData
	 *            required fields from activity input
	 * @return id of the user created
	 * @throws ActivityFault
	 */
	private Long createZendeskUser(UserData userData) throws ActivityFault {
		String companyUrl = activityConfig.getCompanyUrl();
		String userId = activityConfig.getUserId();
		String password = activityConfig.getPassword(); // TODO: Encode password using HTTP connector

		Zendesk zendeskInstance = null;
		try {
			zendeskInstance = new Zendesk.Builder(companyUrl).setUsername(userId).setPassword(password).build();
			User user = zendeskInstance.getAuthenticatedUser();
			if(user == null){
				throw new RuntimeException();
			}
		} catch (RuntimeException e) {
			LocalizedMessage msg = new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_INVALID_CREDENTIALS,
					new Object[] { activityContext.getActivityName() });
			throw new ActivityFault(activityContext, msg);
		}

		// Build user for zendesk
		User user = new User();
		user.setName(userData.getName());
		user.setEmail(userData.getEmail());

		String role = userData.getRole();
		if (role == null)
			user.setRole(Role.END_USER);
		else if (role.equals("admin"))
			user.setRole(Role.ADMIN);
		else if (role.equals("end-user"))
			user.setRole(Role.END_USER);
		else if (role.equals("agent"))
			user.setRole(Role.AGENT);

		if (userData.getPhoneNumber() != null) {
			user.setPhone(userData.getPhoneNumber());
		}

		if (userData.getAlias() != null) {
			user.setAlias(userData.getAlias());
		}

		if (userData.getExternalId() != null) {
			user.setExternalId(userData.getExternalId());
		}

		// Get path to image from activity input
		if (activityConfig.getProfilePhoto() != null) {
			File file = new File(activityConfig.getProfilePhoto());
			try {
				ImageIO.read(file); // Verifies if it's an image (only BMP, GIF, JPG and PNG are recognized)
			} catch (IOException e) {
				throw new ActivityFault(activityContext, e); // It's not an image.
			}

			byte[] contents = new byte[(int) file.length()];
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
				fis.read(contents);
			} catch (FileNotFoundException e) {
				throw new ActivityFault(activityContext, e);
			} catch (IOException e) {
				throw new ActivityFault(activityContext, e);
			}
			try {
				fis.close();
			} catch (IOException e) {
				throw new ActivityFault(activityContext, e);
			}

			// Upload profile photo to user account
			Upload upload = null;
			try{
				upload = zendeskInstance.createUpload(file.getName(), contents);		
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			List<Attachment> photos = upload.getAttachments();
			user.setPhoto(photos.get(0));
		}

		// Creating user with all the required information
		User createdUser = null;
		try{
			createdUser = zendeskInstance.createUser(user);
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		zendeskInstance.close();
		return createdUser.getId();
	}

	/**
	 * @generated
	 * 
	 *            This method to build the output after finishing the business.
	 * @param inputData
	 *            This is the activity input data.
	 * @param processingContext
	 *            XML processing context.
	 * @param data
	 *            Business object.
	 * @return An XML Element which adheres to the output schema of the activity or may return
	 *         <code>null</code> if the activity does not require an output.
	 */
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, long userId) throws Exception {

		ActivityOutputType activityOutput = new ActivityOutputType();
		activityOutput.setUserId(userId);
		N output = PaletteUtil.parseObjtoN(ActivityOutputType.class, activityOutput, processingContext, activityContext.getActivityOutputType()
				.getTargetNamespace(), "ActivityOutput");
		return output;
	}
}
