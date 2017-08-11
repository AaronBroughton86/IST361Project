package testpack;

/**
 * Purpose: The purpose of the Customer class is to keep track of each customer
 * that does business with the organization.
 * 
 * @author Aaron Broughton, Austin Brown, Nathan Oberdick, Sahil Heighes
 */
public class Customer {
    
    private int custID = 0;
    private String custName;
    private String custAddress;
    private String custEmail;
    
    public Customer(){
    
        
    }// end Customer method
  
    /**
     * Set CustName
     * @param: custNameSet: String
     *
     */
    public void setCustName(String custNameSet){
        custName = custNameSet;
    
    }// end setCustName method
  
    /**
     * Set CustAddress
     * @param: custAddressSet: String
     *
     */
    public void setCustAddress(String custAddressSet){
        custAddress = custAddressSet;
    
    }// end setCustAddress method
  
    /**
     * Set CustEmail
     * @param: custEmailSet: String
     *
     */
    public void setCustEmail(String custEmailSet){
        custEmail = custEmailSet;
    
    }// end setCustEmail method
  
    /**
     * Get CustName
     * @return: custName: String
     *
     */
    public String getCustName(){
        return custName;
        
    }// end getCustName method
    
    /**
     * Get CustAddress
     * @return: custAddress: String
     *
     */
    public String getCustAddress(){
        return custAddress;
        
    }// end getCustAddress method
    
    /**
     * Get CustEmail
     * @return: custEmail: String
     *
     */
    public String getCustEmail(){
        return custEmail;
        
    }// end getCustEmaill method
    
    
    
    
    
    
    
}// end Customer class



