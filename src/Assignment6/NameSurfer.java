/*
 * File: NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class NameSurfer extends ConsoleProgram implements NameSurferConstants {

    /* Method: init() */
    /**
     * This method has the responsibility for reading in the data base
     * and initializing the interactors at the bottom of the window.
     */
    public void init() {
        add(new JLabel("Name"), SOUTH);
        nameField = new JTextField(30);
        add(nameField, SOUTH);
        add(new JButton("Graph"), SOUTH);
        add(new JButton("Clear"), SOUTH);
        nameField.addActionListener(this);
        addActionListeners();
    }

    /* Method: actionPerformed(e) */
    /**
     * This class is responsible for detecting when the buttons are
     * clicked, so you will have to define a method to respond to
     * button actions.
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Graph")) {
            println(new NameSurferEntry("Sam 58 69 99 131 168 236 278 380 467 408 466").getName());
            // println("Graph: " + nameField.getText());
        } else if (e.getActionCommand().equals("Clear")) {
            println("Clear");
//            removeAll();
        } else if (e.getSource() == nameField) {
            println("Graph: " + nameField.getText());
        }
    }

    private JTextField nameField    ;
}
