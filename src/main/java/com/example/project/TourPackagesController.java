package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class TourPackagesController {

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private Button b5;

    @FXML
    private Button b6;

    @FXML
    private Button b7;

    @FXML
    private Button b8;

    @FXML
    private Button b9;

    @FXML
    void buttonFuncttion(ActionEvent event) {
        if (event.getSource().equals(b1)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Sajek Valley Tour Package", "5800", "2 Days - 3 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (event.getSource().equals(b2)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Bandarban Tour Package", "5800", "2 Days - 3 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (event.getSource().equals(b3)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Saint-Martin Tour Package", "4700", "2 Days - 3 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (event.getSource().equals(b4)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Sundarban Tour Package", "7500", "3 Days - 2 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (event.getSource().equals(b5)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Tanguar Haor Tour Package", "4800", "2 Days - 3 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (event.getSource().equals(b6)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Nafakhum Tour Package", "6800", "2 Days - 3 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (event.getSource().equals(b7)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Keokradong Tour Package", "6800", "2 Days - 3 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (event.getSource().equals(b8)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Srimangal Tour Package", "5800", "2 Days - 3 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        if (event.getSource().equals(b9)) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("BuyPackageInfo.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BuyPackageInfoController obj = fxmlLoader.getController();
                obj.setPnameCost("Rangamati Tour Package", "5800", "2 Days - 3 Nights");
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Buy Travel Packages");
//                Image icon = new Image(getClass().getResourceAsStream("80a070926096993c6473c3423d35c4ed.png"));
//                stage.getIcons().add(icon);
                stage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}


