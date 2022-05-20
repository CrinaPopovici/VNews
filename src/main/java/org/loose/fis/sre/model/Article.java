package org.loose.fis.sre.model;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import org.dizitart.no2.objects.Id;

import java.util.Objects;

public class Article {
@Id
    private Image image;
    private Label label;


        public Article(Image image, Label label) {
            this.image = image;
            this.label = label;

        }

        public Article() {
         }

///user-ul pt login
    /*public User(String username, String encodePassword) {
        this.username = username;
        this.password = password;
    }*/

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public  Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public void  setArticle()
    {
        setImage(image);
        setLabel(label);

    }
    public void getArticle()
    {
        getImage();
        getLabel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Objects.equals(image, article.image) && Objects.equals(label, article.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, label);
    }
}


