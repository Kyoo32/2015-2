


class Shape{
	public void draw(){
		System.out.println("Draw shape ");
	}
}

class Circle extends Shape{
	public void draw(){
		System.out.println("Draw circle ");
	}
	public void circle(){
		System.out.println("Complete");
	}
}
class Triangle extends Shape{
	public void draw(){
		System.out.println("Draw triangle");
	}
	public void triangle(){
		System.out.println("mission");
	}
	
}

public class ShapeTest {
	public void main(String[] args){
		ShapeTest st = new ShapeTest();
		st.drawShape(new Circle());
		
		Shape s = st.makeShape(1);
		
		Shape[] slist = {new Circle()};
		slist[1].draw();
		
		Shape h = new Circle();
		Circle c;
		
		if(h instanceof Circle){
			c = (Circle)h;
			c.circle();
		}
		
		Shape a = new Triangle();
		Triangle t;
		
		if (a instanceof Triangle){
			t = (Triangle)a;
			t.triangle();
		}
	
	}
	
	public void drawShape(Shape s){
		s.draw();
	}
	
	public Shape makeShape(int type){
		if (type==1) return new Circle();
		else return  null;
	}
	
	
}
