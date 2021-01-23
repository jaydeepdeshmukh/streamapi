package com.shreyoshi.test.collection;

import java.util.ArrayList;
import java.util.Arrays;

import com.shreyoshi.test.junit.NegativeNumberException;


public class TestMyArrayList{

	public static void main(String[] args) throws NegativeNumberException {

		MyArrayList list = new MyArrayList();

		//ArrayList list = new ArrayList();

		System.out.println("Default size of list is:: "+list.size());
		System.out.println();

		System.out.println("To check if list is empty:: "+list.isEmpty());
		System.out.println();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);


		System.out.println("To check if list is empty after adding elements:: "+list.isEmpty());
		System.out.println();

		System.out.println("List size is:: "+list.size());
		System.out.println();
		System.out.print("Elements in list are:: [");

		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i) +" ");
		}

		System.out.print("]");
		System.out.println();
		System.out.println();
		System.out.println("Element in third position of the list is:: "+list.get(3));
		System.out.println();

		list.remove(3);
		
		System.out.print("After removing, elements in new list are:: [");
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i) +" ");
		}

		System.out.print("]");
		System.out.println();
		System.out.println();
		System.out.println("List size is:: "+list.size());
		System.out.println();

		System.out.println("To check if element is present in list:: "+list.isIn(3));
		System.out.println();
	}
}

class MyArrayList {

	/** Store object in an array **/
	private Object[] storeList;

	/** current amount of elements in the array **/
	private int numOfElements;

	/** The default constructor that creates an storeList with a default size of 10 **/
	public MyArrayList() {

		storeList = new Object[10];  //or this(10)
	}

	/** Constructor that allows an initial size to be passed to the array to make it dynamic 
	 * @throws NegativeNumberException which is custom exception **/
	public MyArrayList(int n) throws NegativeNumberException {

		if(n <= 0) {
			throw new NegativeNumberException();
		}

		this.storeList = new Object[n]; //initializes list to n size
		numOfElements=0; // initializes the number of elements in array as 0
	}

	/** check if array is full **/
	private boolean checkArrayFull() {
		return this.storeList.length == this.numOfElements;  //list length equals num of elements in the list
	}

	private void copyArray(int size, String action) {
		
		if("double".equalsIgnoreCase(action))
			size = this.storeList.length*2;
		else
			size = this.storeList.length + size;

		Object[] tempArray = new Object[size];

		int tempElement = 0;

		// Invariants: 0 <= i < arrayList.length && 0 <= tempElement < arrayList.length
		for (int i = 0; i < this.storeList.length; i++, tempElement++) {
			if (this.storeList[i] == null) {
				tempElement--;
				continue;
			}

			tempArray[tempElement] = this.storeList[i];
		}

		this.storeList = null;
		this.storeList = new Object[tempArray.length];
		this.storeList = tempArray;
	}


	/** pass Object type parameter to to be added to storeList
	 * check if array is full
	 * if full then with the help of copyOf() method size of list to be doubled 
	 * The Object ob is added to the storeList array. The size, numOfElements,
	 * is incremented by 1 **/
	public void add(Object ob) {

		if(checkArrayFull()) {
			copyArray(0,"double");
		}

		this.storeList[this.numOfElements] = ob;
		this.numOfElements++;
	}

	/** Allows to retrieve a value of the arrayList array from a given location
	 *  To pass index that's within array bounds. Check to see if the index passed is within the arrayList bounds. 
	 *  If it's not, throw exception. 
	 *  If it is within bounds, the Object at the specific index location is returned.**/
	public Object get(int index) {
		
		Object element = null;
		
			if(index < storeList.length) {

				element = this.storeList[index];
			}
			else {

				throw new IndexOutOfBoundsException();
			}
			
		return element;
	}

	/** Allows to get the number of elements currently in the storeList.
	 *  Returns the value of the numOfElements field.**/
	public int size() {
		return this.numOfElements;
	}

	/** Tests to check if storeList is 0
	 * Returns true if numOfElements is 0
	 * Returns false if numOfElements is greater than 0 **/
	public boolean isEmpty() {

		return this.numOfElements == 0;
	}

	/** method checks whether the particular object is present in the array
	 * For this find() method is used
	 * It returns the position of the Object if an object is present
	 * If not present then returns -1
	 * The isIn() method calls this find() method
	 * It returns true if find() returns a value greater than equal to 0
	 * It return false if find() returns -1 **/
	private int find(Object obj) {

		for(int i = 0; i < this.storeList.length; i++) {

			if(obj.equals(storeList[i]))
				return i;
		}

		return -1;
	}

	public boolean isIn(Object ob) {

		return find(ob) >= 0;
	}

	public void remove (int index) {
		
		int size=this.numOfElements;
		
			if(index < size) {
				
				storeList[index]=null;
				size--;
				copyArray(0, "");		
			}
			else throw new IndexOutOfBoundsException();
	}
}