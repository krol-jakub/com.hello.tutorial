package HelloMaven.com.hello.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      HelloWorld obj3 = (HelloWorld) context.getBean("helloWorld2");
	      HelloWorld obj2 = (HelloWorld) context.getBean("probnaMetoda");

	      obj.getMessage();
	      obj2.getMessage2();
	      obj3.getMessage();
	   }
}
