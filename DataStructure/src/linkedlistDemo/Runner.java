package linkedlistDemo;

public class Runner {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.insert(5);
		list.insert(14);
		list.insert(12);
		list.show();
		list.insertAtStart(10);
		list.show();
		list.insertAt(2,29);
		list.show();
		list.deleteAt(4);
		list.show();

	}

}
