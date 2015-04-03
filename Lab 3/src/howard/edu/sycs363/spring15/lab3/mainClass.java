/*
 * 
 * Java IntegerArrayList class 
 * 
 * 
 * @Author: Ram Hari Dahal
 * */

//Main class
// For input testing
//Driver class
package howard.edu.sycs363.spring15.lab3;

import static org.junit.Assert.assertEquals;

public class mainClass {

		public static void main(String[] args){
			
			//Some output checkers
			IntegerArrayList checker = new IntegerArrayList();
			System.out.println("\nAdding element 5 " );
			checker.add(5);
			System.out.println("The index of element 5 is "+ checker.indexOf(5) + "\n");
			
			System.out.println("\nAdding element 7 in index 1 " );
			checker.add(1,7);
			System.out.println("The index of element 7 is " + checker.indexOf(7) + "\n");
			
			System.out.println("\nAdding element 15 in index 2 " );
			checker.add(2,15);
			System.out.println("The index of element 15 is " + checker.indexOf(15) + "\n");
			
			
			System.out.println("\nThe index of element 7 is " + checker.indexOf(7) + "\n");
			System.out.println("\nThe element in index 7 is " + checker.get(7) + "\n");
			
			System.out.println("\nAdding element 6 in index 3 " );
			checker.add(3,6);
			
			System.out.println("\nAdding element -5 " );
			checker.add(-5);
						
			System.out.println("\nThe element in index 3 is " + checker.get(3) + "\n");
			System.out.println("\nThe element in index 2 is " + checker.get(2) + "\n");
			
			System.out.println("\nThe index of element 6 is " + checker.indexOf(6) + "\n");
			System.out.println("\nThe index of element -5 is " + checker.indexOf(-5) + "\n");
			
			
			System.out.println("\nThe array is empty: " + checker.isEmpty() + "\n");
			
			
			System.out.println("\nRemoving the element "+ checker.remove(3) + "\n");		
		}
}
