package com.example.project;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Objects;

public class TravelSuggestion {
    @FXML
    private Label titelbox;

    @FXML
    private TextArea  description;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private MenuButton selectPlace;

    public void coxsBazaar(ActionEvent event){
        titelbox.setText(" Cox's Bazaar");
        description.setText("Cox’s Bazar beach is the longest undivided beach in the world (সমুদ্র সৈকত). \n" +
                "One of the most significant features of this 120km long sea beach is that the \n" +
                "whole beach is sandy, mud does not exist here. During the tourist season the \n" +
                "state of art, hotel, motel cottages, and newly decorated Burmese markets the \n" +
                "Cox’s Bazar city bustle with tourists visiting the coral market, stalls of \n" +
                "various species of snails and oysters adjacent to Baliari beach.\n" +
                "\n" +
                "The activities of Bangladesh Tourism Corporation and the local Sea-Beach \n" +
                "Management Committee are working to beautify Cox’s Bazar beach. The old oyster\n" +
                "market has been demolished and the newly built modern oyster market ‘Beach Park\n" +
                "Market’ in the form of an eight-colored umbrella is truly worth seeing. Although\n" +
                "there is space for construction of eight shops in each market, with mutual \n" +
                "understanding the shopkeepers have built sixteen instead of eight and in some\n" +
                " cases twenty.\n" +
                "\n" +
                "Three more similar umbrella markets are under construction. In addition to \n" +
                "snail-oyster and coral shops, these markets include various shops including \n" +
                "Burmese products, cosmetics, fast food, cooling corners, dry goods, studios, \n" +
                "mobile shops. At the entrance to the beach, under the financial patronage of \n" +
                "Cox’s Bazar District Council, the eye-catching Beach Garden Cum Park and Oyster\n" +
                " Market with 26 shops have been constructed. A two-storeyed observation tower \n" +
                "and a permanent open stage for the district administration have been constructed\n" +
                " at Laboni Point in front of the garden with the funding of the district council\n" +
                " and the supervision of the Beach Management Committee.\n" +
                "\n" +
                "Cox’s Bazar beach is a magical and beautiful beach. Every day and each time it \n" +
                "changes its form. No matter what the season is, winter, monsoon, spring or summer,\n" +
                " the look of the beach is very different. It is different in the morning and \n" +
                "different in the afternoon. There is a big difference between the weather on the\n" +
                " beach at dusk and the weather at night.\n" +
                "That’s why Captain Cox’s beach is so much appreciated by domestic and foreign\n" +
                " tourists. They come to embrace the sea-beach, to bathe, to enjoy its beauty to \n" +
                "the fullest and to enjoy the fresh air in an unadulterated and safe environment.\n" +
                "\n" +
                "In order to increase the popularity of sea-beach, the authorities organize open\n" +
                "concerts, national and international beach-football, beach-volleyball, beach-cricket\n" +
                "competitions, national whirlwind festivals, sand sculptures and other events on \n" +
                "various national and important days.\n" +
                "\n" +
                "To make surfing a popular sport in Bangladesh, the local administration has \n" +
                "given temporary permission to set up a temporary surfing cottage for a surfing \n" +
                "club at Laboni Point on Sea-Beach. The recent addition of beach police for the \n" +
                "safety of tourists on the beach is undoubtedly a commendable initiative of the \n" +
                "government.\n" +
                "\n" +
                "There are permanent-temporary billboards and banners at the initiative of the \n" +
                "district administration and the district council to display the tides. In addition,\n" +
                " the local administration has given conditional permission to a few private \n" +
                "companies to install LCD TV monitors at Kalatali, Sugandha and Laboni points on \n" +
                "the beach to promote cyclone and tidal public awareness and educational \n" +
                "advertisements.\n" +
                "\n" +
                "Beach bikes, jet skis, horse-drawn carriages or horses at Cox’s Bazar’s Silver \n" +
                "Beach provide delightful feelings for tourists. Due to the installation of many \n" +
                "changing rooms, bathrooms, toilets on the beach, tourists are not having any\n" +
                " difficulty in responding to the natural call.\n" +
                "\n" +
                "When to go:\n" +
                "...........\n" +
                "The peak season in Cox’s Bazar is October to March. At this time more tourists \n" +
                "come as there is less rain. In addition, the beaches are more enjoyable in the \n" +
                "winter, but the crowd is more nevertheless. Despite the off-peak season, there \n" +
                "are many tourists after two Eids and three days of holidays. It is not right to\n" +
                " go without booking at this time. Off-season hotels offer discounts of 30% to 60%.\n" +
                " In addition, the waves are much larger during the rainy season. Ships to St.\n" +
                " Martin usually run from October to April. If you want to go to St. Martin, you \n" +
                "can go at that time.\n" +
                "\n" +
                "Accommodation:\n" +
                "................\n" +
                "At present, the hotels in Cox’s Bazar have a capacity of about 150,000 people. \n" +
                "So even if you don’t book, there is a possibility of getting a hotel. However, \n" +
                "at the end of December and the beginning of the new year, it would not be right \n" +
                "to take this risk. Cox’s Bazar hotels / motels / resorts can be divided into \n" +
                "three categories according to the price.\n" +
                "6,000-10,000: Mermaid Beach Resort, Simon Beach Resort, Ocean Paradise, Long Beach,\n" +
                " Cox’s today, Heritage, etc. 3,000-6,000: Sea Palace, Sea Gal, Coral Reef, \n" +
                "Nitol Resort, Islandia, Beach View, Sea Crown, Uni Resort etc.\n" +
                " 800 – 3,000: Urmi Guest House, Coral Reef, Ikra Beach Resort, Abhisar, \n" +
                "Media Inn, Kallol, Honeymoon Resort, Nilima Resort etc. There are also some \n" +
                "low cost hotels available (such as Zia Guest House), so look for them.\n" +
                "\n" +
                "Keep in mind in off season the rent of hotels can be discounted to more than half.\n" +
                " If there is an opportunity, it is best to go down to Cox’s Bazar and find a hotel\n" +
                " by bargaining with the hotel manager. The hotel should not be searched on the \n" +
                "advice of rickshaw pullers or CNG drivers. Now almost all the hotels have a \n" +
                "Facebook page or website, from there you can also contact the number first. \n" +
                "But it is better to book from December 15 to January 15. Also, if you go on \n" +
                "working days, you can get more discounts than weekends.\n" +
                "\n" +
                "Apart from hotels, some flats are also available for rent. If you have a large\n" +
                " family, this type of flat may be more suitable for you. Rent for 2/3/4 bed \n" +
                "room AC / non AC, kitchen with such flat will be 2,000 to 15,000 taka per day. \n" +
                "Phone number of such a flat house (Alpha Web, Kalatali Road 01715683956), \n" +
                "Voyager (01616100400). There are also many more in Hotel Islander Alley, you can \n" +
                "explore.\n" +
                "\n" +
                "Eating arrangements:\n" +
                "....................\n" +
                "There are many restaurants to eat in Cox’s Bazar. Among the budget restaurants, \n" +
                "the names of Zhaoban and Poushi restaurant come first. There are several \n" +
                "restaurants like this, the quality of the food is pretty much the same. They are \n" +
                "Rodela, Dhansindri, Niribili. The price list according to the menu is given below. \n" +
                "In different seasons price may vary Rice: 20-40tk, Mixed vhorta: 75/150/300 \n" +
                "(8-10 items) Loitta Fry: 100-120 (6-10 pieces per plate) Coral / Vetki: 150 \n" +
                "(per piece, beef: 150-200 (2 person can share) Rupchanda Fry / cooked: 300-400 \n" +
                "(Large, 2 people can eat), Pulses: 30-60 Particularly notable name Poushi. \n" +
                "It’s located in the town a little further from the hotel zone. Rickshaw / \n" +
                "auto will take 50 tk. The prices are pretty much the same. But the crowd is \n" +
                "too much because the food is good. Besides, you can eat Hyderabadi Biryani at \n" +
                "Handi Restaurant for 200-250 taka. Located at Laboni Point. There is also KFC \n" +
                "if anyone wants to eat.\n" +
                "\n" +
                "How to go:\n" +
                "............\n" +
                "Buses from Cox’s Bazar run directly to major cities, including the capital Dhaka.\n" +
                " For example, Chittagong, Khulna, Sylhet, Rangpur etc. There are many non-AC \n" +
                "vehicles from Dhaka. Shyamoli, TR, Hanif, Unique, S Alam, Soudia, etc. The rent \n" +
                "will be 800 taka. And if you want to go by AC-bus then Green Line, Saidia, Desh \n" +
                "Travels, TR, Sohag etc. Rent will be 1600 (economy class) to 2000 taka (business \n" +
                "class). It may take about 12-14 hours. There is also a service called St. Martin’s\n" +
                " Transport which runs to Teknaf. Unique and Shyamli services are good for non AC \n" +
                "and Desh and TR Travels and Desh Travels services are good for AC.\n" +
                "\n" +
                "From Chittagong, Cox’s Bazar car is available every hour from BahaddarHat. Most \n" +
                "cars are also extremely local. Good service is provided by S Alam and Saidia, \n" +
                "dispatches from Garibullah Shah Mazar, Dampara. The fare of local buses is 150-200\n" +
                " taka and direct buses are 350-400 taka.\n" +
                "\n" +
                "You can also go by plane. Return fares range from tk 8,000 to tk 12,000. One way \n" +
                "fares start at tk 5,000. US Bangla, NovoAir, Bangladesh Biman goes to Cox’s Bazar.\n" +
                " The condition of United Air is not good, it is better not to travel in it. If \n" +
                "you want to go at a low cost, air is the best way, but you have to buy a ticket \n" +
                "first.\n" +
                "\n" +
                "Many people want to go to Chittagong by train and then from there to Cox’s Bazar.\n" +
                " In that case you have to come to Chittagong from Dhaka by Turna-Nishitha, \n" +
                "Suborn Express, Mahanagar Prabhati / Godhuli, Chittagong Mail. You can take a \n" +
                "BRTC bus from the BRTC counter on the opposite side of Chittagong Railway Station\n" +
                " to Cox’s Bazar. Or take CNG to New Bridge or Dampara and get in the car of Cox’s \n" +
                "Bazar. You can know the detailed train schedule and fare from the railway’s website.\n");
        image1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("coxsbazar.jpg"))));
        image2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("coxbazar2.jpg"))));

    }
    public void sajek(ActionEvent event){
        titelbox.setText(" Sajek Valley");
        description.setText("Sajek valley is 2000 feet above sea level. Sajek valley is known as the Queen of \n" +
                "Hills & Roof of Rangamati. The name of Sajek Valley came from Sajek River that \n" +
                "originates from Karnafuli river. Sajek river is working as a border between \n" +
                "Bangladesh and India. Sajek valley resorts are made on the side of the hill to \n" +
                "provide the unique experience of tribal lifestyle.\n" +
                "\n" +
                "Sajek valley is famous for its natural beauty. The valley is surrounded by mountains,\n" +
                " dense forest, grasslands hilly tracks. Many small rivers flow through the mountains \n" +
                "among which Kachalong and Machalong are notable. On the way to Sajek valley, one has\n" +
                " to cross the Mayni range and Mayni river.\n" +
                "\n" +
                "The road to Sajek has high picks and falls. The native people of Sajek valley are \n" +
                "ethnic minorities. Among them Chakma, Marma, Tripura, Pankua, Lushai and Sagma are\n" +
                " mentionable. Women seem to be more involved in economic activities here. Tea stalls,\n" +
                " food joints, and roadside marketplaces are dominated by women. People, in general, \n" +
                "are gentle, welcoming and friendly. Picking fruits and vegetables early in the morning\n" +
                " is a major trade here. They are not fluent in Bengali but the young population speaks\n" +
                " English confidently.\n" +
                "\n" +
                "HIGHLIGHTS: \n" +
                "* 2 Days & 1 Night\n" +
                "* Stay at Eco Resort on top of Sajek\n" +
                "* Alutila Cave, Hazachora & Risang Waterfall expedition\n" +
                "* Hiking to Konglok Para/Village\n" +
                "* Enjoy Chander Gari ride on hilly roads\n" +
                "\n" +
                "Day 1: Valley of Clouds\n" +
                "The trip will start from khagrachari Twon.\n" +
                "7 AM: Breakfast will be served at a local restaurant at Khagrachori town. After break\n" +
                "fast our guide will pick you up with a 4x4 Land Cruiser or Chander Gari.\n" +
                "8 AM: Journey to Sajek Valley by Chander Gari. It’ll take 2 hours to reach Bhagaichor\n" +
                "i from where Army will escort the vehicle to Sajek Valley. From Bhagaichori, it’ll \n" +
                "take another 2 hours to reach the final destination, Sajek Valley.\n" +
                "12 PM: Reached at Sajek Valley and check into the eco resort.\n" +
                "2 PM: Lunch will be served at a local restaurant with standard Bengali menu plain \n" +
                "rice, vhorta, vegetable, chicken curry, dal, water at Sajek Valley.\n" +
                "3 PM: Visiting Konglok Para. It is highest point of Sajek valley. There’s a small \n" +
                "village on the top of Konglok Para. So, you’ll experience the tribal lifestyle.\n" +
                "6 PM: Enjoy mesmerizing sunset from the Helipad of Sajek. The view from the helipad \n" +
                "is something unique & amazing.\n" +
                "9 PM: Dinner will be served with Chicken BBQ, Paratha & Soft drinks.\n" +
                "Night will be spent at the resort in a shared room.\n" +
                "\n" +
                "Day 2: Alutila Cave & Risang Waterfall\n" +
                "Enjoy the early morning view of the cloud of the valley from the resort.\n" +
                "8 AM: Breakfast will be served with Khichuri& Egg / Paratha, Egg, Vegetable & Tea.\n" +
                "9 AM: Start journey towards Khagrachori town by Chander Gari.\n" +
                "1 PM: Reached at Khagrachoi town & lunch with standard Bengali menu plain rice, \n" +
                "vhorta, vegetable, chicken curry, dal, water\n" +
                "3 PM: Visiting Alutila cave You’ll definitely love the Alutila Cave expedition \n" +
                "with a fire torch which will make you feel old stone age.\n" +
                "5 PM: Visiting Horticulture park.\n" +
                "8 PM: Dinner will be served at a local restaurant in Khagrachori town.\n" +
                "The trip will end at khagrachari town.");
        image1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("sajek1.jpg"))));
        image2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("sajek2.jpg"))));
    }

    public void SylhetJaflong(ActionEvent event){
        titelbox.setText(" Jaflong – Sylhet");
        description.setText("Jaflong of Sylhet is called the daughter of nature. This is a lovely land of natural\n" +
                "beauty on the foothils of Jointa hill. The decorted stone on the bank of Pian river \n" +
                "increases its beauty.\n" +
                "\n" +
                "High hills of India beyond the border, Water fall from the Dauki hill, swinging Dauki\n" +
                "Bridge, Crystal water of Pian river, deep forest on high hills, quiet and clam \n" +
                "environment will fascinated you. For its unimaginable beauty Jaflong is also called \n" +
                "the Beauty spot, Picnic spot, the queen of beauty. So, Jaflong considered as very \n" +
                "attractive place for the tourist. If you go to Shylet you can never miss to visit \n" +
                "Jaflong.\n" +
                "\n" +
                "Location:\n" +
                ".........\n" +
                "Jaflong is situated at Goainghat Upazila in Shylet district. From Sylhet \n" +
                "city Jaflong is about 56 km.\n" +
                "\n" +
                "How will you go Jaflong:\n" +
                "........................\n" +
                "You can go Jaflong from Sylhet by bus, micro bus, or CNG auto Rickshaw. It would \n" +
                "take 1 hour to 1.30 hour. It would take 80 tk. per passenger. If you want to take \n" +
                "reserve and for round trip it would take 3000 to 3500tk. for micro bus. For CNG you \n" +
                "would need 1000 to 1200tk. You can rent micro bus or CNG from any bus station or \n" +
                "auto rickshaw station from Sylhet city to go Jaflong.");
        image1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("jaflong.jpg"))));
        image2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("jaflong2.jpg"))));
    }
        public void Ratargul(ActionEvent event){
        titelbox.setText("Ratargul Swamp Forest");
        description.setText("Ratargul Swamp Forest is only one swamp forest of Bangladesh. It is called the Amazan\n" +
                "of Bangladesh. It is about 26 km away from Sylhet city and situated on the border area\n" +
                " of Shylet under the Goain ghat area. Goain river flows in north, large hoar in south.\n" +
                " And between this two is Ratargul swamp forest. Ratargul swamp forest is one of the \n" +
                "most beautiful tourist spot/place in Sylhet.\n" +
                "\n" +
                "According to wikipedia, there are 22 sweet water swamp forest in the world. In this \n" +
                "indian subcontinent are only two Swamp Forest . And this one is Ratargul, another one\n" +
                " in Srilanka. This a beatiful forest as you can only compare with Amazon. As like\n" +
                " Amazon it is a forest of vast sweet water and swamp forest.\n" +
                "\n" +
                "If you vistit there in winter you will not get the real scenery of Ratargul. Because\n" +
                " that time you will see the dry leaf is dorpping, the lake of water turn into small \n" +
                "hole and sometimes it is using the country road for walking. However, in the rainy \n" +
                "season it get full of its youth. It fills with water. Lots of fishes and aquatic \n" +
                "animals get their life back. The hills rainfall and steream rush to Ratargul. It \n" +
                "fills with water. Most of the tree dive into water. Some are standing up to rise \n" +
                "their head on the water. Water and tree mix together. Small fishes jump into the \n" +
                "water.\n" +
                "\n" +
                "Wonderful world: under the water\n" +
                ".................................\n" +
                "Really it would be fantastic experience to see the tree diving into the crystal water.\n" +
                " Though in winter you will get another scenery. Such as after decreasing the water, \n" +
                "there will be rise murta and jail (one kinds of Rattan) garden. This is another beauty\n" +
                " of this forest. In the rainy season the forest keep in water for four to seven \n" +
                "months. You have to enter there with small boat. Goain River will be the way to \n" +
                "reach there. Along with sight-seeing bank of river you can see the high hills of \n" +
                "Mizoram (an Indian states). You will be fascinated to see this lovely nature.\n" +
                "\n" +
                "How To go Ratargul:\n" +
                "......................\n" +
                "You can go Ratargul in different ways. But where from you go? First of all  you \n" +
                "have to go from Sylhet. then from Sylhet you can go Ratargul  easily.\n" +
                "\n" +
                "1st way: \n" +
                "Sylhet to Jaflong– In the Tamabil road vs Sharghat to reach Goainghat. \n" +
                "Then you have to rent a engine boat to reach ratargul bit office. It would take 900\n" +
                " tk. To 1500 tk. For round trip. It would take 2 hour. After reaching bit office \n" +
                "you have to take small boat to enter this swampy forest. It have to pay 200 to 300 \n" +
                "tk. Per hour.\n" +
                "\n" +
                "2nd way: \n" +
                "You can take a CNG paying 500tk from ambarkana point of shylet and reach \n" +
                "Goain ghat. This a beautiful road in the rainy season, Osmani airport vs Shalutikor.\n" +
                " Then reach in Goainghat rest are the same to 1st way.\n" +
                "\n" +
                "There is another way, you can take a CNG from the Ambarkana point paying 200 to \n" +
                "300tk then reach in Motorghat ( Shaheb bazar). Then you can take small boat paying\n" +
                " 200 to 300 tk to reach the swampy frost. It would take 200 to 300 tk. Per hour. \n" +
                "You can save money and time in this way. It might be cheapest way to trip Ratargul.\n");
        image1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("ratargul.jpg"))));
        image2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("ratargul2.jpg"))));
    }
        public void srimangal(ActionEvent event){
        titelbox.setText(" Srimangal");
        description.setText("Tea Garden\n" +
                "=============\n" +
                "450sq km Srimangal can be called the capital of tea in Bangladesh. The magnificent \n" +
                "beauty of lots of tea garden attract the tourists. After seeing lots of tea garden \n" +
                "mile after mile it will appear that there is a green carpet on the slopes of \n" +
                "mountains. Tea of best quality of the country are generated here.\n" +
                "\n" +
                "Sylhet has a great contribution to the country’s economy by producing tea. By \n" +
                "exporting this tea country earn lots of remittance every year. Tea garden of \n" +
                "Srimongol is one of them.\n" +
                "\n" +
                "Obligingly it would be unforgettable if you visit tea garden of Srimongol. Those \n" +
                "tea garden are conveying the memory of British rule. British introduced the \n" +
                "cultivation of tea. And even still now the managers of this kind of tea garden \n" +
                "live white wooden house as  like them. You will be fascinated to see the Banglow \n" +
                "which is decorated in the large tea garden. There lifestyle has much similarity \n" +
                "with british period.\n" +
                "\n" +
                "You will be fascinated to see the Banglow which is decorated in the large tea \n" +
                "garden. There lifestyle has much similarity with british period.\n" +
                "\n" +
                "There 163 tea garden in various place of Bangladesh and the largest are three. \n" +
                "About 3 lakh people are working there. 75% of them are female and 25% are male labor.\n" +
                " Especially the female and ethnic labor are much demanded here. Because they are \n" +
                "apt to pick up tea leaf from the tree.\n" +
                "==================================================================================\n" +
                "\n" +
                "Ham Ham waterfall\n" +
                "==================\n" +
                "Ham Ham or Cita Jorna (waterfall) is situated at Kurma bit area in Rajkandi deep \n" +
                "reserve forest under the Upazila Komolgonj in Moulovibazar district. A tourist \n" +
                "team along with tourist guide Shyamol debobarma  discovered this waterfall at the \n" +
                "end of 2010.\n" +
                "\n" +
                "It is about 135 or 147 or 160 feet high. Whereas Madobkondo the tallest waterfall \n" +
                "of the country is about 162 feet high. This is only the assumption of tourist. \n" +
                "There is no authority to measure this. But researcher give their opinion that its \n" +
                "range would be three times than Madobkonda.\n" +
                "\n" +
                "How was it naming hamham? There are different opinion about naming. Someone says \n" +
                "that there is a relation between (gosol) bath and jhorna( waterfall). So, it comes \n" +
                "from Ham + Ham to hammam. Hammam means bathroom.\n" +
                "\n" +
                "Hamham get its full rhythm in raiy season. water onrush to the below. But in winter \n" +
                "it lose its youth and get into narrow stream. There are lots of flow created from \n" +
                "this spreaded waterfall. You have to go through within craggy path to reach there. \n" +
                "Usually the tourist hire local people as guider to visit there. Morever there is no \n" +
                "infrustracture on behalf of govt. yet.\n" +
                "\n" +
                "You have to go through on Champaray tea garden to reach in waterfall. It is about \n" +
                "7km from champaray tea garden to Hamham waterfall. You have to pass through on \n" +
                "small elevation, small pathway, streamy and muddy way. You have to bear the biting \n" +
                "of mosquito.If you visit here in rainy season, you will get another small water \n" +
                "fall in the pathway. In Hamaham, there are two step of falling. Water is falling \n" +
                "in the middle from the top and then water is falling in the below again. \n" +
                "Inhabitants of this area are Indigenous Tripura.\n" +
                "\n" +
                "There are banana, jarul, chikrashi, and Kadam trees in rows on the way. Butterfly \n" +
                "is flying through the forest. Lots of entellus are playing on the branch of fig \n" +
                "tree and cane garden. There are various species of bamboo named Dolu,muli,khali etc.\n" +
                " Tourist take necessary food and water to pass the extreme path. But they show \n" +
                "apathy to take back this used plastic bottle and packet. They throw this things \n" +
                "here and there. So, environment are being messy for this.\n" +
                "\n" +
                "====================================================================================\n" +
                "\n" +
                "Lawachara National Park\n" +
                "========================\n" +
                "Lawachara alive with Biodiversity which is situated at Kamalganj Upazila in \n" +
                "Moulovi  bazar. It is about 10 km away from the capital of tea Srimongol on \n" +
                "west besides Srimongol vs Komolgonj road. Among seven wildlife sanctuaries and \n" +
                "ten national parks of Bangladesh, Lawachara National Park is one of them. This \n" +
                "evergreen forest is considered as a safe habitat of extinct ape. This woodland is \n" +
                "famous for various rare animals, insects and trees. Lauachora is very popular to \n" +
                "the tourist after Sundarbon.\n" +
                "\n" +
                "How it comes. The history is very ancient of Lawachara National Park . British \n" +
                "government at first started to planting trees in 1925. Increasing this kinds of \n" +
                "trees gradually now it has created a woodland called Lawachara . In 1996 government\n" +
                " gave it the status of national park.\n" +
                "\n" +
                "This forest contains 460 species of rare wildlife and plant. Among them 167 species \n" +
                "of plants, Four species of amphibians, Six species of reptiles, 20 species of \n" +
                "mammals and 246 species of birds. The main attraction of Lauachora is almost \n" +
                "extinct ape. They live along with their family in High branches of tree. Various \n" +
                "kinds of monkey, tiger, fox and deer are seen there also. Among the birds green \n" +
                "doves, moorfowl, parrot, cuckoo etc. There are lot of tree such as Gorjon, Gamar, \n" +
                "Jamrul, Segun, Chapalish, Shimul, Nagesswar etc.\n" +
                "\n" +
                "Its structure is consisted with a great combination of low and high elevation. \n" +
                "Sometime you can get the way of walk through the forest. There is much sand under \n" +
                "the ground in here. There are several mountain springs have passed through the \n" +
                "forest. But those are full of water in rainy season.\n" +
                "\n" +
                " \n" +
                "\n" +
                "How to go Lawachara National Park:\n" +
                "From srimongol town you can go to  Lawachara National Park by your own vehicles or \n" +
                "you have to use CNG or Zip.\n" +
                "==================================================================================\n" +
                "\n" +
                "\n" +
                "Dhaka to Srimongol by bus:\n" +
                "..........................\n" +
                "\n" +
                "There are lot of transport in Dhaka to Srimongol road. Like Hanif Paribahan, \n" +
                "Shyamoli Paribahan, Mamun Enterprise and Syleht Express most popular bus service \n" +
                "in this road.\n" +
                "\n" +
                "Dhaka to Srimongol by bus Trains:\n" +
                ".................................\n" +
                "\n" +
                "There are few trains that go to Sylhet from Dhaka everyday. The Dhaka to Sylhet \n" +
                "trains are Parabat express, Joyantika express, Upaban express and Surma mail. \n" +
                "Some trains have a weekly off day.\n" +
                "\n" +
                "Hotel / Resort is Moulvibazar and Srimangal:\n" +
                "............................................\n" +
                "For their accommodation, now a good number of hotels are available here with a few \n" +
                "differences in facilities served. Some of Moulvibazar’s hotels are –\n" +
                "\n" +
                "Hotel Sonargaon (contact no: 0861 – 64607)\n" +
                "Hotel Helal (contact no : 0861- 52535)\n" +
                "Hotel Rezia (contact no: 01716 – 086463)\n" +
                "Parjatan Resthouse (contact no: 0861 – 52350)\n" +
                "Sheraton Plaza (contact no: 0861 – 52020)\n" +
                "Hotel Rajdhani\n" +
                "Hotel Camilla\n" +
                "Hotel Basundhara\n" +
                "Hotel Lal Kella\n" +
                "Some restaurants are –\n" +
                "Hotel Western Plaza (contact no: 0861 – 64810)\n" +
                "Bengal Food and Restaurant\n" +
                "Hotel City King Chinese (contact no: 0861 – 62775)\n" +
                "Rajmahal\n" +
                "Shad\n" +
                "Hotel Prince\n" +
                "Khawa-dawa\n" +
                "Rahmania\n" +
                "Manager stall etc\n" +
                "All these Hotels and Restaurants are located in Moulvibazar town. You can also \n" +
                "book your rooms in hotels not located in moulvibazar rather than in Srimangal, \n" +
                "which may be considered the best tourist attraction spot of this division.\n" +
                "\n" +
                "Some hotels and restaurant in Srimangal are –\n" +
                "\n" +
                "Hotel Plaza (contact no: 08626 – 71525)\n" +
                "Tea resort (contact no: 08626 – 71207)\n" +
                "B.T.R.I (contact no: 08626 – 71225)\n" +
                "Tea town restaurant\n" +
                "Hotel Prince etc.");
        image1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("srimangal.jpg"))));
        image2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("srimangal2.jpg"))));
    }
        public void Bandarban (ActionEvent event){
        titelbox.setText(" Bandarban");
        description.setText("Bandarban Hill District is blissed with beauties & culture. You’ll find great mountain\n" +
                "views in bandarban. It treks through virgin forests and chance to meet more than 15 \n" +
                "tribes. Bandarban town which lies on the Sangu River, 92km from Chittagong. The river \n" +
                "is the center of local life: epically long bamboo rafts, steered by a solitary boatman.\n" +
                "\n" +
                "\n" +
                "\n" +
                "There are so many amazing resorts in bandarban. The district is blessed with \n" +
                "waterfalls, treks & unique lifestyle of tribal people. You’ll certainly enjoy the \n" +
                "magical views from hills. The center of the Bandarban Hill District is the town of\n" +
                " Bandarban. Here there is a harmonious mixture of the Moghs, devout Buddhists, and \n" +
                "the Murangs who lure visitors with their legendary dances and traditional music.\n" +
                "\n" +
                "Spot to visit:\n" +
                "* Meghla Tourists Spot\n" +
                "* Nilgiri\n" +
                "* Nilachol\n" +
                "* Shoilopropat Waterfall\n" +
                "* Sornomondi (The Golden temple)\n" +
                "\n" +
                "HIGHLIGHTS:\n" +
                "* 2 Days & 1 Night\n" +
                "* Visit Nilgiri, Chimbuk, Shoilopropat, Nilachol, Meghla & Sornomondir\n" +
                "* Experience tribal lifestyle and food menus\n" +
                "* Delicious local food from the restaurant\n" +
                "* Enjoy Chander Gari ride on hilly roads\n" +
                "\n" +
                "Day 1:\n" +
                "\n" +
                "The trip will start from Bandarban city. Check into the hotel upon arrival & take \n" +
                "Breakfast. (Standard 3 star category hotel). Visiting popular tourist spots Meghla \n" +
                "at 10 AM.\n" +
                "1 PM: Lunch at the hotel with the standard Bengali menu in the local restaurant.\n" +
                "After lunch visiting the Sornomondir (Golden Temple) in a 4×4 land cruiser \n" +
                "Chander Gari).\n" +
                "Enjoy sunset at Nilachol.\n" +
                "Back to the hotel in the evening. Overnight stay at Bandarban.\n" +
                "\n" +
                "Day 2:\n" +
                "Drive to Nilgiri in the very early morning by Chander Gari (Open Jeep). One of the \n" +
                "most popular tourist spots in Bandarban, where you can see heaven and the earth \n" +
                "meeting together. Breakfast will be served there.\n" +
                "On the way back visit Chimbuk Hill & one of the most famous naturals falls in \n" +
                "Bangladesh Shoilopropat Waterfall. Lunch will be served on the way back to Bandarban\n" +
                "town. After the evening, visit Bandarban town and complete personal shopping.\n" +
                "Dinner will be served at a local restaurant with a standard Bengali menu.\n" +
                "End of the Tour at Bandarban city.");
        image1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bandarban.jpg"))));
        image2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("Bandarban2.jpg"))));
    }
        public void StMartin(ActionEvent event){
        titelbox.setText(" St. Martin’s Island");
        description.setText("Saint Martin’s Island is a coral island in the northeastern part of the Bay of Bengal\n" +
                " in the southernmost part of Bangladesh. Covering an area of \u200B\u200Babout eight square \n" +
                "kilometers, the island is located at the mouth of the Naf River, about 9 kilometers \n" +
                "south of Teknaf in Cox’s Bazar district and 8 kilometers west of the coast of \n" +
                "Myanmar. The three-sided foundation of the island is rock, which sinks at high \n" +
                "tide and rises at low tide. Sonadia (Saint Martin’s Dbip) on St. Martin’s Island \n" +
                "has an average elevation of 3.6 meters above sea level.\n" +
                "\n" +
                "As long as the eye goes, only blue and blue, and it feels like the sky and the \n" +
                "blue water of the sea are one and the same. If you want to enjoy this eye-catching \n" +
                "beauty, visit St. Martin, the unique beautiful coral island in Bangladesh, which is \n" +
                "also known as Narikel Gingira. The island was once known as Narikel Gingira \n" +
                "(meaning Coconut Island) by locals because of its dense coconut groves.\n" +
                "\n" +
                "It is said that in the first half of the seventh century, in unfavorable weather \n" +
                "conditions, an Arabian merchant ship carrying cinnamon crashed into a huge rock \n" +
                "under the water. As a result, the cinnamon boarded on the ship spread all over the \n" +
                "island and hence the name St. Martin’s Island became ‘Cinnamon Island’. However, \n" +
                "during a cadastral survey in the early part of the last century, the survey \n" +
                "authorities probably named the coral island Saint Martin’s Island after a British \n" +
                "saint.\n" +
                "\n" +
                "The beauty of St. Martin, the only coral island in Bangladesh, cannot be overstated.\n" +
                " Surrounded only by the blue sea, boats tied to the shore, rows of coconut trees \n" +
                "and the rhythm of the waves, sometimes stopping, sometimes touching the gusts of \n" +
                "wind, all these are the greatness of St. Martin’s Island which has made this small \n" +
                "island uniquely beautiful. Coral Island is a unique place for those who are thirsty \n" +
                "for knowledge and travel with its combination of sand, rocks, corals and \n" +
                "biodiversity. Throughout the year, many people from different parts of the world \n" +
                "flock here. The way of living of the people on this island, the incomparable \n" +
                "harmony with the blue water of the sea creates a different kind of feeling.\n" +
                "\n" +
                "\n" +
                " \n" +
                "Once you reach St. Martin, all your fatigue will be gone. It is difficult to stand \n" +
                "still seeing its clear and blue water. You can swim in the water as you wish. \n" +
                "However, it is better not to go into the water at low tide. At the south side of \n" +
                "the island there are plenty of Keora bushes. There are some mangrove forests. \n" +
                "Other plants include algae, seaweed, bay tree, etc. If you go to St. Martin, you \n" +
                "will see the famous Humayun Ahmed’s much talked about ‘Shomudro Bilash’.The people \n" +
                "of St, Martin’s Island are very simple; their warm hospitality is a major attraction\n" +
                " of tourists.\n" +
                "\n" +
                "Many tourists also spend the night here to enjoy the beauty of the night darkness \n" +
                "(there are no electric lights) amidst the spectacular natural beauty and the actual\n" +
                " ocean atmosphere. The unique experience of leaning your body on a beach chair and \n" +
                "seeing the magical moon or the night sky inlaid with millions of stars as well as \n" +
                "enjoying the roar of the ocean waves as well as thinking about the mysteries of \n" +
                "creation is indescribable.\n" +
                "\n" +
                "During the tourist season, 5 launches come and go from the mainland of Bangladesh \n" +
                "every day. Every day more than three thousand tourists come to St. Martin’s Island \n" +
                "in the morning to enjoy the beauty of the beach with the clear blue water surrounded\n" +
                " by corals and they leave the island by 3 pm.\n" +
                "\n" +
                "The real fun of St. Martin cannot be enjoyed without staying one night. Everyday \n" +
                "tourists return in the afternoon, so the fun of visiting the island in the afternoon\n" +
                " is different. And if you can go to the full moon, then there is no point in \n" +
                "wandering around St. Martin’s Island at night and increasing your desire to live.\n" +
                "\n" +
                "Bicycle rental:\n" +
                "Bicycles can be rented from a few places on the island, especially from West Beach, \n" +
                "for 60-80 taka per hour. However, these bicycles do not have brakes or bells. \n" +
                "You can ride along the beach but you can’t ride with the van on the narrow streets \n" +
                "of the island.\n" +
                "\n" +
                "Electricity facility:\n" +
                "There is no PDB or rural electricity connection in St. Martin. Totally dependent on \n" +
                "the generator. Resort-hotels usually run generators from evening to 10-11 pm. \n" +
                "During the day the water pump can be turned on for a while. Since there is no fan \n" +
                "in winter, there is no lack of current during the day. The problem is with charging\n" +
                " mobiles, cameras and laptops. At nighty etmosphare with  the giltering and \n" +
                "dazzaling row of restaurants with lights at the jetty, it does not seem that there \n" +
                "is no electricity on the island. They keep the generator running for late nights.\n" +
                "\n" +
                "How to get to St. Martin’s:\n" +
                "............................\n" +
                "Teknaf can be reached by bus from Dhaka, Chittagong and Cox’s Bazar. Teknaf buses \n" +
                "are available at Fakirapul and Sayedabad in Dhaka. Eagle, Modern Line, S Alam, \n" +
                "Shyamoli, Green Line etc. buses go to Teknaf. It takes 10-13 hours to reach. \n" +
                "Regular buses are available from Chittagong and Cox’s Bazar to Teknaf. Teknaf \n" +
                "can also be reached by renting a micro bus from Cox’s Bazar.\n" +
                "\n" +
                "You have to go to the shipyard of Teknaf and buy a ticket for seatruck . \n" +
                "Rent 450-550 taka (with return). The distance from Teknaf to St. Martin is 9 km. \n" +
                "Here you have to cross the rough sea. The sea is calm in winter so it is much \n" +
                "safer to go here at this time. During this tourist season, there are several ships \n" +
                "or sea-trucks going from Teknaf to St. Martin, including Green Line water buses, \n" +
                "LC Kutubdia, Kajal, Kerry Sindbad. The ship left for St. Martin at 10 a.m. and \n" +
                "returned at 3 p.m.\n" +
                "\n" +
                "\n" +
                " \n" +
                "St. Martin’s can also be reached by trawler and speed boat. Sea trucks run until \n" +
                "April. After that the administration don’t allow it to continue due to hostile \n" +
                "weather. However, those who want to go to St. Martin as an adventure in the hostile \n" +
                "season can rent a trawler. However, this journey is not very safe. Accidents don’t \n" +
                "usually happen, but they can happen. So be careful. But for those who can’t cope \n" +
                "with the temptation to see the real sea or take a rain bath on a deserted island, \n" +
                "there is no alternative but a trawler, a trawler can be rented for 800 taka.or you \n" +
                "can go for 100 taka per person.\n" +
                "\n" +
                "Contact / phone number of  Kerry Sindbad : 01817210421, 0341-62812, 8125881.\n" +
                "\n" +
                "Where to eat:\n" +
                ".............\n" +
                "There are restaurants in almost all residential hotels, so you can dine there if you\n" +
                " want. Apart from this, you can order all the food by choosing from all kinds of \n" +
                "live fish arranged on the table outside the hotel. You can BBQ at night, pick fish \n" +
                "and tell them they will do it for you.\n" +
                "\n" +
                "Where to stay in St. Martin’s:\n" +
                "...............................\n" +
                "There are all types of accommodation facilities available from good, medium, to  \n" +
                "normal. However, there are probably two places for first class-\n" +
                "\n" +
                " Blue Marine\n" +
                "Palace Paradise\n" +
                "Some of the famous places to stay are-\n" +
                "\n" +
                "Abakash.\n" +
                "Samudra Bilash(Humayun Ahmed)\n" +
                "Nil diganta Resort\n" +
                "Names and telephone numbers of several hotels and resorts in St. Martin\n" +
                "Blue merinah 01819063418, 01722473613, 01819063425, 028358485, 9342351, 9359230 \n" +
                "(have to be booked from Dhaka)\n" +
                "Coral Blue Resort: 01713190013, 01713190007\n" +
                "Palace Paradise: 01713062569\n" +
                "Pacific Resort: 01732434264 (Saint Martin), 01712643694, 01720939090 (Dhaka)\n" +
                "Hotel Swapna Prabal: 01814274409, 01722545872 (St. Martin) 028611428, 01711-110919 \n" +
                "(Dhaka)\n" +
                "Samudra Bilas (Humayun Ahmed): 01813019839.\n" +
                "Shimana periye: 01819018027, 01817042020 (St. Martin), 01819466059, 01819478434, \n" +
                "01911121292, 01711344451 (Dhaka) They also have tents. If you want, you can pitch a \n" +
                "tent near the sea. The rent is reasonable. Between 500 and 800.\n" +
                "8.Nil digonte resort : 01730051004 (Saint Martin), 8652374, 01730051005 (Dhaka)\n" +
                "Abakash tourism: 01713145584, 934 2351\n" +
                "\n" +
                "\n" +
                "Here are some tips to help you get around St. Martin’s:\n" +
                ".......................................................\n" +
                ". From Dhaka to St. Martin, you can contact several travel agencies, including Carey.\n" +
                ". The ship ran for only 4 months from November to March. If you want to go another\n" +
                " time, you have to go by trawler.\n" +
                ". St. Martin now has many hotels, resorts and cottages so there is no shortage of \n" +
                "accommodation.\n" +
                ". It is better not to go to the island on Friday-Saturday to stay at affordable \n" +
                "prices.\n" +
                ". Everything on the island comes from outside, so the cost of food is relatively \n" +
                "high.\n" +
                ". The most famous thing on this island is the coconut. The name of this island is \n" +
                "Coconut Gingira. The coconut water here is as sweet as it is delicious. It would \n" +
                "not be right to miss coconut water if you go to St. Martin.\n" +
                ". Joke apart, I don’t think those who don’t eat fish have the right to go to \n" +
                "St. Martin. Because the taste of coral, beautiful poya, hilsa, rupchanda, lobster,\n" +
                " kalachanda is amazing in one word. One more thing you can try. That is kura \n" +
                "(in the local language the native chicken is called kura). In the case of eating \n" +
                "dried fish, you can try Laita, Churi, Rupchanda, and Kachki. But keep in mind that\n" +
                " most of the dry goods come from Cox’s Bazar and Chittagong. Those who like hilsa \n" +
                "very much should know that sea hilsa is not as tasty as river hilsa.\n" +
                ". Those who visit St. Martin in January or February must not miss the watermelon. \n" +
                "Although it is not very red to look at, it’s tasty.\n" +
                ". Since Myanmar is next door, there are many types of pickles made there that have\n" +
                " already won the hearts of the people, the most readily available in St. Martin.");
        image1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("StMartin.jpg"))));
        image2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("StMartin2.jpg"))));
    }
//    public void SylhetJaflong(ActionEvent event){
//        titelbox.setText("Jaflong – Sylhet");
//        description.setText("");
//        image1.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("sajek1.jpg"))));
//        image2.setImage(new Image(Objects.requireNonNull(getClass().getResourceAsStream("sajek2.jpg"))));
//    }
}
