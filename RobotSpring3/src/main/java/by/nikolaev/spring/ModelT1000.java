package by.nikolaev.spring;

import by.nikolaev.spring.interfaces.Hand;
import by.nikolaev.spring.interfaces.Head;
import by.nikolaev.spring.interfaces.Leg;

public class ModelT1000 extends Robot {
	private Hand hand;
	private Leg leg;
	private Head head;
	
	private String color;
	private int year;
	private boolean soundEnabled;
	
	public ModelT1000() {
	}
	
	public ModelT1000(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnabled) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public ModelT1000(String color, int year, boolean soundEnabled) {
		super();
		this.color = color;
		this.year = year;
		this.soundEnabled = soundEnabled;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Leg getLeg() {
		return leg;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isSoundEnabled() {
		return soundEnabled;
	}

	public void setSoundEnabled(boolean soundEnabled) {
		this.soundEnabled = soundEnabled;
	}

	@Override
	public void dance(){
		System.out.println("Robot dence !");
	}

	@Override
	void fire() {
		head.calc();
		leg.go();
		hand.cathSomething();
		System.out.println("Color " + color);
		System.out.println("Year  " + year);
		System.out.println("SoundEnabled " + soundEnabled);
		
	}
}
