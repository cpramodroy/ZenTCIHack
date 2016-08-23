package com.tibco.bw.palette.zendesk.runtime.util;

import com.tibco.bw.runtime.ActivityLogger;
import com.tibco.neo.localized.BundleMessage;

public class ZendeskPluginLogger 

{
	private ActivityLogger logger;
	
	public ZendeskPluginLogger(ActivityLogger logger) {
		this.logger = logger;
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * Trace level
	 * 
	 * @param msg The log message.
	 * @param params The parameters of the log message
	 */
	public void trace(BundleMessage msg, Object ... params) {
		if (this.logger.isTraceEnabled()) {
			// begin-custom-code
			// add your own business code here
			// end-custom-code
			logger.trace(msg, params);
		}
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * Debug level
	 * 
	 * @param msg The log message.
	 * @param params The parameters of the log message
	 */
	public void debug(BundleMessage msg, Object ... params) {
		if (this.logger.isDebugEnabled()) {
			// begin-custom-code
			// add your own business code here
			// end-custom-code
			logger.debug(msg, params);
		}
		
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * Info level
	 * 
	 * @param msg The log message.
	 * @param params The parameters of the log message
	 */
	public void info(BundleMessage msg, Object ... params) {
		if (this.logger.isInfoEnabled()) {
			// begin-custom-code
			// add your own business code here
			// end-custom-code
			logger.info(msg, params);
		}
		
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * Warn level
	 * 
	 * @param msg The log message.
	 * @param params The parameters of the log message
	 */
	public void warn(BundleMessage msg, Object ... params) {
		if (this.logger.isWarnEnabled()) {
			// begin-custom-code
			// add your own business code here
			// end-custom-code
			logger.warn(msg, params);
		}
		
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * Error level
	 * 
	 * @param msg The log message.
	 * @param params The parameters of the log message
	 */
	public void error(BundleMessage msg, Object ... params) {
		if (this.logger.isErrorEnabled()) {
			// begin-custom-code
			// add your own business code here
			// end-custom-code
			logger.error(msg, params);
		}
	}
	
}
