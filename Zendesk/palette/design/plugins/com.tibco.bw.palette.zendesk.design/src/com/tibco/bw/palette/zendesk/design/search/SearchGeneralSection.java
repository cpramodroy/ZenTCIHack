package com.tibco.bw.palette.zendesk.design.search;

import com.tibco.bw.design.util.PropertyTypeQnameConstants;
import org.eclipse.swt.SWT;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;

import org.eclipse.jface.viewers.ArrayContentProvider;

import com.tibco.bw.design.field.AttributeBindingField;

import org.eclipse.swt.widgets.Text;

import org.eclipse.swt.widgets.Spinner;
import com.tibco.bw.design.field.PasswordField;
import com.tibco.bw.design.field.viewer.CustomComboViewer;

import org.eclipse.swt.widgets.Composite;

import com.tibco.bw.design.field.BWFieldFactory;
import com.tibco.bw.design.propertysection.AbstractBWTransactionalSection;
import com.tibco.bw.palette.zendesk.model.zendesk.Search;
import com.tibco.bw.palette.zendesk.model.utils.Messages;
/**
 * General tab properties for the activity.
 */
public class SearchGeneralSection extends AbstractBWTransactionalSection 
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
    private CustomComboViewer searchType;


    /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private AttributeBindingField maxRowsABF;
/**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*/
    private Spinner maxRows;


	@Override
    protected Class<?> getModelClass() {
       return Search.class;
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
        getBindingManager().bind(companyUrlABF, getInput(), ZendeskPackage.Literals.SEARCH__COMPANY_URL); 
        getBindingManager().bind(userIdABF, getInput(), ZendeskPackage.Literals.SEARCH__USER_ID); 
        getBindingManager().bind(passwordABF, getInput(), ZendeskPackage.Literals.SEARCH__PASSWORD); 
        getBindingManager().bindCustomViewer(searchType, getInput(), ZendeskPackage.Literals.SEARCH__SEARCH_TYPE, BWFieldFactory.getInstance().getPropertyTargetToModelUpdateValueStrategy(), null); 
        getBindingManager().bind(maxRowsABF, getInput(), ZendeskPackage.Literals.SEARCH__MAX_ROWS); 
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
   	    BWFieldFactory.getInstance().createLabel(parent, Messages.SEARCH_COMPANYURL, true);
   	    companyUrl = BWFieldFactory.getInstance().createTextBox(parent);

   	    companyUrlABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, companyUrl, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.SEARCH_USERID, true);
   	    userId = BWFieldFactory.getInstance().createTextBox(parent);

   	    userIdABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, userId, PropertyTypeQnameConstants.STRING_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.SEARCH_PASSWORD, true);
   	    password = BWFieldFactory.getInstance().createPasswordField(parent);

   	    passwordABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, password, PropertyTypeQnameConstants.PASSWORD_PRIMITIVE, true);

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.SEARCH_SEARCHTYPE, true);
   	    searchType = BWFieldFactory.getInstance().createComboViewer(parent);
   	    searchType.setContentProvider(new ArrayContentProvider());
   	    searchType.setInput(new String[]{"ticket", "user", "group", "organization"});

   	    BWFieldFactory.getInstance().createLabel(parent, Messages.SEARCH_MAXROWS, false);
   	    maxRows = BWFieldFactory.getInstance().createSpinner(parent, 2, SWT.BORDER);

   	    maxRowsABF = BWFieldFactory.getInstance().createAttributeBindingField(parent, maxRows, PropertyTypeQnameConstants.INTEGER_PRIMITIVE, true);
     
        // begin-custom-code
        // end-custom-code
        return parent;
    }
  

}
