package testpack;

/**
 * Purpose: The purpose of the Orders class is to organize and keep track of
 * all customer orders. It uses an orderID that associates with a customer and
 * all AirplaneID's associated with the order. 
 * 
 * @author Aaron Broughton, Austin Brown, Nathan Oberdick, Sahil Heighes
 */
public class Orders extends Aircraft {
   
    private String date = "";
    private boolean statusFlag = false; 
    private Customer customer = new Customer();
    public Aircraft aircraft[] = new Aircraft[4];
    
    
    
    public Orders()  {
    
       
    for(int i=0;i<aircraft.length;i++){
       aircraft[i] = new Aircraft();

    }// end Orders
    
 
    }
    
    
    
    /**
     * Set Date
     * @param: createDate: String
     *
     */
    public void setDate(String createDate){
        date = createDate;
    }// end setDate method
    
    /**
     * Set StatusFlag
     * @param: changeFlag: boolean
     *
     */
    public void setStatusFlag(boolean changeFlag){
        statusFlag = changeFlag;
        
    }// end setStatusFlag method
    
    /**
     * Set Customer
     * @param: setCustomer: Customer
     *
     */
    public void setCustomer(Customer setCustomer){
        customer = setCustomer;
    } // end setCustomer method
    
    /**
     * Get Customer
     * @return: customer: Customer
     *
     */
    public Customer getCustomer(){
        return customer;
    } // end getCustomer method
    
   
   
    /**
     * Get date
     * @return: date: String
     *
     */
    public String getDate(){
        return date;
    
    }// end getDate method
    
    /**
     * Get StatusFlag
     * @return: statusFlag: boolean
     *
     */
    public boolean getStatusFlag(){
        return statusFlag;
    }// end getStatus Flag method

  
    
    
    
}// End Orders class
