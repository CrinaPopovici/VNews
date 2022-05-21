package org.loose.fis.sre.controllers;

import javafx.event.ActionEvent;
import org.loose.fis.sre.Main;

import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class MainVoluntarControler {
    public void LogOff(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("Login.fxml");
    }

    public void MainLogin(ActionEvent actionEvent) {
        Main m = new Main();
        m.changeScene("MainLogin.fxml");
    }

    /*public <ActionLink> void Link(ActionEvent actionEvent) {
        Desktop BrowserUtil = null;
        ActionLink externalLink = new ActionLink("External link", event->BrowserUtil.browse(URI.create("http://google.com")));
        externalLink.setExternalLinkIcon();
    }*/
    public void Link(ActionEvent actionEvent) {
        //Main m = new Main();
        try{
            Desktop.getDesktop().browse(new URL("https://ro.yahoo.com/").toURI());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    public void handleHome(ActionEvent actionEvent) {
    }

    public void handleEnglish(ActionEvent actionEvent) {
    }

    public void handleRomanian(ActionEvent actionEvent) {
    }

    public void handleFrench(ActionEvent actionEvent) {
    }

    public void handleGerman(ActionEvent actionEvent) {
    }

    public void handleSpanish(ActionEvent actionEvent) {
    }
}
