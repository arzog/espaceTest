package com.company;

public class Main {

    private static final int[][] STOCKS = {{1, 56, 200, 55}, {2, 42, 200, 60}, {3, 62, 200, 125}, {4, 45, 200, 150},
            {5, 25, 200, 140}, {6, 72, 200, 86}, {7, 40, 200, 47}, {8, 48, 200, 80}, {9, 24, 150, 126},
            {10, 36, 200, 164}, {11, 15, 100, 85}, {12, 25, 80, 23}};
    private static final String[] NAMES = {"Spa Reine", "Bru Plate", "Bru legerement petillante", "Pepsi", "Spa Orange",
            "Schweppes Tonic", "Schweppes Agrumes", "Lipton Ice Tea", "Lipton Ice Tea Peche", "Jus d'orange Looza",
            "Cecemel", "Red Bull"};

    public static void main(String[] args) {

        //region exo for
//        int place1 = 35;
//        int place2 = 40;
//        int place3 = 45;
//
//        int[] places = {35,40,45};

        //region for v1
        /*
        for (int i = 0; i < names.length; i++) {
            String boostedName = names[i];

            //to transform with for
            String prix1 = Integer.toString(stocks[i][1]);
            String prix2 = Integer.toString(stocks[i][2]);
            String prix3 = Integer.toString(stocks[i][3]);

            // tu boostes ton nom avec des " " jusque (35 - x)
            for (int j = boostedName.length(); boostedName.length() < (35 - prix1.length()); j++) {
                boostedName += " ";
            }
            // tu rajoutes le premier prix à ton nom boosté
            boostedName += prix1;

            //tu boostes ton boostedName jusqu'à (40-y)
            for (int j = boostedName.length(); boostedName.length() < (40 - prix2.length()); j++) {
                boostedName += " ";
            }

            // tu rajoutes le second prix à ton nom boosté
            boostedName += prix2;
            for (int j = 0; boostedName.length() < (45 - prix3.length()); j++) {
                boostedName += " ";
            }
            // tu rajoutes le dernier prix à ton nom boosté
            boostedName += prix3;
            System.out.println(boostedName);
        }
        */
        //endregion

        //region for v2
        /*
        for (int j = 0; j < names.length; j++){
            String boostedName = names[j];
            //boucle pour parcourir les places
            for (int k=0; k < places.length; k++){
                //boost string
                for (int l = boostedName.length(); boostedName.length() < (places[k] - Integer.toString(stocks[j][k+1]).length()); l++) {
                    boostedName += " ";
                }
                boostedName += stocks[j][k+1];
            }
            System.out.println(boostedName);
        }
         */
        //endregion

//        numberAtGivenPlaces(place1,place2,place3);
//        System.out.println("************************");
//        numberAtGivenPlaces(places);

//endregion

        Exo_tombola.exo_tomb();
    }

    //version with given places
    public static void numberAtGivenPlaces(int place1, int place2, int place3){

        int[] places = {place1,place2,place3};

        for (int j = 0; j < NAMES.length; j++){
            String boostedName = NAMES[j];
            //boucle pour parcourir les places
            for (int k=0; k < places.length; k++){
                //boost string
                for (int l = boostedName.length(); boostedName.length() < (places[k] - Integer.toString(STOCKS[j][k+1]).length()); l++) {
                    boostedName += " ";
                }
                boostedName += STOCKS[j][k+1];
            }
            System.out.println(boostedName);
        }

    }

    public static void numberAtGivenPlaces(int[] places){

        for (int j = 0; j < NAMES.length; j++){
            String boostedName = NAMES[j];
            //boucle pour parcourir les places
            for (int k=0; k < places.length; k++){
                //boost string
                for (int l = boostedName.length(); boostedName.length() < (places[k] - Integer.toString(STOCKS[j][k+1]).length()); l++) {
                    boostedName += " ";
                }
                boostedName += STOCKS[j][k+1];
            }
            System.out.println(boostedName);
        }

    }
}
