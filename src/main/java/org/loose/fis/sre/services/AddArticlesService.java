package org.loose.fis.sre.services;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import org.dizitart.no2.Cursor;
import org.dizitart.no2.Document;
import org.dizitart.no2.Nitrite;
import org.dizitart.no2.NitriteCollection;
import org.dizitart.no2.objects.ObjectRepository;
import org.h2.mvstore.Page;
import org.loose.fis.sre.exceptions.IncorrectCodeException;
import org.loose.fis.sre.exceptions.IncorrectUsernameException;
import org.loose.fis.sre.exceptions.UsernameAlreadyExistsException;
import org.loose.fis.sre.model.Article;
import org.loose.fis.sre.model.User;

import javax.swing.*;

import java.util.Calendar;
import java.util.Objects;

import static javax.swing.text.StyleConstants.setIcon;
import static org.loose.fis.sre.services.FileSystemService.getPathToFile;

public class AddArticlesService {

    private static ObjectRepository<Article> userRepository;

    public static void initDatabase() {
        Nitrite database = Nitrite.builder()
                .filePath(getPathToFile("VNews.db").toFile())
                .openOrCreate("test", "test");

        userRepository = database.getRepository(Article.class);
    }

    public static void printEnglishArticle()
    {
        try {
            NitriteCollection n = userRepository.getDocumentCollection();
            Cursor x = n.find();
            for (Document keyValuePairs : x)
            {
//cand apas pe "english article" din AddArticles trebuie sa imi stocheze articolul in english articles-ul din MainLogin
               // Article.setArticle(new Image(f.toURI().toString()));

                //...afiseaza articolul pe mainLogin
                System.out.println(keyValuePairs.get("image") + " " + keyValuePairs.get("label"));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());}
    }



    public static void addArticle(Image image, Label label) {
         userRepository.insert(new Article(image,label));
       // printArticle();
    }

    /*
    public static boolean ReadArticleFromDatabase() {
        for (Article article : userRepository.find()) {
           // if ();
                //return true;
        }
    }*/


}
