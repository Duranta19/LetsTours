package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.DataOutputStream;
import java.net.Socket;
import java.time.LocalDate;

public class BuyPackageInfoController {

    @FXML
    private TextField cadult;

    @FXML
    private Button cancel;

    @FXML
    private TextField cchild;

    @FXML
    private TextField cemail;

    @FXML
    private AnchorPane checkinancor;

    @FXML
    private DatePicker cindate;

    @FXML
    private TextField cname;

    @FXML
    private Button confirm;

    @FXML
    private TextField cphonnumber;

    @FXML
    private TextField hcost;

    @FXML
    private TextField hname;

    @FXML
    private TextField days;

    @FXML
    private TextField tID;

    Stage stage = new Stage();

    @FXML
    void Cancelbutt(ActionEvent event) {
        stage = (Stage) checkinancor.getScene().getWindow();
        stage.close();
    }

    @FXML
    void Confirmbutt(ActionEvent event) {
        setCost();

        String tid = tID.getText();

        String tidCh;
        cardController obj = new cardController();
        tidCh = obj.tidCheck;

        String tidCh1;
        BkashController obj1 = new BkashController();
        tidCh1 = obj1.tidCheck1;

        String tidCh2;
        NagadController obj2 = new NagadController();
        tidCh2 = obj2.tidCheck2;

        if(tidCh.equals(tid) ||  tidCh1.equals(tid) || tidCh2.equals(tid) ) {
            try {
                Socket s = new Socket("localhost", 7777);
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());

                dout.writeUTF("button2");
                dout.flush();
                dout.writeUTF("Package Name : " + hname.getText() + "\n");
                dout.flush();
                dout.writeUTF("Cost Per Person : " + hcost.getText() + "\n");
                dout.flush();
                dout.writeUTF("Name : " + cname.getText() + "\n");
                dout.flush();
                dout.writeUTF("E-mail : " + cemail.getText() + "\n");
                dout.flush();
                dout.writeUTF("Phone Number :" + cphonnumber.getText() + "\n");
                dout.flush();
                dout.writeUTF("Number of Child and Adult :" + cchild.getText() + " " + cadult.getText() + "\n");
                dout.flush();
                dout.writeUTF("Check in Day :" + getCheckInDate() + "\n");
                dout.flush();
                dout.writeUTF("Check out Day :" + days.getText() + "\n");
                dout.flush();
                dout.writeUTF("exit");
                s.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Tour Packages");
            alert.setHeaderText("Purchase Successful");
            alert.setContentText("You have purchase bus ticket Successfully");
            alert.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Tour Packages");
            alert.setHeaderText("Wrong Transaction ID");
            alert.setContentText("Please Enter a valid Transaction ID");
            alert.show();
        }

    }
    void setPnameCost(String x, String y, String z){
        hname.setText(x);
        hcost.setText(y);
        days.setText(z);
    }
    void setCost(){
        int c = Integer.parseInt(hcost.getText());
        int ad = Integer.parseInt(cadult.getText());
        int cd = Integer.parseInt(cchild.getText());
        int cost = ad*c + cd*(c/2);
        String ss = Integer.toString(cost);
        hcost.setText(ss);
    }
    public String getCheckInDate() {
        LocalDate depDate = cindate.getValue();
        String deptDate = depDate.toString();
        return deptDate;
    }
    @FXML
    void Nogad(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Nagad.fxml"));
            Parent root;
            root = fxmlLoader.load();
            NagadController obj = fxmlLoader.getController();
            obj.setAmnt(hcost.getText());
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
    void bkash(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Bkash.fxml"));
            Parent root;
            root = fxmlLoader.load();
            BkashController obj = fxmlLoader.getController();
            obj.setAmnt(hcost.getText());
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
    void Card(ActionEvent event) {

            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CardNameScene.fxml"));
                Parent root;
                root = fxmlLoader.load();
                cardController obj = fxmlLoader.getController();
                obj.setAmnt(hcost.getText());
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
