package by.nikolaev.beanfactory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class XmlConfigWithBeanFactory {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(factory);
		definitionReader.loadBeanDefinitions("xml-bean-factory-config.xml");
		Oracle oracle = (Oracle) factory.getBean("wiseworm");
		System.out.println(oracle.defineMeaningOfLife());

	}

}
