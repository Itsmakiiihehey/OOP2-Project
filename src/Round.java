class Round {
    private Player p1;
    private Player p2;
    public Round(Player p1, Player p2) { this.p1 = p1; this.p2 = p2; }
 
    public RoundResult play() {
        Move move1 = p1.chooseMove();
        if (move1 == null) return RoundResult.QUIT;
        Move move2 = p2.chooseMove();
        System.out.println(p1.getName() + " chose " + move1.getName());
        System.out.println(p2.getName() + " chose " + move2.getName());
        int result = move1.compare(move2);
        if (result == 1) return RoundResult.PLAYER1_WIN;
        if (result == -1) return RoundResult.PLAYER2_WIN;
        System.out.println("It's a tie!");
        return RoundResult.TIE;
    }
}
