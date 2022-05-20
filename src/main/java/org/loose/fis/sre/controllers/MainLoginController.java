package org.loose.fis.sre.controllers;


import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import org.loose.fis.sre.Main;
import javafx.scene.control.MenuItem;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.services.UserService;

public class MainLoginController {
    public AnchorPane tabel;

    public void BacktoLogin(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("Login.fxml");
    }

    public void goToArticle(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("AddArticles.fxml");
    }

    public MenuItem EnglishFx, HomeFx, RomanianFx, FrenchFx, SpanishFx;
    public void handleHome(ActionEvent actionEvent){

    }
    public void handleEnglish(ActionEvent actionEvent){
        for(int i=0; i<5; i++){
            Pane newp = new Pane();
            newp.setLayoutX(0);
            newp.setLayoutY(300*i);
            newp.prefHeight(100);
            newp.prefWidth(100);
            TextArea ta = new TextArea();
            ta.setLayoutX(100);
            ta.setLayoutY(100);
            ta.prefHeight(80);
            ta.prefWidth(80);
            newp.getChildren().add(ta);
            tabel.getChildren().add(newp);
        }

        tabel.setPrefHeight(5*200);
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


