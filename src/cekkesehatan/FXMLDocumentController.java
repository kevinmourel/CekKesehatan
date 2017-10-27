/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author kevin
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton rdblakilaki;

    @FXML
    private ToggleGroup PilihanK;

    @FXML
    private RadioButton rdbperempuan;

    @FXML
    private JFXTextField editNama;

    @FXML
    private JFXTextField editBerat;

    @FXML
    private JFXTextField editTinggi;

    @FXML
    private JFXTextField ideal;

    @FXML
    private JFXTextArea hasil;

    @FXML
    private JFXTextArea saran;

    @FXML
    private JFXButton buttonOk;

    @FXML
    private JFXButton buttonReset;
    
/**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void Proses(javafx.event.ActionEvent event) {
       double ti, bt, kelamin = 0;
       ti = Double.valueOf(editTinggi.getText());
       bt = Double.valueOf(editBerat.getText());
       
       
       if(rdblakilaki.isSelected()){
           kelamin = (ti - 110);
       }else if(rdbperempuan.isSelected()){
           kelamin = (ti - 100);
       }
       if(kelamin < bt){
       ideal.setText(""+kelamin);
       hasil.setText("Maaf "+editNama.getText()+" Sepertinya anda Overweight");
       saran.setText("Lebih banyak olahraga agar berat badan anda ideal");
       }else if( kelamin > bt){
       ideal.setText(""+kelamin);
       hasil.setText("Maaf "+editNama.getText()+" Sepertinya anda Underweight");
       saran.setText("Perbanyak makan tapi jangan lupa olahraga harus teratur");
       }else{
       ideal.setText(""+kelamin);
       hasil.setText("Selamat "+editNama.getText()+" Berat badanmu ideal");
       saran.setText("jaga pola makan, dan olahraga teratur"); 
       }
       
    }

    @FXML
    private void Reset(javafx.event.ActionEvent event) {
        hasil.setText("");
        saran.setText("");
        ideal.setText("");
        editNama.setText("");
        editBerat.setText("");
        editTinggi.setText("");
        rdblakilaki.setSelected(false);
        rdbperempuan.setSelected(false);
    }    
    
}
