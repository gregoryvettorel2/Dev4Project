public class States implements GameStateUI {
        @Override
        public void startGameMethod(){
            System.out.println("Cards are being dealt equally");
            System.out.println("Game is started...");
            System.out.println("P1: 7H > 3K :P2");
            System.out.println("1 point for P1");
            System.out.println("...");
        }

        @Override
        public void endGame() {
            System.out.println("Player1 has 37 points and Player2 has 15 points");
            System.out.println("Player 1 WINS");
        }

        @Override
        public void reset() {
            System.out.println("Reshuffle the deck");
        }
    }
