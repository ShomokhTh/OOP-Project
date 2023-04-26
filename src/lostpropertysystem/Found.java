package lostpropertysystem;
import java.util.*;

/**
 *subclass from  sortProperty class,it is a class for the properties that have been found
 * @author ghady Alharthi
 */


public class Found extends sortProperty{
    Scanner scan=new Scanner(System.in);
     /**
      * an arrayList contains the properties that have been found
      */
    protected static ArrayList <Property> foundProperties= new ArrayList<Property>();
   /**
    * method to add the property that have been found to the found properties if 
    * there are no one who lost it and if it was found in the lost 
    * list then the person who found it can make an appointment with the  person who lost it 
    * @param p the property to be added to the lostList
    */
   @Override
        public void addProperty(Property p){
           
                if(this.search(p)==true){
                    System.out.println("do you want to make an appointment with the person who lost this property");
                    String answer=scan.next();
                    if(answer.equalsIgnoreCase("yes")){
                        //setDate
                    }
                    else{
                        Found.foundProperties.add(p);
                    }
                }   
   }
        /**
         * method to dertermine if the peoperty is new or not and print the information of the user that has lost the property
         * @param p the property that will be determined if it is new or not in the lostlist
         */
   @Override
    public void checkIfNew(Property p){
        if(Lost.LostProperties.contains(p)==true){
            System.out.println("this property already exists inside the Lostlist");
            System.out.println(p/*.getUser()*/);}
           
        
        else{ 
            System.out.println("this property is a new property in the lostList");
            Lost.LostProperties.add(p);
        }
        }
    /**
     * methods to search if the property is existing in the lostList
     * @param p the property that will be determined if it is in the lostList or not
     * @return true if the property have been found in the lostList and false if it is the opposite
     * 
     */
   @Override
    public boolean search(Property userInput){
        for(Property property :Lost.LostProperties){
        if(userInput.equals(property)){
            return true;}
        }
        return false;
    }
}
