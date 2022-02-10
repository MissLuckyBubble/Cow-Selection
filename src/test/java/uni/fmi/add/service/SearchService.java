package uni.fmi.search.service;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.models.Animal;

public class SearchService {
	
	private static final List<Animal> animalDB = new ArrayList<>();
	 
	public static String Search(String ID) {
		
		String message;
		initDb();
		
		message= "Животно с това ID несъществува!";
		
		for(Animal a : animalDB) {
			if(a.getID().equals(ID)) {
				message = "Името на това животно е: " + a.getAnimalName();
			}
		}
		
		return message;
		
	}
	public static String SearchByName(String name) {
		String message= "Няма крави с това име!";
		String msg = "";
		initDb();
		int counter = 0;

		for(Animal a:animalDB) {
			if(a.getAnimalName().equals(name)) {
				msg = msg + a.getID() + "; ";
				counter++;
			}
		}
		if (counter > 0) {
			message = "Има " + counter + " крави с това име - тяхните ID са: " + msg;
		}
		
		return message;
	}
	private static void initDb(){
		animalDB.clear();
		Animal newAnimal = new Animal("2","Mimi");
		Animal newAnimal2 = new Animal("3","Mimi");
		animalDB.add(newAnimal);
		animalDB.add(newAnimal2);
		
	}


}
