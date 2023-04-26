package lostpropertysystem;
/**
 *
 * @author Shooq Faisal Al subhi
 */
public class Date {
    private int Day;
    private int Month;
     private int Year;
     
     /**Date default constructor*/
     public Date(){}
    
    /**Date parametrised constructor
     @param Day,  what day did the user found/lost the property
     @param Month, what month did the user found/lost the property
     @param Year,  what year did the user found/lost the property
     */
    public Date(int Day, int Month, int Year ) {
        this.Day = Day;
        this.Month = Month;
        this.Year = Year;
        
    }
    
    /**set day for found/lost property*/
    public void setDay(int Day ) {
        this.Day = Day;
        
    }
    
      /**set month for found/lost property*/
    public void setMonth(int Month ) {
        this.Month = Month;
        
    }
     
     /**set year for found/lost property*/
    public void setYear(int Year ) {
        this.Year = Year;
        
    } 
    
     /**get Day for found/lost property
     * @return  */
    public int getDay( ) {
        return Day;
        
    } 
    
     /**get Month for found/lost property
     * @return  */
    public int getMonth( ) {
        return Month;
        
    } 
     /**get year for found/lost property
     * @return  */
    public int getYear( ) {
        return Year;
        
    } 
    
     /**toStrin
     * @return g*/
    @Override
    public String toString() {
        return "(" +Year+"/" + Month + "/" + Day+ ")";
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
