import java.util.ArrayList;
import java.util.Arrays;

public class Players {
    //Containers om de kaarten willekeurig in te verdelen,
    // zal dus int hebben voor de punten, array voor de kaarten en 2 instanties van deze class (2 spelers die dan hun kaarten vergelijken -> hoger of lager)
    public ArrayList<Kaart> kaartStack;

    //Constructor
    public Players(String playername){
        //Ik zal deck door twee moeten splitsen of elke speler een beperkt aantal kaarten van deck moeten geven
        //Bv Array index van 0 tot 9 nemen voor 10 kaarten elk
        kaartStack = new ArrayList<>();
    }
    public int kaartValues(){
        int enkeleKaartValue = 0;

        for(Kaart k : kaartStack){
            if(k.getKaartWaarde().contains("Aas"))enkeleKaartValue=1;
            else if(k.getKaartWaarde().contains("2"))enkeleKaartValue=2;
            else if(k.getKaartWaarde().contains("3"))enkeleKaartValue=3;
            else if(k.getKaartWaarde().contains("4"))enkeleKaartValue=4;
            else if(k.getKaartWaarde().contains("5"))enkeleKaartValue=5;
            else if(k.getKaartWaarde().contains("6"))enkeleKaartValue=6;
            else if(k.getKaartWaarde().contains("7"))enkeleKaartValue=7;
            else if(k.getKaartWaarde().contains("8"))enkeleKaartValue=8;
            else if(k.getKaartWaarde().contains("9"))enkeleKaartValue=9;
            else if(k.getKaartWaarde().contains("10"))enkeleKaartValue=10;
            else if(k.getKaartWaarde().contains("11"))enkeleKaartValue=11;
            else if(k.getKaartWaarde().contains("12"))enkeleKaartValue=12;
            else if(k.getKaartWaarde().contains("13"))enkeleKaartValue=13;
        }
        return enkeleKaartValue;
    }
}
