package testpack;

/**
 * Purpose: The purpose of the Revision class is to keep track of the engineer
 * drawing revisions that engineers make to each part drawing.
 * 
 * @author Aaron Broughton, Austin Brown, Nathan Oberdick, Sahil Heighes
 */
public class Revision {
    
    private String letter;
    private Engineer engineer = new Engineer();
    private String date;
    private int drawingID; 
    
    
    /**
     * Revision
     * @param: engineerID: Engineer
     *
     */
    public Revision(Engineer engineerID){
        
        
    }// end Revision method
    
    /**
     * Set engineer
     * @param: setEngineer: Engineer
     *
     */
    public void setEngineer(Engineer setEngineer){
        engineer = setEngineer;
    } // end setEngineer method
    
    /**
     * Set letter
     * @param: letterSet: String
     *
     */
    public void setLetter(String letterSet){
        letter = letterSet;   
    }// end setLetter method
    
    /**
     * Set date
     * @param: dateSet: String
     *
     */
    public void setDate(String dateSet){
        date = dateSet;
        
    }// end setDate method
    
    /**
     * Set drawingID
     * @param: setDrawingID: int
     *
     */
    public void setDrawingID(int setDrawingID){
        drawingID = setDrawingID;
    }// end setDrawingID method
    
    /**
     * Get drawingID
     * @return: drawingID: int
     *
     */
    public int getDrawingID(){
        return drawingID;
    }// end getDrawingID method
    
    /**
     * Get engineer
     * @return: engineer: Engineer
     *
     */
    public Engineer getEngineer(){
        return engineer;
    }// end getEngineer method
    
    /**
     * Get letter
     * @return: letter: String
     *
     */
    public String getLetter(){
        return letter;
        
    }// end getLetter method
    
    /**
     * Get date
     * @return: date: String
     *
     */
    public String getDate(){
        return date;
        
    }// end getDate method
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
