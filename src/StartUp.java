/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vekivulic
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       MessageOutput output = new ConsoleOutput();
       MessageInput input = new KeyboardInput();
    
    
    MessageService service = new MessageService(output, input);
	service.createAndOutputMessage();
        
    }
}
