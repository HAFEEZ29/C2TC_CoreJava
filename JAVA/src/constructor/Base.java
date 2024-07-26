package constructor;
public class Base {
	Base(){
		System.out.println("Default Constructor");
	}
	Base(int a){
		System.out.println("A:"+a);
	}
	Base(int a,int b){
		System.out.println("A:"+a+" B:"+b);
	}
	Base(String a,int b){
		System.out.println("A:"+a+" B:"+b);
	}
	Base(int a,String b){
		System.out.println("A:"+a+" B:"+b);
	}
}
