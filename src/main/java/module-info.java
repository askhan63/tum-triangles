module com.example.tumtriangle {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.checkerframework.checker.qual;


    opens com.example.tumtriangle to javafx.fxml;
    exports com.example.tumtriangle;
}