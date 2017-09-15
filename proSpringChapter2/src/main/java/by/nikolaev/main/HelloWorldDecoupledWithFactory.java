package by.nikolaev.main;

import by.nikolaev.factory.MessageSupportFactory;
import by.nikolaev.interfaces.MessageProvider;
import by.nikolaev.interfaces.MessageRenderer;

public class HelloWorldDecoupledWithFactory {

	public static void main(String[] args) {
		MessageRenderer renderer = MessageSupportFactory.getInstance().getRenderer();
		MessageProvider provider =  MessageSupportFactory.getInstance().getProvider();
		renderer.setMessageProvider(provider);
		renderer.render();
	}

}
