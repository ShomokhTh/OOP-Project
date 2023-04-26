package lostpropertysystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Summayah Albarakati
 */

public class Display {
    
    
    Scanner keyboard = new Scanner(System.in);
    
    public void DisplayMainMenu(){
        System.out.println("[Missing Property System]"+
                "\n1. Sign in"+
                "\n2. Log in"+
                "\n3. Log out"+
                "\n4. Exit"
                + "\n*at anypoint at the program if you enter 3 or 4 the program will respone!*");
    }
    
    public void DisplaySideMenu(){
        System.out.println("Did you..."+
                "\na. lost property"
                + "\nb. found property");
    }
    
    public void DisplayTypeOfPropertyMenu(){
        System.out.println("What is the type of property?"
                + "\na. Accessorie"
                + "\nb. Credit Card"
                + "\nc. Elctronic"
                + "\nd. Other");
    }
    
    public User DisplayUserSignIn(){
        int garbegCounter=0;
        if(garbegCounter>0){
            //String garbage = keyboard.nextLine();
        }
        System.out.println("Name: ");
        String userName = keyboard.nextLine();
        
        System.out.println("Date Of Birth (DD-MM-YYYY) : ");        
//        String Garbage = keyboard.nextLine();
        String userBirth = keyboard.nextLine();
        int day = Integer.parseInt(userBirth.substring(0, userBirth.indexOf('-')));
        int month = Integer.parseInt(userBirth.substring(userBirth.indexOf('-'),userBirth.lastIndexOf('-') ));
        int year = Integer.parseInt(userBirth.substring(userBirth.lastIndexOf('-'),userBirth.length()-1));
        Date dateOfBirth = new Date(day,month,year);
        
        System.out.println("ID: ");
        int userID = keyboard.nextInt();
        
        System.out.println("Password: ");
        String userPasswrod = keyboard.next();
        
        garbegCounter++;
        
        return new User(userID,userPasswrod,userName,dateOfBirth);
        
        
    }
    
    public User DisplayUserLogIn(ArrayList<User> users){
        System.out.println("ID: ");
        int userID = keyboard.nextInt();
        
        System.out.println("Password: ");
        String userPassword = keyboard.next();
        User newUserLogIn = new User(userID,userPassword);
                
        for(User user : users){
            if(user.equals(newUserLogIn)){
                System.out.println("Welcome "+user.getName()+" !");
                return user;
        }
        }
        return null;
    }
    
    public Property DisplayPropertyDetails(char userTypeOfPropertyChoice, User onlineUser){ 
        
        String garbage1 = keyboard.nextLine();
        System.out.println("Location (where did you found/lost it?): ");
        String location = keyboard.nextLine();
        System.out.println("Date (when did you found/lost it?): \nDD-MM-YYYY: ");
        String date = keyboard.nextLine();
        int day = Integer.parseInt(date.substring(0, date.indexOf('-')));
        int month = Integer.parseInt(date.substring(date.indexOf('-'),date.lastIndexOf('-') ));
        int year = Integer.parseInt(date.substring(date.lastIndexOf('-'),date.length()-1));
        Date dateOfLostOrFound = new Date(day,month,year);

        if(userTypeOfPropertyChoice=='a'||userTypeOfPropertyChoice=='A'){
            /**Accessorie*/
            System.out.println("Type: ");
            String type = keyboard.nextLine();
            System.out.println("Color: ");
            String color = keyboard.nextLine();
            System.out.println("Kind: ");
            String kind = keyboard.nextLine();
            
            System.out.println("Other Details: \nType \"no more\" if you have nothing more to add: ");
            String[] otherDetails = new String[5];
            for(int i = 0; i<5; i++){
                String other = keyboard.nextLine();
                if (other.equalsIgnoreCase("no more"))
                    otherDetails[i]=other;
                else{break;}
            }
            
            return new Accessorie(type, color, kind, location, dateOfLostOrFound, onlineUser, otherDetails);

            
        }else if(userTypeOfPropertyChoice=='b'||userTypeOfPropertyChoice=='B'){
            /**Credit Card*/
            System.out.println("Name: ");
            String name = keyboard.nextLine();
            System.out.println("Bank: ");
            String bank = keyboard.nextLine();
            System.out.println("Type: ");
            String type = keyboard.nextLine();
            
            System.out.println("Other Details: \nType \"no more\" if you have nothing more to add: ");
            String[] otherDetails = new String[5];
            for(int i = 0; i<5; i++){
                String other = keyboard.nextLine();
                if (!other.equalsIgnoreCase("no more"))
                    otherDetails[i]=other;
                else{break;}
            }
            
            return new CreditCard(name, bank, type, location, dateOfLostOrFound, onlineUser, otherDetails);
            
            
        }else if(userTypeOfPropertyChoice=='c'||userTypeOfPropertyChoice=='c'){
            /**Electronic*/
            System.out.println("Type: ");
            String type = keyboard.nextLine();
            System.out.println("Model: ");
            String model = keyboard.nextLine();
            System.out.println("Company: ");
            String company = keyboard.nextLine();
            System.out.println("Color: ");
            String color = keyboard.nextLine();
            
            System.out.println("Other Details: \nType \"no more\" if you have nothing more to add: ");
            String[] otherDetails = new String[5];
            for(int i = 0; i<5; i++){
                String other = keyboard.nextLine();
                if (!other.equalsIgnoreCase("no more"))
                    otherDetails[i]=other;
                else{break;}
            }
            
            return new Electronic(type, model, company, color, location, dateOfLostOrFound, onlineUser, otherDetails);
            
            
        }else{
            /**Other*/
            System.out.println("Name: ");
            String name = keyboard.nextLine();
            System.out.println("Type: ");
            String type = keyboard.nextLine();
            System.out.println("Size: ");
            String size = keyboard.nextLine();
            System.out.println("Color: ");
            String color = keyboard.nextLine();
            
            System.out.println("Other Details: \nType \"no more\" if you have nothing more to add: ");
            String[] otherDetails = new String[5];
            for(int i = 0; i<5; i++){
                String other = keyboard.nextLine();
                if (!other.equalsIgnoreCase("no more"))
                    otherDetails[i]=other;
                else{break;}
            }
            
            return new Other(location, dateOfLostOrFound, onlineUser, name, type, size, color, otherDetails);
        }

    }
}
