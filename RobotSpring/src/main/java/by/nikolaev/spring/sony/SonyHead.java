package by.nikolaev.spring.sony;

import by.nikolaev.spring.interfaces.Head;

public class SonyHead implements Head{

	@Override
	public void calc() {
		System.out.println("Sony calc something");
	}
	

}
