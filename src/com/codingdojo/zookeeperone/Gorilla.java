package com.codingdojo.zookeeperone;

public class Gorilla extends Mammal{
	
	public void throwSomething() {
		
		energyLevel = energyLevel - 5;
		System.out.println("The gorilla has thrown something");
		super.displayEnergy();
		
	}
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The gorilla has eaten a banana");
		super.displayEnergy();
	}
	public void climbTree() {
		energyLevel -= 10;
		System.out.println("The gorilla climbed away");
		super.displayEnergy();
	}
	
}
