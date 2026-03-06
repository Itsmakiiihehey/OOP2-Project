class Game {

    private Player human = new HumanPlayer("You");

    private Player computer = new ComputerPlayer("Computer");

    private ScoreBoard scoreBoard = new ScoreBoard();

    private final int WIN_SCORE = 5;
 
    public void start() {

        System.out.println("=== Rock Paper Scissors: First to 5 Wins ===");

        while (scoreBoard.getHumanScore() < WIN_SCORE && scoreBoard.getComputerScore() < WIN_SCORE) {

            Round round = new Round(human, computer);

            RoundResult result = round.play();

            if (result == RoundResult.QUIT) {

                System.out.println("Thanks for playing!");

                return;

            }

            scoreBoard.updateScore(result);

            scoreBoard.display();

        }
 
        if (scoreBoard.getHumanScore() == WIN_SCORE) System.out.println("Congratulations You won the match!");

        else System.out.println("Computer Wins!");

    }

}
 
