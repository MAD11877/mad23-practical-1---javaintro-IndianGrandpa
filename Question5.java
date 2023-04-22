import java.util.ArrayList;
import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int no_of_input=in.nextInt();
    ArrayList<Integer> numbers= new ArrayList<Integer>(); 

    for(int i=0;i<no_of_input;i++)
    {
    
      numbers.add(in.nextInt());



    }

    int maxcount=0;
  
    ArrayList<Integer> mode= new ArrayList<Integer>(); 
    for(int num:numbers)
    {   int count=0;
        for (int i:numbers)
        
        {
          if (i==num)
          {
            count++;
            
          }




        }

        if (maxcount<count)
        
        { 
          maxcount=count;
          mode.clear();
         
          mode.add(num);
          


        }
        else if( count==maxcount && mode.contains(num)==false)
        {
          mode.add(num);


        }


    }



    
    for (int x:mode)
    {

      System.out.println(x);
    }
  }
}
