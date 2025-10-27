import java.util.Scanner;

public class Main {


    public static void guzelYazi(String text, int delay) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    public static void clearScreen() {
        System.out.print("\u001B[2J\u001B[H");
        System.out.flush();
    }

    public static void anamenü() {
        System.out.println("**********************");
        System.out.println("Select an option to continue");
        System.out.println("OPTION A - Primary School");
        System.out.println("OPTION B - Secondary School");
        System.out.println("OPTION C - High School");
        System.out.println("OPTION D - University");
        System.out.println("OPTION E - Terminate");
        System.out.println("**********************");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        String subinput = "";
        boolean isRunning = true;


        System.out.println("\u001B[35m JAVA");
        System.out.println("\u001B[34m IS");
        System.out.println("\u001B[36m SMART");
        System.out.println(
                "\u001B[31m PROGRAM MADE BY GROUP 14 \n ALIDAMAT SAFARLI \n MAHMUT EGE SORHAN \n MUSTAFA CAN SANDALCI \n SERHAT DEMIR "
        );


        for (int i = 5; i > 0; i--) {
            System.out.println("Please wait for program to open... " + i + " seconds");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        clearScreen();


        guzelYazi("$$\\      $$\\           $$\\                                              \n" +
                "$$ | $$\\ $$ |          $$ |                                             \n" +
                "$$ |$$$\\ $$ | $$$$$$\\  $$ | $$$$$$$\\  $$$$$$\\  $$$$$$\\$$$$\\   $$$$$$\\  \n" +
                "$$ $$ $$\\$$ |$$  __$$\\ $$ |$$  _____|$$  __$$\\ $$  _$$  _$$\\ $$  __$$\\ \n" +
                "$$$$  _$$$$ |$$$$$$$$ |$$ |$$ /      $$ /  $$ |$$ / $$ / $$ |$$$$$$$$ |\n" +
                "$$$  / \\$$$ |$$   ____|$$ |$$ |      $$ |  $$ |$$ | $$ | $$ |$$   ____|\n" +
                "$$  /   \\$$ |\\$$$$$$$\\ $$ |\\$$$$$$$\\ \\$$$$$$  |$$ | $$ | $$ |\\$$$$$$$\\\n" +
                "\\__/     \\__| \\_______|\\__| \\_______| \\______/ \\__| \\__| \\__| \\_______|\n", 3);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clearScreen();
        anamenü();

        while (isRunning) {
            input = scanner.nextLine().trim().toUpperCase();

            switch (input) {
                case "A":
                    clearScreen();
                    guzelYazi("=== PRIMARY SCHOOL ===", 30);
                    System.out.println("\nSub-option 1 - Age and Zodiac Sign Detection");
                    System.out.println("Sub-option 2 - Reverse the Words");
                    System.out.println("Press X to return to main menu");

                    subinput = scanner.nextLine().trim().toUpperCase();
                    switch (subinput) {
                        case "1":
                            clearScreen();
                            guzelYazi("=== Age and Zodiac Sign Detection ===", 20);
                            System.out.println();
                            Zodiac zodiac = new Zodiac(scanner);
                            zodiac.Zodiac_Sign();
                            clearScreen();
                            anamenü();
                            break;
                        case "2":
                            clearScreen();
                            guzelYazi("=== Reverse the Words ===", 20);

                            clearScreen();
                            anamenü();
                            break;
                        case "X":
                            clearScreen();
                            anamenü();
                            break;
                        default:
                            System.out.println("Please enter a valid sub-option (1, 2, or X)");
                            break;
                    }
                    break;

                case "B":
                    clearScreen();
                    guzelYazi("=== SECONDARY SCHOOL ===", 30);
                    System.out.println("\nSub-option 1 - Prime Numbers");
                    System.out.println("Sub-option 2 - Step-by-step Evaluation of Expression");
                    System.out.println("Press X to return to main menu");

                    subinput = scanner.nextLine().trim().toUpperCase();
                    switch (subinput) {
                        case "1":
                            clearScreen();
                            guzelYazi("=== Prime Numbers ===", 20);
                            System.out.println("\nNot implemented yet");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            clearScreen();
                            anamenü();
                            break;
                        case "2":
                            clearScreen();
                            guzelYazi("=== Step-by-step Evaluation ===", 20);
                            System.out.println("\nNot implemented yet");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            clearScreen();
                            anamenü();
                            break;
                        case "X":
                            clearScreen();
                            anamenü();
                            break;
                        default:
                            System.out.println("Please enter a valid sub-option (1, 2, or X)");
                            break;
                    }
                    break;

                case "C":
                    clearScreen();
                    guzelYazi("=== HIGH SCHOOL ===", 30);
                    System.out.println("\nSub-option 1 - Statistical Information about an Array");
                    System.out.println("Sub-option 2 - Distance between Two Arrays");
                    System.out.println("Press X to return to main menu");

                    subinput = scanner.nextLine().trim().toUpperCase();
                    switch (subinput) {
                        case "1":
                            clearScreen();
                            guzelYazi("=== Statistical Information ===", 20);
                            System.out.println("\nNot implemented yet");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            clearScreen();
                            anamenü();
                            break;
                        case "2":
                            clearScreen();
                            guzelYazi("=== Distance between Arrays ===", 20);
                            System.out.println("\nNot implemented yet");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            clearScreen();
                            anamenü();
                            break;
                        case "X":
                            clearScreen();
                            anamenü();
                            break;
                        default:
                            System.out.println("Please enter a valid sub-option (1, 2, or X)");
                            break;
                    }
                    break;

                case "D":
                    clearScreen();
                    guzelYazi("=== UNIVERSITY ===", 30);
                    System.out.println("\nSub-option 1 - Connect Four Game");
                    System.out.println("Press X to return to main menu");

                    subinput = scanner.nextLine().trim().toUpperCase();
                    switch (subinput) {
                        case "1":
                            clearScreen();
                            guzelYazi("=== Connect Four Game ===", 20);
                            System.out.println("\nNot implemented yet");
                            try {
                                Thread.sleep(2000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            clearScreen();
                            anamenü();
                            break;
                        case "X":
                            clearScreen();
                            anamenü();
                            break;
                        default:
                            System.out.println("Please enter a valid sub-option (1 or X)");
                            break;
                    }
                    break;

                case "E":
                    clearScreen();
                    guzelYazi("\n=== Thank you for using our program! ===\n", 30);
                    guzelYazi("Goodbye! 👋\n", 50);
                    isRunning = false;
                    break;

                default:
                    System.out.println("Invalid option! Please enter A, B, C, D, or E");
                    break;
            }
        }

        scanner.close();
    }
}