module com.example.fxdemo {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.fxdemo to javafx.fxml;
    exports com.example.fxdemo;
}