package com.tibco.bw.palette.zendesk.design.delete;

import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;
import org.eclipse.jface.viewers.ArrayContentProvider;
import com.tibco.bw.design.field.AttributeBindingField;
import org.eclipse.swt.widgets.Text;
import com.tibco.bw.design.field.PasswordField;
import com.tibco.bw.design.field.viewer.CustomComboViewer;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.palette.zendesk.model.zendesk.Delete;
import com.tibco.bw.palette.zendesk.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class DeleteGeneralSection extends AbstractBWTransactionalSection 
{
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private AttributeBindingField companyUrlABF;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Text companyUrl;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private AttributeBindingField userIdABF;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Text userId;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private AttributeBindingField passwordABF;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private PasswordField password;
   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private CustomComboViewer deleteType;


    @Override
    protected Class<?> getModelClass() {
       return Delete.class;
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
        getBindingManager().bind(companyUrlABF, getInput(), ZendeskPackage.Literals.DELETE__COMPANY_URL); 
        getBindingManager().bind(userIdABF, getInput(), ZendeskPackage.Literals.DELETE__USER_ID); 
        getBindingManager().bind(passwordABF, getInput(), ZendeskPackage.Literals.DELETE__PASSWORD); 
        getBindingManager().bindCustomViewer(deleteType, getInput(), ZendeskPackage.Literals.DELETE__DELETE_TYPE, BWFieldFactory.getInstance().getPropertyTargetToModelUpdateValueStrategy(), null); 
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
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.DELETE_COMPANYURL, true);
   	    companyUrl = BWFieldFactory.getInstance().createTextBox(parent);

   	    companyUrlABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, companyUrl, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.DELETE_USERID, true);
   	    userId = BWFieldFactory.getInstance().createTextBox(parent);

   	    userIdABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, userId, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.DELETE_PASSWORD, true);
   	    password = BWFieldFactory.getInstance().createPasswordField(parent);

   	    passwordABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, password, PropertyTypeQnameConstants.PASSWORD_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.DELETE_DELETETYPE, true);
   	    deleteType = BWFieldFactory.getInstance().createComboViewer(parent);
   	    deleteType.setContentProvider(new ArrayContentProvider());
   	    deleteType.setInput(new String[]{"ticket", "user", "group", "organization"});
   	    
   	    // begin-custom-code
        // end-custom-code
        return parent;
    }
  

}
