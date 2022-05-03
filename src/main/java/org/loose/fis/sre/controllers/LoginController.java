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

import java.io.IOException;
import java.net.URL;

public class LoginController {
   @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;

    public void Login(ActionEvent event){

        if(txtUsername.getText().equals("user") && txtPassword.getText().equals("pass")){
            lblStatus.setText("Login Success");
        }else{
            lblStatus.setText("Login Failed");
        }
    }

    public void login(ActionEvent actionEvent) {
        System.out.println(txtUsername.getText()+","+txtPassword.getText());
    }

    public void register(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Main.class.getClassLoader().getResource("register.fxml"));
            Stage thisStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            thisStage.setScene(new Scene(root, 300, 275));
            thisStage.show();
        } catch (IOException e) {
            System.out.println(e);
        }


    }


}
