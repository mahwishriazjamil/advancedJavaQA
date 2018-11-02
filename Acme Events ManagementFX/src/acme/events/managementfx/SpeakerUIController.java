/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acme.events.managementfx;

import acme.events.management.controllers.SpeakerController;
import acme.events.management.model.Speaker;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Administrator
 */
public class SpeakerUIController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML TextField speakerName;
    @FXML TextField speakerRate;
    @FXML TextField speakerContactNumber;
    @FXML TextArea allSpeakers;
    
    @FXML
    private void createSpeaker(ActionEvent event) {
        // get data from controls


        
        allSpeakers.setText(SpeakerController.getAllSpeakers());
        String name = speakerName.getText();
        double rate = Double.parseDouble(speakerRate.getText());
        String number = speakerContactNumber.getText();
        
        // save to db
        SpeakerController.save(new Speaker(name, number, rate));
        
        System.out.println(name);
        System.out.println(rate);
        System.out.println(number);
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
