package linkedList;

import java.io.*;
import java.util.Scanner;

public class MainProgram {
	public static void main (String[] args) throws IOException {
		LinkedList list = new LinkedList();
		
		list.addNode(new Node(-5));
		list.addNode(new Node(8));
		
		list.addNode(new Node(9));
		list.addNode(new Node(10));
		Node node = new Node(6);
		list.addNode(node);
		list.displayList();
		
		// my code
		Scanner scan = new Scanner (System.in);

		while (true) {
			int choice;
			System.out.println("\n---------------------------------------------------");
			System.out.println("Menu:\n(1) Insert a node\n(2) Delete a node");
			System.out.print("(3) Display list\n(4) Exit\n\nEnter a number of your choice: ");
			choice = scan.nextInt();
			System.out.println();
			
			if (choice == 1) {
				int insert, index;
				System.out.print("Add number: ");
				insert = scan.nextInt();
				
				while (true) {
					char head;
					System.out.print("Insert as head? (Y) or (N): ");
					head = scan.next().charAt(0);
					
					if (head == 'Y' || head == 'y') {
						list.insertNode((new Node(insert)));
						list.displayList();
						break;
					} else if (head == 'N' || head == 'n') {
						System.out.print("Insert " + insert + " next to which number: ");
						index = scan.nextInt();
						
						list.insertNode((new Node(insert)), index);
						list.displayList();
						break;
					} else {
						System.out.println("-------Please enter only Y or N!-------");
					}
				}
			} else if (choice == 2) {
				int delete;
				System.out.print("Which node to delete: ");
				delete = scan.nextInt();
				
				list.deleteNode(delete);
				list.displayList();
			} else if (choice == 3) {
				System.out.println("Current List: ");
				list.displayList();
			} else if (choice == 4) {
				System.out.println("-------Program Terminated-------");
				break;
			} else {
				System.out.println("-------Error! Try Again!-------");
			}
		}
		scan.close();
	}
}