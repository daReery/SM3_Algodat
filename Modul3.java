package responAkhir;
class NodeS{
	String data;
	NodeS next,prev;
	NodeS(String data){
		this.data=data;
	}
}

class stack{
	NodeS head,tail;
	int size=0;
	void push(String databaru) {
		NodeS baru=new NodeS(databaru);
		if(head==null) {head=tail=baru;}
		else {
			baru.next=head;
			head=baru;
		}
		size++;
	}
	String pop(){
		String x;
		NodeS current=head;
		if(head==null) {
			System.out.println("kosong");
		}
		else {
			head=head.next;
		}
		size--;
		return current.data;
	}
	void show() {
		NodeS current=head;
		for(int i=0;i<size;i++) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
}

class queue{
	NodeS head,tail;
	int size=0;
	void enqueue(String databaru) {
		NodeS baru=new NodeS(databaru);
		if(head==null) {head=tail=baru;}
		else {
			baru.next=head;
			head=baru;
		}
		size++;
	}
	String dequeue(){
		String balik;
		NodeS current=head;
		NodeS last=current.next;
		while(last.next!=null) {
			current=current.next;
			last=last.next;
		}
		tail=current;
		tail.next=null;
		size--;
		return last.data;
	}
	
	void show() {
		NodeS current=head;
		for(int i=0;i<size;i++) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
}

public class Modul3 {
	public static void main(String[] args) {
		stack darys=new stack();
		queue daryq=new queue();
		System.out.print("Stack : ");
		darys.push("Anjing");
		darys.push("kambing");
		darys.push("bebek");
		darys.push("monyet");
		darys.push("cicak");
		darys.show();
		System.out.println("");
		
		System.out.print("Queue : ");
		daryq.enqueue("ande");
		daryq.enqueue("diki");
		daryq.enqueue("diky");
		daryq.enqueue("farel");
		daryq.enqueue("anda");
		daryq.show();
		
		System.out.print("\nQueue : ");
		daryq.enqueue(darys.pop());
		daryq.enqueue(darys.pop());
		daryq.enqueue(darys.pop());
		daryq.enqueue(darys.pop());
		daryq.enqueue(darys.pop());
		daryq.show();
		
		System.out.print("\nStack : ");
		darys.push(daryq.dequeue());
		darys.push(daryq.dequeue());
		darys.push(daryq.dequeue());
		darys.push(daryq.dequeue());
		darys.push(daryq.dequeue());
		darys.show();
	}
}
