package linkedList;
import java.util.Scanner;

public class InsertR {
	
	public static Node<Integer> insert(Node<Integer> head, int pos, int elem){
		Node<Integer> newNode = new Node<>(elem);
		if (pos == 0) {
			newNode.next = head;
			return newNode;
		}
		
		if (head == null)
			return head;
	
		head.next = insert(head.next, pos - 1, elem);
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		NodeUse n = new NodeUse();
		Node<Integer> head = n.takeInput();
		n.print(head);
		System.out.println("enter the pos where to insert elem:");
		int pos = sc.nextInt();
		System.out.println("enter the value to insert:");
		int elem = sc.nextInt();
		head = insert(head, pos - 1, elem);
		n.print(head);
		

	}

}
