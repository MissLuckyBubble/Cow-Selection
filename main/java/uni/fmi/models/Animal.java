package uni.fmi.models;
import java.util.*;

public class Animal {


   
    private String AnimalName;
    private String ID;
    private Date BirthDay;
    private Date lastBirth;
    private Farm farm;
    /**
     * 
     */
    private Set<Animal> children;
    private Set<Animal> parent;
    
    /**
     * Default constructor
     * @param string3 
     * @param string2 
     * @param string 
     */
    public Animal() {}
    public Animal(String string, String string2, String string3) {
    }


    public Animal(final String animalName, final String animalMomName, final String momAge,final String lastBirth,final String animalDadName,final String dadAge) {
		this.AnimalName=animalName;
		
	}

	public Animal(String ID, String animalName) {
		this.ID=ID;
		this.AnimalName=animalName;
	}
	
	public String getAnimalName() {
        return AnimalName;
    }
    public void setAnimalName(String AnimalName) {
        // TODO implement here
    	this.AnimalName= AnimalName;
    }
    public String getID() {
        // TODO implement here
        return ID;
    }
    public void setID(String ID) {
        // TODO implement here
    	this.ID=ID;
    }


    public Date getBirthDay() {
        // TODO implement here
    	return BirthDay;
    }
    public void setBirthDay(Date birthDay) {
        // TODO implement here
    	this.BirthDay=birthDay;
    }


    public Date getLastBirth() {
        // TODO implement here
        return lastBirth;
    }
    void setLastBirth(Date lastBirth) {
        this.lastBirth=lastBirth;
        }


    public Farm getFarm() {
        // TODO implement here
        return farm;
    }
    public void setFarm(Farm farm) {
        // TODO implement here
    }

    /**
     * @return
     */
    public Set<Animal> getParents() {
        // TODO implement here
        return parent;
    }
    public void setParents(Set<Animal> animals) {
        this.parent=animals;
        }


    public Set<Animal> getChildren() {
        // TODO implement here
        return children;
    }

 
    public void setChildren(Set<Animal> animals) {
        this.children=animals;    
        }

}