package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Association {

    private String AssociationName;
    private String email;
    private String password;
    private String Address;
    private Set<FarmOwner> FarmOwners;
   
    /**
     * Default constructor
     */
    public Association() {
    }



    public String getAssociationName() {
        // TODO implement here
        return AssociationName;
    }
    public void setAssociationName(String AssociationName) {
        this.AssociationName=AssociationName;
        
    }

    /**
     * @return
     */
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
        // TODO implement here
        this.password=password;
    }

    /**
     * @return
     */
    public String getAddress() {
        // TODO implement here
        return Address;
    }
    public void setAddress(String Address) {
       this.Address=Address;
    }


    public Set<FarmOwner> getFarmOwner() {
        // TODO implement here
        return FarmOwners;
    }

    public void setFarmOwner(Set<FarmOwner> FarmOwners) {
    	this.FarmOwners=FarmOwners;       
    }

}