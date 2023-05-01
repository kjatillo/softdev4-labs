package ex2part2;

public class DVD {

    private String title;
    private String studio;
    private String year;

    public DVD(String t, String s, String y) {
        title = t;
        studio = s;
        year = y;
    }

    public String getStudio() {
        return studio;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + studio + ", " + year + "\n";
    }

}
