package org.loose.fis.sre.controllers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.loose.fis.sre.Main;
import javafx.scene.control.MenuItem;
import org.loose.fis.sre.model.Article;
import org.loose.fis.sre.services.AddArticlesService;

import java.io.IOException;

public class MainLoginController {
    public AnchorPane tabel;

    public void BacktoLogin() throws IOException {
        Main m = new Main();
        m.changeScene("Login.fxml");
    }

    public void goToArticle() throws IOException {
        Main m = new Main();
        m.changeScene("AddArticles.fxml");
    }

    public MenuItem EnglishFx, RomanianFx, FrenchFx, SpanishFx;

    public void handleEnglish() {
        int i = 0;
        for (Article a : AddArticlesService.ReadLanguageArticleFromDatabase("English")) {
            Pane newp = new Pane();
            newp.setLayoutX(0);
            newp.setLayoutY(100 * i);
            newp.prefHeight(100);
            newp.prefWidth(400);
            TextArea ta = new TextArea();
            newp.getChildren().add(ta);
            ta.setText(a.getLabel());
            ta.setLayoutX(100);
            ta.setLayoutY(5);
            ta.setPrefHeight(80);
            ta.setPrefWidth(200);


            ImageView iv = new ImageView();
            newp.getChildren().add(iv);
            iv.setImage(new Image(a.getImage()));
            iv.setLayoutX(5);
            iv.setLayoutY(5);
            iv.setFitHeight(80);
            iv.setFitWidth(80);
            tabel.getChildren().add(newp);
            i++;


            Button b = new Button();
            b.setText("Delete");
            b.setOnAction((evt) -> {
                AddArticlesService.deleteArticle(a.getLabel());
                handleEnglish();
            });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    event -> {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        VBox dialogVbox = new VBox(10);
                        dialogVbox.resize(1, 1);
                        dialogVbox.getChildren().add(new Text(a.getLabel()));
                        Scene dialogScene = new Scene(dialogVbox, 600, 600);
                        dialog.setScene(dialogScene);
                        dialog.show();
                        dialogVbox.getChildren().add(new ImageView(a.getImage()));
                    });
            newp.getChildren().add(w);


            tabel.setPrefHeight(i * 100);
        }
    }

    public void handleRomanian() {
        int i = 0;
        for (Article a : AddArticlesService.ReadLanguageArticleFromDatabase("Romanian")) {
            Pane newp = new Pane();
            newp.setLayoutX(0);
            newp.setLayoutY(100 * i);
            newp.prefHeight(100);
            newp.prefWidth(400);
            TextArea ta = new TextArea();
            newp.getChildren().add(ta);
            ta.setText(a.getLabel());
            ta.setLayoutX(100);
            ta.setLayoutY(5);
            ta.setPrefHeight(80);
            ta.setPrefWidth(200);


            ImageView iv = new ImageView();
            newp.getChildren().add(iv);
            iv.setImage(new Image(a.getImage()));
            iv.setLayoutX(5);
            iv.setLayoutY(5);
            iv.setFitHeight(80);
            iv.setFitWidth(80);
            tabel.getChildren().add(newp);
            i++;
            Button b = new Button();
            b.setText("Delete");
            b.setOnAction((evt) -> {
                AddArticlesService.deleteArticle(a.getLabel());
                handleRomanian();
            });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    event -> {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        VBox dialogVbox = new VBox(10);
                        dialogVbox.resize(1, 1);
                        dialogVbox.getChildren().add(new Text(a.getLabel()));
                        Scene dialogScene = new Scene(dialogVbox, 600, 600);
                        dialog.setScene(dialogScene);
                        dialog.show();
                        dialogVbox.getChildren().add(new ImageView(a.getImage()));
                    });
            newp.getChildren().add(w);
            tabel.setPrefHeight(i * 100);
        }
    }

    public void handleFrench() {
        int i = 0;
        for (Article a : AddArticlesService.ReadLanguageArticleFromDatabase("French")) {
            Pane newp = new Pane();
            newp.setLayoutX(0);
            newp.setLayoutY(100 * i);
            newp.prefHeight(100);
            newp.prefWidth(400);
            TextArea ta = new TextArea();
            newp.getChildren().add(ta);
            ta.setText(a.getLabel());
            ta.setLayoutX(100);
            ta.setLayoutY(5);
            ta.setPrefHeight(80);
            ta.setPrefWidth(200);


            ImageView iv = new ImageView();
            newp.getChildren().add(iv);
            iv.setImage(new Image(a.getImage()));
            iv.setLayoutX(5);
            iv.setLayoutY(5);
            iv.setFitHeight(80);
            iv.setFitWidth(80);
            tabel.getChildren().add(newp);
            i++;
            Button b = new Button();
            b.setText("Delete");
            b.setOnAction((evt) -> {
                AddArticlesService.deleteArticle(a.getLabel());
                handleFrench();
            });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    event -> {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        VBox dialogVbox = new VBox(10);
                        dialogVbox.resize(1, 1);
                        dialogVbox.getChildren().add(new Text(a.getLabel()));
                        Scene dialogScene = new Scene(dialogVbox, 600, 600);
                        dialog.setScene(dialogScene);
                        dialog.show();
                        dialogVbox.getChildren().add(new ImageView(a.getImage()));

                    });
            newp.getChildren().add(w);
            tabel.setPrefHeight(i * 100);
        }
    }

    public void handleGerman() {
        int i = 0;
        for (Article a : AddArticlesService.ReadLanguageArticleFromDatabase("German")) {
            Pane newp = new Pane();
            newp.setLayoutX(0);
            newp.setLayoutY(100 * i);
            newp.prefHeight(100);
            newp.prefWidth(400);
            TextArea ta = new TextArea();
            newp.getChildren().add(ta);
            ta.setText(a.getLabel());
            ta.setLayoutX(100);
            ta.setLayoutY(5);
            ta.setPrefHeight(80);
            ta.setPrefWidth(200);


            ImageView iv = new ImageView();
            newp.getChildren().add(iv);
            iv.setImage(new Image(a.getImage()));
            iv.setLayoutX(5);
            iv.setLayoutY(5);
            iv.setFitHeight(80);
            iv.setFitWidth(80);
            tabel.getChildren().add(newp);
            i++;
            Button b = new Button();
            b.setText("Delete");
            b.setOnAction((evt) -> {
                AddArticlesService.deleteArticle(a.getLabel());
                handleGerman();
            });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    event -> {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        VBox dialogVbox = new VBox(10);
                        dialogVbox.resize(1, 1);
                        dialogVbox.getChildren().add(new Text(a.getLabel()));
                        Scene dialogScene = new Scene(dialogVbox, 600, 600);
                        dialog.setScene(dialogScene);
                        dialog.show();
                        dialogVbox.getChildren().add(new ImageView(a.getImage()));
                    });
            newp.getChildren().add(w);
            tabel.setPrefHeight(i * 100);
        }
    }

    public void handleSpanish() {
        int i = 0;
        for (Article a : AddArticlesService.ReadLanguageArticleFromDatabase("Spanish")) {
            Pane newp = new Pane();
            newp.setLayoutX(0);
            newp.setLayoutY(100 * i);
            newp.prefHeight(100);
            newp.prefWidth(400);
            TextArea ta = new TextArea();
            newp.getChildren().add(ta);
            ta.setText(a.getLabel());
            ta.setLayoutX(100);
            ta.setLayoutY(5);
            ta.setPrefHeight(80);
            ta.setPrefWidth(200);


            ImageView iv = new ImageView();
            newp.getChildren().add(iv);
            iv.setImage(new Image(a.getImage()));
            iv.setLayoutX(5);
            iv.setLayoutY(5);
            iv.setFitHeight(80);
            iv.setFitWidth(80);
            tabel.getChildren().add(newp);
            i++;
            Button b = new Button();
            b.setText("Delete");
            b.setOnAction((evt) -> {
                AddArticlesService.deleteArticle(a.getLabel());
                handleSpanish();
            });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    event -> {
                        final Stage dialog = new Stage();
                        dialog.initModality(Modality.APPLICATION_MODAL);
                        VBox dialogVbox = new VBox(10);
                        dialogVbox.resize(1, 1);
                        dialogVbox.getChildren().add(new Text(a.getLabel()));
                        Scene dialogScene = new Scene(dialogVbox, 600, 600);
                        dialog.setScene(dialogScene);
                        dialog.show();
                        dialogVbox.getChildren().add(new ImageView(a.getImage()));
                    });
            newp.getChildren().add(w);
            tabel.setPrefHeight(i * 100);
        }
    }


}


