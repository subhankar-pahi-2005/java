import java.lang.*;
import java.util.Scanner;

public class Expt_3 {
    public static void main(String[] args)
    {
        System.out.println("ENTER A NUMBER YOU WANT: ");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        System.out.println("(--------THE MULTIPLICATION OF===>>  "+num+"  <<==---------)");
        System.out.println(">>>>--------YOUR ANSWER IS WRITTEN IN BILLOW--------<<<<<");
        System.out.println("***************");
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
            System.out.println("***************");
        }
        System.out.println("BEST OF LUCK");
    }
}