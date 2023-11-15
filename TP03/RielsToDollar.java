import java.util.Scanner;

    public class RielsToDollar {
        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);
    
            // Prompt the user to enter the amount in Riels
            System.out.println("Please input money in Riels: ");
            int riels = scanner.nextInt();
    
            // Convert the amount in Riels to Dollars
            double dollars = riels / 4000.0;
    
            // Display the result to the user
            System.out.println(riels + " RIELS = " + dollars + " USD.");
    
            // Close the Scanner object
            scanner.close();
        }
    }
     
