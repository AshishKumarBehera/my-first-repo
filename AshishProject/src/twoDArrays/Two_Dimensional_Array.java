package twoDArrays;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
	int B[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for(int i=0;i<B.length;i++) {
		for(int j=0;j<B[0].length;j++) {
			System.out.print(B[i][j]+" ");
		}
		System.out.println("");
	}

	}

}
