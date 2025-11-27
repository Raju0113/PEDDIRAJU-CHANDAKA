import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {      
    
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the input: ");

        int n = sc.nextInt();

        int count = n%2==0?(n-1):n;

        for(int i=1;i<=count*2-1;i+=2){
          
            System.out.print(i+" ");
        }
   
        sc.close();
    }
    
}
