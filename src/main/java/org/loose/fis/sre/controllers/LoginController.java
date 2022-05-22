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
import org.loose.fis.sre.exceptions.IncorrectCodeException;
import org.loose.fis.sre.exceptions.IncorrectPasswordException;
import org.loose.fis.sre.exceptions.IncorrectUsernameException;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.services.UserService;

import java.io.IOException;
import java.util.Objects;

import static org.loose.fis.sre.services.UserService.CodeC;


public class LoginController {
    @FXML
    private Label lblStatus;
    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private TextField txtCode;


    public void Login(ActionEvent event) throws IncorrectCodeException, IncorrectUsernameException {
        if (txtUsername.getText().isEmpty() ){
            lblStatus.setText("Please enter a username!");}
        else if (txtPassword.getText().isEmpty()) {
            lblStatus.setText("Please enter a password!");
        }else
            if(txtCode.getText().isEmpty())
            try {
                //UserService.printUsers();
                UserService.CheckLogin(txtUsername.getText(),txtPassword.getText());
                Parent root = FXMLLoader.load(Main.class.getClassLoader().getResource("MainVoluntar.fxml"));
                Stage thisStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                thisStage.setScene(new Scene(root, 500, 500));
                thisStage.show();
            } catch (IOException e) {
                System.out.println(e);
            }catch (IncorrectPasswordException | IncorrectUsernameException e){
                lblStatus.setText(e.getMessage());
                e.printStackTrace();
            }
        else{
            try {
                //UserService.printUsers();
                UserService.CheckCode(txtUsername.getText(),txtPassword.getText(),txtCode.getText());
                Parent root = FXMLLoader.load(Main.class.getClassLoader().getResource("MainLogin.fxml"));
                Stage thisStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                thisStage.setScene(new Scene(root, 500, 500));
                thisStage.show();
            } catch (IOException e) {
                System.out.println(e);
            }catch (IncorrectPasswordException | IncorrectUsernameException |IncorrectCodeException e){
                lblStatus.setText(e.getMessage());
                e.printStackTrace();
            }
        }
    }



    /*public void LoginAdmin(ActionEvent event) {
        if (txtUsername.getText().isEmpty()) {
            lblStatus.setText("Please enter a username!");
        } else if (txtPassword.getText().isEmpty()) {
            lblStatus.setText("Please enter a password!");
        } else {
            try {
                // UserService.printUsers();
                UserService.CheckCode(txtUsername.getText(), txtPassword.getText(), txtCode.getText());
            } catch (IncorrectPasswordException | IncorrectUsernameException | IncorrectCodeException e) {
                lblStatus.setText(e.getMessage());
            }

            Main m = new Main();
            m.changeScene("MainLogin.fxml");
        }
    }*/

    public void register(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("register.fxml");
    }


}
