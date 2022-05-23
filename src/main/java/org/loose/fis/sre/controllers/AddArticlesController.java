package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.services.AddArticlesService;

import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class AddArticlesController {
    public javafx.scene.control.TextArea textArea;
    @FXML
    List<String> firstFile;
    @FXML
    private ImageView imageViewFiles;

    public void handleBackToMainLogin() throws IOException {
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
    private void uploadChoosenImage() throws RuntimeException {
        final FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Images", firstFile));
        File f = fc.showOpenDialog(null);

        if (f != null) {
            imageViewFiles.setImage(new Image(f.toURI().toString()));

        }
    }


    public void handleEnglishArticles() {
        AddArticlesService.addArticle(imageViewFiles.getImage().getUrl(), textArea.getText(), "English");

    }

    public void handleRomanianArticles() {
        AddArticlesService.addArticle(imageViewFiles.getImage().getUrl(), textArea.getText(), "Romanian");
    }

    public void handleFrenchArticles() {
        AddArticlesService.addArticle(imageViewFiles.getImage().getUrl(), textArea.getText(), "French");
    }

    public void handleGermanArticles() {
        AddArticlesService.addArticle(imageViewFiles.getImage().getUrl(), textArea.getText(), "German");

    }

    public void handleSpanishArticles() {
        AddArticlesService.addArticle(imageViewFiles.getImage().getUrl(), textArea.getText(), "Spanish");

    }
}



