package uni.fmi.add.service;

import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import uni.fmi.models.Animal;

public class AddService {

    private static final List<Animal> animalDB = new ArrayList<>();
	
	public static String add(String animalName, String animalMomName, String momAge, String lastBirth, String animalDadName, String dadAge)
	{
		
		initDb();

		if(null == animalName || animalName.trim().equals("")) {
			return "Моля попълнете всички данни!";
		}
		
		//For the mom
		if(null == animalMomName || animalMomName.trim().equals("") ) {
			return "Моля попълнете всички данни!";
		}
		
		if(momAge.trim().equals("") || momAge== null) {
			return "Моля попълнете всички данни!";
		}
		
		if(Float.parseFloat(momAge) <2 ) {
			return "Женско животно под 2 години не може да е родител!";
		}
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate birthDate = LocalDate.parse(lastBirth, formatter);
		LocalDate now = LocalDate.now();
		int m1 = now.getYear() * 12 + now.getMonthValue();
		int m2= birthDate.getYear()* 12 + birthDate.getMonthValue();
		if((m1-m2+1)<10) {
			return "Женско животно не може да ражда през период по – малък от 10 месеца!";
		}
		
		//for the dad

		if(null == animalDadName || animalDadName.trim().equals("")) {
			return "Моля попълнете всички данни!";
		}
		
		if(dadAge.trim().equals("") || dadAge== null) {
			return "Моля попълнете всички данни!";
		}
		
		if(Float.parseFloat(dadAge) < 2) {
			return "Мъжко животно под 2 години не може да е родител!";
		}
		
		//others
		final Animal newAnimal = new Animal(animalName, animalMomName, momAge, lastBirth, animalDadName, dadAge);
		
		boolean animalExists = animalDB.stream().anyMatch(u -> animalName.equals(u.getAnimalName()));
		
		if(animalExists) {
			return "Това име е заето!";
		}
		
		animalDB.add(newAnimal);
		return "Успешно добавяне на ново животно!";
	}
	
	private static void initDb(){
		animalDB.clear();
		Animal newAnimal = new Animal("Mika","Mariq1","2.1","01/02/2022","Mitko1","2.1");
		animalDB.add(newAnimal);
	}

}
