package ex1;

import java.util.Comparator;

/**
 * Created by: Keneith Atillo
 * Created on: 02/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class NameComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.getMake().compareTo(v2.getMake());
    }// Method - compare
}// Class - NameComparator
