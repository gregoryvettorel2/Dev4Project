import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTester {
    @Test
    void GetDeck() {
        Deck d1 = Deck.getInstance();
        Deck d2 = Deck.getInstance();
        //Test of ze gelijk zijn
        assertEquals(d1, d2);
        //Test lukt
    }


    @Test
    void randomVolgordeTest(){
        Deck d1 = Deck.getInstance();
        d1.randomVolgorde();

        Kaart kaartVoorDeShuffle = d1.next();
        d1.randomVolgorde();
        Kaart kaartNaDeShuffle = d1.next();

        assertNotSame(kaartVoorDeShuffle, kaartNaDeShuffle);
    }


    @Test
    void testVoorIteratorPat(){

    }

}