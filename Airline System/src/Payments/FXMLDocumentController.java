
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
    private void Onback(ActionEvent event) throws IOException {
           Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
           Stage window= (Stage)back.getScene().getWindow();
           window.setScene(new Scene(root));
           window.centerOnScreen();
    }
    @FXML
    private void OnSelect(ActionEvent event) throws IOException
    {


        LocalDate i = Cdate.getValue();
        date.setText(i.toString());


    }
    @FXML
    private void OnBSelect(ActionEvent event) throws IOException
    {
  if(Google.isSelected()) {
      Credit.setDisable(true); Net.setDisable(true); Paypal.setDisable(true);
      date.setDisable(true);
      Cdate.setDisable(true);
      cvv.setDisable(true);
      FileOutputStream out = null;
      File filet = new File("C:/Program Files/Airline System/src/Text_Files/payment.txt");

      String f=filet.getAbsolutePath();

      String text = "Google Pay";
      byte b[] = text.getBytes();

      String outputFileName = System.getProperty("user.home",
              File.separatorChar + "home"
                      + File.separatorChar + "monica")
              + File.separatorChar + "text.txt";
      out = new FileOutputStream(f);
      out.write(b);
      out.close();
  }
        if(Net.isSelected()) {
            Credit.setDisable(true); Google.setDisable(true); Paypal.setDisable(true);
            date.setDisable(true);
            Cdate.setDisable(true);
            cvv.setDisable(true);
            FileOutputStream out = null;
            File filet = new File("C:/Program Files/Airline System/src/Text_Files/payment.txt");

            String f=filet.getAbsolutePath();

            String text = "NetBanking";
            byte b[] = text.getBytes();

            String outputFileName = System.getProperty("user.home",
                    File.separatorChar + "home"
                            + File.separatorChar + "monica")
                    + File.separatorChar + "text.txt";
            out = new FileOutputStream(f);
            out.write(b);
            out.close();
        }
        if(Paypal.isSelected()) {
            Credit.setDisable(true); Net.setDisable(true); Google.setDisable(true);
            date.setDisable(true);
            Cdate.setDisable(true);
            cvv.setDisable(true);
            FileOutputStream out = null;
            File filet = new File("C:/Program Files/Airline System/src/Text_Files/payment.txt");

            String f=filet.getAbsolutePath();

            String text ="Paypal";
            byte b[] = text.getBytes();

            String outputFileName = System.getProperty("user.home",
                    File.separatorChar + "home"
                            + File.separatorChar + "monica")
                    + File.separatorChar + "text.txt";
            out = new FileOutputStream(f);
            out.write(b);
            out.close();
        }
        if(Credit.isSelected()) {
            Google.setDisable(true); Net.setDisable(true); Paypal.setDisable(true);
            FileOutputStream out = null;
            File filet = new File("C:/Program Files/Airline System/src/Text_Files/payment.txt");

            String f=filet.getAbsolutePath();

            String text = "Credit Card";
            byte b[] = text.getBytes();

            String outputFileName = System.getProperty("user.home",
                    File.separatorChar + "home"
                            + File.separatorChar + "monica")
                    + File.separatorChar + "text.txt";
            out = new FileOutputStream(f);
            out.write(b);
            out.close();
        }

    }


    @FXML
    private void Onnext(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/Seats/FXMLDocument.fxml"));
        Stage window= (Stage)next.getScene().getWindow();
        window.setScene(new Scene(root));
        window.centerOnScreen();
      
    }
    @FXML
    private void OnExit(ActionEvent event) throws IOException {

        Stage stage = (Stage) exit.getScene().getWindow();

        stage.close();

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      ab.setVisible(false);
      en.setVisible(false);
     ap.setBackground(Background.EMPTY);
        File D = new File("C:/Program Files/Airline System/src/Text_Files/languages.txt");

        try (Scanner scanner = new Scanner(D)) {

            while (scanner.hasNext())


                languageChanger(scanner.next().toString());


        }catch (Exception e) { e.printStackTrace(); }
       }

    private void languageChanger(String x) {
        if(x.equals("ab")) {
            name.setPromptText(" Emri");

            date.setPromptText("Data");

            pass.setPromptText("Fjalëkalimi");
            phone.setPromptText("Numri i telefonit");
            cpm.setText("Zgjidhni mënyrën tuaj të pagesës");
            cp.setText("Konfirmoni pagesën tuaj");
            back.setText("Mbrapa");
            next.setText("Tjetër");
            exit.setText(
                    "dil");

            Credit.setText("Kartë krediti / debiti");



        }}





    @FXML
    private void lang(ActionEvent event) throws IOException {
        if (ab.isSelected()) {
            en.setDisable(true);
            name.setPromptText("Emri");

            date.setPromptText("Data");

            pass.setPromptText("Fjalëkalimin");
            phone.setPromptText("Numri i telefonit");
          cpm.setText("Zgjidhni mënyrën tuaj të pagesës");
          cp.setText("Konfirmoni pagesën tuaj");
            back.setText("Mbrapa");
            next.setText("Tjetër");
            exit.setText(
                    "dil");

            Credit.setText("Kartë krediti / debiti");

        }


    }


    }