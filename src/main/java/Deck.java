import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Deck implements Iterator<Kaart> {
    private ArrayList<Kaart> kaarten;
    private static Deck enigeInstantie;
    private int iterator = 0;
    private int totaalKaarten = 52;

    //Arrays waardoor we itereren om de kaarten te initalisiëren
    String[] hartenWaarden = {"AasH","2H","3H","4H","5H","6H","7H","8H","9H","10H","BoerH","DameH","HeerH"};
    String[] klaverWaarden = {"AasK","2K","3K","4K","5K","6K","7K","8K","9K","10K","BoerK","DameK","HeerK"};
    String[] schoppenWaarden = {"AasS","2S","3S","4S","5S","6S","7S","8S","9S","10S","BoerS","DameS","HeerS"};
    String[] ruitenWaarden = {"AasR","2R","3R","4R","5R","6R","7R","8R","9R","10R","BoerR","DameR","HeerR"};

    //Constructor
    private Deck(){
        kaarten = new ArrayList<>();

        //Blijft kaarten toevoegen zolang er waarden next in String zijn
            for (String hvar : hartenWaarden) {
                kaarten.add(new Kaart(hvar));
            }
            for (String kvar : klaverWaarden) {
                kaarten.add(new Kaart(kvar));
            }
            for (String svar : schoppenWaarden) {
                kaarten.add(new Kaart(svar));
            }
            for (String rvar : ruitenWaarden) {
                kaarten.add(new Kaart(rvar));
            }

     this.randomVolgorde();
        System.out.println(kaarten);
    }

    //Methoden
    public void randomVolgorde(){
        Collections.shuffle(kaarten);
        iterator = 0;
    }

    public static Deck getInstance() {
        if(enigeInstantie == null) {
            enigeInstantie = new Deck();
        }

        return enigeInstantie;
    }

    public boolean hasNext() {
        if(iterator < totaalKaarten)
            return true;
        else
            return false;
    }

    public Kaart next() {
        Kaart kaart = kaarten.get(iterator);
        iterator++;
        return kaart;
    }

    @Override
    public String toString() {
        return "Deck{" + "kaarten=" + kaarten + '}';
    }

    /*
    public static void main(String[] args) {
        Deck deck1 = Deck.getInstance();
        System.out.println(deck1);
        }
*/
}

//Eventuele methoden

//whileHasNext

//Legende: H = Harten, K = Klaver, S = Schoppen, R = Ruiten
