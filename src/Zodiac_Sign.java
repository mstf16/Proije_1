
import java.util.InputMismatchException;
import java.util.Scanner ;
import java.time.LocalDate;

  class Zodiac {

   public   static void Zodiac_Sign() {


       Scanner input = new Scanner(System.in);
       LocalDate today = LocalDate.now();
       boolean isRunning = true;
       int userday;
       int usermonth;
       int useryear;
       int currentyear = today.getYear();
       int choice;

       System.out.println("Enter your Birth Year");
       useryear = input.nextInt();
       System.out.println("Enter your Birth Month");
       usermonth = input.nextInt();
       System.out.println("Enter your Birth Day");
       userday = input.nextInt();


       while (isRunning) {


           if (useryear < currentyear)
               System.out.println("Your input is Valid");
           else
               System.out.println("Enter a Valid Year");

           if (usermonth >= 1 && usermonth <= 12)
               System.out.println("Your input is Valid");
           else
               System.out.println("Enter a Valid Month a month can not be bigger than 12 and smaller than 1");

           if (userday >= 1 && userday <= 31)
               System.out.println("Your input is Valid ");
           else
               System.out.println("Enter a Valid Day a day can not be bigger than 31 and smaller than 1");

           if (userday >= 1 && userday <= 31 && usermonth >= 1 && usermonth <= 12 && useryear < currentyear)
               System.out.println("All inputs are correct");
           else
               System.out.println("Enter your Birth Year" + "\n" + "Enter your Birth Month" + "\n" + "Enter your Birth Day");


           if ((usermonth == 1) && (userday >= 1 || userday <= 18))
               System.out.println("Sagitarus");
           else if ((usermonth == 12) && (userday >= 18 || userday <= 31))
               System.out.println("Sagitarus");

           else if ((usermonth == 1) && (userday >= 19 || userday <= 31))
               System.out.println("Capricornus");
           else if ((usermonth == 2) && (userday >= 1 || userday <= 15))
               System.out.println("Capricornus");

           else if ((usermonth == 2) && (userday >= 16 || userday <= 29))
               System.out.println("Aquarius");
           else if ((usermonth == 3) && (userday >= 1 || userday <= 11))
               System.out.println("Aquarius");

           else if ((usermonth == 3) && (userday >= 12 || userday <= 31))
               System.out.println("Pisces");
           else if ((usermonth == 4) && (userday >= 1 || userday <= 18))
               System.out.println("Pisces");

           else if ((usermonth == 4) && (userday >= 19 || userday <= 30))
               System.out.println("Aries");
           else if ((usermonth == 5) && (userday >= 1 || userday <= 13))
               System.out.println("Aries");

           else if ((usermonth == 5) && (userday >= 14 || userday <= 31))
               System.out.println("Taurus");
           else if ((usermonth == 6) && (userday >= 1 || userday <= 19))
               System.out.println("Taurus");

           else if ((usermonth == 6) && (userday >= 20 || userday <= 30))
               System.out.println("Gemini");
           else if ((usermonth == 7) && (userday >= 1 || userday <= 20))
               System.out.println("Gemini");

           else if ((usermonth == 7) && (userday >= 21 || userday <= 31))
               System.out.println("Cancer");
           else if ((usermonth == 8) && (userday >= 1 || userday <= 9))
               System.out.println("Cancer");

           else if ((usermonth == 8) && (userday >= 10 || userday <= 31))
               System.out.println("Leo");
           else if ((usermonth == 9) && (userday >= 1 || userday <= 15))
               System.out.println("Leo");

           else if ((usermonth == 9) && (userday >= 16 || userday <= 30))
               System.out.println("Virgo");
           else if ((usermonth == 10) && (userday >= 1 || userday <= 30))
               System.out.println("Virgo");

           else if ((usermonth == 10) && (userday == 31))
               System.out.println("Libra");
           else if ((usermonth == 11) && (userday >= 1 || userday <= 22))
               System.out.println("Libra");

           else if ((usermonth == 11) && (userday >= 23 || userday <= 29))
               System.out.println("Scorpius");


           else if ((usermonth == 11) && (userday == 30))
               System.out.println("Ophiuchus");
           else if ((usermonth == 12) && (userday >= 1 || userday <= 17))
               System.out.println("Ophiuchus");

           int userage = currentyear - useryear;
           System.out.println("Your age is " + userage);

           System.out.println("İf you Want to calculate your zodiac and age again press 1");
           System.out.println("İf you Want to exit and return to the main menu press 2");

           choice = input.nextInt();

           if (choice==1)
               Zodiac_Sign();
           else if (choice==2);
               isRunning = false;
           Main.anamenü();

           continue;



       }
   }
   }







