package Day7;
import java.util.*;
public class Exercise6 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int a=sc.nextInt();
		System.out.println("Enter the number of columns");
		int b=sc.nextInt();
		
		int [][] arr1=new int[a][b];
		int [][] arr2=new int[a][b];
		System.out.println("Enter the elements of first matrix");
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements of second matrix");
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		int [][] sum=new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				sum[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("Addition of two3 matrix");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}
	}
}
