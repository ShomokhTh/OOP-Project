package lostpropertysystem;


/**@author Shomokh Althagafi*/

public class Accessorie extends Property{
    
private String type;
private String color;
private String kind;

/**Electronic default constructor*/        
public Accessorie (){}

/**Electronic parameterized constructor
     @param type, type of the user property found/lost 
     @param color, color of the user property found/lost
     @param kind, kind of the user property found/lost*/
public Accessorie (String type, String color, String kind, String location, Date date, User user, String otherDetails[]){
    super(location, date, user, otherDetails);
    this.type=type;
    this.color=color;
    this.kind=kind;
}

/**Set and get all attributes*/
public void setType (String type){this.type=type;}
public String getType (){return type;}    

public void setColor (String color){this.color=color;}
public String getColor (){return color;} 

public void setKind (String kind){this.kind=kind;}
public String getkind (){return kind;} 

/**Check the equality between two object of Property*/
@Override
public boolean equals(Object object){
Accessorie property = (Accessorie)object;
        if(super.equals(property)){
            if((this.type==property.type && this.kind==property.kind)&& this.color==property.color)
            return true;
        }
            return false;
    } 
/**toString*/
@Override
public String toString() {

        return "Type is "+type+", color is "+color+", kind is "+kind;
    }

}