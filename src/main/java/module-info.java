module com.example.cowfarm {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.cowfarm to javafx.fxml;
    exports com.example.cowfarm;
}