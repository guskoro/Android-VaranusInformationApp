package com.quching.submition;

import java.util.ArrayList;

public class LizardData {
    public static String[][] data = new String[][] {
            {"Varanus Salvator Salvator",
             "Locality : Javanese Island",
             "https://upload.wikimedia.org/wikipedia/commons/thumb/3/39/Varanus_salvator_-_01.jpg/800px-Varanus_salvator_-_01.jpg"},
            {"Varanus Komodoensis",
             "Locality : Komodo Island",
             "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Komodo_dragon_with_tongue.jpg/800px-Komodo_dragon_with_tongue.jpg"},
            {"Varanus Salvadorii",
             "Locality : Papua New Guinea",
             "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d4/Amneville_Varanus_salvadorii_27082010_4.jpg/576px-Amneville_Varanus_salvadorii_27082010_4.jpg"},
            {"Varanus Salvator Komaini",
             "Locality : Komaini Island",
             "https://awsimages.detik.net.id/community/media/visual/2018/02/27/dfd47158-6a36-4006-8226-75003c63b699.jpeg?a=1"}
    };

    public static ArrayList<Lizard> getListData(){
        Lizard lizard = null;
        ArrayList<Lizard> list = new ArrayList<>();
        for (String[] aData : data) {
            lizard = new Lizard();
            lizard.setName(aData[0]);
            lizard.setRemarks(aData[1]);
            lizard.setPhoto(aData[2]);

            list.add(lizard);
        }
        return list;
    }
}
