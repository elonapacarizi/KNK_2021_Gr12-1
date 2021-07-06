/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package destination;
import Booking_Interface.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.layout.Pane;
import jdk.nashorn.internal.runtime.regexp.joni.ast.AnchorNode;

/**
 *
 * @author freec
 */
public class FXMLDocumentController implements Initializable {
    //-----------------
  
    
      @FXML
  private AnchorPane rootpane;
    
    
     static File file = new File("C:/Program Files/Airline System/src/Videos/Route_Map.mp4");

static URI p= file.toURI(); 

  static    Media m= new Media(p.toString());
    static   MediaPlayer mp= new MediaPlayer(m);
       
      @FXML
   public MediaView mv;

   
    
    
    
    
       
    
    //---------
   
    
    @FXML
   private Button back;
   @FXML
   private Button next;
  
       @FXML
    private void Onback(ActionEvent event) throws IOException {
         mp.stop();
           Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
           Stage window= (Stage)back.getScene().getWindow();
           window.setScene(new Scene(root));
           window.centerOnScreen();


    }
    
    @FXML
    private void Onnext(ActionEvent event) throws IOException {
    

         mp.stop();
        Parent root = FXMLLoader.load(getClass().getResource("/Info/FXMLDocument.fxml"));
        Stage window= (Stage)next.getScene().getWindow();
        window.setScene(new Scene(root,1280,720));
        window.centerOnScreen();
    
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
       
      
       mv.setFitHeight(720);
       mv.setFitWidth(1280);
        mv.setMediaPlayer(mp);
       mp.play();
       if(mp.getStatus()==MediaPlayer.Status.STOPPED){
              

   mp.play();
 
       }
    }    
                               

    
}