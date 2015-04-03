package howard.edu.sycs363.spring15.lab5;

import static org.junit.Assert.*;
import howard.edu.sycs363.spring15.lab3.IntegerArrayList;

import org.junit.Test;

public class JUnitTest {
	@Test
	public void testAdd() {
	   // IntegerArrayList is tested
	   IntegerArrayList tester = new IntegerArrayList();
	   tester.add(10);
	   tester.add(30);

	   // Tests
	   assertEquals("Should return 10", 10, tester.get(0));
	   assertEquals("Should return 30", 30, tester.get(1));
	   assertEquals("Should return -1", -1, tester.get(3));  //Value not in the list
	   
	   /*
	    * Check to see if this works for dynamic array
	    */
	   IntegerArrayList dynamicTester = new IntegerArrayList(1);
	   dynamicTester.add(2);
	   dynamicTester.add(3); //needs to increase array size to accomodate 3
	   
	   assertEquals("Should return 3", 3, dynamicTester.get(1));
	   
	   
	 } 
	
	@Test
	public void addValueWithIndex(){
		// IntegerArrayList is tested
		IntegerArrayList tester = new IntegerArrayList();
		
		tester.add(2,40);
		tester.add(3,50);
		tester.add(4,20);
		
		// Tests
		  assertEquals("Should return 40", 40, tester.get(2));
		  assertEquals("Should return 50", 50, tester.get(3));
		  assertEquals("Should return 20", 20, tester.get(4));
		  assertEquals("Should return -1", -1, tester.get(6));  //Value not in the list
		  
		 /*
		  * Check to see for dynamic array
		  */
		  IntegerArrayList dynamicTester = new IntegerArrayList(1);
		   dynamicTester.add(0, 2);
		   dynamicTester.add(1, 3); //needs to increase array size to accomodate 3
		   
		   assertEquals("Should return 3", 3, dynamicTester.get(1));
	}
	
	@Test
	public void getValueWithIndex(){
		// IntegerArrayList is tested
		IntegerArrayList tester = new IntegerArrayList();
		
		tester.add(15);
		tester.add(25);
		
		// Tests
		 assertEquals("Should return 15", 15, tester.get(0));
		 assertEquals("Should return 25", 25, tester.get(1));
	}

	@Test
	public void getIndexOf(){
		// IntegerArrayList is tested
		IntegerArrayList tester = new IntegerArrayList();
		
		tester.add(15);
		tester.add(25);
		
		// Tests
		 assertEquals("Should return 0", 0, tester.indexOf(15));
		 assertEquals("Should return 1", 1, tester.indexOf(25));
	}
	
	@Test
	public void checkIfEmpty(){
		// IntegerArrayList is tested
		IntegerArrayList tester = new IntegerArrayList();
		
		
		// Tests
		 assertEquals("Should return True", true, tester.isEmpty());
		 tester.add(5);
		 assertEquals("Should return False", false, tester.isEmpty());
	}
	
	@Test
	public void removeItem(){
		// IntegerArrayList is tested
		IntegerArrayList tester = new IntegerArrayList();
		
		
		// Tests
		tester.add(5);
		
		assertEquals("Should return True", false, tester.isEmpty());
		
		tester.remove(5);
		assertEquals("Should return False", true, tester.isEmpty());
		//tester.add(5);
	}
	
	
}
