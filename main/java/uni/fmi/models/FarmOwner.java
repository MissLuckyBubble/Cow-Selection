package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class FarmOwner {

    private String FarmOwnerName;
    private String email;
    private String password;
    private Set<Association> associations;
    private Set<Farm> farms;
    /**
     * Default constructor
     */
    public FarmOwner() {
    }

    public String getFarmOwnerName() {
        // TODO implement here
        return FarmOwnerName;
    }

    public void setFarmOwnerName(String FarmOwnerName) {
    	this.FarmOwnerName=FarmOwnerName;
    }

    public String getEmail() {
        // TODO implement here
        return email;
    }
    public void setEmail(String email) {
       this.email=email;
    }
    public String getPassword() {
        // TODO implement here
        return password;
    }
    public void setPassword(String password) {
       this.password=password;
        
    }
    public Set<Association> getAssociation() {
        // TODO implement here
        return associations;
    }
    public void setAssociation(Set<Association> Associations) {
       this.associations=Associations;
        
    }
    public Set<Farm> getFarm() {
        // TODO implement here
        return farms;
    }
    public void setFarm(Set<Farm> Farms) {
       this.farms=Farms;
        
    }

}