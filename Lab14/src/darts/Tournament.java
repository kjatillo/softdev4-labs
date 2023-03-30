package darts;

public abstract class Tournament {
    private int nr_of_players;
    private String comp_name;


    //constructor
    public Tournament(String comp_name, int nr_of_players)
    {
        this.comp_name = comp_name;
        this.nr_of_players = nr_of_players;
    }

    //abstract method
    public abstract int processTable();
}
