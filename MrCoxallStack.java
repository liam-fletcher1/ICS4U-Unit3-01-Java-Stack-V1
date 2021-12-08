/*
* The Mr.Coxall Stack Program
*
* @author  Liam Fletcher
* @version 1.0
* @since   2021-12-07
*/

// Import the ArrayList class
import java.util.ArrayList;

public class MrCoxallStack {

   private ArrayList < Integer > stackAsArray = new ArrayList < Integer > ();

   public void push(int receivedNum) {
       stackAsArray.add(receivedNum);
   }

   public int getNumber() {
       return this.stackAsArray.get(0);
   }
}
