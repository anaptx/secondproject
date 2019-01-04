
public class Quicksort {
public static void main(String[] args) {
	int[] A = {99,20,5,16,15,1,30,45,23,9};
	int start = 0;
	int end = A.length-1;
	sort(A, start, end);
	for(int i=0;i<A.length;i++){
		System.out.print(A[i]+"<");
	}
}
public static int Partition(int[] A,int p,int r) {
	int i = p;
	int j = r;
	int x = A[p];
	while(true) {
		while(i<j && A[j]>x) 
			j--;
			while(i<j && A[i]<=x)
				i++;
				if (i<j) {
					int temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
				else return j;
			}
}
public static void sort(int[] A,int p,int r) {
	if (p<r) {
		int q = Partition(A, p, r);
		int temp = A[q];
		A[q] = A[p];
		A[p] = temp;
		sort(A,p,q-1);
		sort(A, q+1, r);
	}
}
}
