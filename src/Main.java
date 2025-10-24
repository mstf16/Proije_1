import java.util.Scanner;

public class Main {

    public static void anamenü() {
        System.out.println("**********************");
        System.out.println("Select a option to continue");
        System.out.println("OPTİON A Primary School");
        System.out.println("OPTİON B Secondary School");
        System.out.println("OPTİON C High School");
        System.out.println("OPTİON D University");
        System.out.println("OPTİON E Terminate");
        System.out.println("**********************");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = "";
        String subinput = "";
        boolean isRunning = true;

        System.out.println("\u001B[35m JAVA");
        System.out.println("\u001B[34m İS");
        System.out.println("\u001B[36m SMART");
        System.out.println(
                "\u001B[31m PROGRAM MADEN BY GROUP 14 \n ALIDAMAT SAFARLI \n MAHMUT EGE SORHAN \n MUSTAFA CAN SANDALCI \n SERHAT DEMİR "
        );

        for (int i = 0; i < 5; i++) {
            System.out.println("Please wait for \n program to open");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(
                "\n \u001B[35m "
                        + "                  $$$        $$$$$      $$$$         $$$$     $$$$$                                 \n"
                        + "                  $$$       $$$$$$$     $$$$         $$$$    $$$$$$$                                \n"
                        + "                  $$$       $$$$$$$     $$$$$       $$$$$    $$$$$$$                                \n"
                        + "                  $$$       $$$$$$$      $$$$       $$$$     $$$$$$$                                \n"
                        + "                  $$$      $$$$ $$$$     $$$$$     $$$$$    $$$$ $$$$                               \n"
                        + "                  $$$      $$$$ $$$$      $$$$     $$$$     $$$$ $$$$                               \n"
                        + "                  $$$     $$$$$ $$$$$     $$$$     $$$$    $$$$$ $$$$$                              \n"
                        + "                  $$$     $$$$   $$$$     $$$$$   $$$$$    $$$$   $$$$                              \n"
                        + "                  $$$     $$$$   $$$$      $$$$   $$$$     $$$$   $$$$                              \n"
                        + "                  $$$    $$$$$   $$$$$     $$$$$ $$$$$    $$$$$   $$$$$                             \n"
                        + "                  $$$    $$$$$$$$$$$$$      $$$$ $$$$     $$$$$$$$$$$$$                             \n"
                        + "          $$$$   $$$$    $$$$$$$$$$$$$      $$$$ $$$$     $$$$$$$$$$$$$                             \n"
                        + "          $$$$   $$$$   $$$$$$$$$$$$$$$      $$$$$$$     $$$$$$$$$$$$$$$                            \n"
                        + "          $$$$$ $$$$$   $$$$       $$$$      $$$$$$$     $$$$       $$$$                            \n"
                        + "          $$$$$$$$$$$  $$$$$       $$$$$     $$$$$$$    $$$$$       $$$$$                           \n"
                        + "           $$$$$$$$$   $$$$         $$$$      $$$$$     $$$$         $$$$                           \n"
                        + "            $$$$$$$    $$$$         $$$$      $$$$$     $$$$         $$$$                           \n"
        );

        anamenü();

        while (isRunning) {
            input = scanner.nextLine().trim().toUpperCase();

            switch (input) {
                case "A":
                    System.out.println("Sub-option J Age and Zodiac Sign Detection");
                    System.out.println("Sub-option K Reverse the Words");
                    System.out.println("For return to the main menu press X");

                    subinput = scanner.nextLine().trim().toUpperCase();
                    switch (subinput) {
                        case "J":
                            System.out.println("Age and Zodiac Sign Detection - Not implemented yet");
                            Zodiac.Zodiac_Sign();

                            anamenü();
                            break;
                        case "K":
                            System.out.println("Reverse the Words - Not implemented yet");
                            anamenü();
                            break;
                        case "X":
                            for (int i = 0; i < 50; i++) {
                                System.out.println("");
                            }
                            anamenü();
                            break;
                        default:
                            System.out.println("Please enter a valid sub-option");
                            break;
                    }
                    break;

                case "B":
                    System.out.println("Sub-option F Prime Numbers");
                    System.out.println("Sub-option G Step-by-step Evaluation of Expression");
                    System.out.println("For return to the main menu press X");

                    subinput = scanner.nextLine().trim().toUpperCase();
                    switch (subinput) {
                        case "F":
                            System.out.println("Prime Numbers - Not implemented yet");
                            anamenü();
                            break;
                        case "G":
                            System.out.println("Step-by-step Evaluation of Expression - Not implemented yet");
                            anamenü();
                            break;
                        case "X":
                            for (int i = 0; i < 50; i++) {
                                System.out.println("");
                            }
                            anamenü();
                            break;
                        default:
                            System.out.println("Please enter a valid sub-option");
                            break;
                    }
                    break;

                case "C":
                    System.out.println("Sub-option H Statistical Information about an Array");
                    System.out.println("Sub-option I Distance between Two Arrays");
                    System.out.println("For return to the main menu press X");

                    subinput = scanner.nextLine().trim().toUpperCase();
                    switch (subinput) {
                        case "H":
                            System.out.println("Statistical Information about an Array - Not implemented yet");
                            anamenü();
                            break;
                        case "I":
                            System.out.println("Distance between Two Arrays - Not implemented yet");
                            anamenü();
                            break;
                        case "X":
                            for (int i = 0; i < 50; i++) {
                                System.out.println("");
                            }
                            anamenü();
                            break;
                        default:
                            System.out.println("Please enter a valid sub-option");
                            break;
                    }
                    break;

                case "D":
                    System.out.println("Connect Four Game");
                    System.out.println("For return to the main menu press X");

                    subinput = scanner.nextLine().trim().toUpperCase();
                    switch (subinput) {
                        case "X":
                            for (int i = 0; i < 50; i++) {
                                System.out.println("");
                            }
                            anamenü();
                            break;
                        default:
                            System.out.println("Please enter a valid sub-option");
                            break;
                    }
                    break;

                case "E":
                    System.out.println("Exit");
                    System.out.println("Thank you for using our program");
                    isRunning = false;
                    break;

                default:
                    System.out.println("Please enter a valid option to continue");
                    break;
            }
        }

        scanner.close();
    }
}
