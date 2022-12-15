package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.net.Socket;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class BuyTicketController2 implements Initializable, Runnable  {
    public BuyTicketController2(){
        Thread t = new Thread(this);
        t.start();
    }

    @FXML
    private TabPane Tickets;

    @FXML
    private Tab Train;

    @FXML
    private TextField aTPrice;

    @FXML
    private TextField aTammount;

    @FXML
    private RadioButton ac;

    @FXML
    private Tab air;

    @FXML
    private ChoiceBox<String> airFrom;

    @FXML
    private DatePicker airReturn;

    @FXML
    private ChoiceBox<String> airTo;

    @FXML
    private DatePicker airdate;

    @FXML
    private ChoiceBox<String> airlines;

    @FXML
    private ChoiceBox<String> atime;

    @FXML
    private TextField bSeatAmount;

    @FXML
    private AnchorPane bTicket;

    @FXML
    private ChoiceBox<String> bTime;

    @FXML
    private Button bkash;

    @FXML
    private Button bkash1;

    @FXML
    private Button bkash2;

    @FXML
    private ChoiceBox<String> boardingPoint;

    @FXML
    private ChoiceBox<String> boardingPoint1;

    @FXML
    private TextField btP;

    @FXML
    private TextField btP1;

    @FXML
    private RadioButton buisness;

    @FXML
    private Tab bus;

    @FXML
    private ChoiceBox<String> busService;

    @FXML
    private ChoiceBox<String> busService1;

    @FXML
    private Button cancel;

    @FXML
    private Button cancel1;

    @FXML
    private Button cancle2;

    @FXML
    private Button card;

    @FXML
    private Button card1;

    @FXML
    private Button card2;

    @FXML
    private Button confirm;

    @FXML
    private Button confirm1;

    @FXML
    private Button confirm2;

    @FXML
    private DatePicker dDate;

    @FXML
    private DatePicker dDate1;

    @FXML
    private ChoiceBox<String> dFrom;

    @FXML
    private ChoiceBox<String> dFrom1;

    @FXML
    private ChoiceBox<String> dTo;

    @FXML
    private ChoiceBox<String> dTo1;

    @FXML
    private RadioButton economy;

    @FXML
    private Button nogad;

    @FXML
    private Button nogad1;

    @FXML
    private Button nogad2;

    @FXML
    private RadioButton nonac;

    @FXML
    private TextField pEmail;

    @FXML
    private TextField pEmail1;

    @FXML
    private TextField pEmail2;

    @FXML
    private TextField pName;

    @FXML
    private TextField pName1;

    @FXML
    private TextField pName2;

    @FXML
    private TextField pPhnNum;

    @FXML
    private TextField pPhnNum1;

    @FXML
    private TextField pPhnNum2;

    @FXML
    private DatePicker rDate;

    @FXML
    private DatePicker rDate1;

    @FXML
    private TextField tID;

    @FXML
    private TextField tID1;

    @FXML
    private TextField tSeatAmount;

    @FXML
    private RadioButton tacB;

    @FXML
    private RadioButton tacS;

    @FXML
    private TextField tnrxID;

    @FXML
    private RadioButton tsc;

    @FXML
    private RadioButton tsovan;

    @FXML
    private ChoiceBox<String> ttime;

    @FXML
    private Button gtp;

    @FXML
    private Button gtp1;

    @FXML
    private Button gtp2;
    @FXML
    private Button ts;

    @FXML
    private Button ts1;

    @FXML
    private Button ts2;

    //private String tidCheck = null;

    Stage stage;
    private String [] location ={"Dhaka","Cox's Bazar","Satkhira","Chittagong","Sylhet","Bandarban","Teknaf","Khagrachari","Sreemangal"};
    private String [] bordingPoints={"Gabtoli","Shamoly","Saydabad","Komlapur","Kallanpur","Mohakhali","Jatrabari", "Bahdderhat Bus Terminal", "Saltgola Bus Stop", "Moulvibazer Bus Stop", "Habigonj Bus Stand", "Kolatoli Bus Stand", "Central Bus Terminal Cox's Bazar","Sylhet Bus Stand"};
    private String [] busServices ={"VOLVO TRAVELS","GREEN LINE","DESH TRAVELS","NATIONAL TRAVELS","HANIF PARIBAHAN","SHAMOLY PARIBAHAN","SAUDIA TRAVELS","SHOHAG EXPRESS","ENA TRAVELS","EAGLE PORIBAHAN"};
    private String [] trainStation={"Komlapur","Bimanbondor","Dhaka_Cantonment","Pahartoli"};
    private String [] trainName={"Akota Express","Nilsagor","Siam Express","Rangpur Express","Titumir Express","Khulna Express","Tista Express","Sundarban Express","Rupsha Express","Barendra Express"};
    private String[] trainFrome = {"Dhaka", "Chottogram", "Feni", "Khulna", "Rajshahi", "Comilla Railway Station", "Sylhet Railway Station", "SreeMangal"};
    //private String [] trainTo={"Dhaka","Dhaka_Cantornment","Bimanbondor_Station","Gazipur Railway Station","Akkelpur Railway Station","Ishwardi Railway Station","Shantaher Railway Station","Gaibandha Railway Station","Chapai Nawabganj Railway Station","Comilla Railway Station","Chittagong Railway Station","Khulna Railway Station","Sreemangal Railway Station","Sylhet Railway Station"};
    private String [] trainTime={"00:20 AM","02:20 AM","06:40 AM","09:10 AM","10:10AM","11:40 AM","01:15 PM","02:10 PM","05:15 PM","08:00 PM","10:10 PM"};
    private String [] airRoute ={"Shahjalal International Airport- Dhaka","Cox's Bazar Airport", "Osmani International Airport- Sylhet","Shah Amanat International Airport- Chattogram","Jessore Airport","Shah Makhdum Airport- Rajshahi","Saidpur Airport"};
    private String [] AirLines ={"Biman Bangladesh Airlines","US-Bangla Airlines","NOVOAIR"};
    private String[] flightAir = {"07:05","08:05","09:05","10:05","11:05","12:05","13:05","14:05","15:05","16:05","16:05","17:05","18:05","19:05","20:05","21:05","22:05"};




    @FXML
    void ACancel(ActionEvent event) {
        stage = (Stage) bTicket.getScene().getWindow();
        stage.close();
    }

    @FXML
    void AConfirm(ActionEvent event) {
        String name = pName2.getText();
        String email = pEmail2.getText();
        String phnNum = pPhnNum2.getText();
        String deperatureDate = getdDateA();
        String returnDate = getrDateA();
        String locFrom = airFrom.getValue();;
        String locTo = airTo.getValue();;
        String airSer = airlines.getValue();
        String rBtn = getAirClass();
        String borTime = atime.getValue();
        String numTicket = aTammount.getText();
        String btPrice = aTPrice.getText();
        String tid = tnrxID.getText();

        try{
            Socket s=new Socket("localhost",7777);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            dout.writeUTF("air");
            dout.flush();
            dout.writeUTF("Name :"+name+"\n");
            dout.flush();
            dout.writeUTF("E-mail :"+email+"\n");
            dout.flush();
            dout.writeUTF("Phone Number :"+phnNum+"\n");
            dout.flush();
            dout.writeUTF("Departure date  :"+deperatureDate+"\n");
            dout.flush();
            dout.writeUTF("Return Date :"+returnDate+"\n");
            dout.flush();
            dout.writeUTF("Train Name :"+airSer+"\n");
            dout.flush();
            dout.writeUTF("From :"+locFrom+"\n");
            dout.flush();
            dout.writeUTF("To :"+locTo+"\n");
            dout.flush();
            dout.writeUTF("Boarding Time :"+borTime+"\n");
            dout.flush();
            dout.writeUTF("Number of Tickets :"+numTicket+"\n");
            dout.flush();
            dout.writeUTF("AC/Non AC :"+rBtn+"\n");
            dout.flush();
            dout.writeUTF("Ticket Price :"+btPrice);
            dout.flush();
            dout.writeUTF("Boarding Time :"+borTime+"\n");
            dout.flush();
            dout.writeUTF("Transaction ID :"+tid+"\n");
            dout.flush();
            dout.writeUTF("exit");
            s.close();


//            bw2.write("Name :"+name+"\n");
//            bw2.write("E-mail :"+email+"\n");
//            bw2.write("Phone Number :"+phnNum+"\n");
//            bw2.write("Departure date  :"+deperatureDate+"\n");
//            bw2.write("Return Date :"+returnDate+"\n");
//            bw2.write("Bus Service Name :"+airSer+"\n");
//            bw2.write("From :"+locFrom+"\n");
//            bw2.write("To :"+locTo+"\n");
//            bw2.write("Boarding Time :"+borTime+"\n");
//            bw2.write("Number of Tickets :"+numTicket+"\n");
//            bw2.write("AC/Non AC :"+rBtn+"\n");
//            bw2.write("Ticket Price :"+btPrice+"\n");
//            bw2.write("Transaction ID :"+tid+"\n");
//            bw2.newLine();
//            bw2.newLine();
//            bw2.close();
//            fw2.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Buy Train Ticket");
        alert.setHeaderText("Purchase Successful");
        alert.setContentText("You have purchase train ticket Successfully");
        alert.show();
    }

    @FXML
    void Cancel(ActionEvent event) {
        stage = (Stage) bTicket.getScene().getWindow();
        stage.close();
    }


    @FXML
    void Confirm(ActionEvent event) {

        String name = pName.getText();
        String email = pEmail.getText();
        String phnNum = pPhnNum.getText();
        String deperatureDate = getdDate();
        String returnDate = getrDate();
        String locFrom = dFrom.getValue();;
        String locTo = dTo.getValue();;
        String busSer = busService.getValue();
        String rBtn = getBusClass();
        String borTime = bTime.getValue();
        String numTicket = bSeatAmount.getText();
        String BPoint = boardingPoint.getValue();
        String btPrice = btP.getText();
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

        System.out.println(tidCh);
        System.out.println(tid);
        if(( tidCh.equals(tid) ||  tidCh1.equals(tid) || tidCh2.equals(tid) )  ) {
            try {
                Socket s = new Socket("localhost", 7777);
                DataOutputStream dout = new DataOutputStream(s.getOutputStream());

                dout.writeUTF("bus");
                dout.flush();

                dout.writeUTF("Name :" + name + "\n");
                dout.flush();
                dout.writeUTF("E-mail :" + email + "\n");
                dout.flush();
                dout.writeUTF("Phone Number :" + phnNum + "\n");
                dout.flush();
                dout.writeUTF("Departure date  :" + deperatureDate + "\n");
                dout.flush();
                dout.writeUTF("Return Date :" + returnDate + "\n");
                dout.flush();
                dout.writeUTF("Bus Service Name :" + busSer + "\n");
                dout.flush();
                dout.writeUTF("From :" + locFrom + "\n");
                dout.flush();
                dout.writeUTF("To :" + locTo + "\n");
                dout.flush();
                dout.writeUTF("Boarding Point :" + BPoint + "\n");
                dout.flush();
                dout.writeUTF("Boarding Time :" + borTime + "\n");
                dout.flush();
                dout.writeUTF("Number of Tickets :" + numTicket + "\n");
                dout.flush();
                dout.writeUTF("AC/Non AC :" + rBtn + "\n");
                dout.flush();
                dout.writeUTF("Ticket Price :" + btPrice + "\n");
                dout.flush();
                dout.writeUTF("Boarding Time :" + borTime + "\n");
                dout.flush();
                dout.writeUTF("Transaction ID :" + tid + "\n\n");
                dout.flush();
                dout.writeUTF("exit");
                s.close();


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Buy Bus Ticket");
            alert.setHeaderText("Purchase Successful");
            alert.setContentText("You have purchase bus ticket Successfully");
            alert.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Buy Bus Ticket");
            alert.setHeaderText("Wrong Transaction ID");
            alert.setContentText("Please Enter a valid Transaction ID");
            alert.show();
        }


    }


    @FXML
    void TCancel(ActionEvent event) {
        stage = (Stage) bTicket.getScene().getWindow();
        stage.close();
    }

    @FXML
    void TConfirm(ActionEvent event) {
        String name = pName1.getText();
        String email = pEmail1.getText();
        String phnNum = pPhnNum1.getText();
        String deperatureDate = getdDateT();
        String returnDate = getrDateT();
        String locFrom = dFrom1.getValue();;
        String locTo = dTo1.getValue();;
        String busSer = busService1.getValue();
        String rBtn = getTrainClass();
        String borTime = ttime.getValue();
        String numTicket = tSeatAmount.getText();
        String BPoint = boardingPoint1.getValue();
        String btPrice = btP1.getText();
        String tid = tID1.getText();

        try{
            Socket s=new Socket("localhost",7777);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());

            dout.writeUTF("train");
            dout.flush();

            dout.writeUTF("Name :"+name+"\n");
            dout.flush();
            dout.writeUTF("E-mail :"+email+"\n");
            dout.flush();
            dout.writeUTF("Phone Number :"+phnNum+"\n");
            dout.flush();
            dout.writeUTF("Departure date  :"+deperatureDate+"\n");
            dout.flush();
            dout.writeUTF("Return Date :"+returnDate+"\n");
            dout.flush();
            dout.writeUTF("Train Name :"+busSer+"\n");
            dout.flush();
            dout.writeUTF("From :"+locFrom+"\n");
            dout.flush();
            dout.writeUTF("To :"+locTo+"\n");
            dout.flush();
            dout.writeUTF("Boarding Point :"+BPoint+"\n");
            dout.flush();
            dout.writeUTF("Boarding Time :"+borTime+"\n");
            dout.flush();
            dout.writeUTF("Number of Tickets :"+numTicket+"\n");
            dout.flush();
            dout.writeUTF("AC/Non AC :"+rBtn+"\n");
            dout.flush();
            dout.writeUTF("Ticket Price :"+btPrice);
            dout.flush();
            dout.writeUTF("Boarding Time :"+borTime+"\n");
            dout.flush();
            dout.writeUTF("Transaction ID :"+tid+"\n\n");
            dout.flush();
            dout.writeUTF("exit");
            s.close();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Buy Train Ticket");
        alert.setHeaderText("Purchase Successful");
        alert.setContentText("You have purchase train ticket Successfully");
        alert.show();
    }

    @FXML
    void bkash(ActionEvent event) {
        if(event.getSource().equals(bkash)){
            //setFareBus();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Bkash.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BkashController obj = fxmlLoader.getController();
                obj.setAmnt(btP.getText());
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
        if(event.getSource().equals(bkash1)){
            //setFareBus();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Bkash.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BkashController obj = fxmlLoader.getController();
                obj.setAmnt(btP1.getText());
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
        if(event.getSource().equals(bkash2)){
            //setFareBus();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Bkash.fxml"));
                Parent root;
                root = fxmlLoader.load();
                BkashController obj = fxmlLoader.getController();
                obj.setAmnt(aTPrice.getText());
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

    @FXML
    void Card(ActionEvent event) {
        if(event.getSource().equals(card)){
            setFareBus();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CardNameScene.fxml"));
                Parent root;
                root = fxmlLoader.load();
                cardController obj = fxmlLoader.getController();
                obj.setAmnt(btP.getText());
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
        if(event.getSource().equals(card1)){
            //setFareBus();
            setFareTrain();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CardNameScene.fxml"));
                Parent root;
                root = fxmlLoader.load();
                cardController obj = fxmlLoader.getController();
                obj.setAmnt(btP1.getText());
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Payment");
                stage.setResizable(false);
                Image icon = new Image(getClass().getResourceAsStream("download.png"));
                stage.getIcons().add(icon);
                stage.show();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        if(event.getSource().equals(card2)){
            setFareAir();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CardNameScene.fxml"));
                Parent root;
                root = fxmlLoader.load();
                cardController obj = fxmlLoader.getController();
                obj.setAmnt(aTPrice.getText());
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("Payment");
                stage.setResizable(false);
                Image icon = new Image(getClass().getResourceAsStream("download.png"));
                stage.getIcons().add(icon);
                stage.show();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    @FXML
    void Nogad(ActionEvent event) {
        if(event.getSource().equals(nogad)){
            //setFareBus();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Nagad.fxml"));
                Parent root;
                root = fxmlLoader.load();
                NagadController obj = fxmlLoader.getController();
                obj.setAmnt(btP.getText());
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
        if(event.getSource().equals(nogad1)){
            //setFareBus();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Nagad.fxml"));
                Parent root;
                root = fxmlLoader.load();
                NagadController obj = fxmlLoader.getController();
                obj.setAmnt(btP1.getText());
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
        if(event.getSource().equals(nogad2)){
            //setFareBus();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Nagad.fxml"));
                Parent root;
                root = fxmlLoader.load();
                NagadController obj = fxmlLoader.getController();
                obj.setAmnt(aTPrice.getText());
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
    @FXML
    public String getdDate() {
        LocalDate depDate = dDate.getValue();
        String deptDate = depDate.toString();
        return deptDate;
    }

    @FXML
    public String getdDateA() {
        LocalDate depDate2 = airdate.getValue();
        String deptDate1 = depDate2.toString();
        return deptDate1;
    }

    @FXML
    public String getdDateT() {
        LocalDate depDate1 = dDate1.getValue();
        String deptDate1 = depDate1.toString();
        return deptDate1;
    }

    @FXML
    public String getrDate() {
        LocalDate reDate = rDate.getValue();
        String retDate = reDate.toString();
        return retDate;
    }

    @FXML
    public String getrDateA() {
        LocalDate reDate2 = airReturn.getValue();
        String retDate2 = reDate2.toString();
        return  retDate2;
    }

    @FXML
    public String getrDateT() {
        LocalDate reDate1 = rDate1.getValue();
        String retDate1 = reDate1.toString();
        return retDate1;
    }

    @FXML
    void getTicketPrice(ActionEvent event) {
        if(event.getSource().equals(gtp)){
            setFareBus();
        }

        if (event.getSource().equals(gtp1)){
            setFareTrain();
        }
        if (event.getSource().equals(gtp2)){
            setFareAir();
        }
    }





    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        dFrom.getItems().addAll(location);
        dTo.getItems().addAll(location);
        busService.getItems().addAll(busServices);
        boardingPoint.getItems().addAll(bordingPoints);
        boardingPoint1.getItems().addAll(trainStation);
        busService1.getItems().addAll(trainName);
        dFrom1.getItems().addAll(trainFrome);
        dTo1.getItems().addAll(trainFrome);
        ttime.getItems().addAll(trainTime);
        bTime.getItems().addAll(trainTime);
        airFrom.getItems().addAll(airRoute);
        airTo.getItems().addAll(airRoute);
        airlines.getItems().addAll(AirLines);
        atime.getItems().addAll(flightAir);

    }

    public String getBusClass(){
        String c;
        if(ac.isSelected()){
            c = ac.getText();
        }
        else {
            c = nonac.getText();
        }
        return c;
    }

    public String getTrainClass(){
        String c;
        if(tacB.isSelected()){
            c = tacB.getText();
        }
        else if(tacS.isSelected()){
            c = tacS.getText();
        }
        else if(tsc.isSelected()){
            c = tsc.getText();
        }
        else {
            c = tsovan.getText();
        }
        return c;
    }

    public String getAirClass(){
        String c;
        if(economy.isSelected()){
            c = economy.getText();
        }
        else {
            c = buisness.getText();
        }
        return c;
    }

//    void TransID(String x){
//        tidCheck = x;
//    }
//    @FXML
//    void tShow(ActionEvent event, String x) {
//        if(event.getSource().equals(ts)){
//            tID.setText(x);
//        }
//    }

    void setFareBus(){
        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Cox's Bazar")) ||(dFrom.getValue().equals("Cox's Bazar") && dTo.getValue().equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*1200;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*900;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Sylhet")) ||(dFrom.getValue().equals("Sylhet") && dTo.getValue().equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*700;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*480;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Bandarban")) ||(dFrom.getValue().equals("Bandarban") && dTo.getValue().equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*1000;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*650;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Khagrachari")) ||(dFrom.equals("Khagrachari") && dTo.equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*1000;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*650;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Teknaf")) ||(dFrom.equals("Teknaf") && dTo.equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*1000;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*650;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Cox's Bazar") && dTo.getValue().equals("Teknaf")) ||(dFrom.equals("Teknaf") && dTo.equals("Cox's Bazar"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*1000;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*650;
                btP.setText(Integer.toString(cost));
            }
        }

        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Chittagong")) ||(dFrom.getValue().equals("Chittagong") && dTo.getValue().equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*1000;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*650;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Sreemangal")) ||(dFrom.getValue().equals("Sreemangal") && dTo.getValue().equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*1000;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*650;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Sylhet") && dTo.getValue().equals("Sreemangal")) ||(dFrom.getValue().equals("Sreemangal") && dTo.getValue().equals("Sylhet"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*400;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*150;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Satkhira")) ||(dFrom.getValue().equals("Satkhira") && dTo.getValue().equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*900;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*340;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Chittagong") && dTo.getValue().equals("Cox's Bazar")) ||(dFrom.getValue().equals("Cox's Bazar") && dTo.getValue().equals("Chittagong"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*600;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*350;
                btP.setText(Integer.toString(cost));
            }
        }
        if((dFrom.getValue().equals("Dhaka") && dTo.getValue().equals("Teknaf")) ||(dFrom.getValue().equals("Teknaf") && dTo.getValue().equals("Dhaka"))){
            if(getBusClass().equals("AC")){
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*1300;
                btP.setText(Integer.toString(cost));
            }
            else{
                int p = Integer.parseInt(bSeatAmount.getText());
                int cost = 2*p*950;
                btP.setText(Integer.toString(cost));
            }
        }

    }

    void setFareTrain() {
        if ((dFrom1.getValue().equals("Dhaka") && dTo1.getValue().equals("Sylhet Railway Station")) || (dFrom1.getValue().equals("Sylhet Railway Station") && dTo1.getValue().equals("Dhaka"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 955;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 640;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 320;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 230;
                btP1.setText(Integer.toString(cost));
            }
        }
        if ((dFrom1.getValue().equals("Dhaka") && dTo1.getValue().equals("Chottogram")) || (dFrom1.getValue().equals("Chottogram") && dTo1.getValue().equals("Dhaka"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 1075;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 715;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 360;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 315;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Dhaka") && dTo1.getValue().equals( "Feni")) || (dFrom1.getValue().equals("Feni") && dTo1.getValue().equals("Dhaka"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 540;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 430;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 265;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 220;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Dhaka") && dTo1.getValue().equals("Khulna")) || (dFrom1.getValue().equals("Khulna") && dTo1.getValue().equals("Dhaka"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 1505;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 890;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 445;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 340;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Dhaka") && dTo1.getValue().equals("Comilla Railway Station")) || (dFrom1.getValue().equals("Comilla Railway Station") && dTo1.getValue().equals("Dhaka"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 545;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 405;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 205;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = p * 170;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Dhaka") && dTo1.getValue().equals("SreeMangal")) || (dFrom1.getValue().equals("SreeMangal") && dTo1.getValue().equals("Dhaka"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 640;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 480;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 240;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 200;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Dhaka") && dTo1.getValue().equals("Rajshahi")) || (dFrom1.getValue().equals("Rajshahi") && dTo1.getValue().equals("Dhaka"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 1020;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 680;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 340;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 200;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Feni") && dTo1.getValue().equals( "Chottogram")) || (dFrom1.getValue().equals("Chottogram") && dTo1.getValue().equals("Feni"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 320;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 240;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 200;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 180;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Feni") && dTo1.getValue().equals( "Khulna")) || (dFrom1.getValue().equals("Khulna") && dTo1.getValue().equals("Feni"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 310;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 250;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 210;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 190;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Feni") && dTo1.getValue().equals( "Rajshahi")) || (dFrom1.getValue().equals("Rajshahi") && dTo1.getValue().equals("Feni"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 350;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 290;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 210;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 190;
                btP1.setText(Integer.toString(cost));
            }
        }


        if ((dFrom1.getValue().equals("Feni") && dTo1.getValue().equals( "Comilla Railway Station")) || (dFrom1.getValue().equals("Comilla Railway Station") && dTo1.getValue().equals("Feni"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 200;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 180;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 150;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 140;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Feni") && dTo1.getValue().equals( "Sylhet Railway Station")) || (dFrom1.getValue().equals("Sylhet Railway Station") && dTo1.getValue().equals("Feni"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 200;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 180;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 150;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 140;
                btP1.setText(Integer.toString(cost));
            }
        }
///
        if ((dFrom1.getValue().equals("Feni") && dTo1.getValue().equals( "SreeMangal")) || (dFrom1.getValue().equals("SreeMangal") && dTo1.getValue().equals("Feni"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 400;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 345;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 215;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 180;
                btP1.setText(Integer.toString(cost));
            }
        }


        if ((dFrom1.getValue().equals("Khulna") && dTo1.getValue().equals( "Chottogram")) || (dFrom1.getValue().equals("Chottogram") && dTo1.getValue().equals("Khulna"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 1050;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 850;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 450;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 350;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Khulna") && dTo1.getValue().equals( "Rajshahi")) || (dFrom1.getValue().equals("Rajshahi") && dTo1.getValue().equals("Khulna"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 610;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 515;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 310;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 290;
                btP1.setText(Integer.toString(cost));
            }
        }


        if ((dFrom1.getValue().equals("Khulna") && dTo1.getValue().equals( "Comilla Railway Station")) || (dFrom1.getValue().equals("Comilla Railway Station") && dTo1.getValue().equals("Khulna"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 510;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 415;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 340;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 290;
                btP1.setText(Integer.toString(cost));
            }
        }
        if ((dFrom1.getValue().equals("Khulna") && dTo1.getValue().equals( "Sylhet Railway Station")) || (dFrom1.getValue().equals("Sylhet Railway Station") && dTo1.getValue().equals("Khulna"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 710;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 615;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 440;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 390;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Khulna") && dTo1.getValue().equals( "SreeMangal")) || (dFrom1.getValue().equals("SreeMangal") && dTo1.getValue().equals("Khulna"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 990;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 755;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 440;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 390;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Rajshahi") && dTo1.getValue().equals( "Chottogram")) || (dFrom1.getValue().equals("Chottogram") && dTo1.getValue().equals("Rajshahi"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 610;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 515;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 415;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 300;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Rajshahi") && dTo1.getValue().equals( "Comilla Railway Station")) || (dFrom1.getValue().equals("Comilla Railway Station") && dTo1.getValue().equals("Rajshahi"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 730;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 615;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 490;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 380;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Rajshahi") && dTo1.getValue().equals( "Sylhet Railway Station")) || (dFrom1.getValue().equals("Sylhet Railway Station") && dTo1.getValue().equals("Rajshahi"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 890;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 715;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 530;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 440;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Rajshahi") && dTo1.getValue().equals( "SreeMangal")) || (dFrom1.getValue().equals("SreeMangal") && dTo1.getValue().equals("Rajshahi"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 1140;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 930;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 650;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 550;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Comilla Railway Station") && dTo1.getValue().equals( "Chottogram")) || (dFrom1.getValue().equals("Chottogram") && dTo1.getValue().equals("Comilla Railway Station"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 510;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 450;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 360;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 215;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Comilla Railway Station") && dTo1.getValue().equals( "Sylhet Railway Station")) || (dFrom1.getValue().equals("Sylhet Railway Station") && dTo1.getValue().equals("Comilla Railway Station"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 540;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 460;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 370;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 235;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Comilla Railway Station") && dTo1.getValue().equals( "SreeMangal")) || (dFrom1.getValue().equals("SreeMangal") && dTo1.getValue().equals("Comilla Railway Station"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 590;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost =2* p * 490;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 380;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 255;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Sylhet Railway Station") && dTo1.getValue().equals( "Chottogram")) || (dFrom1.getValue().equals("Chottogram") && dTo1.getValue().equals("Sylhet Railway Station"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 540;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 440;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 340;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 245;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("Sylhet Railway Station") && dTo1.getValue().equals( "SreeMangal")) || (dFrom1.getValue().equals("SreeMangal") && dTo1.getValue().equals("Sylhet Railway Station"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 440;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 340;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 240;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 195;
                btP1.setText(Integer.toString(cost));
            }
        }

        if ((dFrom1.getValue().equals("SreeMangal") && dTo1.getValue().equals( "Chottogram")) || (dFrom1.getValue().equals("Chottogram") && dTo1.getValue().equals("SreeMangal"))) {
            if (getTrainClass().equals("AC_B")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 340;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("AC_S")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 320;
                btP1.setText(Integer.toString(cost));
            } else if (getTrainClass().equals("S_CHAIR")) {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 235;
                btP1.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(tSeatAmount.getText());
                int cost = 2*p * 195;
                btP1.setText(Integer.toString(cost));
            }
        }



    }
    void setFareAir() {
        if ((airFrom.getValue().equals("Shahjalal International Airport- Dhaka") && airTo.getValue().equals("Cox's Bazar Airport")) || (airFrom.getValue().equals("Cox's Bazar Airport") && airTo.getValue().equals("Shahjalal International Airport- Dhaka"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 5822;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 4280;
                aTPrice.setText(Integer.toString(cost));
            }
        }

        if ((airFrom.getValue().equals("Shahjalal International Airport- Dhaka") && airTo.getValue().equals("Osmani International Airport- Sylhet")) || (airFrom.getValue().equals("Osmani International Airport- Sylhet") && airTo.getValue().equals("Shahjalal International Airport- Dhaka"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 4320;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 3228;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Shahjalal International Airport- Dhaka") && airTo.getValue().equals("Shah Amanat International Airport- Chattogram")) || (airFrom.getValue().equals("Shah Amanat International Airport- Chattogram") && airTo.getValue().equals("Shahjalal International Airport- Dhaka"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 4380;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 3228;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Shahjalal International Airport- Dhaka") && airTo.getValue().equals("Jessore Airport")) || (airFrom.getValue().equals("Jessore Airport") && airTo.getValue().equals("Shahjalal International Airport- Dhaka"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 4250;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 3228;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Shahjalal International Airport- Dhaka") && airTo.getValue().equals("Shah Makhdum Airport- Rajshahi")) || (airFrom.getValue().equals("Shah Makhdum Airport- Rajshahi") && airTo.getValue().equals("Shahjalal International Airport- Dhaka"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 4280;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 3228;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Shahjalal International Airport- Dhaka") && airTo.getValue().equals("Saidpur Airport")) || (airFrom.getValue().equals("Saidpur Airport") && airTo.getValue().equals("Shahjalal International Airport- Dhaka"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 4200;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 3228;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Cox's Bazar Airport") && airTo.getValue().equals("Saidpur Airport")) || (airFrom.getValue().equals("Saidpur Airport") && airTo.getValue().equals("Cox's Bazar Airport"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 9300;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 7000;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Cox's Bazar Airport") && airTo.getValue().equals("Osmani International Airport- Sylhet")) || (airFrom.getValue().equals("Osmani International Airport- Sylhet") && airTo.getValue().equals("Cox's Bazar Airport"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 9380;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 7400;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Cox's Bazar Airport") && airTo.getValue().equals("Shah Amanat International Airport- Chattogram")) || (airFrom.getValue().equals("Shah Amanat International Airport- Chattogram") && airTo.getValue().equals("Cox's Bazar Airport"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 9350;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 7400;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Cox's Bazar Airport") && airTo.getValue().equals("Jessore Airport")) || (airFrom.getValue().equals("Jessore Airport") && airTo.getValue().equals("Cox's Bazar Airport"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = p * 9500;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 7700;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Cox's Bazar Airport") && airTo.getValue().equals("Shah Makhdum Airport- Rajshahi")) || (airFrom.getValue().equals("Jessore Airport") && airTo.getValue().equals("Shah Makhdum Airport- Rajshahi"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = p * 9300;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 7700;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Osmani International Airport- Sylhet") && airTo.getValue().equals("Shah Amanat International Airport- Chattogram")) || (airFrom.getValue().equals("Shah Amanat International Airport- Chattogram") && airTo.getValue().equals("Osmani International Airport- Sylhet"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 9390;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 6280;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Osmani International Airport- Sylhet") && airTo.getValue().equals("Jessore Airport")) || (airFrom.getValue().equals("Jessore Airport") && airTo.getValue().equals("Osmani International Airport- Sylhet"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = p * 9380;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 6280;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Osmani International Airport- Sylhet") && airTo.getValue().equals("Shah Makhdum Airport- Rajshahi")) || (airFrom.getValue().equals("Shah Makhdum Airport- Rajshahi") && airTo.getValue().equals("Osmani International Airport- Sylhet"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 10800;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 8400;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Osmani International Airport- Sylhet") && airTo.getValue().equals("Saidpur Airport")) || (airFrom.getValue().equals("Saidpur Airport") && airTo.getValue().equals("Osmani International Airport- Sylhet"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 8400;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 6225;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Shah Amanat International Airport- Chattogram") && airTo.getValue().equals("Saidpur Airport")) || (airFrom.getValue().equals("Saidpur Airport") && airTo.getValue().equals("Shah Amanat International Airport- Chattogram"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 6900;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 6225;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Shah Amanat International Airport- Chattogram") && airTo.getValue().equals("Jessore Airport")) || (airFrom.getValue().equals("Jessore Airport") && airTo.getValue().equals("Shah Amanat International Airport- Chattogram"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 6618;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 5400;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Shah Amanat International Airport- Chattogram") && airTo.getValue().equals("Shah Makhdum Airport- Rajshahi")) || (airFrom.getValue().equals("Shah Makhdum Airport- Rajshahi") && airTo.getValue().equals("Shah Amanat International Airport- Chattogram"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 8400;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 6800;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Jessore Airport") && airTo.getValue().equals("Saidpur Airport")) || (airFrom.getValue().equals("Saidpur Airport") && airTo.getValue().equals("Jessore Airport"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 8500;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 7500;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Jessore Airport") && airTo.getValue().equals("Shah Makhdum Airport- Rajshahi")) || (airFrom.getValue().equals("Shah Makhdum Airport- Rajshahi") && airTo.getValue().equals("Jessore Airport"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 8580;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost = 2*p * 7500;
                aTPrice.setText(Integer.toString(cost));
            }
        }
        if ((airFrom.getValue().equals("Shah Makhdum Airport- Rajshahi") && airTo.getValue().equals("Saidpur Airport")) || (airFrom.getValue().equals("Saidpur Airport") && airTo.getValue().equals("Shah Makhdum Airport- Rajshahi"))) {
            if (getAirClass().equals("Business")) {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 8480;
                aTPrice.setText(Integer.toString(cost));
            } else {
                int p = Integer.parseInt(aTammount.getText());
                int cost =2* p * 7500;
                aTPrice.setText(Integer.toString(cost));
            }
        }

    }

    @Override
    public void run() {
        setFareBus();
        setFareTrain();
        setFareAir();
    }
}
