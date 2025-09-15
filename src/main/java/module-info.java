module com.masanz.prog.mr {

    requires org.apache.logging.log4j.core;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens edu.masanz.prog.pintar.controller to javafx.fxml;
    opens edu.masanz.prog.pintar.app to javafx.fxml;
    exports edu.masanz.prog.pintar;
    exports edu.masanz.prog.pintar.app;
    exports edu.masanz.prog.pintar.controller;

}