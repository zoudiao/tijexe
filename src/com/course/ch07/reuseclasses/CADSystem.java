package com.course.ch07.reuseclasses;
class Shape{
	Shape(int i){
		System.out.println("Shape constructor");
	}
	void dispose(){
		System.out.println("Shape dispose");
	}
}

class Circle extends Shape{

	Circle(int i) {
		super(i);
		System.out.println("Circle constructor");
	}
	
	void dispose(){
		System.out.println("Eraising Circle");
		super.dispose();
	}
	
}

class Triangle extends Shape{

	Triangle(int i) {
		super(i);
		System.out.println("Triangle constructor");
	}
	
	void dispose(){
		System.out.println("Eraising Triangle");
		super.dispose();
	}
	
}

class Line extends Shape{
	private int start,end;
	

	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		
		System.out.println("Drawing Line: "+start+","+"end");
	}
	
	
	void dispose(){
		System.out.println("Eraising Line "+start+","+"end");
		super.dispose();
	}
	
}
public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	
	CADSystem(int i) {
		super(i);
		for(int j=0;j<lines.length;j++){
			lines[j]=new Line(j,j*j);
			c = new Circle(1);
			t = new Triangle(1);
			System.out.println("Combined constructor");
		}
	}
	
	public void dispose(){
		System.out.println("CADSystem.dispose(");
		t.dispose();
		c.dispose();
		for(int i = lines.length-1;i>=0;i--){
			lines[i].dispose();
		}
		super.dispose();
	}

	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try{
			
		}finally{
			x.dispose();
		}
	}

}
