

package Booking_Interface;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Home extends Application {
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
         primaryStage.initStyle(StageStyle.UNDECORATED);
        
        
         Scene scene = new Scene(root);

        KeyCombination kc= new KeyCodeCombination(KeyCode.Z, KeyCodeCombination.CONTROL_DOWN);
        Runnable rn = ()-> System.exit(0);
        scene.getAccelerators().put(kc, rn);




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
