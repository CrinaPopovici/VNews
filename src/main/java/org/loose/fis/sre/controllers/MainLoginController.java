package org.loose.fis.sre.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.loose.fis.sre.Main;

import java.io.IOException;

public class MainLoginController {
    public void BacktoLogin(ActionEvent actionEvent) {
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


