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


public class LoginController {
   @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;




    public void Login(ActionEvent event){
            if (txtUsername.getText().isEmpty() ){
                lblStatus.setText("Please enter a username!");}
            else if (txtPassword.getText().isEmpty()) {
                lblStatus.setText("Please enter a password!");
            }else{
                try {
                    UserService.printUsers();
                    UserService.CheckLogin(txtUsername.getText(),txtPassword.getText());
                    Parent root = FXMLLoader.load(Main.class.getClassLoader().getResource("MainLogin.fxml"));
                    Stage thisStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                    thisStage.setScene(new Scene(root, 500, 500));
                    thisStage.show();
                } catch (IOException e) {
                    System.out.println(e);
                }catch (IncorrectPasswordException | IncorrectUsernameException e){
                    lblStatus.setText(e.getMessage());
                }
            }
        }




    public void login(ActionEvent actionEvent) {
        System.out.println(txtUsername.getText()+","+txtPassword.getText());
    }

    public void register(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(Main.class.getClassLoader().getResource("register.fxml"));
            Stage thisStage = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
            thisStage.setScene(new Scene(root, 300, 500));
            thisStage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

 
}
