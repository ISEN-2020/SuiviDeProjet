package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.json.JSONObject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoard implements Initializable {

    @FXML
    private Button btn_projet;

    @FXML
    private Button btn_message;

    @FXML
    private Button bnt_deconnecter;
    @FXML
    private Button btn_option;
    @FXML
    private Pane panel_deconnecter;
    @FXML
    private Pane panelAffichage;
    @FXML
    private Pane panel_option;

    @FXML
    private Pane panel_projet;
    @FXML
    private Label labelAffichage,labelNom;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        panel_deconnecter.setVisible(false);
        panel_option.setVisible(false);
        Affichage_nom();
    }

    public void handle(ActionEvent event){
        if(event.getSource()==btn_projet){

            Visibility(1);
            labelAffichage.setText("Suivi de projet");
            panelAffichage.setBackground(new Background(new BackgroundFill(Color.rgb(113,86,221), CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(event.getSource()==btn_message){
            Visibility(2);
            labelAffichage.setText("Message reçu");
            panelAffichage.setBackground(new Background(new BackgroundFill(Color.rgb(43,63,99), CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(event.getSource()==btn_option){
            labelAffichage.setText("Options");
            panelAffichage.setBackground(new Background(new BackgroundFill(Color.rgb(43,99,63), CornerRadii.EMPTY, Insets.EMPTY)));
        }
        else if(event.getSource()==bnt_deconnecter){
            labelAffichage.setText("Bye bye fdp");
            panelAffichage.setBackground(new Background(new BackgroundFill(Color.rgb(43,63,99), CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }

    public void Visibility(int i){
            if(i==1) {
                panel_deconnecter.setVisible(false);
                panel_option.setVisible(true);
            }
            else{
                panel_deconnecter.setVisible(true);
                panel_option.setVisible(false);
            }
    }
    public void Affichage_nom() {
        labelNom.setText(Data.prenom + " " + Data.nom);
    }

}
