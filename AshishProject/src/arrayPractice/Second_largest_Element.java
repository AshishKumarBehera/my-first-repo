package arrayPractice;

public class Second_largest_Element {

	public static void main(String[] args) {
		int A[]= {2,4,6,12,11,9,3,7,99,100,119,20,25};
		int max1=A[0];
		int max2=A[0];
		for(int i=0;i<A.length;i++) {
			if(A[i]>max1) {
				max2=max1;
				max1=A[i];
			}
			else if(A[i]>max2) {
				max2=A[i];
			}
		}
       System.out.println("The second largest element is:"+max2);
	}

}
