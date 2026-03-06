class Paper extends Move {
    public int compare(Move other) {
        if (other instanceof Paper) return 0;
        if (other instanceof Rock) return 1;
        return -1;
    }
    public String getName() { return "Paper"; }
}
