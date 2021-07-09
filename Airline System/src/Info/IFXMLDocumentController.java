
package Info;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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


public class IFXMLDocumentController implements Initializable {

    
      @FXML
  private Pane rootpane;

    
   
@FXML
private AnchorPane ap;
   
    
    public static int x=0;
    
    @FXML
    private TextField SClass,name,phone,time,pass ;
    @FXML
    private TextField date ;
      @FXML
      private ComboBox<String> CClass;
      @FXML
      private DatePicker  Cdate;
    @FXML
    private RadioButton ab,en;
    @FXML
   private Button back;
   @FXML
   private Button next;

    @FXML
    public void KeyN(KeyEvent event) throws IOException{
        if (event.getCode() == KeyCode.ENTER) {

            Parent root = FXMLLoader.load(getClass().getResource("/Payments/FXMLDocument.fxml"));
            Stage window= (Stage)next.getScene().getWindow();
            window.setScene(new Scene(root));
            window.centerOnScreen();
        }
        else if(event.getCode() == KeyCode.ESCAPE){

            Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
            Stage window= (Stage)back.getScene().getWindow();
            window.setScene(new Scene(root));
            window.centerOnScreen();
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
        String s=CClass.getSelectionModel().getSelectedItem();

        SClass.setText(s);


    }
    @FXML
    private void OndSelect(ActionEvent event) throws IOException
    {


        LocalDate i = Cdate.getValue();
        date.setText(i.toString());

    }


public int value(int i){
   return i;
}
    @FXML
    private void Onnext(ActionEvent event) throws IOException {



        FileOutputStream out = null;
        File filet1 = new File("C:/Program Files/Airline System/src/Text_Files/name.txt");

        String f1=filet1.getAbsolutePath();

        String text = name.getText();
        byte b[] = text.getBytes();

        String outputFileName = System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out = new FileOutputStream(f1);
        out.write(b);
        out.close();
        FileOutputStream out1 = null;
        File filet2 = new File("C:/Program Files/Airline System/src/Text_Files/passenger.txt");

        String f2=filet2.getAbsolutePath();

        String text2 =pass.getText() ;
        byte b1[] = text2.getBytes();

        String outputFileName1= System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out1 = new FileOutputStream(f2);
        out1.write(b1);
        out1.close();
        FileOutputStream out2 = null;
        File filet3 = new File("C:/Program Files/Airline System/src/Text_Files/phone.txt");

        String f3=filet3.getAbsolutePath();

        String text3 =phone.getText() ;
        byte b2[] = text3.getBytes();

        String outputFileName2= System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out2 = new FileOutputStream(f3);
        out2.write(b2);
        out2.close();



        FileOutputStream out3= null;
        File filet4 = new File("C:/Program Files/Airline System/src/Text_Files/time.txt");

        String f4=filet4.getAbsolutePath();

        String text4 =time.getText() ;
        byte b3[] = text4.getBytes();

        String outputFileName3= System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out3 = new FileOutputStream(f4);
        out3.write(b3);
        out3.close();

        FileOutputStream out4= null;
        File filet5 = new File("C:/Program Files/Airline System/src/Text_Files/PlaneClass.txt");

        String f5=filet5.getAbsolutePath();

        String text5 =SClass
                .getText() ;
        byte b4[] = text5.getBytes();

        String outputFileName4= System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out4 = new FileOutputStream(f5);
        out4.write(b4);
        out4.close();



        Parent root = FXMLLoader.load(getClass().getResource("/Payments/FXMLDocument.fxml"));
        Stage window= (Stage)next.getScene().getWindow();
        window.setScene(new Scene(root));
        window.centerOnScreen();
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Bussiness Class","Economy Class");

        CClass.setItems(list);
     ap.setBackground(Background.EMPTY);
     ab.setVisible(false);
     en.setVisible(false);
        File D = new File("C:/Program Files/Airline System/src/Text_Files/languages.txt");

        try (Scanner scanner = new Scanner(D)) {

            while (scanner.hasNext())


                languageChanger(scanner.next().toString());


        }catch (Exception e) { e.printStackTrace(); }

       }
    private void languageChanger(String x) {
        if(x.equals("ab")){
        name.setPromptText(" Emri");
        SClass.setPromptText("Zgjidhni klasën e udhëtimit");
        date.setPromptText("Data");
        CClass.setPromptText(
                "zgjedh klasën");
        pass.setPromptText("Nr. i udhëtarëve");
        phone.setPromptText("Numri i telefonit");
        time.setPromptText("Koha");
        back.setText("Mbrapa");
        next.setText("Tjetër");
    }}
    @FXML
    private void OnLang(ActionEvent event) throws IOException {
        if (ab.isSelected()) {
            en.setDisable(true);
            name.setPromptText("Emri");
            SClass.setPromptText("Zgjidhni klasën e udhëtimit");
            date.setPromptText("Data");
            CClass.setPromptText(
                    "zgjedh klasën");
            pass.setPromptText("Nr. I udhëtarëve");
            phone.setPromptText("Numri i telefonit");
            time.setPromptText("Koha");
            back.setText("Mbrapa");
            next.setText("Tjetër");
        }


    }
    
}