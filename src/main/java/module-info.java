module com.example.exerciciosestruturadedados {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exerciciosestruturadedados to javafx.fxml;
    exports com.example.exerciciosestruturadedados;
}