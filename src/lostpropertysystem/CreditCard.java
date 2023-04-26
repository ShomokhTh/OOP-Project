package lostpropertysystem;
/**
 *
 * @author Norah Alumari
 */
public class CreditCard extends Property {

    //attributes
    private String name;
    private String bank;
    private String type;

    /**
     * default constructor
     */
    public CreditCard() {
    }

    /**
     * parametrised constructor
     *
     * @param location, where did the user found/lost the Credit Card
     * @param date, when did the user found/lost the Credit Card
     * @param user, the user which is the Credit Card with at the moment
     * @param name, the user name on the Credit Card
     * @param bank, the bank of the Credit Card
     * @param type,the type of the Credit Card
     * @param otherDetails, other details about the Credit Card
     */
    public CreditCard( String name, String bank, String type, String location, Date date, User user, String otherDetails[]) {
        super(location, date, user, otherDetails);
        this.name = name;
        this.bank = bank;
        this.type = type;
    }

    /**
     * methods set all values to its attributes
     */
    public void setAll(String location,Date date,User user,String name,String bank,String type,String otherDetails[]) {
        super.setAll(location, date, user, otherDetails);
        this.name = name;
        this.bank = bank;
        this.type = type;
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
     * comparing between tow credit cards
     */
    @Override
    public boolean equals(Object object) {
        CreditCard creditCard = (CreditCard) object;
        if(super.equals(object)){
        if (creditCard.name == this.name && creditCard.bank == this.bank && creditCard.type == this.type) {

            return true;
        }}
            return false;
        
    }

    /**
     * print the properties of the card
     */
    @Override
    public String toString() {
      super.toString();
        return ("name: " + name + " bank: " + bank + " type: " + type);
    }

}

