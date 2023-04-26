package lostpropertysystem;



 /**@author Shomokh Althagafi*/

public class Electronic extends Property{

private String type;
private String model;
private String company;
private String color;

/**Electronic default constructor*/        
public Electronic (){}

/**Electronic parameterized constructor
     @param type, type of the user property found/lost 
     @param model, model of the user property found/lost 
     @param company, company of the user property found/lost
     @param color, color of the user property found/lost*/
public Electronic (String type, String model, String company, String color, String location ,Date date, User user, String otherDetails[]){
    super(location, date, user, otherDetails);
    this.type=type;
    this.model=model;
    this.company=company;
    this.color=color;
}
/**Set and get all attributes*/
public void setType (String type){this.type=type;}
public String getType (){return type;}    

public void setModel (String model){this.model=model;}
public String getModel (){return model;}  

public void setCompany (String company){this.company=company;}
public String getCompany (){return company;} 

public void setColor (String color){this.color=color;}
public String getColor (){return color;}  

/**Check the equality between two object of Property*/
@Override
public boolean equals(Object object){
Electronic property = (Electronic)object;
        if(super.equals(property)){
            if(((this.type==property.type && this.model==property.model) && this.company==property.company)&& this.color==property.color)
            return true;
        }
            return false;
    } 
/**toString*/
@Override
public String toString() {

        return "Type is "+type+", model is "+model+", company is "+company+", color is "+color;
    }

}

