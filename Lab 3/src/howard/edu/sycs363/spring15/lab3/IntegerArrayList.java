/*
 * 
 * Java IntegerArrayList class 
 * 
 * 
 * @Author: Ram Hari Dahal
 * */


package howard.edu.sycs363.spring15.lab3;

/*
 * The class that represents array list and also functions ad a dynamic integer array
 * */
public class IntegerArrayList {
	
		//The size of myarrayList array at the beginning.
		private int maxValue = 100;
		
		//Integer array that acts as a dynamic integer array list
		private int[] myarrayList;
		
		//The default (at first) size of dynamic array list
		private int size = 0;
	
		//Initialize an array of size 100
		public IntegerArrayList(){
			myarrayList = new int[100];
		}

		//Initialize an array of size "size" (a parameter)
		public IntegerArrayList(int size){
			myarrayList = new int[size];
			maxValue = size;
		}
		
		//Function to add an integer value at the end of the array/list
		//As specified by the question
		public void add(int value){
			if (size < maxValue){
				myarrayList[size] = value;
				size++;
			}
			else{
				//Increase the array size first to add the input value
				enlargeArraySize();
				
				//After increasing the size, add the value to the array/list
				myarrayList[size] = value;
				size++;
			}					
		}
		
		//Function to increase the size of the array/list
		private void enlargeArraySize(){
			//Create a new larger array to hold more elements
			int[] temp = new int[maxValue*2];
			
			//Copy all the elements to the new array
			for (int i = 0; i < size; i++){
				temp[i] = myarrayList[i];
			}
			//Make the myarrayList point to new array
			myarrayList = temp;
		}
		
		
		//Inserts an integer at a specific index
		//To prevent error (ArrayIndexOutOfBoundsException), size <0 and size > maxValue are checkeed
		public void add(int index, int value){
			
			if (!(size < 0 || size >= maxValue)){
				for (int i = size; i > index ; i--){
					myarrayList[i] = myarrayList[i-1];
				}
				myarrayList[index] = value;
				if (index > size)
					size = index+1;
				else
					size++;
			}
			else{
				enlargeArraySize();
				myarrayList[size] = value;
				size++;
			}
			
		}
		
		
		//Returns the integer value at a given index
		//Error if index < 0 and index > maxValue
		public int get(int index){
			if (index < 0 || index > size){
				return -1;
			}else{
				return myarrayList[index];
			}
		}
		
		//Returns index of the value in the array (first instance)
		//Returns -1 if not found
		public int indexOf(int value){
			
			for (int i = 0; i  < size ; i++){
				if (value == myarrayList[i])
					return i;
			}
			
			return -1;
		}
		
		
		//Checks if the array is empty
		public boolean isEmpty(){
			
			return size == 0;
		}
		
		//Remove and return the value from the given index
		public int remove(int index){
			int a = myarrayList[index];
			for (int i = index; i < size -1 ; i++){
				myarrayList[i] = myarrayList[i+1];
			}
			size--;
			return a;
			
		}
}
