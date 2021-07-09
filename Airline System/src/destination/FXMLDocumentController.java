
package destination;
import Info.IFXMLDocumentController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import Info.IFXMLDocumentController;

import java.io.*;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;


public class FXMLDocumentController implements Initializable {

    
      @FXML
  private AnchorPane rootpane;
    
    
     static File file = new File("C:/Program Files/Airline System/src/Videos/Route_Map.mp4");

static URI p= file.toURI(); 

  static    Media m= new Media(p.toString());
    static   MediaPlayer mp= new MediaPlayer(m);
       
      @FXML
   public MediaView mv;

   
    
    
    
    
       
    

   
    
    @FXML
   private Button back;
    @FXML
    private RadioButton eng,ab;
    @FXML
    private Label t1,f1,label;
   @FXML
   public Button next;
    @FXML
    private TextField From;
    @FXML
    private TextField To;
    @FXML
    private ComboBox<String> Tcom;
    ObservableList<String> list1 = FXCollections.observableArrayList("Kosovo","Canada","Japan","USA","Africa","India");
    ObservableList<String> list2 = FXCollections.observableArrayList("Canada","Japan","India","Russia","Europe","Argentina");

    @FXML
    private  ComboBox<String> FCom;
  
       @FXML
    private void Onback(ActionEvent event) throws IOException {
         mp.stop();
           Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
           Stage window= (Stage)back.getScene().getWindow();
           window.setScene(new Scene(root));
           window.centerOnScreen();


    }

    @FXML
    private void OnSelect(ActionEvent event) throws IOException
    {
        if(ab.isSelected()){
            eng.setDisable(true);
            FCom.setPromptText("Zgjidhni");
            Tcom.setPromptText("Zgjidhni");
            label.setText("Zgjidhni destinacionin tuaj");
            t1.setText("Në");
            f1.setText("Nga");
            back.setText("Mbrapa");
            next.setText("Tjetër");




        }else if(eng.isSelected()){
            ab.setDisable(true);
            FCom.setPromptText("Choose");
            Tcom.setPromptText("Choose");
            label.setText("Choose Your Destination");
            t1.setText("To");
            f1.setText("From");
            back.setText("Back");
            next.setText("Next");
        }
        String s=FCom.getSelectionModel().getSelectedItem();
        From.setPromptText(s);
        From.setText(s);
        String s1=Tcom.getSelectionModel().getSelectedItem();
        To.setText(s1);



    }


@FXML
 private void OnLang(ActionEvent event) throws IOException {
if(eng.isSelected()){


}if(ab.isSelected()){
        eng.setDisable(true);
        try {

        }
        catch (Exception e){

        }
    }
 }

    @FXML
    private void Onnext(ActionEvent event) throws IOException {
    

         mp.stop();


        Parent root = FXMLLoader.load(getClass().getResource("/Info/FXMLDocument.fxml"));
        Stage window= (Stage)next.getScene().getWindow();
        window.setScene(new Scene(root));
        window.centerOnScreen();

FileOutputStream out = null;





       File filet = new File("C:/Program Files/Airline System/src/Text_Files/To.txt");

        String f=filet.getAbsolutePath();

        String text = To.getText();
        byte b[] = text.getBytes();

        String outputFileName = System.getProperty("user.home",
                File.separatorChar + "home"
               + File.separatorChar + "monica")
+ File.separatorChar + "text.txt";
out = new FileOutputStream(f);
out.write(b);
out.close();

        FileOutputStream out1 = null;

        File filet1 = new File("C:/Program Files/Airline System/src/Text_Files/From.txt");

        String f1=filet1.getAbsolutePath();


        String text1 = From.getText();
        byte b1[] = text1.getBytes();

        String outputFileName1 = System.getProperty("user.home",
                File.separatorChar + "home"
                        + File.separatorChar + "monica")
                + File.separatorChar + "text.txt";
        out = new FileOutputStream(f1);
        out.write(b1);
        out.close();




    }

    @FXML
    public void KeyN(KeyEvent event) throws IOException{
  if (event.getCode() == KeyCode.ENTER) {
      mp.stop();
      Parent root = FXMLLoader.load(getClass().getResource("/Info/FXMLDocument.fxml"));
      Stage window= (Stage)next.getScene().getWindow();
      window.setScene(new Scene(root));
      window.centerOnScreen();
    }
  else if(event.getCode() == KeyCode.ESCAPE){
      mp.stop();
      Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
      Stage window= (Stage)back.getScene().getWindow();
      window.setScene(new Scene(root));
      window.centerOnScreen();
  }
  else if(event.getCode() == KeyCode.ALT){
      Tcom.onShowingProperty();
  }

}

    @FXML
    public void KeyB(KeyEvent h) throws IOException{
        if (h.getCode() == KeyCode.ESCAPE) {
            mp.stop();
            Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
            Stage window = (Stage) back
                    .getScene().getWindow();
            window.setScene(new Scene(root));
            window.centerOnScreen();
        }
    }



    @Override
    public void initialize(URL url, ResourceBundle rb) {

ab.setVisible(false);
eng.setVisible(false);
        FCom.setItems(list1);
        Tcom.setItems(list2);
       mv.setFitHeight(720);
       mv.setFitWidth(1280);
        mv.setMediaPlayer(mp);
       mp.play();
       if(mp.getStatus()==MediaPlayer.Status.STOPPED){
              

   mp.play();}

        File D = new File("C:/Program Files/Airline System/src/Text_Files/languages.txt");

        try (Scanner scanner = new Scanner(D)) {

            while (scanner.hasNext())


                languageChanger(scanner.next().toString());


        }catch (Exception e) { e.printStackTrace(); }


    }
private void languageChanger(String x){

           if(x.equals("ab")){
               FCom.setPromptText("Zgjidhni");
               Tcom.setPromptText("Zgjidhni");
               label.setText("Zgjidhni destinacionin tuaj");
               t1.setText("Në");
               f1.setText("Nga");
               back.setText("Mbrapa");
               next.setText("Tjetër");
           }
}

    }    
                               

    
