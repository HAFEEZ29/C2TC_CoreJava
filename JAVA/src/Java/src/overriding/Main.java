package overriding;

public class Main {

	public static void main(String[] args) {
	Method m=new Method();
	m.a(0);
	Method n=new Demo();
	n.a(0);
	Demo d=new Demo();
	d.a(0);
	}
	}
