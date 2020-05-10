package com.ds.list.linkedlist.singlelinkedlist;

//Complexity is O(1) for adding element at the front of the list
public class Main {

	public static void main(String[] args) {
		
		Employee nakul = new Employee("Nakul", "Chauhan", 1);
		Employee adam = new Employee("Adam", "John", 2);
		Employee john= new Employee("John", "Hayden", 3);	
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		
		System.out.println(list.isEmpty());
		
		list.addToFront(nakul);
		list.addToFront(adam);
		list.addToFront(john);
		
		System.out.println(list.getSize());
		
		list.printList();
		
		System.out.println(list.isEmpty());
		
		list.removeFromFront();
		System.out.println(list.getSize());
		list.printList();
			
	
	}

}