module com.example.csc221_project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc221_project1 to javafx.fxml;
    exports com.example.csc221_project1;
}