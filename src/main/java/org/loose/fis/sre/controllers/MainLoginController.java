package org.loose.fis.sre.controllers;


import com.sun.javafx.scene.control.ContextMenuContent;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.loose.fis.sre.Main;
import javafx.scene.control.MenuItem;
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
    public MenuItem EnglishFx, HomeFx, RomanianFx, FrenchFx, SpanishFx;
    public void handleHome(ActionEvent actionEvent){

    }
    public void handleEnglish(ActionEvent actionEvent){

    }
    public void handleRomanian(ActionEvent actionEvent){

    }
    public void handleFrench(ActionEvent actionEvent){

    }
    public void handleGerman(ActionEvent actionEvent){

    }
    public void handleSpanish(ActionEvent actionEvent){

    }
}


