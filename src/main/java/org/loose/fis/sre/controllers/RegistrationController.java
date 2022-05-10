package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.services.UserService;

import java.io.IOException;

public class RegistrationController {

    @FXML
    private Text registrationMessage;
    @FXML
    private PasswordField passwordField;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField addressField;
    @FXML
    private TextField IDField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField mailField;
    @FXML
    private ChoiceBox role;
    private TextField code;


    @FXML
    public void initialize() {
        role.getItems().addAll("translator", "verifier");
        role.setValue("translator");
    }

    @FXML
    public void handleRegisterAction() {
        try {
            UserService.addUser(usernameField.getText(), passwordField.getText(), addressField.getText(), IDField.getText(), phoneField.getText(), mailField.getText(), (String) role.getValue(), code.getText());
            registrationMessage.setText("Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            registrationMessage.setText(e.getMessage());
        }
        //UserService.printUsers();
    }

    public void handleBacktoLogin(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Main.class.getClassLoader().getResource("Login.fxml"));
            Stage thisStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            thisStage.setScene(new Scene(root, 300, 500));
            thisStage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
