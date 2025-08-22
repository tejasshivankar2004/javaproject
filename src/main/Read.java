import java.util.Scanner;  

public class Read {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

        int x, y;
        System.out.println("Enter 2 Numbers: ");
        x = sc.nextInt();  
        y = sc.nextInt();

        int z = x + y;
        System.out.println("Sum is: " + z);  
    }
}
