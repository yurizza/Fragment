package com.example.recyclerviewpahlawan;

import java.util.ArrayList;

public class PahlawanData {

    private static String[] heroNames = {
            "Ahmad Dahlan",
            "Ahmad Yani",
            "Sutomo",
            "Gatot Soebroto",
            "Ki Hadjar Dewantarai",
            "Mohammad Hatta",
            "Soedirman",
            "Soekarno",
            "Soepomo",
            "Tan Malaka"
    };
    private static int[] thumbnail = new int[]{
            R.mipmap.ahmad_dahlan,
            R.mipmap.ahmad_yani,
            R.mipmap.bung_tomo,
            R.mipmap.gatot_subroto,
            R.mipmap.ki_hadjar_dewantara,
            R.mipmap.mohammad_hatta,
            R.mipmap.sudirman,
            R.mipmap.sukarno,
            R.mipmap.supomo,
            R.mipmap.tan_malaka
    };

   public static ArrayList<PahlawanModel>getListData(){
       PahlawanModel pahlawanmodel = null;
       ArrayList<PahlawanModel> list = new ArrayList<>();
       for (int i=0;i<heroNames.length;i++){
           pahlawanmodel = new PahlawanModel();
           pahlawanmodel.setNamaPahlawan(heroNames[i]);
           pahlawanmodel.setImgPahlawan(thumbnail[i]);
           list.add(pahlawanmodel);
       }
       return list;
   }
}
