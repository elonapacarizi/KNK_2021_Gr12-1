
package Booking_Interface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import Info.IFXMLDocumentController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author freec
 */
public class FXMLDocumentController implements Initializable {

    
    @FXML
   private Button skip;
    @FXML
   private Button welcome;
     @FXML
   private Button login;
      @FXML
   private Button register;
       @FXML
   private Button help; 
       @FXML
   private Button about;
   @FXML
   private Button admin;
 @FXML
 private RadioButton ab,en;
  
  @FXML
   private ImageView main;
    @FXML
    private Label l1,l2;
  
    
     @Override
     
    public void initialize(URL url, ResourceBundle rb) {

    } 
    
    
    @FXML
    private void Onskip(ActionEvent event) {
      
     Stage stage = (Stage) skip.getScene().getWindow();
 
    stage.close();
  
    }
    
     @FXML
    private void OnHelp(ActionEvent event) {
      

    }
    
    
     @FXML
    private void onAdmin(ActionEvent event) {

  
    }
    
    
    
    
}
    
