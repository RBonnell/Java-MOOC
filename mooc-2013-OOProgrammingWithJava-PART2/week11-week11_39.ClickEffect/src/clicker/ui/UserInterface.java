package clicker.ui;

import clicker.applicationlogic.PersonalCalculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        PersonalCalculator calc = new PersonalCalculator();
        BorderLayout layout = new BorderLayout();
        container.setLayout(layout);

        JLabel lblOutput = new JLabel("0");
        JButton btnIncrease = new JButton("Click!");

        ClickListener listener = new ClickListener(calc, lblOutput);
        btnIncrease.addActionListener(listener);

        container.add(lblOutput, BorderLayout.NORTH);
        container.add(btnIncrease, BorderLayout.SOUTH);
    }

        public JFrame getFrame() {
            return frame;
        }
}
