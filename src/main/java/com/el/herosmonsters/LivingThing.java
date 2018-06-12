package com.el.herosmonsters;

public abstract class LivingThing {
	
	protected String name;
	protected int health;
	
	public LivingThing(String name, int health){
		this.name = name;
		this.health = health;
	}
	
	public boolean isAlive() {
		return this.health > 0;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getName() {
		return name;
	}

}
