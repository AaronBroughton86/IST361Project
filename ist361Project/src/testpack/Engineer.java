package testpack;

/**
 * Purpose: The purpose of the Engineer class is to annoy spies.
 *          To keep track of the engineers and their hours, and to keep
 *          track of which aircraft they are working on.
 * @author Aaron Broughton, Austin Brown, Nathan Oberdick, Sahil Heighes
 */
public class Engineer {
    
    private int engineerID;
    private String lastName;
    private String firstName;
    private final Aircraft aircraftID[] = new Aircraft[4]; 
    private int hours = 0;
    
    public Engineer(){
    
        
        
    }// end Engineer method
    
    /**
     SETTERS
     */
    
    /**
     * Set last name
     * @param: lastNameSet: String
     *
     */
    public void setLastName(String lastNameSet){
        lastName = lastNameSet;
        
    }// end SetLastName mehtod
    
    /**
     * Set first name
     * @param: firstNameSet: String
     *
     */
    public void setFirstName(String firstNameSet){
        firstName = firstNameSet;
    
    }// end SetFirstName mehtod
    
    /**
     * Set hours
     * @param: hoursSet: int
     *
     */
    public void setHours(int hoursSet){
        
        hours = hoursSet;
    }// end setHours method
    
    /**
     GETTERS
     */
    
    /**
     * Get last name
     * @return: lastName: String
     *
     */
    public String getLastName(){
        return lastName;
    
    }// end getLastName mehtod
    
    /**
     * Get first name
     * @return: firstName: String
     *
     */
    public String getFirstName(){
        return firstName;
        
    }// end getFirstName method
    
    /**
     * Get hours
     * @return: hours: int
     *
     */
    public int getHours(){
        return hours;
    
    }// end getHours method
    
    /**
     * Get addHours
     * @param: hoursAdd: int
     *
     */
    public void addHours(int hoursAdd){
        hours = hours + hoursAdd; // to put in extra hours
        
    }// end addHours method
    
    
    
    
    
}// End Engineer class
