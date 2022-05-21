package org.loose.fis.sre.services;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import org.dizitart.no2.Cursor;
import org.dizitart.no2.Document;
import org.dizitart.no2.NitriteCollection;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;
import org.loose.fis.sre.model.Article;

import java.util.List;

public class AddArticlesService {

    public static ObjectRepository<Article> articleRepository;



    public static void printEnglishArticle()
    {
        try {
            NitriteCollection n = articleRepository.getDocumentCollection();
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



    public static void addArticle(String imageAdress, String label, String detectLanguage)
    {
         articleRepository.insert(new Article(imageAdress,label, detectLanguage));
       // printArticle();
    }


    public static List<Article> ReadLanguageArticleFromDatabase(String language)
    {
        return articleRepository.find(ObjectFilters.eq("detectLanguage",language)).toList();

    }


}
