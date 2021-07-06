
package Info;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;


public class FXMLDocumentController implements Initializable {
    //-----------------
  
    
      @FXML
  private Pane rootpane;
    
    
    
   
@FXML
private AnchorPane ap;
   
    
    
    
    
  
    
    @FXML
   private Button back;
   @FXML
   private Button next;
  
       @FXML
    private void Onback(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
           Stage window= (Stage)back.getScene().getWindow();
           window.setScene(new Scene(root));
           window.centerOnScreen();
    }
    
    @FXML
    private void Onnext(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Payments/FXMLDocument.fxml"));
        Stage window= (Stage)next.getScene().getWindow();
        window.setScene(new Scene(root));
        window.centerOnScreen();
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
     ap.setBackground(Background.EMPTY);
       }
    
                               

    
}