package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import org.loose.fis.sre.Main;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class MainVoluntarControler {

    public void LogOff() throws IOException {
        Main m = new Main();
        m.changeScene("Login.fxml");
    }

    public void MainLogin() throws IOException {
        Main m = new Main();
        m.changeScene("MainLogin.fxml");
    }

    public void SeeArticles() throws IOException {
        Main m = new Main();
        m.changeScene("VoluntarView.fxml");
    }

    public void Link() {
        try {
            Desktop.getDesktop().browse(new URL("https://ro.yahoo.com/").toURI());
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void handleHome() throws IOException {
        Main m = new Main();
        m.changeScene("MainLogin.fxml");
    }

    public void handleEnglish(ActionEvent actionEvent) {
    }

    public void handleRomanian(ActionEvent actionEvent) {

    }

    public void handleFrench(ActionEvent actionEvent) {
    }

    public void handleGerman(ActionEvent actionEvent) {
    }

    public void handleSpanish(ActionEvent actionEvent) {
    }
}
