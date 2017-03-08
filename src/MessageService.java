/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vekivulic
 */
public class MessageService {
    private MessageOutput output;
    private MessageInput input;
	
	
	
	public MessageService( MessageOutput output, MessageInput input ) {
		this.output = output;
		this.input = input;
	}

    
	
    public void createAndOutputMessage() {
        output.write(input);
    }

    public MessageOutput getOutput() {
        return output;
    }

    public void setOutput(MessageOutput output) {
        this.output = output;
    }

    public MessageInput getInput() {
        return input;
    }

    public void setInput(MessageInput input) {
        this.input = input;
    }
    
    
}
    

