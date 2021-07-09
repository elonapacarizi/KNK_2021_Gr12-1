
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
RPass.setText(FakePass.getText());
           RPass.setVisible(true);
           FakePass.setVisible(false);
      
   }                
    @FXML
    private void Onskip(ActionEvent event) {
       
              mp.stop();
     Stage stage = (Stage) skip.getScene().getWindow();
 
    stage.close();

    
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       FakePass.setVisible(false);
      
    
    mv.setPreserveRatio(true);

       mv.setMediaPlayer(mp);
      
       mp.play();
       if(mp.getStatus()==PLAYING){
            
 
       }else{
           mp.stop();
           mp.play();
       }
    }    
                               

    @FXML
    private void OnSubmit(ActionEvent event) {
           if(RUser.getText().trim().isEmpty()&&RPass.getText().trim().isEmpty()){
        
            message("Username Field should not be left empty"
                    + "and Password Field should not be left empty");
        }
       
        
        else if(RUser.getText().trim().isEmpty())
        {
            
        message("Username Field should not be left empty");
        }
        else if(RPass.getText().trim().isEmpty())
        {
          message("Password Field should not be left empty");
        }
        else if(Cap.getText().trim().isEmpty())
        {
          message("Please do enter Captcha");
        }     
        else if(!Cap.getText().equals("9xyz")){
                message("Invalid code entered");
           }
        else if (RNick.getText().trim().isEmpty()){
              message("Enter your nickname Please");
        }
        else{
            
 
            message("You have been registered succesfully");
          

        }
    
    }
    
private void message(String x){
  Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setContentText(x);
alert.show();


}
     @FXML
    private void OnSignIn(ActionEvent event) throws IOException, Exception {
  if(RUser.getText().trim().isEmpty()||
     RPass.getText().trim().isEmpty()
     ||RNick.getText().trim().isEmpty()
     ||Cap.getText().trim().isEmpty()
          || !Cap.getText().equals("9xyz"))
  {
       
        message("No field Should be left empty");    
        }
  else{
      mp.stop();
      String  JBBC_DRIVER="com.mysql.jdbc.Driver";
      String  DB_URL="jdbc:mysql://localhost:3306/system";
      String DB_USER="root";
      String DB_PASS="Verona2001";
      Connection con=null;
           try
           {
               Class.forName("com.mysql.jdbc.Driver");
               con= DriverManager.getConnection(DB_URL,DB_USER,DB_PASS);
               PreparedStatement st;
               ResultSet rs;
               boolean username_exist=false;

               String query="insert into details(Name,Password,phone,Unicode) Values(?,?,?,?)";
               PreparedStatement pdt = con.prepareStatement(query);
               pdt.setString(1, RUser.getText());
               pdt.setString(2, RPass.getText());
               pdt.setInt(3, 898202902);
               pdt.setInt(4,23);
               //put the rest of the code
               int n1=pdt.executeUpdate();
               {
                  System.out.println("Inserted Successfully!");
               }
           }
           catch(Exception e)
           {  System.out.println(e);   }
      Parent root = FXMLLoader.load(getClass().getResource("/Login/RFXMLDocument.fxml"));
      Stage window= (Stage)RSignIn.getScene().getWindow();
      window.setScene(new Scene(root));
      window.centerOnScreen();


//
    }
    }
    public String movingU(int a){
        return RUser.getText();
    }
    
    
    
    
    
}


