package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Title");
        frame.setPreferredSize(new Dimension(300, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));
        JCheckBox chBox1 = new JCheckBox("Yes!");
        JCheckBox chBox2 = new JCheckBox("No!");
        ButtonGroup btnGrp1 = new ButtonGroup();
        btnGrp1.add(chBox1);
        btnGrp1.add(chBox2);
        container.add(chBox1);
        container.add(chBox2);
        container.add(new JLabel("Why?"));
        JRadioButton reason1 = new JRadioButton("No reason.");
        JRadioButton reason2 = new JRadioButton("Because it is fun!");
        ButtonGroup btnGrp2 = new ButtonGroup();
        btnGrp2.add(reason1);
        btnGrp2.add(reason2);
        container.add(reason1);
        container.add(reason2);
        JButton btn = new JButton("Done!");
        container.add(btn);
    }

    public JFrame getFrame() {
        return frame;
    }
}
