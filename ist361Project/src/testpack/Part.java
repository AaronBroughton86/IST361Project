package testpack;

/**
 * Purpose: The purpose of the Part class is to keep track of what part goes
 * to which aircraft and which vendor we buy them from.
 * 
 * @author Aaron Broughton, Austin Brown, Nathan Oberdick, Sahil Heighes
 */
public class Part {
    
    private int partID = 0;
    private String description;
    private String aircraftID;
    private int vendorID = 0;
    private Drawing drawing = new Drawing();
    
    
    
  public Part(){
    
        
    }// end Part method
  
    /**
     * Set drawing
     * @param: setDrawing: Drawing
     *
     */
    public void setDrawing(Drawing setDrawing){
        drawing = setDrawing;
    } // end setDrawing method
    
    /**
     * Set partID
     * @param: setPartID: int
     *
     */
    public void setPartID(int setPartID){
        partID = setPartID;
    } // end setPartID method
    
    /**
     * Set Aircraft ID
     * @param: setAircraftID: String
     *
     */
    public void setAircraftID(String setAircraftID){
        aircraftID = setAircraftID;
    } // end setAircraftID method
    
    /**
     * Set description
     * @param: descriptionSet: String
     *
     */
    public void setDescription(String descriptionSet){
        
        description = descriptionSet;
    }// end setDescription method
    
    /**
     * Set vendorID
     * @param: vendorSet: int
     *
     */
    public void setVendorID(int vendorSet){
        
        vendorID = vendorSet;
    }// end setVendorID method
  
    /**
     * Get drawing
     * @return: drawing: Drawing
     *
     */
    public Drawing getDrawing(){
        return drawing;
    } // end getDrawing method
    
    /**
     * Get partID
     * @return partID: int
     *
     */
    public int getPartID(){
        return partID;
    } // end getPartID method
    
    /**
     * Get aircraftID
     * @return: aircraftID: String
     *
     */
    public String getAircraftID(){
        return aircraftID;
    } // end getAircraftID method
    
    /**
     * Get description
     * @return: description: String
     *
     */
    public String getDescription(){
        return description;
        
    }// end getDescription method
    
    /**
     * Get vendorID
     * @return: vendorID: int
     *
     */
    public int getVendorID(){
        return vendorID;
        
    }// end getVendorID method
    
    
    
    
    
    
    
    
    
    
}// end pPart class
