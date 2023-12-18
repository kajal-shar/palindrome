import java.util.Scanner;

public class swap
{
    public static void main(String args[]) {
        int a,b;
        System.out.println("enter any number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("before swapping"+ +a+" "+b);

        a=a-b;
    
        b=a+b;
        a=b-a;
        System.out.println("after swapping"+ +a+" "+b);



        
    }
}