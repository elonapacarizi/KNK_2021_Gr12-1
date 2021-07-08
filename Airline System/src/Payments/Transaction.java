package Payments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 *
 * @author freec
 */
public class Transaction extends Application {
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Payments/FXMLDocument.fxml"));
         primaryStage.initStyle(StageStyle.UNDECORATED);
         


        Scene scene = new Scene(root);
        KeyCombination kc1= new KeyCodeCombination(KeyCode.N, KeyCodeCombination.CONTROL_DOWN);
        Runnable rn1 = ()-> {
            try {
                start1(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        scene.getAccelerators().put(kc1, rn1);
