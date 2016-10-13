/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterfaceexecise37;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;


/**
 *
 * @author Carmen_Lucia3
 */
public class UserInterfaceExercise37 implements Runnable {

   private JFrame frame;

    public UserInterfaceExercise37() {
    }

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(250, 250));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Are you?"));
        JCheckBox yes = new  JCheckBox("Yes!");
        JCheckBox no = new  JCheckBox("No!");
        
        //If the check Boxes must be choosen one at a time, the code in
        //the lines 56, 57 an 58  will do the trick, otherwise, this lines
        //must be comented
        ButtonGroup buttonGroupCheck = new ButtonGroup();
        buttonGroupCheck.add(no);
        buttonGroupCheck.add(yes);
        
        container.add(yes);
        container.add(no);
                
        container.add(new JLabel("Why?"));

        JRadioButton noReason = new JRadioButton("No Reason.");
        JRadioButton itsFun = new JRadioButton("Because it is fun!");
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(noReason);
        buttonGroup.add(itsFun);
        
        container.add(noReason);
        container.add(itsFun);
        
        container.add(new JButton("Done!"), BorderLayout.SOUTH);
    }

    public JFrame getFrame() {
        return frame;
    }
    
}
