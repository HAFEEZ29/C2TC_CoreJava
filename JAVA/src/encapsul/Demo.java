package encapsul;

public class Demo {
int a,b;
String name,dept;
float per;
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public float getPer() {
	return per;
}
public void setPer(float per) {
	this.per = per;
}
@Override
public String toString() {
	return "Demo [a=" + a + ", b=" + b + ", name=" + name + ", dept=" + dept + ", per=" + per + "]";
}

}
