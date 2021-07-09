
package Main;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.io.File;
import java.io.IOException;
import java.net.URI;

public class FXMLDocumentController implements Initializable {

  
    
    
    
    
     static File file = new File("C:/Program Files/Airline System/src/Videos/Intro.mp4");

static URI p= file.toURI(); 

  static    Media m= new Media(p.toString());
    static   MediaPlayer mp= new MediaPlayer(m);
       
      @FXML
   public MediaView mv;

   
    @FXML
    private Label text;
   
   @FXML
   private Button skip;
  
   
    @FXML
    private void Onskip(ActionEvent event) throws IOException {
    

         mp.stop();
             Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
        Stage primaryStage= new Stage();
    primaryStage.initStyle(StageStyle.UNDECORATED);
      
        
         Scene scene = new Scene(root);
        primaryStage.setScene(scene);
         primaryStage.show();

     Stage stage = (Stage) skip.getScene().getWindow();
 
    stage.close();
    
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
       
      
       mv.setFitHeight(720);
       mv.setFitWidth(1280);
        mv.setMediaPlayer(mp);
       mp.play();
       if(mp.getStatus()==MediaPlayer.Status.STOPPED){
              

   
          new  Stage().close();
 
       }
    }    
                               

    
}
