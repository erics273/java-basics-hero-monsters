
 ## It's time to create a hero to dispatch these pesky monsters.
 
 - Add a SETTER method to your LivingThing class named "setHealth" that lets you update the value
 of the "health" property.

 - Now, create a new Class called "Hero" that EXTENDS the LivingThing class.
  - This class should take an extra string parameter in the constructor called "secretIdentity"
 
 - Add a method to the Hero class named "attack" that takes as a parameter a Monster object.
 The method should do three things:
  - Reduce the LivingThing object's health by a random value between 0 and 10.
  - Reduce the hero's health by a random value between 0 and 10.
  - Print out how much damage the monster and hero did to each other.

 - Give the Hero class another method named "fight" that takes as a parameter an List of Monster objects
 and does the following:
  - For each Monster object in the array, call the "attack" method so the hero can attack the monster.
  - The hero and the monster should fight while one of them is alive
  - Repeat the process until all the monsters or the hero is dead.

- Finally, you will need to instantiate your hero object with the into a variable named "hero". Give your hero 100 health, a name, and a secret identity of your choice.