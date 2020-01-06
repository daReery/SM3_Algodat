package responAkhir;
import java.util.Scanner;

class linkedlist{
    NodeR head,tail;
     void addLast(int databaru) {
		NodeR baru = new NodeR (databaru);
		if(head==null) {
		head = baru;
		tail = baru;
		}
		else {
		baru.prev = tail;
		tail.next = baru;
		tail=baru;
		}
		
    }

}


class graf{
    int vertex;
    linkedlist[] arr;
    linkedlist BFS = new linkedlist();
    linkedlist DFS = new linkedlist();
    
    graf(int vertex){
        this.vertex = vertex;
        arr = new linkedlist [vertex];
        for (int i=0; i<vertex; i++){
            arr[i]= new linkedlist();
        }
    }
    

     void addEdge(int mana, int kemana){
        arr[mana].addLast(kemana);
    }

     void adjacencyList() {
        for(int i=0; i<vertex; i++){
            NodeR current = arr[i].head;
            System.out.print("Vertex " + (i+1) + " : ");
            while(current!=null){
                System.out.print("" + (current.data+1) + " ");
                current=current.next;
            }
            System.out.println();
        }
        System.out.println(" ");
        for(int i=0; i<vertex; i++){
        	NodeR current1 = arr[i].head.next;
        	System.out.print("\n"+(i+1)+" :");
        		for(int y=0; y<vertex; y++) {
        			for(int x=0;x<vertex;x++) {
        				boolean fou=false;
        				while(current1!=null) {
        					if(x==current1.data) {fou=true; break;}
        					current1=current1.next;
        					if(fou=true) {System.out.print(" 1");}
            				else if(fou=false) {System.out.print(" 0");}
        				}
        			}
        		}
        	}
     
     }
}

public class Modul6{
    public static void main(String[] args) {
        graf graph = new graf(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 5);
        graph.addEdge(1, 3);
        graph.addEdge(1, 0);
        graph.addEdge(2, 0);
        graph.addEdge(2, 1);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 2);
        graph.addEdge(3, 4);
        graph.addEdge(4, 3);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(5, 0);
        graph.addEdge(5, 4);
        graph.adjacencyList();

      
        
        
    }
}

class NodeR{
	NodeR next, prev;
	int data;
	NodeR(int data){
	this.data = data;		
    }
}
