import java.time.LocalDate;
import java.util.Scanner;



  public class  Zodiac_Sign {

       public  static void main(String[]args){




           LocalDate today = LocalDate.now();

            int currentYear = today.getYear();

            boolean isRunning = true;

            int year;

            boolean check = false;

            int month;

            int date;



            while (isRunning) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Please enter your birth date format like that \n XX \n YY \n MMMM ");

                date = scanner.nextInt();

                month = scanner.nextInt();

                year = scanner.nextInt();


                    if (date < 1 || date > 31) {

                        System.out.println("Please Enter a valid day \n a day can't be smaller than 1 and bigger than 31");
                        System.out.println("Please enter your birth date format like that \n XX \n YY \n MMMM ");
continue;
                                            }

                        if (month < 1 || month > 12) {

                            System.out.println("Please Enter a valid month \n a month can't be smaller than 1 and bigger than 12");
                            System.out.println("Please enter your birth date format like that \n XX \n YY \n MMMM ");
continue;
                        }

                        if (year > currentYear) {

                            System.out.println("Please Enter a valid year \n a year can't be  bigger than current year");
                            System.out.println("Please enter your birth date format like that \n XX \n YY \n MMMM ");
continue;
                    }

                }


            }
        }






