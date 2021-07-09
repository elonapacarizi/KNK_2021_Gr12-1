
package Admin;


import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import Admin.ModelTable;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.text.View;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author freec
 */
public class FXMLDocumentController implements Initializable {
    //-----------------

    @FXML
    private Button back, del, add, refresh;
    @FXML
    public TableColumn<ModelTable, String> c1;
    @FXML
    public TableColumn<ModelTable, String> c2;
    @FXML
    public TableColumn<ModelTable, String> c3;
    @FXML
    public TableColumn<ModelTable, String> c4;
    @FXML
    public TextField n, p, pa, du,u;
    @FXML
    public TableView<ModelTable> table;

    ObservableList<ModelTable> oblist = FXCollections.observableArrayList();

    @FXML
    private void OnBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/Booking_Interface/FXMLDocument.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root));
        window.centerOnScreen();

    }

    @FXML
    private void OnDelete(ActionEvent event) throws IOException {
        String JBBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/system";
        String DB_USER = "root";
        String DB_PASS = "Verona2001";
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            PreparedStatement st;
            ResultSet rs;
            boolean username_exist = false;

            String query = "Delete from details where Unicode=?";
            PreparedStatement pdt = con.prepareStatement(query);

            pdt.setInt(1, Integer.parseInt(du.getText()));
            //put the rest of the code

            int n1=pdt.executeUpdate();
            {
                System.out.println("deleted Successfully!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    @FXML
    public void OnRefresh(ActionEvent event) throws IOException {
        for (int i = 0; i < table.getItems().size(); i++) {
            table.getItems().clear();
        }

        String JBBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/system";
        String DB_USER = "Verona2001";
        String DB_PASS = "root";
        Connection con = null;

        try {

            Class.forName(JBBC_DRIVER);
            con = DriverManager.getConnection(DB_URL, DB_PASS, DB_USER);


            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM details");
            while (rs.next()) {
                oblist.add(new ModelTable(rs.getString("Name"), rs.getString("Password"),
                        rs.getString("Phone"),
                        rs.getString("Unicode")));
                table.setItems(oblist);
            }


        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error-" + ex);

        }

        c1.setCellValueFactory(new PropertyValueFactory<>("Name"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Password"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        c4.setCellValueFactory(new PropertyValueFactory<>("Unicode"));

        table.setItems(oblist);


    }

    @FXML
    private void OnAdd(ActionEvent event) throws IOException {

        String JBBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/system";
        String DB_USER = "root";
        String DB_PASS = "Verona2001";
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            PreparedStatement st;
            ResultSet rs;
            boolean username_exist = false;

            String query = "insert into details(Name,Password,phone,Unicode) Values(?,?,?,?)";
            PreparedStatement pdt = con.prepareStatement(query);
            pdt.setString(1, n.getText());
            pdt.setString(2, pa.getText());
            pdt.setInt(3, Integer.parseInt(p.getText()));
            pdt.setInt(4, Integer.parseInt(u.getText()));
            //put the rest of the code

            int n1=pdt.executeUpdate();
            {
                System.out.println("Inserted Successfully!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {

        String  JBBC_DRIVER="com.mysql.jdbc.Driver";
        String  DB_URL="jdbc:mysql://localhost:3306/system";
        String DB_USER="Verona2001";
        String DB_PASS="root";
        Connection con=null;

        try {

            Class.forName(JBBC_DRIVER);
            con= DriverManager.getConnection(DB_URL,DB_PASS,DB_USER);


            ResultSet rs=con.createStatement().executeQuery("SELECT * FROM details");
            while (rs.next()) {
              oblist.add(new ModelTable(rs.getString("Name"),rs.getString("Password"),
                      rs.getString("Phone"),
                      rs.getString("Unicode")));
                        table.setItems(oblist);
            }


        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Error-"+ex);

        }

 c1.setCellValueFactory(new PropertyValueFactory<>("Name"));
        c2.setCellValueFactory(new PropertyValueFactory<>("Password"));
        c3.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        c4.setCellValueFactory(new PropertyValueFactory<>("Unicode"));

        table.setItems(oblist);



    }
}