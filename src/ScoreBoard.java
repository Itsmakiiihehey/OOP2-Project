class ScoreBoard {
    private int humanScore = 0;
    private int computerScore = 0;
    public void updateScore(RoundResult result) {
        if (result == RoundResult.PLAYER1_WIN) humanScore++;
        else if (result == RoundResult.PLAYER2_WIN) computerScore++;
    }
    public void display() {
        System.out.println("Score -> You: " + humanScore + " | Computer: " + computerScore);
        System.out.println("---------------------------");
    }
    public int getHumanScore() { return humanScore; }
    public int getComputerScore() { return computerScore; }
}
