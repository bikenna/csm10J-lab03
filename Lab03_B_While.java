import java.util.Scanner;

/**
 *
 * @author brianobioha
 */
public class Lab03_B_While {
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
        
        while(count <= second){
            if(count % 2 != 0)
                System.out.println(count++);
            else
                count++;
        }
        
        System.out.print("\nSum of all even numbers between " + first + " and " + second + " inclusive\n");
        
        int counter = first, add = 0;
        
        while(counter <= second){
            if(counter % 2 == 0)
               add += counter++;
            else 
                counter++;
        }
        System.out.print(add + "\n");
    }
    
}
