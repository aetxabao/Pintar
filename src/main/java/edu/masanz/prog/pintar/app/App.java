package edu.masanz.prog.pintar.app;

import edu.masanz.prog.pintar.Main;
import edu.masanz.prog.pintar.utils.Exec;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.URL;

public class App extends Application {

    public static final URL URL_MAIN_VIEW = Main.class.getResource("/edu/masanz/prog/pintar/view/pintar.fxml");
    public static final double APP_WIDTH = 800;//1152;
    public static final double APP_HEIGHT = 600;//864;
    public static final String APP_TITLE = "Pintar";

    private static Logger log = LogManager.getLogger();

    @Override
    public void start(Stage stage) throws IOException {

        log.info("-".repeat(64));
        log.info(Exec.getHostName());
        log.info("-".repeat(64));

        FXMLLoader fxmlLoader = new FXMLLoader(URL_MAIN_VIEW);
        Scene scene = new Scene(fxmlLoader.load(), APP_WIDTH, APP_HEIGHT);
        stage.setTitle(APP_TITLE);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}