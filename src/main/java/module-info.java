module com.example.mousemovement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mousemovement to javafx.fxml;
    exports com.example.mousemovement;
}