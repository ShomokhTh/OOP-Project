package lostpropertysystem;
/**
 *
 * @author Summayah Abdualmoeen Albarakati
 */


public class Property{
    public String location;
    public Date date;
    private boolean isFound = false;
    public User user;
    public String otherDetails[] = new String[5];

    
    /**Property default constructor*/
    public Property(){}
    
    /**Property parameterized constructor
     @param location, where did the user found/lost the property
     @param date, when did the user found/lost the property
     @param user, the user which is the property with at the moment
     @param otherDetails, other details about the property*/
    public Property(String location, Date date, User user, String otherDetails[] ) {
        this.location = location;
        this.date = date;
        this.user = user;
        this.otherDetails=otherDetails;
    }
    
    /**who does this property belong to
     @return String representation to the user which this property belong to*/
    public String belongTo(){
        
        return user.toString();
        
    }
    
    /**get all attributes*/
    public String getAll() {
        String PropertyAsString = "";
        PropertyAsString+= (location+" "+date+" "+user+" ");
        for(int i = 0; i<otherDetails.length; i++){
            PropertyAsString+=otherDetails[i]+" ";
        }
        return PropertyAsString;
    }
    
    /**set all attributes*/
    public void setAll(String location, Date date, User user, String otherDetails[] ) {
        this.location = location;
        this.date = date;
        this.user = user;
        this.otherDetails=otherDetails;
    }
    
    /**set the user which the property is with at the moment*/
    public void setUser(User user){
        isFound = !isFound;
        this.user=user;
    }
    
    /**check the equality between two object of Property*/
    @Override
    public boolean equals(Object object){
        Property property = (Property)object;
        if(this.location==property.location&&this.date==property.date){
            for(int i = 0; i<this.otherDetails.length;i++){
                if(this.otherDetails[i]==property.otherDetails[i]){
                    
                }else{
                    return false;
                }
            }return true;
        }else{
            return false;
        }
    
    }
    
    /**toString*/
    @Override
    public String toString() {
        String PropertyAsString = "";
        PropertyAsString+= (location+" "+date+" "+user+" ");
        for(int i = 0; i<otherDetails.length; i++){
            PropertyAsString+=otherDetails[i]+" ";
        }
        return PropertyAsString;
    }}
    
    