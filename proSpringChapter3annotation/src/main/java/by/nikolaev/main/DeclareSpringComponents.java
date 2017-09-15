package by.nikolaev.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import by.nikolaev.interfaces.MessageProvider;
import by.nikolaev.interfaces.MessageRenderer;

public class DeclareSpringComponents {

	public static void main(String[] args) {
		GenericXmlApplicationContext context = new GenericXmlApplicationContext();
		context.load("classpath:app-context.xml");
		context.refresh();
		MessageProvider messageProvider = context.getBean("messageProvider", MessageProvider.class);
		System.out.println(messageProvider.getMessage());

	}

}
