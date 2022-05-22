package org.loose.fis.sre.model;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import org.dizitart.no2.objects.Id;

import java.util.Objects;

public class Article {

    private String imageAdress;
    @Id
    private String label;

    public String getDetectLanguage() {
        return detectLanguage;
    }

    public void setDetectLanguage(String detectLanguage) {
        this.detectLanguage = detectLanguage;
    }

    private String detectLanguage;


    public Article(String imageAdress, String label, String detectLanguage) {
        this.imageAdress = imageAdress;
        this.label = label;
        this.detectLanguage = detectLanguage;

    }

    public Article() {
    }

///user-ul pt login
    /*public User(String username, String encodePassword) {
        this.username = username;
        this.password = password;
    }*/

    public String getImage() {
        return imageAdress;
    }

    public void setImage(String imageAdress) {
        this.imageAdress = imageAdress;
    }

    public  String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(imageAdress, article.imageAdress) && Objects.equals(label, article.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageAdress, label);
    }
}


