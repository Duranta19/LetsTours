package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.BufferedReader;
import java.io.FileReader;
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

    @FXML
    private Label slts;

    @FXML
    void login(ActionEvent event) {
        if(event.getSource() == login){
            if(logIn() > 0){
                slts.setText("Login");
            }
            else{
                slts.setText("Try Again");
            }
        }
    }

    @FXML
    void signup(ActionEvent event) {

    }
    private int logIn(){
        int cont = 0;
        String un = username.getText().toString();
        String pss = password.getText().toString();
        ArrayList<Data> list = new ArrayList<Data>();
        try{
            FileReader fr = new FileReader("E:\\Study\\6th Trimester\\A_OOP\\Project\\src\\main\\resources\\com\\example\\project\\de-tour.txt");
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
