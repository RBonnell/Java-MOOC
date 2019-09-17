import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author 358721
 */
public class SubtractListener implements ActionListener{
    
    private Calculator calculator;
    private JTextField input;
    private JTextField output;
    private JButton button;

    public SubtractListener(Calculator calculator, JTextField input, JTextField output, JButton button){
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        this.button = button;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int inputNum;
        int outputNum;
  
        try {
            inputNum = Integer.parseInt(input.getText());
            outputNum = Integer.parseInt(output.getText());

            output.setText(Integer.toString(calculator.subtract(inputNum, outputNum)));
            input.setText("");

            if(Integer.parseInt(this.output.getText()) == 0){
                button.setEnabled(false);
            } 
            else{
                button.setEnabled(true);
            }
        } 
        catch (NumberFormatException ex){
            this.input.setText("");
        }
    }
}