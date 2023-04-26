package lostpropertysystem;
/**
 *
 * @author Norah Alumari
 */
public class Other extends Property {
//attributes
    private String name;
    private String type;
    private String size;
    private String color;

    /**
     * default constructor
     */
    public Other() {
    }
/**
     * parametrised constructor
     *
     *  @param location, where did the user found/lost this thing
     * @param date, when did the user found/lost this thing
     * @param user, the user which is the this thing with at the moment
     * @param name, the name of this thing
     * @param type,the type of this thing
     * @param size, the size of this thing
     * @param color,the color of this thing
     * @param otherDetails, other details about the Credit Card
     */
    public Other(String location, Date date, User user, String name, String type, String size, String color, String[] otherDetails) {
        super( location , date ,user, otherDetails);
        this.name = name;
        this.type = type;
        this.size = size;
        this.color = color;
    }

   /**
     * methods set all values to its attributes
     */
    public void setAll(String location,Date date,User user,String name,String type,String size,String color,String otherDetails[]) {
        super.setAll( location,date, user, otherDetails );
        this.name = name;
        this.type = type;
        this.size = size;
        this.color = color;
    }
    /**
     * get all values 
     */
    public String getAll() {
        String full="";
        full+=super.getAll();
        return full;
    }

    /**
     * comparing between tow things
     */
    @Override
    public boolean equals(Object object){
        Other other = (Other) object;
        if(super.equals(object)){
        if (other.name == this.name && other.type == this.type && other.size == this.size && other.color==other.color) {
            return true;
        }} 
            return false;
        
    }
    /**
     * print the properties of this thing
     */
     @Override
      public String toString() {
      super.toString();
        return ("name: " + name + " type: " + type+" size: "+size+" color: "+color);
    }
}
