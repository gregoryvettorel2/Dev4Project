import java.util.ArrayList;
import java.util.Arrays;

public class Players {
    //Containers om de kaarten willekeurig in te verdelen,
    // zal dus int hebben voor de punten, array voor de kaarten en 2 instanties van deze class (2 spelers die dan hun kaarten vergelijken -> hoger of lager)
    public ArrayList<Kaart> kaartStack;

    //Constructor
    public Players(String playername){
        //Ik zal deck door twee moeten splitsen of elke speler een beperkt aantal kaarten van deck moeten geven
        //Krijgen elk bij instantiering random 10 kaarten en deze value wordt opgeteld, en Array index van 0 tot 9 nemen voor 10 kaarten elk bv
        kaartStack = new ArrayList<Kaart>();
    }
    public int kaartValues(){
        int stackValue = 0;

        for(Kaart k : kaartStack){
            if(k.getKaartWaarde().contains("Aas"))stackValue+=1;
            else if(k.getKaartWaarde().contains("2"))stackValue+=2;
            else if(k.getKaartWaarde().contains("3"))stackValue+=3;
            else if(k.getKaartWaarde().contains("4"))stackValue+=4;
            else if(k.getKaartWaarde().contains("5"))stackValue+=5;
            else if(k.getKaartWaarde().contains("6"))stackValue+=6;
            else if(k.getKaartWaarde().contains("7"))stackValue+=7;
            else if(k.getKaartWaarde().contains("8"))stackValue+=8;
            else if(k.getKaartWaarde().contains("9"))stackValue+=9;
            else if(k.getKaartWaarde().contains("10"))stackValue+=10;
            else if(k.getKaartWaarde().contains("11"))stackValue+=11;
            else if(k.getKaartWaarde().contains("12"))stackValue+=12;
            else if(k.getKaartWaarde().contains("13"))stackValue+=13;
        }
        return stackValue;
    }
}
