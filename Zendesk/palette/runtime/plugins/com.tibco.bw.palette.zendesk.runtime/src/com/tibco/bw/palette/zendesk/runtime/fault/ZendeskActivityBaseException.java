package com.tibco.bw.palette.zendesk.runtime.fault;


import javax.xml.namespace.QName;
import org.genxdm.ProcessingContext;
import com.tibco.bw.runtime.ActivityContext;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.neo.localized.BundleMessage;

public abstract class ZendeskActivityBaseException extends ActivityFault {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5440789397181042804L;
    
	public <N> ZendeskActivityBaseException(ActivityContext<N> activityContext, Integer code, BundleMessage bundleMessage) {
		super(activityContext, code.toString(), ActivityFault.createLocalizedMessage(bundleMessage).toString());
    }
   
	public <N> ZendeskActivityBaseException(ActivityContext<N> activityContext, Integer code, BundleMessage bundleMessage, Object[] obj) {
		super(activityContext, code.toString(), ActivityFault.createLocalizedMessage(bundleMessage, obj).toString());
    }
	
	public <N> ZendeskActivityBaseException(ActivityContext<N> activityContext, Integer code, String message, String asStauts) {
		super(activityContext, code.toString(), message);
    }
	
	public abstract QName getFaultElementQName();

	public abstract <N> void buildFault(ProcessingContext<N> pcx);
}
