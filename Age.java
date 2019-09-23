import java.util.Scanner;
public class Age{
	public static void main(String[] args){
		System.out.print("输入年龄");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int x = 0;
		if(age<18){
			x = 1;
		}
		else{
			x = 2;
		}
		switch(x){
			case 1:
			  System.out.println("你好，小姐姐");
			  break;
			case 2 :
              System.out.println("你好 ，大姐姐");
              break;			  
		}
	}
}
