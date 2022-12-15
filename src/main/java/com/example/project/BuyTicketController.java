//package com.example.project;
//
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.*;
//import javafx.scene.layout.AnchorPane;
//import javafx.stage.Stage;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.net.URL;
//import java.time.LocalDate;
//import java.util.ResourceBundle;
//
//public class BuyTicketController implements Initializable {
//
//    @FXML
//    private TabPane Tickets;
//
//    @FXML
//    private Tab Train;
//
//    @FXML
//    private TextField aTPrice;
//
//    @FXML
//    private TextField aTammount;
//
//    @FXML
//    private RadioButton ac;
//
//    @FXML
//    private Tab air;
//
//    @FXML
//    private ChoiceBox<String> airFrom;
//
//    @FXML
//    private DatePicker airReturn;
//
//    @FXML
//    private ChoiceBox<String> airTo;
//
//    @FXML
//    private DatePicker airdate;
//
//    @FXML
//    private ChoiceBox<String> airlines;
//
//    @FXML
//    private ChoiceBox<String> atime;
//
//    @FXML
//    private TextField bSeatAmount;
//
//    @FXML
//    private AnchorPane bTicket;
//
//    @FXML
//    private ChoiceBox<String> bTime;
//
//    @FXML
//    private Button bkash;
//
//    @FXML
//    private Button bkash1;
//
//    @FXML
//    private Button bkash2;
//
//    @FXML
//    private ChoiceBox<String> boardingPoint;
//
//    @FXML
//    private ChoiceBox<String> boardingPoint1;
//
//    @FXML
//    private TextField btP;
//
//    @FXML
//    private TextField btP1;
//
//    @FXML
//    private RadioButton buisness;
//
//    @FXML
//    private Tab bus;
//
//    @FXML
//    private ChoiceBox<String> busService;
//
//    @FXML
//    private ChoiceBox<String> busService1;
//
//    @FXML
//    private Button cancel;
//
//    @FXML
//    private Button cancel1;
//
//    @FXML
//    private Button cancle2;
//
//    @FXML
//    private Button card;
//
//    @FXML
//    private Button card1;
//
//    @FXML
//    private Button card2;
//
//    @FXML
//    private Button confirm;
//
//    @FXML
//    private Button confirm1;
//
//    @FXML
//    private Button confirm2;
//
//    @FXML
//    private DatePicker dDate;
//
//    @FXML
//    private DatePicker dDate1;
//
//    @FXML
//    private ChoiceBox<String> dFrom;
//
//    @FXML
//    private ChoiceBox<String> dFrom1;
//
//    @FXML
//    private ChoiceBox<String> dTo;
//
//    @FXML
//    private ChoiceBox<String> dTo1;
//
//    @FXML
//    private RadioButton economy;
//
//    @FXML
//    private Button nogad;
//
//    @FXML
//    private Button nogad1;
//
//    @FXML
//    private Button nogad2;
//
//    @FXML
//    private RadioButton nonac;
//
//    @FXML
//    private TextField pEmail;
//
//    @FXML
//    private TextField pEmail1;
//
//    @FXML
//    private TextField pEmail2;
//
//    @FXML
//    private TextField pName;
//
//    @FXML
//    private TextField pName1;
//
//    @FXML
//    private TextField pName2;
//
//    @FXML
//    private TextField pPhnNum;
//
//    @FXML
//    private TextField pPhnNum1;
//
//    @FXML
//    private TextField pPhnNum2;
//
//    @FXML
//    private DatePicker rDate;
//
//    @FXML
//    private DatePicker rDate1;
//
//    @FXML
//    private TextField tID;
//
//    @FXML
//    private TextField tID1;
//
//    @FXML
//    private TextField tSeatAmount;
//
//    @FXML
//    private RadioButton tacB;
//
//    @FXML
//    private RadioButton tacS;
//
//    @FXML
//    private TextField tnrxID;
//
//    @FXML
//    private RadioButton tsc;
//
//    @FXML
//    private RadioButton tsovan;
//
//    @FXML
//    private ChoiceBox<String> ttime;
//
//    Stage stage;
//    private String [] location ={"Dhaka","Dinajpur","Panchagor","Nilphamari","Kurigram","Rangpur","Cox's Bazar","Feni","Satkhira","Bogra","Naogaon","Chittagong", "Khulna","Sylhet","Barisal","Bandarban","Teknaf","Khagrachari","TMoulvibazar","Sreemangal","Rangamati","Rajshahi","Jessore","Kushtia"};
//    private String [] bordingPoints={"Gabtoli","Shamoly","Saydabad","Komlapur","Kallanpur","Mohakhali","Jatrabari"};
//    private String [] busServices ={"VOLVO TRAVELS","GREEN LINE","DESH TRAVELS","NATIONAL TRAVELS","HANIF PARIBAHAN","SHAMOLY PARIBAHAN","SAUDIA TRAVELS","SHOHAG EXPRESS","ENA TRAVELS","EAGLE PORIBAHAN"};
//    private String [] trainStation={"Komlapur","Bimanbondor","Dhaka_Cantonment","Pahartoli"};
//    private String [] trainName={"Akota Express","Nilsagor","Siam Express","Rangpur Express","Titumir Express","Khulna Express","Tista Express","Sundarban Express","Rupsha Express","Barendra Express"};
//    private String [] trainFrome={"Dhaka","Dhaka_Cantornment","Bimanbondor_Station","Gazipur Railway Station","Akkelpur Railway Station","Ishwardi Railway Station","Shantaher Railway Station","Gaibandha Railway Station","Chapai Nawabganj Railway Station","Comilla Railway Station","Chittagong Railway Station","Khulna Railway Station","Sreemangal Railway Station","Sylhet Railway Station"};
//    private String [] trainTo={"Dhaka","Dhaka_Cantornment","Bimanbondor_Station","Gazipur Railway Station","Akkelpur Railway Station","Ishwardi Railway Station","Shantaher Railway Station","Gaibandha Railway Station","Chapai Nawabganj Railway Station","Comilla Railway Station","Chittagong Railway Station","Khulna Railway Station","Sreemangal Railway Station","Sylhet Railway Station"};
//    private String [] trainTime={"00:20 AM","02:20 AM","06:40 AM","09:10 AM","10:10AM","11:40 AM","01:15 PM","02:10 PM","05:15 PM","08:00 PM","10:10 PM"};
//    private String [] airRoute ={"Shahjalal International Airport- Dhaka","Cox's Bazar Airport", "Osmani International Airport- Sylhet","Shah Amanat International Airport- Chattogram","Jessore Airport","Shah Makhdum Airport- Rajshahi","Saidpur Airport"};
//    private String [] AirLines ={"Biman Bangladesh Airlines","US-Bangla Airlines","NOVOAIR"};
//    private String[] flightAir = {"07:05","08:05","09:05","10:05","11:05","12:05","13:05","14:05","15:05","16:05","16:05","17:05","18:05","19:05","20:05","21:05","22:05"};
//
//
//    @FXML
//    void ACancel(ActionEvent event) {
//        stage = (Stage) bTicket.getScene().getWindow();
//        stage.close();
//    }
//
//    @FXML
//    void AConfirm(ActionEvent event) {
//        String name = pName2.getText();
//        String email = pEmail2.getText();
//        String phnNum = pPhnNum2.getText();
//        String deperatureDate = getdDateA();
//        String returnDate = getrDateA();
//        String locFrom = airFrom.getValue();;
//        String locTo = airTo.getValue();;
//        String airSer = airlines.getValue();
//        String rBtn = getAirClass();
//        String borTime = atime.getValue();
//        String numTicket = aTammount.getText();
//        String btPrice = aTPrice.getText();
//        String tid = tnrxID.getText();
//
//        try{
//            FileWriter fw1 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\ClassCode\\Provect_Version2.2.2\\Provect_Version2.2.2\\Provect_Version1\\Project\\src\\main\\resources\\com\\example\\project\\AirTicket.txt");
//            FileWriter fw2 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\ClassCode\\Provect_Version2.2.2\\Provect_Version2.2.2\\Provect_Version1\\Project\\src\\main\\resources\\com\\example\\project\\claintTourInformation.txt", true);
//            BufferedWriter bw1 = new BufferedWriter(fw1);
//            BufferedWriter bw2 = new BufferedWriter(fw2);
//
//            bw1.write("Name :"+name+"\n");
//            bw1.write("E-mail :"+email+"\n");
//            bw1.write("Phone Number :"+phnNum+"\n");
//            bw1.write("Departure date  :"+deperatureDate+"\n");
//            bw1.write("Return Date :"+returnDate+"\n");
//            bw1.write("Train Name :"+airSer+"\n");
//            bw1.write("From :"+locFrom+"\n");
//            bw1.write("To :"+locTo+"\n");
//            bw1.write("Boarding Time :"+borTime+"\n");
//            bw1.write("Number of Tickets :"+numTicket+"\n");
//            bw1.write("AC/Non AC :"+rBtn+"\n");
//            bw1.write("Ticket Price :"+btPrice);
//            bw1.write("Boarding Time :"+borTime+"\n");
//            bw1.write("Transaction ID :"+tid+"\n");
//            bw1.newLine();
//            bw1.close();
//            fw1.close();
//
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
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Buy Train Ticket");
//        alert.setHeaderText("Purchase Successful");
//        alert.setContentText("You have purchase train ticket Successfully");
//        alert.show();
//    }
//
//    @FXML
//    void Cancel(ActionEvent event) {
//        stage = (Stage) bTicket.getScene().getWindow();
//        stage.close();
//    }
//
//
//    @FXML
//    void Confirm(ActionEvent event) {
//        String name = pName.getText();
//        String email = pEmail.getText();
//        String phnNum = pPhnNum.getText();
//        String deperatureDate = getdDate();
//        String returnDate = getrDate();
//        String locFrom = dFrom.getValue();;
//        String locTo = dTo.getValue();;
//        String busSer = busService.getValue();
//        String rBtn = getBusClass();
//        String borTime = bTime.getValue();
//        String numTicket = bSeatAmount.getText();
//        String BPoint = boardingPoint.getValue();
//        String btPrice = btP.getText();
//        String tid = tID.getText();
//
//        try{
//            FileWriter fw1 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\ClassCode\\Provect_Version2.2.2\\Provect_Version2.2.2\\Provect_Version1\\Project\\src\\main\\resources\\com\\example\\project\\BusTicket.txt");
//            FileWriter fw2 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\ClassCode\\Provect_Version2.2.2\\Provect_Version2.2.2\\Provect_Version1\\Project\\src\\main\\resources\\com\\example\\project\\claintTourInformation.txt", true);
//            BufferedWriter bw1 = new BufferedWriter(fw1);
//            BufferedWriter bw2 = new BufferedWriter(fw2);
//
//            bw1.write("Name :"+name+"\n");
//            bw1.write("E-mail :"+email+"\n");
//            bw1.write("Phone Number :"+phnNum+"\n");
//            bw1.write("Departure date  :"+deperatureDate+"\n");
//            bw1.write("Return Date :"+returnDate+"\n");
//            bw1.write("Bus Service Name :"+busSer+"\n");
//            bw1.write("From :"+locFrom+"\n");
//            bw1.write("To :"+locTo+"\n");
//            bw1.write("Boarding Point :"+BPoint+"\n");
//            bw1.write("Boarding Time :"+borTime+"\n");
//            bw1.write("Number of Tickets :"+numTicket+"\n");
//            bw1.write("AC/Non AC :"+rBtn+"\n");
//            bw1.write("Ticket Price :"+btPrice);
//            bw1.write("Boarding Time :"+borTime+"\n");
//            bw1.write("Transaction ID :"+tid+"\n");
//            bw1.newLine();
//            bw1.close();
//            fw1.close();
//
//            bw2.write("Name :"+name+"\n");
//            bw2.write("E-mail :"+email+"\n");
//            bw2.write("Phone Number :"+phnNum+"\n");
//            bw2.write("Departure date  :"+deperatureDate+"\n");
//            bw2.write("Return Date :"+returnDate+"\n");
//            bw2.write("Bus Service Name :"+busSer+"\n");
//            bw2.write("From :"+locFrom+"\n");
//            bw2.write("To :"+locTo+"\n");
//            bw2.write("Boarding Point :"+BPoint+"\n");
//            bw2.write("Boarding Time :"+borTime+"\n");
//            bw2.write("Number of Tickets :"+numTicket+"\n");
//            bw2.write("AC/Non AC :"+rBtn+"\n");
//            bw2.write("Ticket Price :"+btPrice+"\n");
//            bw2.write("Transaction ID :"+tid+"\n");
//            bw2.newLine();
//            bw2.newLine();
//            bw2.close();
//            fw2.close();
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Buy Bus Ticket");
//        alert.setHeaderText("Purchase Successful");
//        alert.setContentText("You have purchase bus ticket Successfully");
//        alert.show();
//    }
//
//
//    @FXML
//    void TCancel(ActionEvent event) {
//        stage = (Stage) bTicket.getScene().getWindow();
//        stage.close();
//    }
//
//    @FXML
//    void TConfirm(ActionEvent event) {
//        String name = pName1.getText();
//        String email = pEmail1.getText();
//        String phnNum = pPhnNum1.getText();
//        String deperatureDate = getdDateT();
//        String returnDate = getrDateT();
//        String locFrom = dFrom1.getValue();;
//        String locTo = dTo1.getValue();;
//        String busSer = busService1.getValue();
//        String rBtn = getTrainClass();
//        String borTime = ttime.getValue();
//        String numTicket = tSeatAmount.getText();
//        String BPoint = boardingPoint1.getValue();
//        String btPrice = btP1.getText();
//        String tid = tID1.getText();
//
//        try{
//            FileWriter fw1 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\ClassCode\\Provect_Version2.2.2\\Provect_Version2.2.2\\Provect_Version1\\Project\\src\\main\\resources\\com\\example\\project\\TrainTicket.txt");
//            FileWriter fw2 = new FileWriter("E:\\Study\\6th Trimester\\A_OOP\\ClassCode\\Provect_Version2.2.2\\Provect_Version2.2.2\\Provect_Version1\\Project\\src\\main\\resources\\com\\example\\project\\claintTourInformation.txt", true);
//            BufferedWriter bw1 = new BufferedWriter(fw1);
//            BufferedWriter bw2 = new BufferedWriter(fw2);
//
//            bw1.write("Name :"+name+"\n");
//            bw1.write("E-mail :"+email+"\n");
//            bw1.write("Phone Number :"+phnNum+"\n");
//            bw1.write("Departure date  :"+deperatureDate+"\n");
//            bw1.write("Return Date :"+returnDate+"\n");
//            bw1.write("Train Name :"+busSer+"\n");
//            bw1.write("From :"+locFrom+"\n");
//            bw1.write("To :"+locTo+"\n");
//            bw1.write("Boarding Point :"+BPoint+"\n");
//            bw1.write("Boarding Time :"+borTime+"\n");
//            bw1.write("Number of Tickets :"+numTicket+"\n");
//            bw1.write("AC/Non AC :"+rBtn+"\n");
//            bw1.write("Ticket Price :"+btPrice);
//            bw1.write("Boarding Time :"+borTime+"\n");
//            bw1.write("Transaction ID :"+tid+"\n");
//            bw1.newLine();
//            bw1.close();
//            fw1.close();
//
//            bw2.write("Name :"+name+"\n");
//            bw2.write("E-mail :"+email+"\n");
//            bw2.write("Phone Number :"+phnNum+"\n");
//            bw2.write("Departure date  :"+deperatureDate+"\n");
//            bw2.write("Return Date :"+returnDate+"\n");
//            bw2.write("Bus Service Name :"+busSer+"\n");
//            bw2.write("From :"+locFrom+"\n");
//            bw2.write("To :"+locTo+"\n");
//            bw2.write("Boarding Point :"+BPoint+"\n");
//            bw2.write("Boarding Time :"+borTime+"\n");
//            bw2.write("Number of Tickets :"+numTicket+"\n");
//            bw2.write("AC/Non AC :"+rBtn+"\n");
//            bw2.write("Ticket Price :"+btPrice+"\n");
//            bw2.write("Transaction ID :"+tid+"\n");
//            bw2.newLine();
//            bw2.newLine();
//            bw2.close();
//            fw2.close();
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Buy Train Ticket");
//        alert.setHeaderText("Purchase Successful");
//        alert.setContentText("You have purchase train ticket Successfully");
//        alert.show();
//    }
//
//    @FXML
//    void bkash(ActionEvent event) {
//
//    }
//
//    @FXML
//    void Card(ActionEvent event) {
//
//    }
//
//    @FXML
//    void Nogad(ActionEvent event) {
//
//    }
//    @FXML
//    public String getdDate() {
//        LocalDate depDate = dDate.getValue();
//        String deptDate = depDate.toString();
//        return deptDate;
//    }
//
//    @FXML
//    public String getdDateA() {
//        LocalDate depDate2 = airdate.getValue();
//        String deptDate1 = depDate2.toString();
//        return deptDate1;
//    }
//
//    @FXML
//    public String getdDateT() {
//        LocalDate depDate1 = dDate1.getValue();
//        String deptDate1 = depDate1.toString();
//        return deptDate1;
//    }
//
//    @FXML
//    public String getrDate() {
//        LocalDate reDate = rDate.getValue();
//        String retDate = reDate.toString();
//        return retDate;
//    }
//
//    @FXML
//    public String getrDateA() {
//        LocalDate reDate2 = airReturn.getValue();
//        String retDate2 = reDate2.toString();
//        return  retDate2;
//    }
//
//    @FXML
//    public String getrDateT() {
//        LocalDate reDate1 = rDate1.getValue();
//        String retDate1 = reDate1.toString();
//        return retDate1;
//    }
//
//
//    @Override
//    public void initialize(URL arg0, ResourceBundle arg1) {
//        dFrom.getItems().addAll(location);
//        dTo.getItems().addAll(location);
//        busService.getItems().addAll(busServices);
//        boardingPoint.getItems().addAll(bordingPoints);
//        boardingPoint1.getItems().addAll(trainStation);
//        busService1.getItems().addAll(trainName);
//        dFrom1.getItems().addAll(trainFrome);
//        dTo1.getItems().addAll(trainTo);
//        ttime.getItems().addAll(trainTime);
//        bTime.getItems().addAll(trainTime);
//        airFrom.getItems().addAll(airRoute);
//        airTo.getItems().addAll(airRoute);
//        airlines.getItems().addAll(AirLines);
//        atime.getItems().addAll(flightAir);
//    }
//
//    public String getBusClass(){
//        String c;
//        if(ac.isSelected()){
//            c = ac.getText();
//        }
//        else {
//            c = nonac.getText();
//        }
//        return c;
//    }
//
//    public String getTrainClass(){
//        String c;
//        if(tacB.isSelected()){
//            c = tacB.getText();
//        }
//        else if(tacS.isSelected()){
//            c = tacS.getText();
//        }
//        else if(tsc.isSelected()){
//            c = tsc.getText();
//        }
//        else {
//            c = tsovan.getText();
//        }
//        return c;
//    }
//
//    public String getAirClass(){
//        String c;
//        if(economy.isSelected()){
//            c = economy.getText();
//        }
//        else {
//            c = buisness.getText();
//        }
//        return c;
//    }
//}
