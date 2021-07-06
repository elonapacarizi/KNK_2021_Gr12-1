
package Seats;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    @FXML
    private Pane rootpane;
    @FXML
    private AnchorPane ap;
    @FXML
    private Button Print;

    public FXMLDocumentController() {
    }

    @FXML
    private void Printing(ActionEvent event) throws IOException {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("/Print_Details/FXMLDocument.fxml"));
        Stage window = (Stage)this.Print.getScene().getWindow();
        window.setScene(new Scene(root));
        window.centerOnScreen();
    }

    public void initialize(URL url, ResourceBundle rb) {
    }
}