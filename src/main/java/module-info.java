module com.movieapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;

    opens com.movieapp to javafx.fxml;

    exports com.movieapp;
}
