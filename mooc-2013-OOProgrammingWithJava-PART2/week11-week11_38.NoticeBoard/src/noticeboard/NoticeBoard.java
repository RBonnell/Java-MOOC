package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Notice Board");
        frame.setPreferredSize(new Dimension(400, 200));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }
    
    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField txtInput = new JTextField();
        JButton btnCopy = new JButton("Copy!");
        JLabel lblOutput = new JLabel();

        ActionEventListener copier = new ActionEventListener(txtInput, lblOutput);
        btnCopy.addActionListener(copier);

        container.add(txtInput);
        container.add(btnCopy);
        container.add(lblOutput);
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
