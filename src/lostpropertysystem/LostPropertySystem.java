package lostpropertysystem;

import java.util.*;

public class LostPropertySystem {
    public static void main(String[] args) {
        
        /**objects of all needed classes*/
        Display display = new Display();
        Scanner keyboard = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        Lost lostProperties = new Lost();
        Found foundProperties = new Found();
        
        
        /**Main Menu*/
        int userMainMenuChoice=0;
        User onlineUser = new User();
        
        while(userMainMenuChoice!=4){
        display.DisplayMainMenu();
        userMainMenuChoice = keyboard.nextInt();
        
        if(userMainMenuChoice==1){
            
            users.add(onlineUser=display.DisplayUserSignIn());
            //onlineUser = display.DisplayUserSignIn();
            display.DisplaySideMenu();
            char userSideMenuChoice = keyboard.next().charAt(0);
            display.DisplayTypeOfPropertyMenu();
            char userTypeOfPropertyChoice = keyboard.next().charAt(0);
            String garbage = keyboard.nextLine();
            //display.DisplayPropertyDetails(userTypeOfPropertyChoice, onlineUser);
            if(userSideMenuChoice=='a'||userSideMenuChoice=='A'){
                lostProperties.addProperty(display.DisplayPropertyDetails(userTypeOfPropertyChoice, onlineUser));
            }else{
                foundProperties.addProperty(display.DisplayPropertyDetails(userTypeOfPropertyChoice, onlineUser));
            }
                
        }else if(userMainMenuChoice==2){
            if((onlineUser = display.DisplayUserLogIn(users))!= null){}
            else{System.out.print("this account does NOT exist ! ! !");}
        
        }
        
        String garbage = keyboard.nextLine();
        }
        
        
        
        
    }
    
}
