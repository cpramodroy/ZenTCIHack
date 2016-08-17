package com.tibco.bw.palette.zendesk.design.createuser;

import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;
import com.tibco.bw.design.field.AttributeBindingField;
import org.eclipse.swt.widgets.Text;
import com.tibco.bw.design.field.FilePickerField;
import com.tibco.bw.design.field.PasswordField;

import org.eclipse.swt.widgets.Composite;
import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.palette.zendesk.model.zendesk.CreateUser;
import com.tibco.bw.palette.zendesk.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class CreateUserGeneralSection extends AbstractBWTransactionalSection 
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
    private FilePickerField profilePhoto;
    
    private AttributeBindingField profilePhotoABF;


	@Override
    protected Class<?> getModelClass() {
       return CreateUser.class;
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
        getBindingManager().bind(companyUrlABF, getInput(), ZendeskPackage.Literals.CREATE_USER__COMPANY_URL); 
        getBindingManager().bind(userIdABF, getInput(), ZendeskPackage.Literals.CREATE_USER__USER_ID); 
        getBindingManager().bind(passwordABF, getInput(), ZendeskPackage.Literals.CREATE_USER__PASSWORD); 
        getBindingManager().bind(profilePhoto, getInput(), ZendeskPackage.Literals.CREATE_USER__PROFILE_PHOTO); 
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
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.CREATEUSER_COMPANYURL, true);
   	    companyUrl = BWFieldFactory.getInstance().createTextBox(parent);

   	    companyUrlABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, companyUrl, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.CREATEUSER_USERID, true);
   	    userId = BWFieldFactory.getInstance().createTextBox(parent);

   	    userIdABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, userId, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.CREATEUSER_PASSWORD, true);
   	    password = BWFieldFactory.getInstance().createPasswordField(parent);

   	    passwordABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, password, PropertyTypeQnameConstants.PASSWORD_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.CREATEUSER_PROFILEPHOTO, false);
   	    profilePhoto = BWFieldFactory.getInstance().createFilePickerField(parent, null, "File Name");

        // begin-custom-code
   	    profilePhotoABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, profilePhoto, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);
   	    profilePhotoABF.setDefaultPropertyPrefix("File Name");
        // end-custom-code
        return parent;
    }
  

}
