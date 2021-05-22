import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class DeckTester {
    private int totaalKaarten = 52;
    @Test
    void GetDeck() {
        Deck d1 = Deck.getInstance();
        Deck d2 = Deck.getInstance();
        //Test of ze gelijk zijn
        assertEquals(d1, d2);
        //Test lukt
    }

    @Test
    void testVoorIteratorPat(){

        Deck deck = Deck.getInstance();
        ArrayList<Kaart> kaarten = new ArrayList<>();

        while(deck.hasNext()){

            kaarten.add(deck.next());

        }

        assertEquals(kaarten.size(), totaalKaarten);
    }

}