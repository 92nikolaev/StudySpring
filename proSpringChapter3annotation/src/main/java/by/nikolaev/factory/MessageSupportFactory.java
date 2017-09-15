package by.nikolaev.factory;

import java.io.FileInputStream;
import java.util.Properties;

import by.nikolaev.interfaces.MessageProvider;
import by.nikolaev.interfaces.MessageRenderer;

public class MessageSupportFactory {
	private static MessageSupportFactory instance;
	private Properties props;
	private MessageRenderer renderer;
	private MessageProvider provider;
	private MessageSupportFactory(){
		props = new Properties();
		
		try{
			props.load(new FileInputStream("src\\main\\resources\\msf.properties"));
			String renderClass = props.getProperty("rendered.class");
			String providerClass = props.getProperty("provider.class");
			renderer = (MessageRenderer)Class.forName(renderClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	static{
		instance = new MessageSupportFactory();
	}
	public static MessageSupportFactory getInstance() {
		return instance;
	}
	public MessageRenderer getRenderer() {
		return renderer;
	}
	public MessageProvider getProvider() {
		return provider;
	}
	
}
