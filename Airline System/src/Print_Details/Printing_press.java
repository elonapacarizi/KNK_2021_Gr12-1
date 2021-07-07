
package Print_Details;

import Payments.*;
import Info.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Printing_press extends Application {
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Print_Details/FXMLDocument.fxml"));
         primaryStage.initStyle(StageStyle.UNDECORATED);
         
         
        Scene scene = new Scene(root);
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
