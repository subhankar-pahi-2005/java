import java.util.Scanner;
import java.lang.*;
public class Expt_4
{
    public static void main(String[] args)
    {
        int length,breadth,area,p;
        System.out.println("ENTER YHE LENGTH & BREADTH: ");
        Scanner sc= new Scanner(System.in);
        length= sc.nextInt();
        breadth= sc.nextInt();
        area= length*breadth;
        System.out.println("ARAEA OF RECTANGLE="+area);
        p=2*(length+breadth);
        System.out.println("permeter="+p);
    }
}
