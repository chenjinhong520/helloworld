import java.util.Scanner;
public class Arraycopy{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int array1[] = new int[5];
		for( int i = 0;i < array1.length;++i ){
			array1[i] = (int)(Math.random()*100);
		}
		System.out.println("array1:");
		for ( int value : arr1 ){
			System.out.println(value);
		}
		
	    int array2[] = new int[5];
		for( int i = 0;i < arr2.length;++i ){
			array2[i] = (int)(Math.random()*100);
		}
		System.out.println("array2:");
		for ( int value : arr2 ){
			System.out.println(value);
		}
		
		System.out.println("imput a math what you want to copy srcPos of array1\n");
		System.out.println("(1<=x<=5)\n");
		int a = scan.nextInt()-1;
		System.out.println("imput a math what you want to copy destPos of array2\n");
		System.out.println("(1<=x<=5)\n");
		int b = scan.nextInt()-1;
		System.out.println("imput a length howmany you want to copy");
		int c = scan.nextInt();
		System.arraycopy(array1,a,array2,b,c);
		
		for ( int value : array2 ){
			System.out.println(value);
		}
		
	}
}