/**
 * This class models a Bean Machine (Galton Box).
 *
 * @author Cody King
 * @version 1/11/2017
 */

import java.util.Arrays;

public class BeanMachine
{
    private int slots; // >= 2 
    private int balls;
    private int[] filledSlots;
    private String[] path;

    private int count = 0;

    public BeanMachine(int slots, int balls)
    {
        this.slots = slots;
        this.balls = balls;
        path = new String[balls];
        filledSlots = new int[slots];
    }

    // pre: none
    // post: places paths, as Strings, into an array. Ex: LLRRLLR
    //          also updates number of balls in each slot.
    private void runMachine()
    {
        int right = 0;
        int side = 0;
        
        String p = "";

        for(int i = 0; i < slots - 1; i++)
        {
            side = (int) (2 * Math.random());  

            if(side == 0)  // left
            {
                p += "L";
            }

            else  // right
            {
                right++;
                p += "R";
            }
        }

        path[count] = p;
        count++;
        filledSlots[right]++;
    }
    
    // pre: none
    // post: the path of all of the balls are printed.
    public void printPath()
    {
        for(int i = 0; i < balls; i++)
        {
            runMachine();
            System.out.println(path[i]);
        }
    }

    // pre: none
    // post: prints the histogram that shows which slots balls ended up in.
    public void printHistogram()
    {
        //int[] sorted = Arrays.copyOf(filledSlots, filledSlots.length);
        //Arrays.sort(sorted);
        //int max = sorted[sorted.length - 1];

        int max = 0;
        for(int v : filledSlots)
        {
            if(v > max)
            {
                max = v;
            }
        }

        System.out.println("");
        for(int h = max; h > 0; h--)
        {
            for(int s = 0; s < slots; s++)
            {
                if(filledSlots[s] >= h)
                {
                    System.out.print("O");
                }
                
                else if(h == 1)
                {
                    System.out.print("_");
                }
                else
                {
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }
}
