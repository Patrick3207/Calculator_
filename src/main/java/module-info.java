module com.example.calculator_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculator_ to javafx.fxml;
    exports com.example.calculator_;
}