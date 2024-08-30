package day4Assignment5;

public class Main {
    public static void main(String[] args) {
        // Step 3: Create an object of type DayScholar
        DayScholar dayScholar = new DayScholar(5, "OOP", 16000, 1001, "D", "Manu", "NO 32/3 Vijayanagar");

        // Calculate fees
        dayScholar.calculateFees();

        // Call the corresponding methods
        dayScholar.displayDetails();
        dayScholar.displayFeesDetails();
    }
}
