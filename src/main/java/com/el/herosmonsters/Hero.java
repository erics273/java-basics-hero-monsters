package com.el.herosmonsters;

import java.util.List;
import java.util.Random;

public class Hero extends LivingThing{

	private String secretIdentity;

	public Hero(String name, int health, String secretIdentity) {
		super(name, health);
		this.secretIdentity = secretIdentity;
	}
	
	public void attack(Monster monster){
		
		Random r = new Random();
		
		int monsterDamage = r.nextInt(10) + 1;
		monster.setHealth(monster.getHealth() - monsterDamage);
		
		int heroDamage = r.nextInt(10) + 1;
		this.setHealth(this.getHealth() - heroDamage);
		
	}
	
	public void fight(List<Monster> monsters) {
		
		for(Monster monster : monsters) {
			
			while(monster.isAlive() && this.isAlive()) {
				this.attack(monster);
			}
			
			if(!this.isAlive()) {
				break;
			}
		}
		
	}

	public String getSecretIdentity() {
		return secretIdentity;
	}

}
