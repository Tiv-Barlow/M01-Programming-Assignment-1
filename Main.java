//SDEV 200 - Software Development Using Java
//Professor Adam Bumgardner
//Student: Tiv Muhammad
//24 Mar 2024
// Assignment: Mod1 Programming Assignment 6.9
/*-------------------------------------------------------*/
// import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.Test;

public class Main {

    // Assigned feet to meters formula
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    // Assigned meters to feet formula
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        

// Display header 
      System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        System.out.println("-----------------------------------------");

// Compute area
        for (double i = 1.0; i <= 10.0; i++) {
            double feet = i;
            double meters = footToMeter(feet);
            double convertedMeters = i * 5.0 + 15.0;
            double convertedFeet = meterToFoot(convertedMeters);
            
// Display tabled results
     System.out.printf("%.1f\t%.3f\t|\t%.1f\t%.3f\n", feet, meters, convertedMeters, convertedFeet);
        }
    }
}
