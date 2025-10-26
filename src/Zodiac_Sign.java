import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;

class Zodiac {

    private Scanner input;
    private LocalDate today = LocalDate.now();
    private int userday;
    private int usermonth;
    private int useryear;
    private int currentyear = today.getYear();

    public Zodiac() {
        this.input = new Scanner(System.in);
    }

    private void getInput() {
        try {
            System.out.print("Enter your Birth Year: ");
            useryear = input.nextInt();
            System.out.print("Enter your Birth Month (1-12): ");
            usermonth = input.nextInt();
            System.out.print("Enter your Birth Day (1-31): ");
            userday = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
            input.nextLine();
            useryear = 0;
            usermonth = 0;
            userday = 0;
        }
    }

    public void Zodiac_Sign() {
        boolean isRunning = true;

        while (isRunning) {
            getInput();


            if (useryear > currentyear) {
                System.out.println("\n❌ Invalid input! Are you from the future?\n");
                continue;
            } else if (usermonth < 1 || usermonth > 12) {
                System.out.println("\n❌ Invalid month! Please enter a number between 1 and 12.\n");
                continue;
            } else if (userday < 1 || userday > 31) {
                System.out.println("\n❌ Invalid day! Please enter a number between 1 and 31.\n");
                continue;
            }


            System.out.println("\n✓ All inputs are correct!");


            int userage = currentyear - useryear;
            if (userage > 0) {
                System.out.println("Your age is: " + userage + " years old");
            } else if (userage == 0) {
                System.out.println("You were born this year!");
            } else {
                System.out.println("You are not born yet!");
            }


            String zodiacSign = getZodiacSign(usermonth, userday);
            System.out.println("Your Zodiac Sign is: " + zodiacSign + "\n");


            System.out.println("----------------------------------");
            System.out.println("Press 1 to calculate again");
            System.out.println("Press 2 to return to main menu");
            System.out.println("----------------------------------");

            int choice = 0;
            try {
                choice = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                input.nextLine(); // Clear buffer
                continue;
            }

            if (choice == 1) {
                System.out.println("\n=== New Calculation ===\n");
                continue;
            } else if (choice == 2) {
                isRunning = false;
                System.out.println("\nReturning to main menu...\n");
            } else {
                System.out.println("Invalid choice! Returning to main menu...\n");
                isRunning = false;
            }
        }
    }

    private String getZodiacSign(int month, int day) {
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "♑ Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "♒ Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "♓ Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "♈ Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "♉ Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "♊ Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "♋ Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "♌ Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "♍ Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "♎ Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "♏ Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "♐ Sagittarius";
        }
        return "Unknown";
    }
}




