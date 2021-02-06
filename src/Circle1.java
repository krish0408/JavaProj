
public class Circle1 {
	
	int radious;
	float pi=3.14f;
	 
	
	public Circle1() {
		// TODO Auto-generated constructor stub
	}


	public Circle1(int radious) {
		super();
		this.radious = radious;
	}
	
public void calculateArea() {
	float area = pi*radious*radious;
	System.out.println("Area of the Circle: "+area);
}
public void calculateCircumference() {
	float circumference = pi*2*radious;
	System.out.println("Circumference of the Circle is: "+circumference);
}
}
