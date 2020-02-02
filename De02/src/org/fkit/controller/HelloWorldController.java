package org.fkit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {
	private static final Log logge2=LogFactory.getLog(HelloWorldController.class);
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		logge2.info("此方法被调用");
		ModelAndView mv=new ModelAndView();
		mv.addObject("message","Hello World!");
		mv.setViewName("WEB-INF/Jsp/welcome.jsp");

return mv;


	}

}
