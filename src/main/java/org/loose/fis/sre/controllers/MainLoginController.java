package org.loose.fis.sre.controllers;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
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
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.model.Article;
import org.loose.fis.sre.services.AddArticlesService;
import org.loose.fis.sre.services.UserService;

import java.io.IOException;

public class MainLoginController {
    public AnchorPane tabel;

    public void BacktoLogin(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("Login.fxml");
    }

    public void goToArticle(ActionEvent actionEvent) throws IOException {
        Main m = new Main();
        m.changeScene("AddArticles.fxml");
    }

    public MenuItem EnglishFx, HomeFx, RomanianFx, FrenchFx, SpanishFx;
    public void handleHome(ActionEvent actionEvent){

    }
    public void handleEnglish(ActionEvent actionEvent){
        int i=0;
        for(Article a : AddArticlesService.ReadLanguageArticleFromDatabase("English")){
            Pane newp = new Pane();
            newp.setLayoutX(0);
            newp.setLayoutY(100*i);
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
            b.setText("delete");
            b.setOnAction((evt) -> {AddArticlesService.deleteArticle(a.getLabel());handleEnglish(evt); });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            final Stage dialog = new Stage();
                            dialog.initModality(Modality.APPLICATION_MODAL);
                            VBox dialogVbox = new VBox(10);
                            dialogVbox.resize(1,1);
                            dialogVbox.getChildren().add(new Text(a.getLabel()));
                            Scene dialogScene = new Scene(dialogVbox, 600, 600);
                            dialog.setScene(dialogScene);
                            dialog.show();
                            dialogVbox.getChildren().add(new ImageView(a.getImage()));
                        }
                    });
            newp.getChildren().add(w);
        tabel.setPrefHeight(i*100);
    }}
    public void handleRomanian(ActionEvent actionEvent){
        int i=0;
        for(Article a : AddArticlesService.ReadLanguageArticleFromDatabase("Romanian")){
            Pane newp = new Pane();
            newp.setLayoutX(0);
            newp.setLayoutY(100*i);
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
            b.setText("delete");
            b.setOnAction((evt) -> {AddArticlesService.deleteArticle(a.getLabel());handleRomanian(evt); });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            final Stage dialog = new Stage();
                            dialog.initModality(Modality.APPLICATION_MODAL);
                            VBox dialogVbox = new VBox(10);
                            dialogVbox.resize(1,1);
                            dialogVbox.getChildren().add(new Text(a.getLabel()));
                            Scene dialogScene = new Scene(dialogVbox, 600, 600);
                            dialog.setScene(dialogScene);
                            dialog.show();
                            dialogVbox.getChildren().add(new ImageView(a.getImage()));
                        }
                    });
            newp.getChildren().add(w);
        tabel.setPrefHeight(i*100);
    }}

    public void handleFrench(ActionEvent actionEvent){
        int i=0;
        for(Article a : AddArticlesService.ReadLanguageArticleFromDatabase("French")) {
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
            b.setText("delete");
            b.setOnAction((evt) -> {
                AddArticlesService.deleteArticle(a.getLabel());
                handleFrench(evt);
            });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            final Stage dialog = new Stage();
                            dialog.initModality(Modality.APPLICATION_MODAL);
                            VBox dialogVbox = new VBox(10);
                            dialogVbox.resize(1, 1);
                            dialogVbox.getChildren().add(new Text(a.getLabel()));
                            Scene dialogScene = new Scene(dialogVbox, 600, 600);
                            dialog.setScene(dialogScene);
                            dialog.show();
                            dialogVbox.getChildren().add(new ImageView(a.getImage()));
                            
                        }
                    });
            newp.getChildren().add(w);
            tabel.setPrefHeight(i * 100);
        }
    }
    public void handleGerman(ActionEvent actionEvent){
        int i=0;
        for(Article a : AddArticlesService.ReadLanguageArticleFromDatabase("German")) {
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
            b.setText("delete");
            b.setOnAction((evt) -> {
                AddArticlesService.deleteArticle(a.getLabel());
                handleGerman(evt);
            });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            final Stage dialog = new Stage();
                            dialog.initModality(Modality.APPLICATION_MODAL);
                            VBox dialogVbox = new VBox(10);
                            dialogVbox.resize(1, 1);
                            dialogVbox.getChildren().add(new Text(a.getLabel()));
                            Scene dialogScene = new Scene(dialogVbox, 600, 600);
                            dialog.setScene(dialogScene);
                            dialog.show();
                            dialogVbox.getChildren().add(new ImageView(a.getImage()));
                        }
                    });
            newp.getChildren().add(w);
            tabel.setPrefHeight(i * 100);
        }
    }
    public void handleSpanish(ActionEvent actionEvent){
        int i=0;
        for(Article a : AddArticlesService.ReadLanguageArticleFromDatabase("Spanish")) {
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
            b.setText("delete");
            b.setOnAction((evt) -> {
                AddArticlesService.deleteArticle(a.getLabel());
                handleSpanish(evt);
            });
            newp.getChildren().add(b);

            Button w = new Button();
            w.setLayoutX(50);
            w.setText("Open");
            w.setOnAction(
                    new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            final Stage dialog = new Stage();
                            dialog.initModality(Modality.APPLICATION_MODAL);
                            VBox dialogVbox = new VBox(10);
                            dialogVbox.resize(1, 1);
                            dialogVbox.getChildren().add(new Text(a.getLabel()));
                            Scene dialogScene = new Scene(dialogVbox, 600, 600);
                            dialog.setScene(dialogScene);
                            dialog.show();
                            dialogVbox.getChildren().add(new ImageView(a.getImage()));
                        }
                    });
            newp.getChildren().add(w);
            tabel.setPrefHeight(i * 100);
        }
    }


}


