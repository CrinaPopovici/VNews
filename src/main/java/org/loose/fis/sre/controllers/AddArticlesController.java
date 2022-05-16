package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.loose.fis.sre.Main;

import java.io.File;

import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;


public class AddArticlesController {
    List<String> firstFile;
    private Label labSingleFile;

    public void handleBackToMainLogin(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("MainLogin.fxml");
    }

    public void handleGoToArticle(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("MainLogin.fxml");
    }

    public void initialize() {
        firstFile = new ArrayList<>();
        firstFile.add("*.jpg");
        firstFile.add("*.png");
        firstFile.add("*.jpeg");
    }

    @FXML
    void uploadChoosenImage(ActionEvent actionEvent) throws RuntimeException {
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", firstFile));
        File f = fc.showOpenDialog(null);

        if (f != null)
            labSingleFile.setText("selected File: " + f.getAbsolutePath());
    }
}

