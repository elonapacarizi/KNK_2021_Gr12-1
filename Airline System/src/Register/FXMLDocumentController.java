
package Register;

import java.io.IOException;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.DoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import static javafx.scene.media.MediaPlayer.Status.PLAYING;
import javafx.scene.media.MediaView;
import Login.RFXMLDocumentController;
import java.io.File;
import java.net.URI;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class FXMLDocumentController implements Initializable {
    //-------------------------
    @FXML
   public MediaView mv;
    
   

    static File file = new File("C:/Program Files/Airline System/src/Videos/Register.mp4");

static URI p= file.toURI(); 

  static    Media m= new Media(p.toString());
           
           
           
           
   public static   MediaPlayer mp= new MediaPlayer(m);

    //-----------------------------
   @FXML
  private Pane rootpane;
     
   public static int j=1;
   @FXML
   private Button skip;
   @FXML
   private Button RSignIn;
   @FXML
   public  TextField RUser;
   
   @FXML
   private TextField User;
   @FXML
   private PasswordField Pass;
   
   @FXML
   private CheckBox Rji;
   @FXML
   private TextField Cap;
   @FXML
   private TextField RNick;
   @FXML
   public  PasswordField RPass;
     @FXML
   private TextField FakePass;
      @FXML
   private Button Submit;
  
   @FXML
   private void OnShow() {
           if(Rji.isSelected()){
           
    FakePass.setText(RPass.getText());
    FakePass.setVisible(true);
    RPass.setVisible(false);
    return;
           

   }



