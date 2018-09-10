package com.codingdojo.zookeeperone;

public abstract class Mammal {
	protected int energyLevel = 100;
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	public void setEnergyLevel() {
		energyLevel = 100;
	}
	public int getEnergyLevel() {
		displayEnergy();
		return energyLevel;
	}
}
