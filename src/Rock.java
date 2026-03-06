class Rock extends Move {
    public int compare(Move other) {
        if (other instanceof Rock) return 0;
        if (other instanceof Scissors) return 1;
        return -1;
    }
    public String getName() { return "Rock"; }
}
