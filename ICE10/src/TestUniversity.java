/**
 * Created by: Ken
 * Created on: 28/03/2023
 * Student no: X00190944
 * Group/Year: 2A
 */

public class TestUniversity {
    public static void main(String[] args) {
        int[] depids = {1, 2, 3, 4};
        String[] names = {
                "Computing",
                "Business",
                "Languages",
                "Engineering"
        };

        University university = new University("DCU", depids, names);

        for (int i = 0; i < depids.length; i++) {
            University.Department d = university.new Department(depids[i], names[i]);

//            university.addDept(university.new Department(depids[i], names[i]), i);
        }
    }
}
