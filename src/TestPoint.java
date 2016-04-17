class Toint{
    double x,y,z;
	Toint(float _x,float _y,float _z){
		x=_x;
		y=_y;
		z=_z;
	}
	void Setx(double x_){
		x=x_;
	}
	void Sety(double y_){
		y=y_;
	}
	void Setz(double z_){
		z=z_;
	}
	double Miss(Toint p){
		return (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y) + (z - p.z)*(z - p.z);
	}
	
}
public class TestPoint {
	public static void main(String asgs[]){
     Toint b1=new Toint(0,0,0);
     Toint b2=new Toint(2,2,2);
     System.out.println(b2.Miss(b1));
     b2.Setx(3);
     System.out.println(b2.Miss(b1));
     System.out.println(b2.Miss(new Toint(1,1,1)));
     b2.Sety(0.5);
     b2.Setz(1);
     System.out.println(b2.Miss(b1));
}
	}