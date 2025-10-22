import java.time.LocalDate;
import java.util.Scanner;

public class Zodiac_Sign {
    
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Zodiac Sign Calculator!");
        System.out.println("Enter 'quit' to exit the program.\n");
        
        while (isRunning) {
            System.out.println("Please enter your birth date in the format:");
            System.out.println("Day (1-31)");
            System.out.println("Month (1-12)");
            System.out.println("Year (1900-" + currentYear + ")");
            System.out.print("Enter 'quit' to exit: ");
            
            String input = scanner.nextLine().trim().toLowerCase();
            
            if (input.equals("quit")) {
                isRunning = false;
                System.out.println("Thank you for using the Zodiac Sign Calculator!");
                break;
            }
            
            try {
                System.out.print("Day: ");
                int day = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Month: ");
                int month = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Year: ");
                int year = Integer.parseInt(scanner.nextLine());
                
                // Validate the input
                if (isValidDate(day, month, year, currentYear)) {
                    String zodiacSign = calculateZodiacSign(day, month);
                    System.out.println("\nYour zodiac sign is: " + zodiacSign);
                    System.out.println("----------------------------------------\n");
                } else {
                    System.out.println("Invalid date! Please try again.\n");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Please enter valid numbers only!\n");
            }
        }
        
        scanner.close();
    }
    
    public static boolean isValidDate(int day, int month, int year, int currentYear) {
        // Check year
        if (year < 1900 || year > currentYear) {
            System.out.println("Year must be between 1900 and " + currentYear);
            return false;
        }
        
        // Check month
        if (month < 1 || month > 12) {
            System.out.println("Month must be between 1 and 12");
            return false;
        }
        
        // Check day
        if (day < 1 || day > 31) {
            System.out.println("Day must be between 1 and 31");
            return false;
        }
        
        // Check if the day is valid for the specific month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for leap year
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }
        
        if (day > daysInMonth[month - 1]) {
            System.out.println("Invalid day for the given month");
            return false;
        }
        
        return true;
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static String calculateZodiacSign(int day, int month) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }
}