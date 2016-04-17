public class Person2 {
	int id=1;
	int age = 20;
	Person2(int n, int l) {
		id = n;
		age = l;
	}
public static void main(String args[]) {
		Person2 tom = new Person2(1,25);
	    System.out.println(tom.age+"+"+tom.id+"="+(tom.id+tom.age));	
	
	
		Point p = new Point();
		p.x =10;
		p.y=20;
		System.out.println(p.x+p.y);
	}
		
	}
class Point {
	Point() {}
	int x;
	int y;
}