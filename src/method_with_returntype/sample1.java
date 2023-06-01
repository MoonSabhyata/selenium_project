package method_with_returntype;

public class sample1 {
public static void main(String[] args) {
	 int num=add(20, 20);
	 System.out.println(num);
	  System.out.println("------");
	  System.out.println(add(20, 50));
	  System.out.println("non static");
	  
	   sample1 s1=new sample1();
	   int num2=s1.multi(5, 4);
	   System.out.println(num2);
	   System.out.println("----");
	    System.out.println(s1.multi(3, 4));
	    System.out.println("----------");
	    String num3=sample2.convertnametouppercase("sabhyata");
	    System.out.println(num3);
		   
}
public static int add(int a,int b) {
	int c=a+b;
	return c;
}
public int multi(int a,int b) {
	int multiplication=a*b;
	return multiplication;
}
}
