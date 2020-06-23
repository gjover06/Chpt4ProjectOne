/**
Author: George Samu
Purpose: The purpose  is to write a program that displays
a random integer that lies within the range of two integers.
Include the given integers as possible values for the random
integers. Ask the user to give the smaller of the two integer first.
Use JOptionPane for all input and output.
*/

import java.util.Random;
import javax.swing.JOptionPane;


public class Chpt4ProjectOne
{
  public static void main (String [] args)
  {
    Random generator=new Random();

   // System.out.println("Give a smaller of the two integers between 1-20 ");
   // int randomNumberOne=generator.nextInt(20)+1;

    
    String Input= JOptionPane.showInputDialog("Give a smaller of the two integer");
    
    int small=Integer.parseInt(Input);
    
    Input= JOptionPane.showInputDialog("Give a larger of the two integer");

    int large=Integer.parseInt(Input);
    
    // 20-1=19+1
    int randomNumberOne=generator.nextInt((large-small)+1)+small;

    JOptionPane.showMessageDialog(null, "The smaller number between the two ranges is" + randomNumberOne);


  }//end main
}//end Chpt4ProjectOne