import java.util.Scanner;

public class Problem2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int number = sc.nextInt();

        for(int i=1;i<=number*2-1;i+=2){

            System.out.print(i+" ");
        }
        sc.close();
    }
    
}
