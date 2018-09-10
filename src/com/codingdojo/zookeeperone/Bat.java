package com.codingdojo.zookeeperone;

public class Bat extends Mammal{
	public Bat() {
		this.energyLevel=300;
	}
	public void fly() {
		energyLevel -= 50;
		System.out.println("Woosh");
		super.displayEnergy();
	}
	public void eatHuman() {
		energyLevel+=25;
		System.out.println("This is the area that would have sounds of screaming...");
		super.displayEnergy();
	}
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Fire, why fire?");
		super.displayEnergy();
	}
}
