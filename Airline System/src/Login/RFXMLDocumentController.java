package Login;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.StageStyle;

import Register.FXMLDocumentController;
import javafx.fxml.Initializable;
import javafx.scene.CacheHint;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import Register.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class RFXMLDocumentController implements Initializable {
    
    
  
     static File file = new File("C:/Program Files/Airline System/src/Videos/login.mp4");

static URI pi= file.toURI(); 

  static    Media m= new Media(pi.toString());
    
    public static int nd=0;
    
    
    
      static MediaPlayer mp= new MediaPlayer(m);
       @FXML
   private MediaView mv;
     
 
    @FXML
   private CheckBox ji;
      @FXML
   public Label p;
    
      @FXML
   private TextField User;
       @FXML
   private TextField FakePass;
       @FXML
       private TextField RUser;
          @FXML
       private TextField RPass;
       @FXML
   private PasswordField Pass;
      @FXML
   private Button Sign;
   
   @FXML
   private Button skip;
  
   @FXML
   private void OnShow() {
           if(ji.isSelected()){
           
    FakePass.setText(Pass.getText());
    FakePass.setVisible(true);
    Pass.setVisible(false);
    return;
           

   }
           Pass.setText(FakePass.getText());
           Pass.setVisible(true);
           FakePass.setVisible(false);
      
   }                     
    @FXML
    private void Onskip(ActionEvent event) {
   
       mp.stop();
     Stage stage = (Stage) skip.getScene().getWindow();
 
   stage.close();
    
      
    }
    