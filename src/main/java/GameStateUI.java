public interface GameStateUI {
    //Deelt kaarten gelijk uit tussen twee spelers
    void startGameMethod();

    //Eindigt het spel wanneer de kaarten op zijn
    void endGame();

    //Zal het spel afsluiten en opnieuw opstarten (kaarten opnieuw geshuffeled en verdeeld)
    void reset();
}
