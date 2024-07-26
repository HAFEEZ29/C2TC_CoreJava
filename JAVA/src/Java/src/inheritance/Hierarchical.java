package inheritance;

public class Hierarchical {
void vehicle() {
	String colour="red",model="2024 model";
	System.out.println(colour+model);
}
class Bike extends Hierarchical{
void Bike() {
	String colour="black",model="2024 model",brand="bmw";
	System.out.println(colour+model+brand);		
}
}
class car extends Hierarchical{
void car() {
	String colour="blue",model="2024 model",brand="audi";
	System.out.println(colour+model+brand);
}
}
	public static void main(String[] args) {
		Hierarchical h = new Hierarchical();
		Bike bike =h.new Bike();
		bike.Bike();
		car c=h.new car();
		c.car();
				

	}

}
