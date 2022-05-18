package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import org.loose.fis.sre.Main;

public class MainVoluntarControler {
    public void LogOff(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("Login.fxml");
    }

    public void MainLogin(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("MainLogin.fxml");
    }
}
