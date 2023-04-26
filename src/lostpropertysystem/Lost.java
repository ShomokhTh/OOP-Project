package lostpropertysystem;
import java.util.*;

/**
 * subclass from  sortProperty class,it is a class for the properties that have been lost
 * @author ghady Alharthi
 * 
 */

public class Lost extends sortProperty{
    Scanner scan=new Scanner (System.in);
    
    /**
     * an arrayList contains the properties that have been found
     */
    protected static ArrayList <Property> LostProperties= new ArrayList<Property>();
    /**
     * method to add the property that have been lost to the Lost properties if 
    * there are no one who found it and if it was found in the found 
    * list then the person who lost it can make an appointment with the  person who found it 
     * @param p the property to be added to the FoundList
     */
    @Override
        public void addProperty(Property p){
            if(this.search(p)==true){
                System.out.println("do you want to make an appointment with the person who found this property");
                String answer=scan.next();
                if(answer.equalsIgnoreCase("yes")){
                    //setDAte
                }else{
                    Lost.LostProperties.add(p);
                }
            }
            
      
        }
        
        /**
         * method to check if the property is new or not in the FoundList, print the information of the user that has found the property
         * @param p the property that will be determined if it is new or not in the FoundList
         * 
        */
    @Override
    public void checkIfNew(Property p){
        if(Found.foundProperties.contains(p)==true){
            System.out.println("this property already exists inside the Foundtlist");
            System.out.println(p/*getUserInfromation*/);
        }
        
        else{ System.out.println("this property is a new property in the Foundtlist");
        Found.foundProperties.add(p);
        }
}
    
    /**
     * method to search if the property is existing in the FoundList
     * @param p the property that will be determined if it's in the FoundList or not
     * @return true if it's has been found in FOundList ,false if it's the opposite
     */
    @Override
    public boolean search(Property p){
        if(Found.foundProperties.contains(p)==true){
        return true;}
        else{
            return false;
        }
    }
    
}
