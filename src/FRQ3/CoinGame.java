package FRQ3;

public class CoinGame

{



    private int startingCoins; // starting number of coins

    private int maxRounds; // maximum number of rounds played



    public CoinGame(int startingCoinAmount, int totalRounds)

    {

        startingCoins = startingCoinAmount;

        maxRounds = totalRounds;

    }



    /** Returns the number of coins (1, 2, or 3) that player 1 will spend.

     */

    public int getPlayer1Move()

    {

        /* implementation not shown. */
return (int) (Math.random()*3 + 1);
    }



    /** Returns the number of coins (1, 2, or 3) that player 2 will spend, as described in part (a).

     */

    public int getPlayer2Move(int round) {
    int result = 1;

        if (round % 3 == 0) result = 3;
        if (round % 3 != 0 && round % 2 == 0) result = 2;
        if (round % 3 != 0 && round % 2 != 0) result = 1;

        return result;

    }



    /** Plays a simulated game between two players, as described in part (b).

     */

    public void playGame() {


        int Player1Coins = this.startingCoins;
        int Player2Coins = this.startingCoins;

        for (int i = 0; i < this.maxRounds; i++) {
            int Player1Bet = this.getPlayer1Move();
            int Player2Bet = this.getPlayer2Move(i);

            Player1Coins = Player1Coins - Player1Bet;
            Player2Coins = Player2Coins - Player2Bet;

            int difference = Math.abs(Player1Bet-Player2Bet);

          if (difference == 2) Player1Coins = Player1Coins+2;
          else Player2Coins++;

          System.out.println(String.valueOf(Player1Coins) + "                 " + String.valueOf(Player2Coins));
          //Line for seeing coins each round

          testEnd(Player1Coins, Player2Coins);


        }

        if (Player1Coins > Player2Coins) {
            System.out.println("Player 1 Wins!");
        }

        else if (Player2Coins > Player1Coins) {
            System.out.println("Player 2 Wins!");
        }
        else {
            System.out.println("Tie");
        }



    }

    public void testEnd(int p1coins, int p2coins) {
        if (p1coins < 3) {
            System.out.println("Player 2 Wins!");
            System.exit(0);
        }
        if (p2coins < 3) {
            System.out.println("Player 1 Wins!");
            System.exit(0);
        }
    }


    public static void main(String[] args) {
    CoinGame Game = new CoinGame(15, 5);
    System.out.println("Player 1 Coins" + "    " + "Player 2 Coins");
    //helps set up view for coins each round  in print out
    Game.playGame();




    }



}