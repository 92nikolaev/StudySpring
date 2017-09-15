package by.nikolaev.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import by.nikolaev.interfaces.MessageRenderer;

public class HelloWorldSpringDI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		MessageRenderer renderer = context.getBean("renderer", MessageRenderer.class);
		renderer.render();
	}

}
