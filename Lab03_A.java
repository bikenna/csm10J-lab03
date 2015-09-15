import java.util.Scanner;

/**
 *
 * @author brianobioha
 */
public class Lab03_A {
    static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("How many pages to fax? -> ");
        int pages = input.nextInt();
        double cost =(3.20 + (pages - 10)*(0.1));
        
        if(pages <= 10)
           System.out.println("That will cost $3.20");
        else if(pages > 10)
            System.out.printf("That will cost $ %.2f \n", cost);
    }
    
}
