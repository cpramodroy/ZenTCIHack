package com.tibco.bw.palette.zendesk.design.updateticket;

import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;
import org.eclipse.swt.widgets.Button;
import com.tibco.bw.design.field.FilePickerField;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket;
import com.tibco.bw.palette.zendesk.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class UpdateTicketAdvancedSection extends AbstractBWTransactionalSection 
{
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Button additionalAttachment;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private FilePickerField attachmentName;


    @Override
    protected Class<?> getModelClass() {
       return UpdateTicket.class;
    }

    /**
	 * <!-- begin-custom-doc -->
     * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Initialize bindings of controls to the input. 
	 */
    @Override
    protected void initBindings() {
        getBindingManager().bind(additionalAttachment, getInput(), ZendeskPackage.Literals.UPDATE_TICKET__ADDITIONAL_ATTACHMENT); 
        getBindingManager().bind(attachmentName, getInput(), ZendeskPackage.Literals.UPDATE_TICKET__ATTACHMENT_NAME); 
   	    // begin-custom-code
        // end-custom-code
    }

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to create the section-specific UI.
	 * @param root
	 * @return
	 */
    @Override
    protected Composite doCreateControl(final Composite root) {
        Composite parent = BWFieldFactory.getInstance().createComposite(root, 2);
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.UPDATETICKET_ADDITIONALATTACHMENT, false);
   	    additionalAttachment = BWFieldFactory.getInstance().createCheckBox(parent);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.UPDATETICKET_ATTACHMENTNAME, false);
   	    attachmentName = BWFieldFactory.getInstance().createFilePickerField(parent, null, "File Name");

        // begin-custom-code
        // end-custom-code
        return parent;
    }
  

}
