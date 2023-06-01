package method_with_returntype;

public class sample3 {
public static void main(String[] args) {
	 sample3 d=new sample3();
	 int num=d.sub(30, 10);
	 System.out.println(num);
	 System.out.println(d.sub(35, 4));
	 System.out.println("----------");
	 int num2=div(4, 5);
	 System.out.println(num2);
}
public int sub(int a,int b) {
	int c=a-b;
	return c;
}
public static int div(int c,int e) {
	int d=c/e;
	return d;
}
}
