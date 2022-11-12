import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 6;
        int min = 1;
        int range = max - min + 1;

        int num = 0;
        int tries = 0;
        String ans = "";

        while(num != 6) {
            System.out.println("Enter y to roll the dice");
            ans = input.nextLine();
            if (ans.equals("y")) {
                num = (int) (Math.random() * range) + min;
                System.out.println(num);
                tries++;
            } else {
                System.out.println("Press y to roll the dice");
                ans = input.nextLine();
            }
        }
            System.out.println("Player 1 got a 6 in " + tries + " tries!");

            String ans1 = "";
            int sec = 0;
            int tries2 = 0;
            while (sec != 6) {
                System.out.println("Player 2 press t to roll your dice");
                ans1 = input.nextLine();
                if (ans1.equals("t"))
                {
                    sec = (int) (Math.random() * range) + min;
                    System.out.println(sec);
                    tries2 ++;
                }
                else
                {
                    System.out.println("Press t to roll the dice");
                    ans = input.nextLine();
                }
            }
        System.out.println("Player 2 got a 6 in " + tries2 + " tries!");
        System.out.println("-----------------------------------------");


            if ( tries < tries2)
            {
                int diff = (tries2 - tries);
                System.out.println("Player 1 won, he rolled " + diff + " times less!");
            }
            else if ( tries2 < tries)
            {
                int diff2 = (tries - tries2);
                System.out.println("Player 2 won, he rolled " + diff2 + " times less!");
            }
            else
            {
                System.out.println("The game is a draw");
            }


        }
    }