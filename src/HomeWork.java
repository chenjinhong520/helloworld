public class HomeWork{
	public static void main(String[] args){
		System.out.println("34 + 30 = " + 34 + 30);
		
		int count = 10;
		count *= count +2;
		count /= 100;
		count ++;
		System.out.printf("%d",count);
		
		int res = 0;
		int n1 = 12;
		int n2 = 24;
		int n3 = 16;
		int n4 = 3;
		double d = 0.0;
		double v1 = 10.0;
		double v2 = 3.1416;
		
		res = n1 / n4;
		d = n1 / n4;
		System.out.printf("%d , %f \n",res,d);
		
		res = n3/n4;
		d = n3/n4;
		System.out.printf("%d , %f \n",res,d);
		
		d = v1 / n4;
		System.out.printf(" %f \n",d);
		
		d = v1 / v2;
		System.out.printf(" %f \n",d);
		
		res = n1 / n2;
		System.out.printf(" %d \n",res);
		
		d = (double)n1 / n2;
		System.out.printf(" %f \n",d);
		
		d = n1 / (double)n2;
		System.out.printf(" %f \n",d);
		
		d = (double)(n1 / n2);
		System.out.printf(" %f \n",d);
	}
}