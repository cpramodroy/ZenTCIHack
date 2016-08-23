package com.tibco.bw.palette.zendesk.design.getusers;

import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;
import com.tibco.bw.design.field.AttributeBindingField;
import org.eclipse.swt.widgets.Text;
import com.tibco.bw.design.field.PasswordField;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.palette.zendesk.model.zendesk.GetUsers;
import com.tibco.bw.palette.zendesk.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class GetUsersGeneralSection extends AbstractBWTransactionalSection {
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


    @Override
    protected Class<?> getModelClass() {
       return GetUsers.class;
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
        getBindingManager().bind(companyUrlABF, getInput(), ZendeskPackage.Literals.GET_USERS__COMPANY_URL); 
        getBindingManager().bind(userIdABF, getInput(), ZendeskPackage.Literals.GET_USERS__USER_ID); 
        getBindingManager().bind(passwordABF, getInput(), ZendeskPackage.Literals.GET_USERS__PASSWORD); 
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
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.GETUSERS_COMPANYURL, true);
   	    companyUrl = BWFieldFactory.getInstance().createTextBox(parent);

   	    companyUrlABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, companyUrl, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.GETUSERS_USERID, true);
   	    userId = BWFieldFactory.getInstance().createTextBox(parent);

   	    userIdABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, userId, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.GETUSERS_PASSWORD, true);
   	    password = BWFieldFactory.getInstance().createPasswordField(parent);

   	    passwordABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, password, PropertyTypeQnameConstants.PASSWORD_PRIMITIVE, true);

        // begin-custom-code
        // end-custom-code
        return parent;
    }
  

}
