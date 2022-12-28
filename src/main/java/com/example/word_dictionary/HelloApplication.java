package com.example.word_dictionary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    public static Group root;
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DictionaryPage.fxml"));

        root = new Group();
        stage.setTitle("Word Dictionary");

        DictionaryPage page = new DictionaryPage();
        root.getChildren().add(page.root);

        //Scene scene = new Scene(fxmlLoader.load(), 500, 500);
        Scene scene = new Scene(root, 500, 550);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}