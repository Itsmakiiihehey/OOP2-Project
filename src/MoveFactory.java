class MoveFactory {
    public static Move createMove(String type) {
        switch (type) {
            case "rock": return new Rock();
            case "paper": return new Paper();
            case "scissors": return new Scissors();
            default: return null;
        }
    }
}
