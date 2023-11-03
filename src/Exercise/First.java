package Exercise;

import java.util.Random;
import java.util.Scanner;

//A code to print a matrix with chosen amount of lines and columns that contains 1s and 0s in it randomly
//and the amount of each number in the matrix

public class First {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("How many lines do you want?");
        int lines = scan.nextInt();
        System.out.println("How many column do you want?");
        int columns = scan.nextInt();

        int x = 0;
        int y = 0;

        for(int i = 0; i<columns; i++){
            for(int j = 0; j<lines; j++){
                int z = rand.nextInt(2);
                if(z==1){
                    x++;
                }else{
                    y++;
                }
                System.out.print(z+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("0s = "+y);
        System.out.println("1s = "+x);
    }
}
