
package Payments;

import Info.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;

import javax.swing.*;


public class FXMLDocumentController implements Initializable {
    //-----------------
  
    
      @FXML
  private Pane rootpane;
    
    
    
   
@FXML
private AnchorPane ap;
   
    
    
    
    
       
    
    //---------
    @FXML
    private TextField date,cvv,name,pass, phone;

    @FXML
    private RadioButton Credit,Net,Google,Paypal,ab,en;
    @FXML
    private DatePicker Cdate;
    @FXML
    private Label cp,cpm;
    @FXML
   private Button back;
   @FXML
   private Button next;
    @FXML
    private Button exit;
    @FXML
    public void KeysN(KeyEvent event) throws IOException{
        if (event.getCode() == KeyCode.ENTER) {

            Parent root = FXMLLoader.load(getClass().getResource("/Seats/FXMLDocument.fxml"));
            Stage window= (Stage)next.getScene().getWindow();
            window.setScene(new Scene(root));
            window.centerOnScreen();
        }
        else if(event.getCode() == KeyCode.ESCAPE){

            Parent root = FXMLLoader.load(getClass().getResource("/Info/FXMLDocument.fxml"));
            Stage window= (Stage)back.getScene().getWindow();
            window.setScene(new Scene(root));
            window.centerOnScreen();
        }
        else if(event.getCode() == KeyCode.CONTROL){

            System.exit(0);
        }
    }
    
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

        Parent root = FXMLLoader.load(getClass().getResource("/Seats/FXMLDocument.fxml"));
        Stage window= (Stage)next.getScene().getWindow();
        window.setScene(new Scene(root));
        window.centerOnScreen();
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
     ap.setBackground(Background.EMPTY);
       }
    
                               

    
}
