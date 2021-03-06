package Register;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Register extends Application {
   
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/Register/FXMLDocument.fxml"));
         primaryStage.initStyle(StageStyle.UNDECORATED);
      
        
         Scene scene = new Scene(root);
        primaryStage.setScene(scene);
         primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}