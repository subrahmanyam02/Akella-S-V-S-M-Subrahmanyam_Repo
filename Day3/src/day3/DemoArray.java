package day3;

public class DemoArray {
	public static void main(String[] args) {
		
	
	int arr1[][]= {{1,1,1},{1,1,1}};
	int arr2[][]= {{2,2,2,},{2,2,2}};
	int[][] sumarr=new int[2][3];
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			sumarr[i][j]=arr1[i][j]+arr2[i][j];
		}
	}
	System.out.println("matrix 1");
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("matrix2");
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
		System.out.print(arr2[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println("sum of the matrixes");
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(sumarr[i][j] +" ");
		}
		System.out.println();
	}


}}
