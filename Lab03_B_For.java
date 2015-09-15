import java.util.Scanner;

/**
 *
 * @author brianobioha
 */
public class Lab03_B_For {
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Input the first number: ");
        int first = input.nextInt();
        
        System.out.print("Input the second number: ");
        int second = input.nextInt();
        
        System.out.println("\nAll odd numbers between " + first + " and " + second + " inclusive");
        
        for(int count = first; count <= second; count++){
            if(count % 2 != 0)
                System.out.println(count);
        }
        
        System.out.print("\nSum of all even numbers between " + first + " and " + second + " inclusive\n");
        
        int counter = 0;
        for(int count = first; count <= second; count++){
            if(count % 2 == 0)
                counter += count;
        }
        System.out.println(counter + "\n");
    }
    
}
