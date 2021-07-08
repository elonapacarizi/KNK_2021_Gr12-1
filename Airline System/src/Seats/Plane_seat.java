package Seats;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyCombination.Modifier;
import javafx.stage.Stage;

public class Plane_seat extends Application {
    public Plane_seat() {
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/Seats/FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        KeyCombination kc1 = new KeyCodeCombination(KeyCode.N, new Modifier[]{KeyCodeCombination.CONTROL_DOWN});
        Runnable rn1 = () -> {
            try {
                this.start1(primaryStage);
            } catch (Exception var3) {
                var3.printStackTrace();
            }

        };
        scene.getAccelerators().put(kc1, rn1);
        KeyCombination kc = new KeyCodeCombination(KeyCode.Z, new Modifier[]{KeyCodeCombination.CONTROL_DOWN});
        Runnable rn = () -> {
            System.exit(0);
        };
        scene.getAccelerators().put(kc, rn);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void start1(Stage primaryStage) throws Exception {
        Parent root1 = (Parent)FXMLLoader.load(this.getClass().getResource("/Print_Details/FXMLDocument.fxml"));
        Scene scene = new Scene(root1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}