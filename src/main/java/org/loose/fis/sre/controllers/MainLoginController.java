package org.loose.fis.sre.controllers;


import javafx.event.ActionEvent;
import org.loose.fis.sre.Main;
import javafx.scene.control.MenuItem;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.services.UserService;

public class MainLoginController {
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


