package responAkhir;
import java.util.Scanner;

import java.util.Random;

class Node4 { 
    int data;
    Node4 next;
    Node4 prev;
    Node4(int data) {
        this.data = data;   
        this.next = null;  
    }
}

class link{
	Node4 head, tail;
    int size = 0;
    int ribetnya=0;
    void addLast(int data){
        Node4 baru = new Node4(data);
        if(head == null){
            head = baru;
            tail = baru;
            size++;
        }
        else{
            baru.prev = tail;
            tail.next = baru;
            tail = baru;
            size++;
        }
    }
    
    void display(){
        Node4 current = head;
        for(int i=0;i<size;i++){
            System.out.print(current.data + " ");
            current = current.next;
        }   
    }
    
    void selection() {
    	Node4 temp=head;
    	int simpan=0;
    	while(temp!=null){
    		Node4 current=temp.next;
    		for(;current!=null;current=current.next) {
    			if(temp.data>current.data){
    				simpan=current.data;
    				current.data=temp.data;
    				temp.data=simpan;
    				ribetnya++;
    			}
    		}
    		temp=temp.next;	
    	}
    }


    void insert(){
		Node4 temp,j;
		int tampung;
		for(temp=head.next;temp!=null;temp=temp.next){
			for(j=temp;j.prev!=null;j=j.prev){
				if(j.data<j.prev.data){
					tampung=j.data;
					j.data=j.prev.data;
					j.prev.data=tampung;
					ribetnya++;
				}
			}
		}
    }
    
    void cari(int cariData) {
    	Node4 current=head;
    	int indeks=0;
    	boolean ketemu=false;
    	while(current!=null) {
    		if(current.data==cariData) {
    			ketemu=true;
    			break;
    		}
    		indeks++;
    		current=current.next;
    	}
    	
    	if(ketemu==false) {
    		System.out.println("data tidak ditemukan");
    	}
    	else if(ketemu==true) {
    		System.out.println("data "+cariData+" ditemukan pada indeks ke-"+indeks);
    	}
    }
    
}2

public class Modul4 {
	public static void main(String[] args) {
		link awal=new link();
		link select=new link();
		link insert=new link();
		Random random = new Random();
		int nilaiR=0;
		
		for(int i=0; i<15; i++) {
			nilaiR=random.nextInt(25);
			awal.addLast(nilaiR);
			select.addLast(nilaiR);
			insert.addLast(nilaiR);
		}
		
		System.out.print("Data awal      : ");
		awal.display();
		System.out.print("\nSelection sort : ");
		select.selection();
		select.display();
		System.out.print("\nInsertion sort : ");
		insert.insert();
		insert.display();
		
		int sel=select.ribetnya;
		int ins=insert.ribetnya;
		
		if(sel<ins){
			System.out.println("\n\nSelection sorting lebih efisien dibandingkan Insertion sorting yaitu iterasinya adalah "+sel+" sedangkan Insertion sorting iterasinya adalah "+ ins);
		}
		else if(sel>ins){
			System.out.println("\n\nInsertion sorting lebih efisien dibandingkan Selection sorting yaitu iterasinya adalah "+ins+" sedangkan Selection sorting iterasinya adalah "+ sel);
		}
		
		 Scanner cin = new Scanner(System.in);
	     System.out.print("\nMasukkan data yang ingin dicari : ");
	     int cari = cin.nextInt();
	     select.cari(cari);
		
		
	}
}
