package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.Objects;

public class DashBoardController {

    @FXML
    private Button bookHotel;

    @FXML
    private Button buyTicket;

    @FXML
    private Button tPackage;

    @FXML
    private Button tSuggestion;

    @FXML
    void bookHotel(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("HotelBooking.fxml"));
            Parent root;
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Hotel Booking");
            Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("rifat er hotel.png")));
            stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void buyTicket(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyTicket.fxml"));
            Parent root;
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Buy Tickets");
            Image icon = new Image(getClass().getResourceAsStream("118-1181530_car-hauler-clipart.png"));
            stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void tPackage(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TourPackages.fxml"));
            Parent root;
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Travel Packages");
            Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
            stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void tSuggestion(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TravelSuggestion.fxml"));
            Parent root;
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Tour Suggestion");
            stage.setResizable(false);
            Image icon = new Image(getClass().getResourceAsStream("LetsGoTour.png"));
            stage.getIcons().add(icon);
            stage.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}

//    void b2(ActionEvent event) {
//        try{
//            Parent fxmlLoader =  FXMLLoader.load(getClass().getResource("Scene2.fxml"));
//            surcpane.getChildren().removeAll();
//            surcpane.getChildren().setAll(fxmlLoader);
//        }
//        catch (IOException e){
//            System.out.println(e.getMessage());
//        }
//    }