package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalDate;

public class HotelBookingInfoController {

@FXML
private TextField cadult;

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
private Button ccancel;

@FXML
private Button cconfirmbut;

@FXML
private DatePicker coutdate;

@FXML
private TextField cphonnumber;

@FXML
private TextField hcost;

@FXML
private TextField hname;

Stage stage = new Stage();

@FXML
void Cancelbutt(ActionEvent event) {
    stage = (Stage) checkinancor.getScene().getWindow();
    stage.close();

}

@FXML
void Confirmbutt(ActionEvent event) {
        try{
            Socket s=new Socket("localhost",7777);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            dout.writeUTF("button1");
            dout.flush();
            dout.writeUTF("Name : "+cname.getText()+ "\n");
            dout.flush();
            dout.writeUTF("E-mail : "+cemail.getText()+ "\n");
            dout.flush();
            dout.writeUTF("Phone Number :"+cphonnumber.getText()+ "\n");
            dout.flush();
            dout.writeUTF("Number of Child and Adult :"+cchild.getText() + " "+ cadult.getText()+ "\n");
            dout.flush();
            dout.writeUTF("Check in Day :"+getCheckInDate()+ "\n");
            dout.flush();
            dout.writeUTF("Check out Day :"+getCheckOutDate()+ "\n");
            dout.flush();
            dout.writeUTF("exit");
            s.close();



        }catch (Exception e){
            e.printStackTrace();
        }
}
    public void hnameCost( String x, String y){
    hname.setText(x);
    hcost.setText(y);
    }
    public String getCheckInDate() {
        LocalDate depDate = cindate.getValue();
        String deptDate = depDate.toString();
        return deptDate;
    }
    void setCost(String x,String y){
        hname.setText(x);
        hcost.setText(y);
    }

    @FXML
    public String getCheckOutDate() {
        LocalDate depDate2 = coutdate.getValue();
        String deptDate1 = depDate2.toString();
        return deptDate1;
    }

}



