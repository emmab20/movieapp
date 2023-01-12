package com.movieapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.beans.property.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class PrimaryController {

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
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
