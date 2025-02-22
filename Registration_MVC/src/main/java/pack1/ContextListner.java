package pack1;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
//@WebListener
public class ContextListner  implements ServletContextListener,ServletContextAttributeListener
{
    @Override
	public void contextInitialized(ServletContextEvent sce)
	{
		System.out.println("context Object Initialized");
	  ServletContext	context=sce.getServletContext();
	  System.out.println("Application is deployed into :"+context.getServerInfo());
	}
    
    @Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		System.out.println("context Object Destroyed");
	}
    
   
   @Override
    public void attributeAdded(ServletContextAttributeEvent scae) 
   {
	// TODO Auto-generated method stub
	
   }
   @Override
   public void attributeRemoved(ServletContextAttributeEvent scae) 
   {
	// TODO Auto-generated method stub
	   System.out.println("context Object Removed");
   }
   
   @Override
public void attributeReplaced(ServletContextAttributeEvent scae)
   {
	// TODO Auto-generated method stub
	   System.out.println("context Object Replaced");
    }
}
