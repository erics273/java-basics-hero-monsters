package com.el.herosmonsters;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Monster monster1 = new Monster("bob", 5, "rat");
		Monster monster2 = new Monster("eric", 30, "goblin");
		Monster monster3 = new Monster("sally", 80, "ogre");

		List<Monster> monsters = new ArrayList<Monster>();
		monsters.add(monster1);
		monsters.add(monster2);
		monsters.add(monster3);

		for(Monster monster : monsters) {
			System.out.println(monster.getName() + " : " + monster.getHealth() + " : " + monster.getClassification());
		}

	}
}
