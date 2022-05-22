package org.loose.fis.sre;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import org.loose.fis.sre.services.FileSystemService;
import org.loose.fis.sre.services.UserService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Main extends Application {
   // int screenWidth = (int) Screen.getPrimary().getBounds().getWidth();
   // int screenHeight = (int) Screen.getPrimary().getBounds().getHeight();

    private static Stage stg;

    @Override
    public void start(Stage primaryStage) throws Exception {
        initDirectory();
        UserService.initDatabase();
        //Parent root = null;
        /*try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Login.fxml")));

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        primaryStage.setTitle("VNews!");
        /*
        int sceneWidth = 600;
        int sceneHeight = 600;
        if (screenWidth <= 800 && screenHeight <= 600) {
            sceneWidth = 600;
            sceneHeight = 650;
        } else if (screenWidth <= 1280 && screenHeight <= 768) {
            sceneWidth = 800;
            sceneHeight = 650;
        } else if (screenWidth <= 1920 && screenHeight <= 1080) {
            sceneWidth = 1000;
            sceneHeight = 650;
        }

        primaryStage.setScene(new Scene(root, sceneWidth, sceneHeight));
        primaryStage.show();
        */
        ////
        stg = primaryStage;
       primaryStage.setResizable(false);
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("Login.fxml")));
        primaryStage.setScene(new Scene(root, 400,370));
        primaryStage.show();
        ////
    }

    public void changeScene(String fxml) throws IOException {

            Parent pane = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource(fxml)));
            stg.getScene().setRoot(pane);


    }

    private void initDirectory() {
        Path applicationHomePath = FileSystemService.APPLICATION_HOME_PATH;
        if (!Files.exists(applicationHomePath))
            applicationHomePath.toFile().mkdirs();
    }

    public static void main(String[] args)
    {

        launch(args);
    }
}
