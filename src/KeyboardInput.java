
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vekivulic
 */
public class KeyboardInput implements MessageInput {

    
 

    @Override
    public MessageText getMessage() {
        Scanner input = new Scanner(System.in);
        String newMessage = input.nextLine();
        MessageText msg = new MessageText(newMessage);
        return msg;

    
    

    

}
}
 


  
    

