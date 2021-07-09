
package Seats;

import Info.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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
import java.util.ResourceBundle;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;


public class FXMLDocumentController implements Initializable {

      @FXML
  private Pane rootpane;
   
@FXML
private AnchorPane ap;
   
    
    @FXML
   private Button Print,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
  
      
    
    @FXML
    private void Printing(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Print_Details/FXMLDocument.fxml"));
        Stage window= (Stage)Print.getScene().getWindow();
        window.setScene(new Scene(root));
        window.centerOnScreen();
    
      
    }
    @FXML
    private void OnButtons1(ActionEvent event) throws IOException {

        message("Your Ticket No. Is- AXCr3je809");
        FileOutputStream out = null;
        File filet = new File("C:/Program Files/Airline System/src/Text_Files/Ticket.txt");

        String f=filet.getAbsolutePath();

        String text = "AXCr3je809";
        byte b[] = text.getBytes();

        String outputFileName = System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out = new FileOutputStream(f);
        out.write(b);
        out.close();
    }
    @FXML
    private void OnButtons2(ActionEvent event) throws IOException {
        message("Your Ticket No. Is- Damse809");
        FileOutputStream out = null;
        File filet = new File("C:/Program Files/Airline System/src/Text_Files/Ticket.txt");

        String f=filet.getAbsolutePath();

        String text = "Damse809";
        byte b[] = text.getBytes();

        String outputFileName = System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out = new FileOutputStream(f);
        out.write(b);
        out.close();
    }
    @FXML
    private void OnButtons3(ActionEvent event) throws IOException {
        message("Your Ticket No. Is- DJeruse8037");
        FileOutputStream out = null;
        File filet = new File("C:/Program Files/Airline System/src/Text_Files/Ticket.txt");

        String f=filet.getAbsolutePath();

        String text = "DJeruse8037";
        byte b[] = text.getBytes();

        String outputFileName = System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out = new FileOutputStream(f);
        out.write(b);
        out.close();
    }
    @FXML
    private void OnButtons4(ActionEvent event) throws IOException {
        message("Your Ticket No. Is- DAcrese88df09");
        FileOutputStream out = null;
        File filet = new File("C:/Program Files/Airline System/src/Text_Files/Ticket.txt");

        String f=filet.getAbsolutePath();

        String text = "DAcrese88df09";
        byte b[] = text.getBytes();

        String outputFileName = System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out = new FileOutputStream(f);
        out.write(b);
        out.close();
    }
    private void message(String x){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(x);
        alert.show();


    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      

       }
    
                               

    
}