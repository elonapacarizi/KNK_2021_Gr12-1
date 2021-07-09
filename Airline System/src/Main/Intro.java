
package Main;

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
import javafx.scene.text.Text;

public class Intro extends Application {
   Text text= new Text();
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Main/FXMLDocument.fxml"));
       primaryStage.initStyle(StageStyle.UNDECORATED);
      
        
         Scene scene = new Scene(root, 1280, 720);

        KeyCombination kc= new KeyCodeCombination(KeyCode.Z, KeyCodeCombination.CONTROL_DOWN);
        Runnable rn = ()-> System.exit(0);
        scene.getAccelerators().put(kc, rn);
        primaryStage.setScene(scene);
         primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        
    }
    
}
