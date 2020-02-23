/* Declare a two-dimensional array of doubles (call it scores) with three rows 
and three columns and that uses methods and loops as follows.

Use a method containing a nested while loop to get the nine (3 x 3) doubles 
from the user at the command line.

Use a method containing a nested for loop to compute the average of the doubles
in each row.

Use a method to output these three row averages to the command line.
 */
package scorer;

import java.util.Scanner;

public class Scorer {
   int score[][] = new int[3][3];
   Scanner input = new Scanner(System.in);
   void getInput(){
       int i=0;
       while(i<3){
           int j=0;
           while(j<3){
               System.out.print("Enter number:");
               score[i][j]=input.nextInt();
               j++;
           }
           i++;
       }
   }

   void averagePerRow(){
       for(int i=0;i<3;i++){
           float sum=0;
           for(int j=0;j<3;j++){
               sum=sum+score[i][j];
           }
           output(sum,1+i);
       }
   }

   void output(float sum,int row){
       System.out.println("Average score for Row "+row+" : "+sum/3);
   }
   
   public static void main(String[] args) {
       Scorer object = new Scorer();
       object.getInput();
       object.averagePerRow();
   }
}