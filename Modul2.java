package responAkhir;
class Node{
	int data;
	Node next,prev;
	Node(int data){
		this.data=data;
	}
}

class dll{
	Node head,tail;
	int size=0;
	void addLast(int databaru) {
		Node baru=new Node(databaru);
		if(head==null) {
			head=tail=baru;
			size++;
		}
		else {
			tail.next=baru;
			baru.prev=tail;
			tail=baru;
			tail.next=head;
			head.prev=tail;
			size++;
		}
	}

	
	void show() {
		Node current=head;
		Node current2=head.prev;
		System.out.println("Head ke Head");
		for(int i=0;i<=size;i++) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println("\n\nTail ke Tail");
		for(int i=0;i<=size;i++) {
			System.out.print(current2.data+" ");
			current2=current2.next;
		}
	}

	
	void delete() {
		Node current=head;
		System.out.println("\n");
		int size1=size;
		for(int i=0;i<size;i++) {
			Node teehe=current;
			System.out.println("");
			for(int y=0;y<size1;y++) {
				System.out.print(teehe.data+" ");
				teehe=teehe.next;
			}
			current=current.next;
			current.prev=null;
			size1--;
		}
		
		System.out.println("\nData habis");
	}
}

public class Modul2 {
	public static void main(String[] args) {
		dll dary=new dll();
		dary.addLast(1);
		dary.addLast(2);
		dary.addLast(3);
		dary.addLast(4);
		dary.addLast(5);
		dary.show();
		dary.delete();
	}

}
