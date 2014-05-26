/*
 * File: NameSurfer.java
 * ---------------------
 * When it is finished, this program will implements the viewer for
 * the baby-name database described in the assignment handout.
 */

import acm.program.*;
import java.awt.event.*;
import javax.swing.*;

public class NameSurfer extends Program implements NameSurferConstants {

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

        graph = new NameSurferGraph();
        add(graph);

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
        if (e.getActionCommand().equals("Graph") || e.getSource() == nameField) {
            graph.addEntry(nameData.findEntry(nameField.getText()));
        } else if (e.getActionCommand().equals("Clear")) {
            graph.clear();
        }
    }

    private JTextField nameField;
    private NameSurferGraph graph;
    private NameSurferDataBase nameData = new NameSurferDataBase(NAMES_DATA_FILE);
}
