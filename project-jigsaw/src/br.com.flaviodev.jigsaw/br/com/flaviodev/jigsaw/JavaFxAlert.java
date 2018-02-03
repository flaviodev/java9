package br.com.flaviodev.jigsaw;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;


public class JavaFxAlert extends Application {
    @Override
    public void start(final Stage primaryStage) throws Exception {
	final Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("using javafx modules");

        primaryStage.setScene(new Scene(new Group(), 300, 300, Color.BLACK));

        alert.initOwner(primaryStage);

        alert.showAndWait();
    }

    public static void main(final String... args) {
        launch(args);
    }
}
