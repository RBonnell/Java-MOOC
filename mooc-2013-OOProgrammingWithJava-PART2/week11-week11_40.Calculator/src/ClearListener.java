
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author 358721
 */
public class ClearListener implements ActionListener{
    
    private JTextField input;
    private JTextField output;
    private JButton button;

    public ClearListener(JTextField input, JTextField output, JButton button){
        this.input = input;
        this.output = output;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(!output.getText().equals("0")){
            input.setText("");
            output.setText("0"); 
            button.setEnabled(false);
        }
    }
}