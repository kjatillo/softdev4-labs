package ex2part3;

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

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }// if

        if (o == this) {
            return true;
        }// if

        if (!(o instanceof DVD)) {
            return false;
        }// if

        DVD d = (DVD) o;
        return (this.title == d.title);
    }// Method - equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.title.length();

        return hash;
    }// Method - hashCode
}
