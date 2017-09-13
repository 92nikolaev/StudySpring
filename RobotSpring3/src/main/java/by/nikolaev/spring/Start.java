package by.nikolaev.spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ModelT1000 t1000Empty = (ModelT1000) context.getBean("t1000Empty");
		t1000Empty.fire();

	}

}
