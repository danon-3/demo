package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private TextField login;
    @FXML
    private PasswordField password;
    @FXML
    private Label textError;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void doSwitch(ActionEvent event) throws IOException {
        Stage stage = null;
        Parent root = null;

        if(event.getSource() == button2){
            if(login.getText().equals("danon3") && password.getText().equals("123")) {
                stage = (Stage) button2.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("second-view.fxml"));
            }
            else{
                textError.setText("Error!");
            }
        }
        else{
            stage = (Stage)button3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        }

        if (root != null){
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }}
}