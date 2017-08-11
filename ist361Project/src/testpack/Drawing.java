package testpack;

/**
 * Purpose: The purpose of the Drawing class is to keep track of the drawings,
 * which part goes to each drawing, and which engineer made each drawing.
 * 
 * @author Aaron Broughton, Austin Brown, Nathan Oberdick, Sahil Heighes
 */
public class Drawing {
    
    private final Revision revision[] = new Revision[4];
    private int drawingID = 0;
    private Engineer engineer; 
    private String date;
    
    public Drawing(){
        
        
    }// end Drawing method
    
    /**
     * Set revison
     * @param: index: int, setRevision: Revison
     *
     */
    public void setRevision(int index, Revision setRevision){
        revision[index-1]=setRevision;
    } // end setRevision method
    
    /**
     * Set date
     * @param: dateSet: String
     *
     */
    public void setDate(String dateSet){
        date = dateSet;
        
    }// end setDate method
    
    /**
     * Set Engineer
     * @param: setEngineer: Engineer
     *
     */
    public void setEngineer(Engineer setEngineer){
        engineer = setEngineer;
        
    }// end setEngineerID method
    
    /**
     * Set Drawing ID
     * @param: setDrawingID: int
     *
     */
    public void setDrawingID(int setDrawingID){
        drawingID = setDrawingID;
        
    }// end setDrawingID method

    /**
     * Get engineer
     * @return: engineer: Engineer
     *
     */
    public Engineer getEngineer(){
        return engineer;
    }// end getEngineer method
    
    /**
     * Get drawingID
     * @return: drawingID: int
     *
     */
    public int getDrawingID(){
        return drawingID;
    }// end getDrawingID method
   
    /**
     * Get date
     * @return: date: String
     *
     */
    public String getDate(){
        return date;
        
    }// end getDate method
    
    /**
     * Get Revision
     * @return: revision: Revision
     *
     */
    public Revision getRevision(int index){
        return revision[index-1];
    } // end getRevision
  
    
}// end Drawing class
