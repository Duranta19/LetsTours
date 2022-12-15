package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Random;

public class cardController {

    @FXML
    private TextField amnt;

    @FXML
    private Button ok;

    @FXML
    private TextField tID;

    @FXML
    private AnchorPane mPane;

    //public long l;
    public String tidCheck = "trxid7u239ss28w2";
    Stage stage;

    @FXML
    void cancel(ActionEvent event) {
        stage = (Stage) mPane.getScene().getWindow();
        stage.close();
    }

    @FXML
    void ok() {
        tID.setText(tidCheck);
//        try{
//            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyTicket.fxml"));
//            Parent root;
//            root = fxmlLoader.load();
//            BuyTicketController2 obj = fxmlLoader.getController();
//            obj.TransID(Long.toString(random()));
//
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
    }


    void setAmnt(String x) {
        amnt.setText(x);
    }
    long random(){
        Random rand = new Random();
        long x = rand.nextInt(60000000)+10000000;
        return x;
    }

}
