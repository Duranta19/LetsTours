package com.example.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Let's Go Tours.");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
//    public static void fileHandel() throws IOException{
//        ArrayList<Data> list = new ArrayList<Data>();
//        try{
//            FileReader fr = new FileReader("E:\\Study\\6th Trimester\\A_OOP\\Project\\src\\main\\resources\\com\\example\\project\\de-tour.txt");
//            BufferedReader br = new BufferedReader(fr);
//            String st;
//            while ((st=br.readLine()) != null){
//                String [] str = st.split(",");
//                String a,b,c,d;
//                a = str[0];
//                b = str[1];
//                c = str[2];
//                d = str[3];
//                Data data = new Data(a,b,c,d);
//                list.add(data);
//            }
//        }
//        catch(IOException e){
//            System.out.println(e.getMessage());
//        }
//
//    }

    public static void main(String[] args) {
        launch();
    }
}