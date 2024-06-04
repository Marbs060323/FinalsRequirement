import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * This class reads decimal values from a file and calculates the exponential function for each value.
 */
public class FinalsRequirement {

    /**
     * Main method to execute the program.
     * 
     * @param args Command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Input file path
        String filePath = "Decimal.txt";

        // Read data from the input file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Parse input data and calculate exponential function
                BigDecimal x = new BigDecimal(line);
                BigDecimal result = calculateExponential(x);
                
                // Output the result to the console
                System.out.println("e^" + x + " = " + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Calculate e^x using BigDecimal.
     * 
     * @param x BigDecimal value for which exponential function is calculated
     * @return The result of e^x
     */
    private static BigDecimal calculateExponential(BigDecimal x) {
        BigDecimal result = BigDecimal.ONE; // Initialize result to 1
        BigDecimal term = BigDecimal.ONE; // Initialize first term to 1
        
        // Calculate e^x using the Taylor series expansion
        for (int i = 1; i <= 100; i++) { // Limit the number of iterations for precision
            term = term.multiply(x).divide(BigDecimal.valueOf(i), 50, BigDecimal.ROUND_HALF_EVEN); // Calculate next term
            result = result.add(term); // Add term to result
        }
        
        return result;
    }
}
