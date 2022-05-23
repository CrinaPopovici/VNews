package org.loose.fis.sre.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.exceptions.IncorrectCodeException;
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
    @FXML
    private TextField code;


    @FXML
    public void initialize() throws NullPointerException {
        role.getItems().addAll("translator", "verifier");
        role.setValue("translator");
    }

    @FXML
    public void handleRegisterAction()  {
        try {
            UserService.addUser(usernameField.getText(), passwordField.getText(), addressField.getText(), IDField.getText(), phoneField.getText(), mailField.getText(), (String) role.getValue(), code.getText());
            if(registrationMessage != null) registrationMessage.setText(" Account created successfully!");
        } catch (UsernameAlreadyExistsException e) {
            registrationMessage.setText(e.getMessage());

        }
    }

    public void handleBacktoLogin() throws IOException, NullPointerException {
        Main m = new Main();
        m.changeScene("Login.fxml");
    }
}
