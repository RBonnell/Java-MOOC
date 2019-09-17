import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
    frame = new JFrame("Calculator");
    frame.setPreferredSize(new Dimension(300, 150));

    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    createComponents(frame.getContentPane());

    frame.pack();
    frame.setVisible(true);
    }


    private void createComponents(Container container) {
        Calculator calc = new Calculator();
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField txtOutput = new JTextField("0");
        txtOutput.setEnabled(false);
        JTextField txtInput = new JTextField();

        JButton btnAdd = new JButton("+");
        JButton btnSubtract = new JButton("-");
        JButton btnZ = new JButton("Z");
        btnZ.setEnabled(false);
       
        btnAdd.addActionListener(new AddListener(calc, txtInput, txtOutput, btnZ));
        btnSubtract.addActionListener(new SubtractListener(calc, txtInput, txtOutput, btnZ));
        btnZ.addActionListener(new ClearListener(txtInput, txtOutput, btnZ));
        
        JPanel buttonPanel = new JPanel();
        GridLayout buttonLayout = new GridLayout(1,3);
        buttonPanel.setLayout(buttonLayout);
        
        container.add(txtOutput);
        container.add(txtInput);
        container.add(buttonPanel);
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnSubtract);
        buttonPanel.add(btnZ);
    }

    public JFrame getFrame() {
        return frame;
    }
}
