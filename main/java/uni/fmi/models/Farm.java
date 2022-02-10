package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Farm {

    private String FarmName;
    private String Address;
    private int Size;
    private Set<FarmOwner> farmOwners;
    private Set<Animal> animals;
    /**
     * Default constructor
     */
    public Farm() {
    }


    public String getFarmName() {
        // TODO implement here
        return FarmName;
    }
    public void setFarmName(String FarmName) {
       this.FarmName=FarmName;
        
    }


    public String getAddress() {
        // TODO implement here
        return Address;
    }
    public void setAddress(String Address) {
        this.Address=Address;
    }


    public int getSize() {
        return Size;
    }
    public void setSize(int size) {
      this.Size=size;
    }

    /**
     * @return
     */
    public Set<FarmOwner> getFarmOwner() {
    	return farmOwners;
    }
    public void setFarmOwner(Set<FarmOwner> FarmOwners) {
        this.farmOwners=FarmOwners;
    }

    /**
     * @return
     */
    public Set<Animal> getAnimal() {
        return animals;
    }
    public void setAnimal(Set<Animal> Animals) {
       this.animals=Animals;
    }

}