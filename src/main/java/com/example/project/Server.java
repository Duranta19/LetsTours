package com.example.project;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args){
        try {
            ServerSocket ss = new ServerSocket(7777);
//            DataInputStream dis = new DataInputStream(s.getInputStream());
//            String str = null;
            while(true){
                Socket s = ss.accept();//establishes connection
                ServerMain serverMain = new ServerMain(s);
                Thread t  = new Thread(serverMain);
                t.start();
                t.join();

            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class ServerMain implements Runnable{
    BufferedReader reader;
    DataInputStream dis;
    //BufferedWriter writer;

    //final static ArrayList<ServerMain> clients = new ArrayList<>();

    ServerMain(Socket s){
        try {
//            OutputStreamWriter o = new OutputStreamWriter(s.getOutputStream());
//            writer = new BufferedWriter(o);
            dis = new DataInputStream(s.getInputStream());
            //reader = new BufferedReader(dis);
            //clients.add(this);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {

        try{
            String cmd = (String) dis.readUTF();

            if(cmd.equals("air")){
                String str =null;
                FileWriter fw1 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\\\AirTicket.txt");
                FileWriter fw2 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\\\claintTourInformation.txt", true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                while (true) {
                    str = (String)dis.readUTF();
                    if (str.equals("exit")) {
                        break;
                    }
                    bw1.write(str);
                    bw2.write(str);
                }
                bw1.close();
                bw2.close();
            }
            if(cmd.equals("bus")){
                String str =null;
                FileWriter fw1 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\\\BusTicket.txt");
                FileWriter fw2 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\\\claintTourInformation.txt", true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                while (true) {
                    str = (String)dis.readUTF();
                    if (str.equals("exit")) {
                        break;
                    }
                    bw1.write(str);
                    bw2.write(str);
                }
                bw1.close();
                bw2.close();
            }
            if(cmd.equals("train")){
                String str =null;
                FileWriter fw1 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\\\TrainTicket.txt");
                FileWriter fw2 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\\\claintTourInformation.txt", true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                while (true) {
                    str = (String)dis.readUTF();
                    if (str.equals("exit")) {
                        break;
                    }
                    bw1.write(str);
                    bw2.write(str);
                }
                bw1.close();
                bw2.close();
            }
            if(cmd.equals("button1")){
                String str =null;
                FileWriter fw1 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\HotelBook.txt");
                FileWriter fw2 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\\\claintTourInformation.txt", true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                BufferedWriter bw2 = new BufferedWriter(fw2);
//                bw1.write("Name : Long Beach Hotel Price: 4303 per Night");
//                bw1.newLine();
//                bw2.write("Name : Long Beach Hotel Price: 4303 per Night");
//                bw1.newLine();
                while (true) {
                    str = (String)dis.readUTF();
                    if (str.equals("exit")) {
                        break;
                    }
                    bw1.write(str);
                    //bw1.newLine();
                    bw2.write(str);
                    //bw1.newLine();
                }
                bw1.close();
                bw2.close();
            }
            if(cmd.equals("button2")){
                String str =null;
                FileWriter fw1 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\");
                FileWriter fw2 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\Provect_Version4.1[1269] (2)\\Provect_Version4.1[1269]\\Provect_Version4\\Provect_Version3.2\\Project\\src\\main\\resources\\com\\example\\project\\", true);
                BufferedWriter bw1 = new BufferedWriter(fw1);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                while (true) {
                    str = (String)dis.readUTF();
                    if (str.equals("exit")) {
                        break;
                    }
                    bw1.write(str);
                    bw2.write(str);

                }
                bw1.close();
                bw2.close();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
