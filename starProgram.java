
import java.util.Scanner;
public class starProgram
{
    public static void main(String[] args) {
    //Unfinished
    int inputStars;
    Scanner scan = new Scanner(System.in);
    inputStars = scan.nextInt();
    for(int i = 0; i<inputStars; i++) {
        for(int b = 0; b < i; b++) {
        System.out.print("*");
       }
       System.out.println();
    }
   }
}
