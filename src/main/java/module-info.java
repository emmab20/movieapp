module com.movieapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.movieapp to javafx.fxml;

    exports com.movieapp;
}
