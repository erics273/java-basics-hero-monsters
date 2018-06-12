package com.el.herosmonsters;

public abstract class LivingThing {
	
	public String name;
	public int health;

	public LivingThing(String name, int health){
		this.name = name;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

}
