
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vekivulic
 */
public class GuiOutput implements MessageOutput{

    @Override
    public void write(MessageInput msgInput) {
        MessageText msg = msgInput.getMessage();
        JOptionPane.showMessageDialog(null, msg.getMessageText());
    }
    
}
