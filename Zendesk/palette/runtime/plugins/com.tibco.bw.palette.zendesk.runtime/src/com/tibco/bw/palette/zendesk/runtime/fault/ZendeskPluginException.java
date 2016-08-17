package com.tibco.bw.palette.zendesk.runtime.fault;

import javax.xml.namespace.QName;
import org.genxdm.ProcessingContext;
import com.tibco.bw.runtime.ActivityContext;
import com.tibco.neo.localized.BundleMessage;
public class ZendeskPluginException extends ZendeskActivityBaseException 
{
	private static final long serialVersionUID = 1L;
	
	public <N> ZendeskPluginException(ActivityContext<N> activityContext, Integer code,
			BundleMessage bundleMessage) {
		super(activityContext, code, bundleMessage);
	}
	
	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 */
	public QName getFaultElementQName() {
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		return new QName("http://schemas.tibco.com/bw/plugins/Zendesk/ZendeskExceptions","ZendeskPluginException");
	}
	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to set fault data according to design time
	 * @param processingContext
	 *			XML processing context.  
	 */
	public <N> void buildFault(ProcessingContext<N> pcx) {
		N ZendeskPluginException = this.createFaultMessageElement(pcx);
		
		this.setData(ZendeskPluginException);
		// begin-custom-code
        // add your own business code here
        // end-custom-code
	}
	

}
