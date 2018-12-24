package linkedlistDemo;

public class LinkedList {
	Node head;
	Node tail;

	/*public void insert(int i) {
		Node node=new Node(i);
		node.setData(i);
		if(head==null) {
			head=node;
		}else {
			Node n=head;
			while(n.getNext()!=null) {
				n=n.getNext();
			}
			n.setNext(node);
		}
	}
	 */
	public void insert(int data) {
		Node node=new Node(data);
		node.setData(data);
		node.setNext(null);
		if(head==null) {
			head=node;
			tail=node;
		}else {
			tail.setNext(node);
			tail=node;
		}
	}

	public void insertAtStart(int data) {
		Node node=new Node(data);
		node.setData(data);
		node.setNext(null);
		if(head==null) {
			head=node;
			tail=node;
		}else {
			node.setNext(head);
			head=node;
		}
	}

	public void insertAt(int index, int data) {
		Node node=new Node(data);
		node.setData(data);
		node.setNext(null);
		if(index==0) {
			insertAtStart(data);
		}else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.getNext();
			}
			node.setNext(n.getNext());
			n.setNext(node);
		}
	}

	public void show() {
		Node node=head;
		System.out.print("[");
		while(node.getNext()!=null) {
			System.out.print(node.getData()+",");
			node=node.getNext();
		}
		System.out.println(node.getData()+"]");
	}

	public void deleteAt(int index) {
		if(index==0) {
			head=head.getNext();
		}else {
			Node n=head;
			for(int i=0;i<index-1;i++) {
				n=n.getNext();
			}
			n.setNext(n.getNext().getNext());
			
		}
	}



}
