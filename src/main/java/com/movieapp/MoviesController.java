package com.movieapp;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.scene.text.*;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.movieapp.Movie;
import com.movieapp.Movies;

public class MoviesController {

    @FXML
    private Text dataText;

    @FXML
    private ListView<String> moviesListView;

    private ObservableList<String> movieData = FXCollections.observableArrayList("Single", "Double", "Suite",
            "Family App");

    @FXML
    public VBox root;

    public static String data = "";

    public MoviesController() {
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

                // Gson gson = new Gson();
                // String jsonString = "[{\"title\":\"The Shawshank
                // Redemption\",\"year\":1994,\"genres\":[\"Crime\",\"Drama\"]},{\"title\":\"The
                // Godfather\",\"year\":1972,\"genres\":[\"Crime\",\"Drama\"]}]";
                // Movies obj = gson.fromJson(jsonString, Movies.class);
                // List<Movie> movies = gson.fromJson(data, new TypeToken<List<Movie>>() {
                // }.getType());
                // System.out.println(movies.get(0).getTitle());

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @FXML
    void initialize() {

        // ObservableList<String> items = FXCollections.observableArrayList("Single",
        // "Double", "Suite",
        // "Family App");
        // moviesListView.setItems(movieData);

        dataText.setText(data);
    }

    @FXML
    private void switchToSecondary() throws IOException {
        // App.setRoot("secondary");
    }
}
