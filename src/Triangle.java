
public class Triangle {
	
	float height = 20.0f;
	float width = 40.0f;
	
	
	public Triangle() {
		// TODO Auto-generated constructor stub
	}


	public Triangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}
	
	public void calculateArea() {
		float area = height*width/2;
		System.out.println("Area of the triangle is: "+area);
	}
}
