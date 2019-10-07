package day9;

public class OldMcDonald {

	public static void main(String [] args) {
		
		String  poem = "\n \nOld MacDonald had a farm "
				+ "\nE-I-E-I-O"
				+"\nAnd on his farm he had some ANIMAL"
				+ "\nE-I-E-I-O"
				+"\nwith a SOUND, SOUND here,"
				+ "\nAnd a SOUND,SOUND there,"
				+ "\nHere a SOUND, there a SOUND,"
				+"\nEverywhere a SOUND, SOUND";
		
		String[] animalNames = {"Chicks", "Duck", "Turkey", "Cat", 
				"Mule", "Dog", "Pig", "Turtle", "Cow"};
		
		String[] animalSounds = {"chick", "quack", "gobble", "meow-meow", 
				"heehaw", "bow-wow", "oink-oink", "nerp-nerp", "moo-moo"};
		int n = animalNames.length;
		
		for(int i = 0; i < n ; i++) {
			
			poem  = poem.replaceAll("ANIMAL", animalNames[i]);
			poem  = poem.replaceAll("SOUND", animalSounds[i]);
			
			System.out.println(poem);
			
			poem  = poem.replaceAll( animalNames[i],"ANIMAL");
			poem  = poem.replaceAll(animalSounds[i],"ANIMAL");
		}
	}
	
}
