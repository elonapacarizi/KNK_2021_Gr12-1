
package Print_Details;

import Payments.*;
package Print_Details;

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
public class Printing_press extends Application {
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Print_Details/FXMLDocument.fxml"));
         primaryStage.initStyle(StageStyle.UNDECORATED);
         

        Scene scene = new Scene(root);

        KeyCombination kc= new KeyCodeCombination(KeyCode.Z, KeyCodeCombination.CONTROL_DOWN);
        Runnable rn = ()-> System.exit(0);
        KeyCombination kc2= new KeyCodeCombination(KeyCode.B, KeyCodeCombination.CONTROL_DOWN);
        Runnable rn2 = ()-> {
            try {
                start2(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        };
        scene.getAccelerators().put(kc2, rn2);

        KeyCombination kc1= new KeyCodeCombination(KeyCode.E, KeyCodeCombination.CONTROL_DOWN);
        Runnable rn1 = ()-> System.exit(0);
        scene.getAccelerators().put(kc1, rn1);
        primaryStage.setScene(scene);
         primaryStage.show();
    }
    public void start1(Stage primaryStage) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("/Info/FXMLDocument.fxml"));
        Scene scene = new Scene(root1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void start2(Stage primaryStage) throws Exception{
        Parent root1 = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
        Scene scene = new Scene(root1);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
