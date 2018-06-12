## It's time to create a hero to dispatch these pesky monsters.
 
 - Add a SETTER method to your LivingThing class named "setHealth" that lets you update the value
 of the "health" property.

- Now, create a new Class called "Hero" that EXTENDS the LivingThing class.
	- This class should take an extra string parameter in the constructor called "secretIdentity"
	- Set a private property of "secretIdentity" with the passed in secretIdentity
	- Add a GETTER to retrieve the heroes secret identity
 
- Add a method to the Hero class named "attack" that takes a Monster object as a parameter. The method should do three things:
	- Reduce the LivingThing object's health by a random value between 0 and 10.
	- Reduce the hero's health by a random value between 0 and 10.
	- This should not return anything

- Give the Hero class another method named "fight" that takes as a parameter an List of Monster objects
 and does the following:
 	- For each Monster object in the array, call the "attack" method so the hero can attack the monster.
	- The hero and the monster should fight while one of them is alive
	- Repeat the process until all the monsters or the hero is dead.
	- This method should not return anything

- In the main method of your App.js you will need to instantiate your hero object into a variable named "hero". Give your hero 100 health, a name, and a secret identity of your choice.

- Call the fight method on your hero passing in your list of monsters.
- If the hero is still alive display "The hero, INSERT HERO NAME HERE, prevailed!"
- if the monsters bested the hero display "INSERT HERO NAME HERE was bested by the monsters. We are doomed"