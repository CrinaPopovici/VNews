package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.exceptions.IncorrectPasswordException;
import org.loose.fis.sre.exceptions.IncorrectUsernameException;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.services.UserService;

import java.io.IOException;
import java.util.Objects;


public class LoginController {
    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;


    public void Login(ActionEvent event) {
        if (txtUsername.getText().isEmpty()) {
            lblStatus.setText("Please enter a username!");
        } else if (txtPassword.getText().isEmpty()) {
            lblStatus.setText("Please enter a password!");
        } else {
            try {
                // UserService.printUsers();
                UserService.CheckLogin(txtUsername.getText(), txtPassword.getText());
            } catch (IncorrectPasswordException | IncorrectUsernameException e) {
                lblStatus.setText(e.getMessage());
            }

            Main m = new Main();
            m.changeScene("MainLogin.fxml");
        }
    }


    public void register(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("register.fxml");
    }


}
