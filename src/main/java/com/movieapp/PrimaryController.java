package com.movieapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.text.*;
import javafx.beans.property.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PrimaryController {

    @FXML
    public Text dataText;

    @FXML
    public VBox root;

    public static String data = "";

    public PrimaryController() {
        try {
            HttpURLConnection connection = (HttpURLConnection) new URL(
                    "https://ytjsqesg4o2cjlpo74vzrkx5qa0cwjmn.lambda-url.us-west-2.on.aws/").openConnection();

            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                data = "";
                Scanner scanner = new Scanner(connection.getInputStream());
                while (scanner.hasNextLine()) {
                    data += scanner.nextLine();
                    data += "\n";
                }
                scanner.close();

                System.out.println(data);
                dataText = new Text();
                dataText.setText("Hello, JavaFX!");
                dataText.setX(50);
                dataText.setY(50);
                dataText.setFont(new Font(24));

                VBox root = new VBox();
                root.getChildren().add(dataText);
                dataText.setText("Hello");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private void switchToSecondary() throws IOException {
        // App.setRoot("secondary");
    }
}
