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

public class AddPlacePage implements Initializable {

    @FXML
    private ChoiceBox<String> oras;
    private String[] choices = {"Timisoara","Arad"};
    @FXML
    private TextField adress;
    @FXML
    private TextField nrBeds;
    @FXML
    private TextField price;
    @FXML
    private Button add;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        oras.getItems().addAll(choices);
        oras.setOnAction(this::getChoice);
    }

    public void getChoice(ActionEvent event){
        String choices = oras.getValue();
    }

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void addFunction(ActionEvent actionEvent) throws IOException{
        if (adress.getText().isEmpty() || nrBeds.getText().isEmpty() || oras.getValue() == null || price.getText().isEmpty()) {
            adress.setText("");
            nrBeds.setText("");
            price.setText("");
        }
        else {
            JavaSQL.addPlaceToDataBase(oras.getValue(), adress.getText(), Integer.parseInt(nrBeds.getText()), Double.parseDouble(price.getText()));
            root = FXMLLoader.load(getClass().getResource("addPlace.fxml"));
            stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

}
