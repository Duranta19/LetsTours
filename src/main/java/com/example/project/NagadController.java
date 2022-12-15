package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class NagadController {

    @FXML
    private TextField amnt;

    @FXML
    private Button can;

    @FXML
    private Button con;

    @FXML
    private TextField trnsID;

    @FXML
    private AnchorPane mPane;

    @FXML
    private TextField phn;

    @FXML
    private PasswordField pin;

    Stage stage;
    public String tidCheck2 = "trxid7u239ss28w2";

    @FXML
    void cancel(ActionEvent event) {
        stage = (Stage) mPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void confirm(ActionEvent event) {
        if((phn.getText().equals("")) || (pin.getText().equals(""))){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Empty Field");
            alert.setHeaderText("Fill the empty Field.");
            alert.setContentText("Enter Correct Information.");
            alert.show();
        }
        else {
            trnsID.setText(tidCheck2);
        }
    }

    void setAmnt(String x) {
        amnt.setText(x);
    }

}
