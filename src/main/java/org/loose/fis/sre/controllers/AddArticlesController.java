package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.services.AddArticlesService;
//import java.scene.image.ImageView;
import java.net.URI;
import java.net.URL;
import java.awt.image.ImageObserver;
import java.io.File;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;


public class AddArticlesController {
    public javafx.scene.control.TextArea textArea;
    @FXML
    private Button btnOpenImgFIle;
    List<String> firstFile;
    @FXML
    private Label labSingleFile;
    @FXML
    private  ImageView imageViewFiles;
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
    private void uploadChoosenImage(ActionEvent actionEvent) throws RuntimeException {
       final FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", firstFile));
        File f = fc.showOpenDialog(null);

        if (f != null)
        {
            //labSingleFile.setText("selected File: " + f.getAbsolutePath());
            imageViewFiles.setImage(new Image(f.toURI().toString()));

        }
    }



    public void handleEnglishArticles(ActionEvent actionEvent) {
        AddArticlesService.addArticle(imageViewFiles.getImage().getUrl(),textArea.getText(),"English");

    }

    public void handleRomanianArticles(ActionEvent actionEvent) {
    }

    public void handleFrenchArticles(ActionEvent actionEvent) {
    }

    public void handleGermanArticles(ActionEvent actionEvent) {
    }

    public void handleSpanishArticles(ActionEvent actionEvent) {
    }
}



