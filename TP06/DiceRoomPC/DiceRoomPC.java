package DiceRoomPC;
import java.util.Scanner;

class PC {
    private String pcName;
    private boolean isDamaged;

    public PC(String pcName) {
        this.pcName = pcName;
        this.isDamaged = false; // Initially, assume the PC is not damaged
    }

    public String getPCName() {
        return pcName;
    }

    public boolean isDamaged() {
        return isDamaged;
    }

    public void markAsDamaged() {
        isDamaged = true;
    }

    public void markAsNotDamaged() {
        isDamaged = false;
    }

    @Override
    public String toString() {
        return "PC Name: " + pcName + ", Status: " + (isDamaged ? "Damaged" : "Good");
    }
}

public class DiceRoomPC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPCs = 5; // Change this value based on the actual number of PCs in the room
        PC[] pcArray = new PC[numberOfPCs];

        // Initialize PCs
        for (int i = 0; i < numberOfPCs; i++) {
            pcArray[i] = new PC("PC" + (i + 1));
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. List all PCs");
            System.out.println("2. List all damaged PCs");
            System.out.println("3. List all good PCs");
            System.out.println("4. Mark a PC as damaged");
            System.out.println("5. Mark a PC as not damaged");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("List of all PCs:");
                    for (PC pc : pcArray) {
                        System.out.println(pc);
                    }
                    break;

                case 2:
                    System.out.println("List of damaged PCs:");
                    for (PC pc : pcArray) {
                        if (pc.isDamaged()) {
                            System.out.println(pc);
                        }
                    }
                    break;

                case 3:
                    System.out.println("List of good PCs:");
                    for (PC pc : pcArray) {
                        if (!pc.isDamaged()) {
                            System.out.println(pc);
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter the PC name to mark as damaged: ");
                    String damagedPCName = scanner.nextLine();
                    for (PC pc : pcArray) {
                        if (pc.getPCName().equalsIgnoreCase(damagedPCName)) {
                            pc.markAsDamaged();
                            System.out.println("PC marked as damaged!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter the PC name to mark as not damaged: ");
                    String notDamagedPCName = scanner.nextLine();
                    for (PC pc : pcArray) {
                        if (pc.getPCName().equalsIgnoreCase(notDamagedPCName)) {
                            pc.markAsNotDamaged();
                            System.out.println("PC marked as not damaged!");
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
    }
}