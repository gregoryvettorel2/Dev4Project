import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
//
public class Players {
    //Containers om de kaarten willekeurig in te verdelen,
    public ArrayList<Kaart> kaartStack;

    //Constructor
    public Players(String playername){
        //Ik zal deck door twee moeten splitsen of elke speler een beperkt aantal kaarten van deck te geven
        //of
        //Krijgen elk bij instantiering random 10 kaarten en deze value wordt opgeteld, en Array index van 0 tot 9 nemen voor 10 kaarten elk bv
        kaartStack = new ArrayList<Kaart>();
        Deck deck = Deck.getInstance();
        int midStack = kaartStack.size()/2;
        //String[] player1Array = Arrays.copyOfRange(deck, 0, 9);
    }
    public int kaartValues() {
        int stackValue = 0;

        for (Kaart k : kaartStack) {
            if (k.getKaartWaarde().contains("Aas")) stackValue += 1;
            else if (k.getKaartWaarde().contains("2")) stackValue += 2;
            else if (k.getKaartWaarde().contains("3")) stackValue += 3;
            else if (k.getKaartWaarde().contains("4")) stackValue += 4;
            else if (k.getKaartWaarde().contains("5")) stackValue += 5;
            else if (k.getKaartWaarde().contains("6")) stackValue += 6;
            else if (k.getKaartWaarde().contains("7")) stackValue += 7;
            else if (k.getKaartWaarde().contains("8")) stackValue += 8;
            else if (k.getKaartWaarde().contains("9")) stackValue += 9;
            else if (k.getKaartWaarde().contains("10")) stackValue += 10;
            else if (k.getKaartWaarde().contains("11")) stackValue += 11;
            else if (k.getKaartWaarde().contains("12")) stackValue += 12;
            else if (k.getKaartWaarde().contains("13")) stackValue += 13;
        }
        return stackValue;
    }
}
