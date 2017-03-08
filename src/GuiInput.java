
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
public class GuiInput implements MessageInput{
 MessageText msg;

    public MessageText getMsg() {
        return msg;
    }

    public void setMsg(MessageText msg) {
        this.msg = msg;
    }
 


    

    @Override
    public MessageText getMessage() {
             JOptionPane.showMessageDialog(null, msg.getMessageText());
     return msg;
    

    }
}

    
   

