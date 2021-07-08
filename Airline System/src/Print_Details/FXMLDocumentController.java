package Print_Details;

import Payments.*;
import Info.*;

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
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;

      @FXML
  private Pane rootpane;


    
    
    
   
@FXML
private AnchorPane ap;
   
    
    
    
    
       
    
    @FXML
    public Label tc,ti,n,c,p,pa,t,m,f;
    
    @FXML
   private Button back;
   @FXML
   private Button exit;

 @FXML
    private void Onback(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
           Stage window= (Stage)back.getScene().getWindow();
           window.setScene(new Scene(root));
           window.centerOnScreen();
    }
    
    @FXML
    private void Onnext(ActionEvent event) throws IOException {

        Stage stage = (Stage) exit.getScene().getWindow();

        stage.close();
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ap.setBackground(Background.EMPTY);
         File Des = new File("C:/Program Files/Airline System/src/Text_Files/From.txt");
        File Des1 = new File("C:/Program Files/Airline System/src/Text_Files/To.txt");

        File payments = new File("C:/Program Files/Airline System/src/Text_Files/payment.txt");

        File name = new File("C:/Program Files/Airline System/src/Text_Files/name.txt");
        File phone= new File("C:/Program Files/Airline System/src/Text_Files/phone.txt");

        File ticket = new File("C:/Program Files/Airline System/src/Text_Files/Ticket.txt");

        File plane = new File("C:/Program Files/Airline System/src/Text_Files/PlaneClass.txt");

        File time= new File("C:/Program Files/Airline System/src/Text_Files/time.txt");

        File passeneger = new File("C:/Program Files/Airline System/src/Text_Files/passenger.txt");






