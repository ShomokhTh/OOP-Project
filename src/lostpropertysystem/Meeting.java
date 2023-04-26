package lostpropertysystem;
/**
 *
 * @author Shooq Faisal Al subhi
 */
public class Meeting {
    //Property  sender = new Property();
    //Property  receiver  =new Property();
    
    
     private Date meetingDate ;
     private Property  sender;
     private Property receiver;
     
     
     /**Meeting default constructor*/
     public Meeting (){}
     
     /**Meeting parametrised constructor
     @param meetingDate,  when date of meeting for delivery of property
     @param sender, Who sent the property
     @param receiver,  Who received the property
     */
     
     
     
     public Meeting (Date meetingDate,Property sender,Property receiver){
     this.meetingDate = meetingDate;
        this.sender = sender;
        this.receiver = receiver;
     
     
     }
     /**to print or display all attribute*/
     public void print( ) {
        System.out.println("meetingDate is :" + meetingDate +" " +"sender is :" + sender + "receiver is : " + receiver);
        
    }
     /**check the equality between two object of Property*/
     @Override
     public boolean equals( Object obj){
         Meeting meeting = (Meeting)obj;
         
     
     if(this.meetingDate==meeting.meetingDate&&this.sender==meeting.sender&&this.receiver==meeting.receiver)
     {
     
     return true;
     
     }
     else 
     {
     return false;
     }
     
     
     }
    /**toString*/
    @Override
      public String toString() {
        return "(" +"meetingDate is : "+meetingDate + "sender is : " + sender + "receiver is : "+receiver+ ")";
    }
     
     
 }
    

