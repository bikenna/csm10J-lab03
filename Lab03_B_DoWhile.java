import java.util.Scanner;
/**
 *
 * @author brianobioha
 */
public class Lab03_B_DoWhile {
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.print("Input the first number: ");
        int first = input.nextInt();
        
        System.out.print("Input the second number: ");
        int second = input.nextInt();
        
        int count = first;
        
        System.out.println("\nAll odd numbers between " + first + " and " + second + " inclusive");
        
        do{
            if(count % 2 != 0)
                System.out.println(count++);
            else
                count++;
        }while(count <= second);
        
        System.out.print("\nSum of all even numbers between " + first + " and " + second + " inclusive\n");
        
        int counter = first, add = 0;
        
        do{
            if(counter % 2 == 0)
                add += counter++;
            else
                counter++;         
        }while(counter <= second);
        
        System.out.println(add + "\n");
    }
}
