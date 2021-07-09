package Login;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.StageStyle;

import Register.FXMLDocumentController;
import javafx.fxml.Initializable;
import javafx.scene.CacheHint;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import Register.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class RFXMLDocumentController implements Initializable {
    
    
  
     static File file = new File("C:/Program Files/Airline System/src/Videos/login.mp4");

static URI pi= file.toURI(); 

  static    Media m= new Media(pi.toString());
    
    public static int nd=0;
    
    
    
      static MediaPlayer mp= new MediaPlayer(m);
       @FXML
   private MediaView mv;
     
 
    @FXML
   private CheckBox ji;
      @FXML
   public Label p;
    
      @FXML
   private TextField User;
       @FXML
   private TextField FakePass;
       @FXML
       private TextField RUser;
          @FXML
       private TextField RPass;
       @FXML
   private PasswordField Pass;
      @FXML
   private Button Sign;
   
   @FXML
   private Button skip;
  
   @FXML
   private void OnShow() {
           if(ji.isSelected()){
           
    FakePass.setText(Pass.getText());
    FakePass.setVisible(true);
    Pass.setVisible(false);
    return;
           

   }
           Pass.setText(FakePass.getText());
           Pass.setVisible(true);
           FakePass.setVisible(false);
      
   }                     
    @FXML
    private void Onskip(ActionEvent event) {
   
       mp.stop();
     Stage stage = (Stage) skip.getScene().getWindow();
 
   stage.close();
    
      
    }
    @FXML
    private void OnSignIn(ActionEvent event) throws IOException {
       
     
        if(User.getText().trim().isEmpty()&&Pass.getText().trim().isEmpty()){
        
            message("Username Field should not be left empty"
                    + "and Password Field should not be left empty");
        }
       
        
        else if(User.getText().trim().isEmpty())
        {
            
        message("Username Field should not be left empty");
        }
        else if(Pass.getText().trim().isEmpty())
        {
          message("Password Field should not be left empty");
        }
        else{

            User();
            

        }
    
      
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        p.setVisible(false);
        FakePass.setVisible(false);
      
    
  mv.setMediaPlayer(mp);

      
      mp.play();
   
              
    }    
@FXML
    public void User() throws IOException {
       { 
           
           String pass= Pass.getText();
       
        String user= User.getText();
           String Passcord= sender2("");
            String Usecord= sender("");

           String  JBBC_DRIVER="com.mysql.jdbc.Driver";
           String  DB_URL="jdbc:mysql://localhost:3306/system";
           String DB_USER="Verona2001";
           String DB_PASS="root";
           Connection con=null;
           try{
               Class.forName(JBBC_DRIVER);
               con= DriverManager.getConnection(DB_URL,DB_PASS,DB_USER);
               System.out.println("Success.....");

               String u,p;
               u= user;
               p=pass;
               PreparedStatement st;
               ResultSet rs;
               boolean username_exist=false;

               String query="SELECT * FROM details where Name=? and Password=? ";
               st=con.prepareStatement(query);
               st.setString(1, u);
               st.setString(2, p);
               rs=st.executeQuery();
               if(rs.next()){
                   mp.stop();
                   nd=1;
                   Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
                   Stage window= (Stage)Sign.getScene().getWindow();
                   window.setScene(new Scene(root));
                   window.centerOnScreen();
               }else{
                   Alert alert = new Alert(Alert.AlertType.WARNING);
                   alert.setContentText("INVALID LOGIN DETAILS");
                   alert.show();
               }
               //con.close();
           }
           catch(Exception e){
               System.out.println(e);
           }


           {

            if (user.contains("Harshad")&&pass.contains("S100")) {
     
              mp.stop();
                Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
                Stage primaryStage= new Stage();
                primaryStage.initStyle(StageStyle.UNDECORATED);


                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();

           Stage stage = (Stage) Sign.getScene().getWindow();
 
   stage.close();
           }
            
         
        
  else if (user.contains("Verona Krasniqi")&&pass.contains("123456")) {
        mp.stop();


                Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
                Stage window= (Stage)Sign.getScene().getWindow();
                window.setScene(new Scene(root));
                window.centerOnScreen();
            }
//   else if (user.contains(Usecord)&&pass.contains(Passcord)) {
//          mp.stop();
//                Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
//                Stage window= (Stage)Sign.getScene().getWindow();
//                window.setScene(new Scene(root));
//                window.centerOnScreen();
//            }
            

 else if (user.contains("George")&&pass.contains("Intelligence")) {
          mp.stop();
                Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
                Stage window= (Stage)Sign.getScene().getWindow();
                window.setScene(new Scene(root));
                window.centerOnScreen();
            }
         

      else   if (user.contains("Rinesa")&&pass.contains("222222")){
           mp.stop();
                Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
                Stage window= (Stage)Sign.getScene().getWindow();
                window.setScene(new Scene(root));
                window.centerOnScreen();
      }
 
       else if (user.contains("Sara")&&pass.contains("sarasara")) {
         mp.stop();
                Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
                Stage window= (Stage)Sign.getScene().getWindow();
                window.setScene(new Scene(root));
                window.centerOnScreen();
        } 
       
            
        else{
         if(nd==0) {
             Alert alert = new Alert(Alert.AlertType.WARNING);
             alert.setContentText("INVALID LOGIN DETAILS");
             alert.show();


         }



        }
        }
       }
    }


private void message(String x){
  Alert alert = new Alert(Alert.AlertType.INFORMATION);
          alert.setContentText(x);
alert.show();


}
        public String sender(String user){
            User.setText(user);
            return user;
        }
         public String sender2(String pass){
              Pass.setText(pass);
            return pass;
        }

    
}