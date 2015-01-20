/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controleur;

import Modele.Student;
import Modele.StudentList;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author Hassane
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private TextField Name;
    @FXML
    private TextField Last_Name;
    @FXML
    private ListView<String> list = new ListView<String>();
    @FXML
    private ListView<String> list2 = new ListView<String>();
    public static final ObservableList names = FXCollections.observableArrayList();
    public static final ObservableList Last_names = FXCollections.observableArrayList();

    private static StudentList studentLists = new StudentList();

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        this.AddStudent(Last_Name.getText(), Name.getText());
        System.out.println(Name.getText());
        this.set_observable_lists();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void AddStudent(String lastname, String firstname) {

        this.studentLists.addStudent(new Student(lastname, firstname));
    }

    public void set_observable_lists() {
        names.clear();
        Last_names.clear();
        for (int i = 0; i < studentLists.getSize(); i++) {
            String lastname = (String) studentLists.getValueAt(i,0);
            String firstname = (String) studentLists.getValueAt(i,1);
            names.add(firstname);
            list.setItems(names);
            Last_names.add(lastname);
            list2.setItems(Last_names);
        }

    }

}
