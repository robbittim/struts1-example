package app.form;

import org.apache.struts.action.ActionForm;

/**
 * An ActionForm is a JavaBean that extends org.apache.struts.action.ActionForm.
 *
 * ActionForm maintains the session state for web application and the ActionForm object is automatically
 * populated on the server side with data entered from a form on the client side
 *
 *
 */
public class HelloWorldForm extends ActionForm {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
