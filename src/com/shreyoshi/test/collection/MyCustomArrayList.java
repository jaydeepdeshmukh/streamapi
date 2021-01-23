package com.shreyoshi.test.collection;

import java.util.Arrays;

public class MyCustomArrayList {

	private Object[] store;
	private int size=0;
	
	public MyCustomArrayList() {
		store = new Object[10];
	}
	
	public void add(Object obj) {
		if(store.length-size <= 5) {
			increaseListSize();
		}
		store[size++] = obj;
	}
	
	public Object get(int index) {
		if(index < size) {
			return store[index];
		}
		else throw new IndexOutOfBoundsException();
	}
	
	public int size() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public Object remove(int index) {
		if(index < size) {
			Object obj = store[index];
			store[index]=null;
			int tmp = index;
			while(tmp < size) {
				store[tmp] = store[tmp+1];
				store[tmp+1] = null;
				tmp++;
			}
			size--;
			return obj;
		}
		else throw new IndexOutOfBoundsException();
	}
	private void increaseListSize() {
		store = Arrays.copyOf(store, store.length*2);
	}
	
	public static void main(String[] args) {
		MyCustomArrayList list = new MyCustomArrayList();
		
		System.out.println("Initial size is:: "+list.size);
		System.out.println();
		System.out.println("Initially array is empty:: "+list.isEmpty());
		System.out.println();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("12");
		list.add("13");
		list.add("14");
		list.add("15");
		list.add("16");
		list.add("17");
		list.add("18");
		list.add("19");
		list.add("20");
		list.add("21");
		
		System.out.println("After adding elements, size is:: "+list.size);
		System.out.println();
		
		System.out.print("Elements in list:: [");
		
		for(int i=0;i<list.size;i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.print("]");
		System.out.println();
		System.out.println();
		
		System.out.println("Get element in 15th position after adding elements is:: "+list.get(15));
		System.out.println();
		
		System.out.println("Going to remove elements from list");
		
		list.remove(15);
		System.out.print("After removing element from list is:: [");
		
		for(int i=0;i<list.size;i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.print("]");
		System.out.println();
		System.out.println();
		
		System.out.println("Get element in 15th position after removal:: "+list.get(15));
	}
}