module com.example.ejemplo_label {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejemplo_label to javafx.fxml;
    exports com.example.ejemplo_label;
}