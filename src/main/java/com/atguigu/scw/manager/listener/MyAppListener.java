package com.atguigu.scw.manager.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyAppListener implements ServletContextListener {

	

	

	public void contextInitialized(ServletContextEvent sce) {
		
	ServletContext servletContext = sce.getServletContext();
	servletContext.setAttribute("ctp", servletContext.getContextPath());
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}

}
