package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.jar.Attributes;

public class SignUpController implements Initializable {

    @FXML
    private Button confirm;

    @FXML
    private Button cancel;

    @FXML
    private ChoiceBox<String> genderChoice;
    private String [] gender = {"Male", "Female", "Other"};

    @FXML
    private TextField sAddress;

    @FXML
    private TextField sAge;

    @FXML
    private PasswordField sConPass;

    @FXML
    private TextField sEmail= null;

    @FXML
    private TextField sName = null;

    @FXML
    private TextField sPassword = null;

    @FXML
    private TextField sPhnNum = null;

    @FXML
    private TextField sUserName = null;

    @FXML
    private AnchorPane scenePane;

    Stage stage;
    @FXML
    void Cancel(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }

    //String name,userName, password, phnNum, email;
    @FXML
    void Confirm() {
        try{
            if((sName.getText().equals("")) || (sUserName.getText().equals("")) || (sPassword.getText().equals(null)) || (sPhnNum.getText().equals(null))){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Empty Field");
                alert.setHeaderText("Fill the empty Field.");
                alert.setContentText("Enter Correct Information.");
                alert.show();
            }
            else {
                FileWriter fw = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\de-tour.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                String name = sName.getText();
                String userName = sUserName.getText();
                String password = sPassword.getText();
                String phnNum = sPhnNum.getText();
                String email = sEmail.getText();
                System.out.println(name + "," + userName + "," + password + "," + phnNum + "," + email);
                bw.write(name + "," + userName + "," + password + "," + phnNum + "," + email);
                bw.newLine();
                bw.close();
                fw.close();
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        genderChoice.getItems().addAll(gender);
    }

//    void newData(){
//        try{
//            if((sName.equals("Name")) || (sUserName.equals(null)) || (sPassword.equals("")) || (sPhnNum.equals(null))){
//                Alert alert = new Alert(Alert.AlertType.ERROR);
//                alert.setTitle("Empty Field");
//                alert.setHeaderText("Fill the empty Field.");
//                alert.setContentText("Enter Correct Information.");
//                alert.show();
//            }
//            else {
//                FileWriter fw = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version3.2\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\de-tour.txt", true);
//                BufferedWriter bw = new BufferedWriter(fw);
//                String name = sName.getText();
//                String userName = sUserName.getText();
//                String password = sPassword.getText();
//                String phnNum = sPhnNum.getText();
//                String email = sEmail.getText();
//                System.out.println(name + "," + userName + "," + password + "," + phnNum + "," + email);
//                bw.write(name + "," + userName + "," + password + "," + phnNum + "," + email);
//                bw.newLine();
//                bw.close();
//                fw.close();
//            }
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//    }

}
