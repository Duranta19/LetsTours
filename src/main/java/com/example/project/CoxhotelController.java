package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class CoxhotelController {


    //CoxBazar
    @FXML
    private Button bookbut1;

    @FXML
    private Button bookbut2;

    @FXML
    private Button bookbut3;

    @FXML
    private Button bookbut4;

    @FXML
    private AnchorPane coxinachor;

    @FXML
    private AnchorPane coxmainacor;
    Stage stage = new Stage();
    @FXML
    void bookbut1(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Long Beach Hotel", "4303");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void bookbut2(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Hotel Sea World Cox's Bazar", "2498");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void bookbut3(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Cox Hill Tower", "2347");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void bookbut4(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Best Westren Heritage", "4868");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //SreeMangal

    @FXML
    private Button bookbut5;

    @FXML
    private Button bookbut6;

    @FXML
    private Button bookbut7;

    @FXML
    private Button bookbut8;

    @FXML
    private AnchorPane sminanor;

    @FXML
    private AnchorPane smmainancor;

    @FXML
    void bookbut5(ActionEvent event) throws IOException{

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Green Leaf Guest House", "1217");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void bookbut6(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Hotel Skypark", "1808");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void bookbut7(ActionEvent event) throws IOException{

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Grand Selim Resort & Tour", "2451");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void bookbut8(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Jungle Cottage", "2782");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    //Bandarban

    @FXML
    private AnchorPane bandarbaninancor;

    @FXML
    private AnchorPane bandarbanmainancor;

    @FXML
    private Button bookbut10;

    @FXML
    private Button bookbut11;

    @FXML
    private Button bookbut12;

    @FXML
    private Button bookbut9;

    @FXML
    void bookbut10(ActionEvent event) throws IOException{

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Hotel Hill View", "3043");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }


    }

    @FXML
    void bookbut11(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Holiday Inn Resort", "2695");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void bookbut12(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Hotel Green Land", "1826");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void bookbut9(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Hotel Night Heaven", "1652");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //

    @FXML
    private AnchorPane Stmartinmainacor;

    @FXML
    private Button bookbut13;

    @FXML
    private Button bookbut14;

    @FXML
    private Button bookbut15;

    @FXML
    private Button bookbut16;

    @FXML
    private AnchorPane stmartininancor;

    @FXML
    void bookbut13(ActionEvent event) throws IOException{

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Secret St.Martin Resort & Spa", "48613");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void bookbut14(ActionEvent event) throws IOException {


        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Fantastic Hotel", "9940");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void bookbut15(ActionEvent event) throws IOException{

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Grand Case Beach Club", "20426");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @FXML
    void bookbut16(ActionEvent event) throws IOException {

        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBookingInfo.fxml"));
            Parent root;
            root = fxmlLoader.load();
            HotelBookingInfoController obj = fxmlLoader.getController();
            obj.setCost("Hommage Hotel & Residences", "16915");
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Payment");
            stage.setResizable(false);
//                Image icon = new Image(getClass().getResourceAsStream("download.png"));
//                stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

}



