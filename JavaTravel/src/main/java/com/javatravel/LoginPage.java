package com.javatravel;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Node;
import java.io.IOException;

public class LoginPage {

        private Stage stage;
        private Scene scene;
        private Parent root;

        @FXML
        private Button signin;
        @FXML
        private TextField username;
        @FXML
        private PasswordField password;
        @FXML
        private Label eroare;

        public void getData(ActionEvent actionEvent) throws IOException{
            if (username.getText().isEmpty() || password.getText().isEmpty()) {
                eroare.setText("Completati campurile");
                username.setText("");
                password.setText("");
            }
            else {
                if(JavaSQL.readUsers(username.getText(), password.getText())==true) {
                    root = FXMLLoader.load(getClass().getResource("addPlace.fxml"));
                    stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
                else{
                    eroare.setText("Gresite");
                }
            }
        }

        public void adaugaCont(ActionEvent actionEvent) throws IOException{
            root = FXMLLoader.load(getClass().getResource("register.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }
