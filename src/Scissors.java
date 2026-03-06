class Scissors extends Move {
    public int compare(Move other) {
        if (other instanceof Scissors) return 0;
        if (other instanceof Paper) return 1;
        return -1;
    }
    public String getName() { return "Scissors"; }
}
