import java.util.Scanner;

public class sum{
    public static void main(String args[]){
        int n,sum=0,r;
        System.out.println("Enter the number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
            System.out.println("sum of digits "+ sum);


        }

    }
