


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vekivulic
 */
public class ConsoleOutput implements MessageOutput{
    

    
    

    @Override
    public void write(final MessageInput msgInput) {
        MessageText msg = msgInput.getMessage();
        System.out.println(msg.getMessageText().toUpperCase());
       
    }

    
    
    
}
