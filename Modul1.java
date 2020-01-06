package responAkhir;

public class Modul1 {
	public static void main(String[] args) {
	int matriks1[][],matriks2[][],matriks3[][],matriks4[][],matriks5[][];
	matriks1=new int[3][3];
	matriks2=new int[3][3];
	matriks3=new int[3][3];
	matriks4=new int[3][3];
	matriks5=new int[3][3];
	//(a-b)+(a+c)
	matriks1[0][0]=1;
	matriks1[0][1]=2;
	matriks1[0][2]=3;
	
	matriks1[1][0]=4;
	matriks1[1][1]=5;
	matriks1[1][2]=6;
	
	matriks1[2][0]=2;
	matriks1[2][1]=4;
	matriks1[2][2]=6;
	
	
	matriks2[0][0]=3;
	matriks2[0][1]=2;
	matriks2[0][2]=1;
	
	matriks2[1][0]=9;
	matriks2[1][1]=2;
	matriks2[1][2]=6;
	
	matriks2[2][0]=2;
	matriks2[2][1]=4;
	matriks2[2][2]=6;
	
	
	matriks3[0][0]=4;
	matriks3[0][1]=2;
	matriks3[0][2]=6;
	
	matriks3[1][0]=5;
	matriks3[1][1]=1;
	matriks3[1][2]=3;
	
	matriks3[2][0]=2;
	matriks3[2][1]=4;
	matriks3[2][2]=6;
	
	
	System.out.println("\nMatriks A :");
	for(int i=0;i<3;i++) {
		System.out.println(" ");
		for(int y=0;y<3;y++) {
			System.out.print(matriks1[i][y]+" ");
		}
	}
	
	System.out.println("\n\nMatriks B :");
	for(int i=0;i<3;i++) {
		System.out.println(" ");
		for(int y=0;y<3;y++) {
			System.out.print(matriks2[i][y]+" ");
		}
	}
	
	System.out.println("\n\nMatriks C :");
	for(int i=0;i<3;i++) {
		System.out.println(" ");
		for(int y=0;y<3;y++) {
			System.out.print(matriks3[i][y]+" ");
		}
	}
	
	
	for(int i=0;i<3;i++) {
		for(int y=0;y<3;y++) {
			matriks4[i][y]=matriks1[i][y]-matriks2[i][y];
		}
	}
	
	for(int i=0;i<3;i++) {
		for(int y=0;y<3;y++) {
			matriks5[i][y]=matriks1[i][y]+matriks3[i][y];
		}
	}
	
	System.out.println("\n\nMatriks HASIL (A-B)+(A+C) :");
	for(int i=0;i<3;i++) {
		System.out.println(" ");
		for(int y=0;y<3;y++) {
			System.out.print((matriks4[i][y]+matriks5[i][y])+" ");
		}
	}
	
	
	}
}
