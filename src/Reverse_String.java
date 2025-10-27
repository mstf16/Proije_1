import java.util.Scanner;



class Reverse {

    public void Reverse_S() {

        Scanner input = new Scanner(System.in);


        String sArray;

        System.out.println("Please Enter a word or words:");
        sArray = input.nextLine();

        char[] rArray = sArray.toCharArray();
        for (int i = rArray.length - 1; i >= 0; i--)
            System.out.print(rArray[i]);


    }
}











































