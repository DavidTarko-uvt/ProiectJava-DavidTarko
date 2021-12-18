package com.javatravel;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterPage implements Initializable {

        @FXML
        private Button register;
        @FXML
        private TextField username;
        @FXML
        private PasswordField password;
        @FXML
        private ChoiceBox<String> choiceBox;
        private String[] choices = {"Gazda","Chirias"};
        @FXML
        private Label eroare;

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            choiceBox.getItems().addAll(choices);
            choiceBox.setOnAction(this::getChoice);
        }

        public void getChoice(ActionEvent event){
            String choices = choiceBox.getValue();
        }

        private Stage stage;
        private Scene scene;
        private Parent root;

        public void registerFunction(ActionEvent actionEvent) throws IOException{
            if (username.getText().isEmpty() || password.getText().isEmpty() || choiceBox.getValue() == null) {
                eroare.setText("Completati campurile");
                username.setText("");
                password.setText("");
            }
            else {
                JavaSQL.writeToDatabase(username.getText(), password.getText(), choiceBox.getValue());
                root = FXMLLoader.load(getClass().getResource("addPlace.fxml"));
                stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }

}
