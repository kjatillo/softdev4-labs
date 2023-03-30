package darts;

public class DartsTournament extends Tournament {

    private String[] players;
    private int[][] league_stats;

    //constructor
    public DartsTournament(String comp_name, int nr_of_teams)
    {
        super(comp_name, nr_of_teams);
        this.players = new String[nr_of_teams];
        this.league_stats = new int[nr_of_teams][8];
    }

    public void fillNamesTable(int index, String name){
        this.players[index] = name;
    }

    public void fillTable(int stats[][]){
        this.league_stats = stats;
    }
    @Override
    public int processTable() {
        int sum = 0;
        //print out table and calculate sum to be used for average...
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n","Team","Played","Won","Drawn"," Lost","Scored","Conceded","Diff","Points");
        for (int i=0;i<league_stats.length;i++){
            System.out.printf("%-10s", players[i]);
            for(int j=0;j<league_stats[i].length;j++){
                if (j==4){
                    sum+= league_stats[i][j];
                }
                System.out.printf("%-10d",league_stats[i][j]);
            }
            System.out.println();

        }
       return sum;
    }

    public void calculateAverage(int sum){
        //calculate average....
        double average = (double)sum/(double) players.length;
        int greater_than_average = 0;
        // calculate number of teams who score more goals than the average
        System.out.printf("Average number of legs per player: %.2f%n",average);
        for (int[] row:league_stats){
            if (row[4]>average){
                greater_than_average++;
            }
        }
        System.out.printf("Number of players whose total legs won exceeded the average: %d%n",greater_than_average);
    }
    public void calcLegDiff()
    {
        int highest_goal = league_stats[0][7];
        int highest_team_index = 0;
        String winner = "";
        for (int i = 0; i < players.length; i++) {
            if (league_stats[i][7] > highest_goal) {
                highest_goal = league_stats[i][7];
                highest_team_index = i;
            } else if (i != highest_team_index && league_stats[i][7] == highest_goal) {
                if (league_stats[highest_team_index][6] > league_stats[i][6]) {
                    winner = players[highest_team_index];
                } else {
                    winner = players[i];
                }
            }
        }
        System.out.printf("Winner is %s based on leg diff%n", winner);
    }
}
