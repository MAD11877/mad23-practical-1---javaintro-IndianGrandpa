import java.util.Scanner;

public class Question2
{
  static double bmicalc (double weigth,double height)
  {     height = height/100;
        return weigth/(height*height);

  }
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    System.out.print("Height(cm):");
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
    
    System.out.print("Weigth(kg):");
    Scanner weigth_input = new Scanner(System.in);
    double weigth = weigth_input.nextDouble();
    
    System.out.println(bmicalc(weigth, height));
    






  }
}
