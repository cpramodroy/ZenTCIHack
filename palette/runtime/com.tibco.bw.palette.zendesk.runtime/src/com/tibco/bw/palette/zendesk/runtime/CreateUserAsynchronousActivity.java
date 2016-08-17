package com.tibco.bw.palette.zendesk.runtime;

import java.io.Serializable;
import java.io.IOException;
import com.tibco.bw.runtime.AsyncActivity;
import org.genxdm.ProcessingContext;
import org.genxdm.Model;
import org.genxdm.io.FragmentBuilder;
import com.tibco.bw.palette.zendesk.runtime.util.PaletteUtil;
import com.tibco.bw.palette.zendesk.runtime.pojo.createuser.ActivityOutputType;
import com.tibco.bw.runtime.AsyncActivityCompletionNotifier;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.bw.runtime.util.SerializableXMLDocument;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.AsyncActivityController;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.util.XMLUtils;
import com.tibco.neo.localized.LocalizedMessage;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.tibco.bw.palette.zendesk.model.zendesk.CreateUser;

public class CreateUserAsynchronousActivity<N> extends AsyncActivity<N> implements ZendeskContants {
	private ExecutorService threadPool = null;
	private final ConcurrentHashMap<String, Future<?>> executingTasks = new ConcurrentHashMap<String, Future<?>>();
	
	@Property
	public CreateUser activityConfig;
	
	
	
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method is called to initialize the activity. It is called by the 
	 * BusinessWorks Engine once for a particular activity lifetime.
	 * 
	 * @throws ActivityLifecycleFault
	 *             Thrown if the activity initialization is unsuccessful or encounters an error.
	 */
    @Override
	public void init() throws ActivityLifecycleFault {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "init()"
								,activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		super.init();
		threadPool = Executors.newCachedThreadPool();
	}
	
	/**
  	 * <!-- begin-custom-doc -->
  	 * 
  	 * <!-- end-custom-doc -->
  	 * @generated
  	 *
	 * This method is called when an activity is destroyed. It is called by the BusinessWorks Engine and 
	 * the method must be implemented to release or clean up any resources held by this activity.
  	 */
    @Override
  	public void destroy() {
  		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "destroy()"
								,activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
		// begin-custom-code
		// add your own business code here
		// end-custom-code
		super.destroy();
  	}
  	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Cancels the execution of the asynchronous activity implementation. This method is called by BusinessWorks 
	 * Engine when the asynchronous activity has not completed within the wait time specified in the call to the 
	 * method {@link AsyncActivityController#setPending} or when the BusinessWorks Engine or the application is shutting down.
	 * <p>
	 * If this method is called by BusinessWorks Engine, then the asynchronous activity method {@link AsyncActivity#postExecute} will not be called.
	 *  
	 * @param processContext
	 *           Context that is associated with a BusinessWorks Process instance. This context is unique per BusinessWorks Process instance and it 
	 *           is not visible to other BusinessWorks Process instances.  Also this context is valid only within the BusinessWorks Engine thread on 
	 *           which this method is invoked. Therefore this context must not be saved or used by a different thread that is created or managed by the activity
	 *           implementation. 
	 */
	@Override
	public void cancel(ProcessContext<N> processContext) {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "cancel()"
								,activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
    	Future<?> future = executingTasks.remove(processContext.getActivityExecutionId() + activityContext.getActivityName());
    	// begin-custom-code
        // add your own business code here
        // end-custom-code
    	if(future!=null) {
    		future.cancel(true);
    	}
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Starts the execution of the asynchronous activity implementation.  This method is called by the BusinessWorks Engine 
	 * on a engine thread; however the activity logic must be executed on an independent thread. 
	 * 
	 * @param input
	 *           This is the activity input data. It is an XML Element which adheres to the input schema of the activity or <code>null</code> if the activity does not require an input.
	 *           The activity input data should be processed using the XML processing context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
	 * @param processContext
	 *           Context that is associated with a BusinessWorks Process instance. This context is unique per BusinessWorks Process instance and it 
	 *           is not visible to other BusinessWorks Process instances.  Also this context is valid only within the BusinessWorks Engine thread on 
	 *           which this method is invoked. Therefore this context must <b>not</b> be saved or used by a different thread that is created or managed by the activity
	 *           implementation. 
	 * @param activityController
	 *           Controller used to set the asynchronous activity wait time and to obtain the asynchronous activity completion notifier {@link AsyncActivityCompletionNotifier}. 
	 			 This controller is only valid within this method invocation and must <b>not</b> be saved or held by this method implementation.
	 * @throws ActivityFault
	 */
	@Override
	public void execute(N input, ProcessContext<N> processContext, AsyncActivityController asyncActivityController) throws ActivityFault {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "execute()"
								,activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
		AsyncActivityCompletionNotifier notifier = asyncActivityController.setPending(0);
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		CreateUserActivityExecutor<N> runnable = new CreateUserActivityExecutor<N>(notifier, input, processContext);
		Future<?> task = threadPool.submit(runnable);
		String taskId = processContext.getActivityExecutionId() + this.getActivityContext().getActivityName();
		executingTasks.put(taskId, task);
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Completes the execution of the asynchronous activity implementation. This method is called by the BusinessWorks 
	 * Engine after the asynchronous activity has signaled ready for completion by invoking the 
	 * method {@link AsyncActivityCompletionNotifier#setReady} from the activity's independent thread.
	 * <p>
	 * Before processing the argument <code>activityData</code> of this method, the type must be checked. If the type is {@link com.tibco.bw.runtime.util.SerializableXMLDocument}
	 * then the enclosed XML document can be extracted for further processing. 
	 * <p>
	 * 
	 * @param value 
	 *           Activity data that is passed to the method {@link AsyncActivityCompletionNotifier#setReady} by the asynchronous activity.
	 * @param processContext
	 *           Context that is associated with a BusinessWorks Process instance. This context is unique per BusinessWorks Process instance and it 
	 *           is not visible to other BusinessWorks Process instances.  Also this context is valid only within the BusinessWorks Engine thread on 
	 *           which this method is invoked. Therefore this context must not be saved or used by a different thread that is created or managed by the activity
	 *           implementation. 
	 * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output. 
     *         This is the activity output data and it should be created using the XML processing context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
	 * @throws ActivityFault
	 */
	@SuppressWarnings("unchecked")
	@Override
	public N postExecute(Serializable value, ProcessContext<N> processContext) throws ActivityFault {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "postExecute()"
								,activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
		if (value instanceof ActivityFault) {
			throw (ActivityFault)value;
		} else {
			try {
			 	// begin-custom-code
		        // add your own business code here
		        // end-custom-code
				N output = ((SerializableXMLDocument<N>)value).getXMLDocument(processContext.getXMLProcessingContext());
				if(getActivityLogger().isDebugEnabled()){
					String serializedNode = XMLUtils.serializeNode(output, processContext.getXMLProcessingContext());
					activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_OUTPUT, new Object[] {activityContext.getActivityName(), serializedNode, activityContext.getActivityName()});
		    	}
				return output;
			} catch (IOException e) {
				throw new ActivityFault(activityContext, new LocalizedMessage(
						RuntimeMessageBundle.ERROR_OCCURED_RETRIEVE_RESULT, new Object[] {activityContext.getActivityName()}));
			}
		}
	}
	
	class CreateUserActivityExecutor<A> implements Runnable {
		private AsyncActivityCompletionNotifier notifier = null;
		private N inputData = null;
		private ProcessContext<N> processContext = null;
		
		public CreateUserActivityExecutor(AsyncActivityCompletionNotifier notifier, N input, ProcessContext<N> processContext) {
			this.notifier = notifier;
			this.inputData = input;
			this.processContext = processContext;
		}
		
		/**
		 * <!-- begin-custom-doc -->
		 * 
		 * <!-- end-custom-doc -->
		 * @generated
		 */
		@Override
		public void run() {
			if(getActivityLogger().isDebugEnabled()) {
				activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
									,new Object[] { "Executor run()"
									,activityContext.getActivityName()
									,activityContext.getProcessName()
									,activityContext.getDeploymentUnitName()
									,activityContext.getDeploymentUnitVersion() });
				String serializedNode = XMLUtils.serializeNode(inputData, processContext.getXMLProcessingContext());
		    	activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_INPUT, new Object[] {activityContext.getActivityName(), serializedNode});
			}

			try {				
				// begin-custom-code
				// add your own business code here
				// end-custom-code
				N output = evalOutput(inputData, processContext.getXMLProcessingContext(), null);
				SerializableXMLDocument<N> wrapper = new SerializableXMLDocument<N>(processContext.getXMLProcessingContext(), output);
				notifier.setReady(wrapper);
			} catch (Exception e) {
				e.printStackTrace();
				notifier.setReady(e);
			}
		}
	}
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to build the output after finishing the business.
	 * @param inputData
	 *				This is the activity input data. 
	 * @param processingContext
	 *				XML processing context.
	 * @param data
	 *				Business object.
	 * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output.
	 */
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, Object data) throws Exception {
		
		ActivityOutputType activityOutput = new ActivityOutputType();
		activityOutput.setUserId("StringValue");
		N output = PaletteUtil.parseObjtoN(ActivityOutputType.class, activityOutput, processingContext, activityContext.getActivityOutputType().getTargetNamespace(), "ActivityOutput");
		// begin-custom-code
        // add your own business code here
        // end-custom-code
	    return output;
	}
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to get the root element of output.
	 * @param processingContext
	 *				XML processing context.
	 * @return An XML Element.
	 */		
	 protected N getOutputRootElement(ProcessingContext<N> processingContext) {
        final FragmentBuilder<N> builder = processingContext.newFragmentBuilder();

        Model<N> model = processingContext.getModel();
        builder.startDocument(null, "xml");
        try {
			builder.startElement(activityContext.getActivityOutputType().getTargetNamespace(), "ActivityOutput", "ns0");
        try {
			} finally {
				builder.endElement();
			}
		} finally {
			builder.endDocument();
		}
        N output = builder.getNode();
        N resultList = model.getFirstChild(output);
        // begin-custom-code
        // add your own business code here
        // end-custom-code
        return resultList;
    }
    
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the String type parameter from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param parameterName
     *			The parameter name which you want to get the value.
     * @return parameter value.	
     */
 	public String getInputParameterStringValueByName(final N inputData, final ProcessingContext<N> processingContext, final String parameterName) {
         Model<N> model = processingContext.getMutableContext().getModel();
         N parameter = model.getFirstChildElementByName(inputData, null, parameterName);
         if (parameter == null) {
             return "";
         }
         return model.getStringValue(parameter);
     }
     
 	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the String type attribute from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param attributeName
     *			The attribute name which you want to get the value.
     * @return attribute value.	
     */
 	public String getInputAttributeStringValueByName(final N inputData, final ProcessingContext<N> processingContext, final String attributeName) {
         Model<N> model = processingContext.getMutableContext().getModel();
         N attribute = model.getAttribute(inputData, "", attributeName);
         if (attribute == null) {
             return "";
         }
         return model.getStringValue(attribute);
     }
     
 	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the Boolean type parameter from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param parameterName
     *			The parameter name which you want to get the value.
     * @return parameter value.	
     */
 	public boolean getInputParameterBooleanValueByName(final N inputData, final ProcessingContext<N> processingContext, final String parameterName) {
 		Model<N> model = processingContext.getMutableContext().getModel();
 		N parameter = model.getFirstChildElementByName(inputData, null, parameterName);
 		if (parameter == null) {
 			return false;
 		}
 		String valueStr = model.getStringValue(parameter);
 		return Boolean.parseBoolean(valueStr);
 	}
}
