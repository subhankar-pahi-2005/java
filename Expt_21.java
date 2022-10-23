import java.util.Scanner;

public class Expt_21 {
    public static void main(String[] args) {
        float percentage;
        float total_marks;
        float scored;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your marks:: ");
        scored=sc.nextFloat();
        System.out.println("enter total marks:: ");
        total_marks=sc.nextFloat();
        percentage=(float) ((scored/total_marks)*100);
        System.out.println("percentage::"+percentage);
    }
}
