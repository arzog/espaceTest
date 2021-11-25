package com.company;

public class Main {

    public static void main(String[] args) {
        int Stocks[][] = { { 1, 56, 200, 55 }, { 2, 42, 200, 60 }, { 3, 62, 200, 125 }, { 4, 45, 200, 150 },
                           { 5, 25, 200, 140 }, { 6, 72, 200, 86 }, { 7, 40, 200, 47 }, { 8, 48, 200, 80 }, { 9, 24, 150, 126 },
                           { 10, 36, 200, 164 }, { 11, 15, 100, 85 }, { 12, 25, 80, 23 } };
        String Names[] = { "Spa Reine", "Bru Plate", "Bru legerement petillante", "Pepsi", "Spa Orange",
                           "Schweppes Tonic", "Schweppes Agrumes", "Lipton Ice Tea", "Lipton Ice Tea Peche", "Jus d'orange Looza",
                           "Cecemel", "Red Bull" };
        for (int i = 0; i < Names.length; i++) {
            String boostedName = Names[i];
            String prix1 = Integer.toString(Stocks[i][1]);
            String prix2 = Integer.toString(Stocks[i][2]);
            String prix3 = Integer.toString(Stocks[i][3]);
            // tu boostes ton nom avec des " " jusque (35 - x)
            for (int j = boostedName.length(); boostedName.length() < (35-prix1.length()); j++ ) {
                boostedName += " ";
            }
            // tu rajoutes le premier prix à ton nom boosté
            boostedName += prix1;
            //tu boostes ton boostedName jusqu'à (40-y)
            for (int j = boostedName.length(); boostedName.length() < (40-prix2.length()); j++) {
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
    }
}
