class ComputerPlayer extends Player {
    
    Random random = new Random();
    public ComputerPlayer(String name) { super(name); }
    public Move chooseMove() {
        String[] moves = {"rock", "paper", "scissors"};
        return MoveFactory.createMove(moves[random.nextInt(3)]);
    }
}
