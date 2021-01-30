package com.shreyoshi.test.collection;

public class MyLinkedList {
	
	public static void main(String[] args) {
		
		CustomLinkedList linkedlistObj = new CustomLinkedList();
		
		linkedlistObj.addNode(1);
		linkedlistObj.addNode(2);
		linkedlistObj.addNode(3);
		linkedlistObj.addNode(4);
		linkedlistObj.addNode(5);
		
		linkedlistObj.display();
		
	}

}

class CustomLinkedList{
	
	//inner class Node which represent element of LL and it contains data and 
	//pointer which points to address of next node
	class Node{
		
		int data; //holds data
		Node next; //points to address of next node
		
		//since data and pointer will be present in node, so constructor of Node class will be created and data will be taken as input
		//pointer will be pointing to next node automatically. No input required for the same
		//Newly added node at the end of the list or if the node is the first element of list will always point to null
		//this Node class and constructor is required for adding new nodes in the list
		public Node(int data) {
			
			this.data=data;
			this.next=null;
		}
	}
	
	//LL contains of head and tail
	//head represents the first node
	//tail represents the last node which will always point to null
	//this will help in traversing the list from head to tail, i.e., from first node to last node of the list
	//we declare them accordingly in the outer class
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		
		//since we are adding new node so we create a new node
		Node newNode = new Node(data);
		
		//head, i.e., if first element is not present, it means there is no node present in the list
		//so head will  be null
		//we need to see whether list has any nodes present or not
		//therefore we check if head is null or not
		if(head == null) {
			
			//the newly created node is the first element of the list
			// head and tail will represent the new node only
			//if we traverse the LL then there will be only one node present
			head = newNode; 
			tail = newNode; 
		}
		else {
			
			//list is not empty as head is not null
			//we need to append new node after the last node which is the tail
			//so existing last node i.e., the tail will have to point to the address of newly created node
			//this is done through the next pointer we created in the inner class Node
			//new node will be the last node in the list now, so new node will be the tail
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void display() {
		
		//We declare a pointer current which will help us traverse through the LL
		//It will initially point to head
		//It will traverse through the list until it points to null (finds tail)
		Node current = head;
		
		//no nodes present in list
		if(head == null) {
			
			System.out.println("List is empty");
		}
		
		System.out.println("Node in Linked List are:: ");
		
		while(current!=null) {
			
			//every node this current pointer traverses will print the data present in the list
			System.out.print(current.data+" ");
			//traversing of the list will be done with the next pointer we created in inner class node
			//as soon as it finds the next pointer as null, it means tail is found and the loop will terminate
			current = current.next;
		}
		System.out.println();
	}
}
