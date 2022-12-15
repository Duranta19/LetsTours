package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HotelController {

    @FXML
    private Button CoxButton;

    @FXML
    private ImageView HomeImg;

    @FXML
    private Label Homelbl;

    @FXML
    private Button SmButton;

    @FXML
    private Button StButton;

    @FXML
    private Button Bandarban;



    @FXML
    private Pane asholmal;
//    @FXML
//    void Cox(ActionEvent event) {
//
//    }
//
//    @FXML
//    void SM(ActionEvent event) {
//
//    }
//
//    @FXML
//    void SV(ActionEvent event) {
//
//    }
//
//    @FXML
//    void StML(ActionEvent event) {
//
//    }
@FXML
void Cox(ActionEvent event) throws IOException {
    Parent fxmlLoader=FXMLLoader.load(getClass().getResource("Coxhotel.fxml"));
    asholmal.getChildren().removeAll();
    asholmal.getChildren().setAll(fxmlLoader);

}

    @FXML
    void SM(ActionEvent event) throws IOException {
        Parent fxmlLoader=FXMLLoader.load(getClass().getResource("SreeMangal.fxml"));
        asholmal.getChildren().removeAll();
        asholmal.getChildren().setAll(fxmlLoader);
    }

    @FXML
    void Bandarbanbutt(ActionEvent event) throws IOException {
        Parent fxmlLoader=FXMLLoader.load(getClass().getResource("Bandarban.fxml"));
        asholmal.getChildren().removeAll();
        asholmal.getChildren().setAll(fxmlLoader);
    }

    @FXML
    void StML(ActionEvent event) throws IOException {
        Parent fxmlLoader=FXMLLoader.load(getClass().getResource("St.Martin.fxml"));
        asholmal.getChildren().removeAll();
        asholmal.getChildren().setAll(fxmlLoader);
    }


//    @Override
//    public void initialize(URL arg0, ResourceBundle arg1) {
//        closeLbl.setOnMouseClicked(e->{
//            System.exit(0);
//        });
//
//    }
}
