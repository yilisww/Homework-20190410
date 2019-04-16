package HW4_arrays_files;

import java.util.Scanner;

public class TestNestedloops {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number here: ");

          int num = input.nextInt();

        System.out.println("The number is: "+num+"\n");

        int outloop;
        int innerloop;

        for (outloop = 1; outloop <= num; outloop++) {

            for (innerloop =1; innerloop <=outloop; innerloop++){
                System.out.print(innerloop);
            }
            System.out.println();
        }
        for (outloop = (num-1); outloop >= 1; outloop--) {

            for (innerloop =1; innerloop <=outloop; innerloop++){
                System.out.print(innerloop);
            }
            System.out.println();
        }



    }
}
