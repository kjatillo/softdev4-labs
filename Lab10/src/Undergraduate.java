public class Undergraduate extends Student {
    private int year;

    public Undergraduate(String name, int studentNumber, int numExamsPassed, int year) {
        super(name, studentNumber, numExamsPassed);
        this.year = year;
    }// Constructor Undergraduate

    @Override
    public void processResults() {
        super.processResults();
        if (year == 4 && calcGPA() > 3.25) {
            System.out.println("Congratulations! You have achieved a first-class honours degree.");
        }// if statement
    }// Method - processResults

    @Override
    public void print() {
        super.print();
        System.out.println("Year: " + year);
    }// Method - print
}// Class - Undergraduate
