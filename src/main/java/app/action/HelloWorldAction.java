package app.action;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import app.form.HelloWorldForm;

/**
 * The Model part of the application!!!!
 *
 * Action class extends org.apache.struts.action.Action
 *
 * Action class acts as wrapper around the business logic and provides and interface to the
 * application's Model layer
 *
 * An Action works as an adapter between the contents of an incoming HTTP request and the
 * business logic that corresponds to it.
 * Then the Struts controller (ActionServlet) select an appropriate Action and creates an instance if needed
 * 		finally call execute()
 */
public class HelloWorldAction extends Action {

	//execute() is overwrite
	public ActionForward execute(ActionMapping mapping,
		                         ActionForm form,
			                     HttpServletRequest request,
			                     HttpServletResponse response) throws Exception {


			request.getSession().setAttribute(Globals.LOCALE_KEY, Locale.ENGLISH);


		HelloWorldForm helloWorldForm = (HelloWorldForm) form;
		helloWorldForm.setMessage("Hello World! Struts @" + new java.util.Date());

		return mapping.findForward("view");
	}

}
