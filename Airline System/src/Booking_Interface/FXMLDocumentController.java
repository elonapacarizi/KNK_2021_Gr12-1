
  
    
     @Override
     
    public void initialize(URL url, ResourceBundle rb) {
//main.minHeight(720);
//main.maxWidth(1200);
    } 
    
    
    @FXML
    private void Onskip(ActionEvent event) {
      
     Stage stage = (Stage) skip.getScene().getWindow();
 
    stage.close();
  
    }
     @FXML
         private void OnWelcome(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("/destination/FXMLDocument.fxml"));
         Stage window= (Stage)welcome.getScene().getWindow();
         window.setScene(new Scene(root,1280,720));
         window.centerOnScreen();
         }
         @FXML
    private void OnRegister(ActionEvent event) throws IOException {

    }
     @FXML
    private void OnLogin(ActionEvent event) throws IOException {

    }
    
     @FXML
    private void onAbout(ActionEvent event) throws IOException {
    

  
    }
    
     @FXML
    private void OnHelp(ActionEvent event) {
      

    }
    
    
     @FXML
    private void onAdmin(ActionEvent event) {

  
    }
    
    
    
    
}
    
