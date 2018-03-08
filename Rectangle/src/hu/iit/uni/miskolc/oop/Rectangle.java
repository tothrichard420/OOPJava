package hu.iit.uni.miskolc.oop;

public class Rectangle {
	private int a;
	private int b;
	public Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	public void setBoth(int a, int b){
		this.a = a;
		this.b = b;
	}
	public void setBoth(int a){
		this.a = a;
		this.b = a;
	}
	public Rectangle(int a){
		this (a,a);
	}
	public int area(){
		return a*b;
	}
	public String toString(){
		return "a oldal: " + a + " b oldal: " + b;
	}
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
	public boolean isBigger(Rectangle rectangle){
		if(rectangle.area() < area()){
			return true;
		}
		return false;
	}
	public boolean sameRectangle(Rectangle rectangle){
		if(rectangle.area() < area()){
			return true;
		}
		return false;
	}
}
