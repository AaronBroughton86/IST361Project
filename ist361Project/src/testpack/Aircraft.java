package testpack;

/**
 * Purpose: The purpose of the Aircraft class is to organize and keep track of
 * the each aircraft type available for purchase, this includes parts, 
 * engineers and other descriptors(price,name, description,) about the aircraft.
 * 
 * @author Aaron Broughton, Austin Brown, Nathan Oberdick, Sahil Heighes
 */
public class Aircraft {

private String name;
private int price =0;
private String description;
private Engineer engineer[] = new Engineer[2];
private Part part[] = new Part[10];
private int quantity;
        
    public Aircraft(){
          
       
    }// end Orders
    
    /**
     * Set Engineer
     * @param: setEngineer: Engineer
     *
     */
    public void setEngineer(Engineer setEngineer){
        engineer[0]= setEngineer;
    } // end setEngineer method
    
    /**
     * Set Engineer
     * @param: setEngineer: Engineer, setEngineer2: Engineer
     *
     */
    public void setEngineer(Engineer setEngineer1, Engineer setEngineer2){
        engineer[0]=setEngineer1;
        engineer[1]=setEngineer2;
    } // end setEngineer method
    
    /**
     * Set Part
     * @param: index: int, setPart: Part
     *
     */
    public void setPart(int index, Part setPart){
        part[index-1]=setPart;
    } // end setPart method
    
    /**
     * Set Quantity
     * @param: setQuantity: int
     *
     */
    public void setQuantity(int setQuantity){
        quantity = setQuantity;
    } // end setQuantity method
    
    /**
     * Set Name
     * @param: nameSet: String
     *
     */
    public void setName(String nameSet){
        name = nameSet;
    }// end setName method
    
    /**
     * Set Price
     * @param: priceSet: int
     *
     */
    public void setPrice(int priceSet){
       price = priceSet;
        
    }// end setPrice method
    
    /**
     * Set Description
     * @param: descriptionSet: String
     *
     */
    public void setDescription(String descriptionSet){
       description = descriptionSet;
        
    }// end setDescription method 
    

    
    /**
     * Get Name
     * @return: name: String
     *
     */
    public String getName(){
        return name;
    
    }// end getName method
    
    /**
     * Get Price
     * @return: price: int
     *
     */
    public int getPrice(){
      return price;
        
    }// end getPrice method
    
    /**
     * Get Quantity
     * @return: quantity: int
     *
     */
    public int getQuantity(){
        return quantity;
    } // end getQuantity method
    
    /**
     * Get Description
     * @return: description: String
     *
     */
    public String getDescription(){
        return description;
    
    }// end getDescription method
    
    /**
     * Get engineer1
     * @return: engineer[0]: Engineer
     *
     */
    public Engineer getEngineer1(){
        return engineer[0];
    } // end getEngineer1 method
    
    /**
     * Get engineer2
     * @return: engineer[1]: Engineer
     *
     */
    public Engineer getEngineer2(){
        return engineer[1];
    } // end getEngineer2 method
     
    /**
     * Get part
     * @return: part[index]: Part
     *
     */
    public Part getPart(int index){
        return part[index];
    } // end getPart method
    
}// end Aircraft class

