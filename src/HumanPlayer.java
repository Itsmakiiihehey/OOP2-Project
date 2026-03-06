class HumanPlayer extends Player {
    Scanner scanner = new Scanner(System.in);
    public HumanPlayer(String name) { super(name); }
    public Move chooseMove() {
        while (true) {
            System.out.print("Enter rock, paper, scissors or quit: ");
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("quit")) return null;
            Move move = MoveFactory.createMove(input);
            if (move != null) return move;
            System.out.println("Invalid input. Try again.");
        }
    }
}
