import java.util.Scanner;

public class fact{
    public static void main(String args[]){
        int n,fact=1;
        System.out.println("Enter the number");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        
        for(int i=1;i<=n;i++)
        {
        fact=fact*i;
        }
            System.out.println("the factorial " + fact);


        }

    }
