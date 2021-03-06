package org.loose.fis.sre.services;

import org.dizitart.no2.Cursor;
import org.dizitart.no2.Document;
import org.dizitart.no2.NitriteCollection;
import org.dizitart.no2.objects.ObjectRepository;
import org.dizitart.no2.objects.filters.ObjectFilters;
import org.loose.fis.sre.Main;
import org.loose.fis.sre.model.Article;

import java.io.IOException;
import java.util.List;

public class AddArticlesService {

    public static ObjectRepository<Article> articleRepository;


    public static void printEnglishArticle() {
        try {
            NitriteCollection n = articleRepository.getDocumentCollection();
            Cursor x = n.find();
            for (Document keyValuePairs : x) {
                System.out.println(keyValuePairs.get("image") + " " + keyValuePairs.get("label"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public static void addArticle(String imageAdress, String label, String detectLanguage) {
        articleRepository.insert(new Article(imageAdress, label, detectLanguage));
    }


    public static List<Article> ReadLanguageArticleFromDatabase(String language) {
        return articleRepository.find(ObjectFilters.eq("detectLanguage", language)).toList();

    }

    public static void deleteArticle(String label) {
        articleRepository.remove(ObjectFilters.eq("label", label));
    }

    public static void goToArticle() throws IOException {
        Main m = new Main();
        m.changeScene("OpenArticles.fxml");
    }


}
