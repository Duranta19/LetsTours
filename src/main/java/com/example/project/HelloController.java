package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HelloController {

    @FXML
    private Button login;

    @FXML
    private PasswordField password;

    @FXML
    private Button signup;

    @FXML
    private AnchorPane userName;

    @FXML
    private TextField username;

//    @FXML
//    private Label slts;

//    private Stage stage;
//    private Scene scene;
//    private Parent root;

    @FXML
    void signup(ActionEvent event) throws IOException {
        if(event.getSource() == signup){
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            Parent root;
            root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        }
    }

    @FXML
    void login(ActionEvent event) {
        if(event.getSource() == login){
            if(logIn() > 0){
                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DashBoard.fxml"));
                    Parent root;
                    root = fxmlLoader.load();
                    Stage stage = new Stage();
                    stage.setScene(new Scene(root));
                    stage.setTitle("Dashboard");
                    Image icon = new Image(getClass().getResourceAsStream("dashbord.png"));
                    stage.getIcons().add(icon);
                    stage.show();
                }
                catch(IOException e){
                    System.out.println(e.getMessage());
                }
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Login");
                alert.setHeaderText("Wrong Username or Password.");
                alert.setContentText("Enter Correct Username or Password or Signup.");
                alert.show();
            }
        }
    }


    private int logIn(){
        int cont = 0;
        String un = username.getText().toString();
        String pss = password.getText().toString();
        ArrayList<Data> list = new ArrayList<Data>();
        try{
            FileReader fr = new FileReader("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\de-tour.txt");
            BufferedReader br = new BufferedReader(fr);
            String st;
            while ((st = br.readLine()) != null){
                String [] str = st.split(",");
                String a,b,c,d;
                a = str[0];
                b = str[1];
                c = str[2];
                d = str[3];
                //System.out.println(a+" "+b+" "+c+" "+d+"\n");
                Data data = new Data(a,b,c,d);
                list.add(data);
            }
            br.close();
            fr.close();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
//        for(Data i : list){
//            System.out.println(i.getUserName()+" "+i.getPassword());
//        }
        for(Data d : list){
            System.out.println(d.getUserName()+" "+d.getPassword());
            if(un.equals(d.getUserName()) && pss.equals(d.getPassword())){
                cont++;
            }

        }
        return cont;
    }
}
