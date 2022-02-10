package uni.fmi.add.model;


import uni.fmi.add.service.AddService;

public class AddScreenModel {

	
	private String animalName;
	private String animalMomName;
	private String momAge;
	private String LastBirthMonthsAgo;
	private String animalDadName;
	private String dadAge;
	private String message;
	
	public void setAnimalName(final String animalName) {
		
		this.animalName=animalName;
	}

	public void setAnimalMomName(final String animalMomName) {
		this.animalMomName=animalMomName;
		
	}

	public void setMomAge(final String momAge) {
		this.momAge=momAge;
	}

	public void setLastBirthAgo(final String LastBirthMonthsAgo) {
		this.LastBirthMonthsAgo=LastBirthMonthsAgo;
		
	}

	public void setAnimalDadName(final String animalDadName) {
		this.animalDadName=animalDadName;
	}

	public void setDadAge(final String dadAge) {
		this.dadAge=dadAge;
		
	}


	
	public void clickAddButton() {
		message = AddService.add(animalName, animalMomName, momAge, LastBirthMonthsAgo, animalDadName, dadAge);
	}

	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
		
	}



}
