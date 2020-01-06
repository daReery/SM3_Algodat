package responAkhir;
class Node5{
int data;
Node5 left,right;
Node5(int data){
	this.data=data;
	}			
}

class treery{
Node5 root;
void add(int databaru){
    Node5 baru=new Node5(databaru);
		if(root==null){
			root=baru;
			root.right=null;
			root.left=null;
		}
		else{
		    masuk(root,baru);
	    }
}

void masuk(Node5 root,Node5 baru){
    if(root.data<baru.data){
    	if(root.right==null){
    		root.right=baru;
		}
		else{
			masuk(root.right,baru);
		}
	}
	else{
		if(root.left==null){
			root.left=baru;
		}
		else{
			masuk(root.left,baru);
			}
	}
}

void DFS(Node5 root){
    if(root!=null){
    System.out.print(root.data+" ");
    DFS(root.left);
    DFS(root.right);
    }
}

void inor(Node5 root){
    if(root!=null){
    inor(root.left);
    System.out.print(root.data+" ");
    inor(root.right);
    }
}

void postor(Node5 root){
    if(root!=null){
    postor(root.left);
    postor(root.right);
    System.out.print(root.data+" ");
    }
}


}

public class Modul5{
	public static void main(String[] args){
		treery treeD=new treery();

		treeD.add(10);
		treeD.add(7);
		treeD.add(5);
		treeD.add(3);
		treeD.add(1);
		treeD.add(2);
		treeD.add(4);
		treeD.add(6);
		treeD.add(6);
		
		System.out.print("DFS : ");
		treeD.DFS(treeD.root); System.out.print(" (sama dengan Preorder jadi bisa saya buat)");
		System.out.print("\nBFS : Belum pernah buat (karena jurnal hanya pre,in,post)");

		}
}



