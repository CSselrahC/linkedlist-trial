package linkedList;

public class LinkedList {
	
	// storage for the address of the first node
	private Node head;
	
	// set and get methods for the first node
	public Node getHead() {
		return head;
	}
	
	public void setHead(Node head) {
		this.head = head;
	}
	
	// method for adding new node
	public void addNode(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(node);
		}
	}
	
	// method for displaying the contents of the linked list
	public void displayList() {
		System.out.print("The values are: ");
		Node currentNode = head;
		while (true) {
			if (currentNode != null) {
				System.out.print(currentNode.getData() + " ");
				currentNode = currentNode.getNext();
			} else if (currentNode == null) {
				System.out.println();
				break;
			}
		}
	}
	
	// my code
	public boolean searchNode(int node) {
		Node currentNode = head;
		boolean present = false;
		
		while (currentNode != null) {
			if (currentNode.getData() == node) {
				present = true;
				break;
			}
			currentNode = currentNode.getNext();
		}
		
		return present;
	}
	
	public int numberOfNodes() {
		int numberOfNodes = 1;
		
		if (head == null) {
			return 0;
		} else {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				numberOfNodes++;
				currentNode = currentNode.getNext();
			}
			
			return numberOfNodes;
		}
	}
	
	public void insertNode(Node node, int index) {
		Node currentNode = head;
		Node tempNode = currentNode;
		
		if (currentNode == null) {
			System.out.println("List is null, " + node.getData() + " is now head of List.");
			addNode(node);
		} else if (searchNode(index) == true) {
			while (tempNode.getData() != index) {
				tempNode = tempNode.getNext();
			}
			
			currentNode = tempNode.getNext();
			tempNode.setNext(node);
			addNode(currentNode);
		} else {
			System.out.println("Node absent. Can't insert.");
		}
	}
	
	public void insertNode(Node node) {
		Node currentNode = head;
		
		if (currentNode == null) {
			System.out.println("List is null, " + node.getData() + " is now head of List.");
			addNode(node);
		} else {
			setHead(node);
			addNode(currentNode);
		}
	}
	
	public void deleteNode(int index) {
		Node currentNode = head;
		Node tempNode = currentNode;
		Node delNode;
		
		if (currentNode == null) {
			System.out.println("Nothing to delete.");
		} else if (searchNode(index) == true) {
			if (tempNode.getData() != index) {
				while (tempNode.getNext().getData() != index) {
					tempNode = tempNode.getNext();
				}
							
				currentNode = tempNode;
				delNode = tempNode.getNext();
				tempNode = delNode.getNext();
				
				while (currentNode.getNext() != delNode) {
					currentNode = currentNode.getNext();
				}
				currentNode.setNext(tempNode);
			} else {
				delNode = head;
				tempNode = delNode.getNext();
				
				setHead(tempNode);
				while (tempNode != null) {
					tempNode = tempNode.getNext();
				}
				addNode(tempNode);
			}
		} else {
			System.out.println("Node absent. Nothing to delete.");
		}
	}
}