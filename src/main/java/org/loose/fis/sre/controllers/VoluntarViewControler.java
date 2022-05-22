package org.loose.fis.sre.controllers;


import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import org.loose.fis.sre.Main;
import javafx.scene.control.MenuItem;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.model.Article;
import org.loose.fis.sre.services.AddArticlesService;
import org.loose.fis.sre.services.UserService;

public class VoluntarViewControler  {
    public AnchorPane tabel;

    public void BacktoLogin(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("Login.fxml");
    }

    public void goToMainVoluntar(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("MainVoluntar.fxml");
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

        }

        tabel.setPrefHeight(i*100);
    }
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

        }

        tabel.setPrefHeight(i*100);
    }

    public void handleFrench(ActionEvent actionEvent){
        int i=0;
        for(Article a : AddArticlesService.ReadLanguageArticleFromDatabase("French")){
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

        }

        tabel.setPrefHeight(i*100);

    }
    public void handleGerman(ActionEvent actionEvent){
        int i=0;
        for(Article a : AddArticlesService.ReadLanguageArticleFromDatabase("German")){
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

        }

        tabel.setPrefHeight(i*100);
    }

    public void handleSpanish(ActionEvent actionEvent){
        int i=0;
        for(Article a : AddArticlesService.ReadLanguageArticleFromDatabase("Spanish")){
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

        }

        tabel.setPrefHeight(i*100);

    }
}


