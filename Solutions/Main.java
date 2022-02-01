import java.util.Scanner;

/**
 * Main for Bean Machine program.
 * 
 * @author King 
 * @version 1/11/2017
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the number of slots for the machine: ");
        int slots = in.nextInt();
        System.out.print("Enter the number of balls: ");
        int balls = in.nextInt();
        
        BeanMachine beanMachine = new BeanMachine(slots, balls);
        beanMachine.printPath();
        beanMachine.printHistogram();
    }
}
