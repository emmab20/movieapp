package com.movieapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("movies.fxml"));

        Scene scene = new Scene(root, 300, 275);

        stage.setTitle("Movies App");
        stage.setScene(scene);
        stage.show();

        // primaryStage.setTitle("Movie App");

        // GridPane grid = new GridPane();
        // grid.setAlignment(Pos.CENTER);
        // grid.setHgap(10);
        // grid.setVgap(10);
        // grid.setPadding(new Insets(25, 25, 25, 25));

        // Text scenetitle = new Text("Welcome");
        // scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        // grid.add(scenetitle, 0, 0, 2, 1);

        // Label userName = new Label("User Name:");
        // grid.add(userName, 0, 1);

        // TextField userTextField = new TextField();
        // grid.add(userTextField, 1, 1);

        // Label pw = new Label("Password:");
        // grid.add(pw, 0, 2);

        // PasswordField pwBox = new PasswordField();
        // grid.add(pwBox, 1, 2);

        // Scene scene = new Scene(grid, 300, 275);
        // primaryStage.setScene(scene);

        // primaryStage.show();
    }
}

// package com.movieapp;

// import javafx.application.Application;
// import javafx.fxml.FXMLLoader;
// import javafx.scene.Parent;
// import javafx.scene.Scene;
// import javafx.stage.Stage;

// import java.io.IOException;

// /**
// * JavaFX App
// */
// public class App extends Application {

// private static Scene scene;

// @Override
// public void start(Stage stage) throws IOException {

// // scene = new Scene(loadFXML("primary"), 640, 480);
// // stage.setScene(scene);
// // stage.show();

// Parent root =
// FXMLLoader.load(getClass().getClassLoader().getResource("primary.fxml"));
// Scene scene = new Scene(root, 640, 480);
// stage.setScene(scene);
// stage.show();

// }

// static void setRoot(String fxml) throws IOException {
// scene.setRoot(loadFXML(fxml));
// }

// private static Parent loadFXML(String fxml) throws IOException {
// FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml +
// ".fxml"));
// return fxmlLoader.load();
// }

// public static void main(String[] args) {
// launch();
// }

// }