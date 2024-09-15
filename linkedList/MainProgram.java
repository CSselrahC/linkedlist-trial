package linkedList;

import java.io.*;
import java.util.Scanner;

public class MainProgram {
	public static void main (String[] args) throws IOException {
		Scanner scan = new Scanner (System.in);
		LinkedList list = new LinkedList();
		
		list.addNode(new Node(-5));
		list.addNode(new Node(8));
		
		list.addNode(new Node(9));
		list.addNode(new Node(10));
		Node node = new Node(6);
		list.addNode(node);
		list.displayList();
		
		
//		int insert, index;
//		System.out.print("Add number: ");
//		insert = scan.nextInt();
//		
//		System.out.print("Insert " + insert + " next to which number: ");
//		index = scan.nextInt();
//		
//		list.insertNode((new Node(insert)), index);
		
		int delete;
		System.out.print("Which node to delete: ");
		delete = scan.nextInt();
		
		list.deleteNode(delete);
		
		list.displayList();
		System.out.println("num of nodes: " + list.numberOfNodes());
		
		scan.close();
	}
	
}