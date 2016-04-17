class Qoint {//����
    private double x;
    private double y;
    Qoint(double x1, double y1) { 
    	x = x1; 
    	y = y1;
    }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double i) { x = i; }
    public void setY(double i) { y = i; }
}


class Circle {//԰��
    private Qoint o;//��
    private double radius;//�뾶
    Circle(Qoint p, double r) {//����㷽������Ͱ뾶������������  M
    	o = p; 
    	radius = r;
    }
    Circle(double r) {//����㷽�����뾶�������������� Z
        o = new Qoint(0.0, 0.0);
        radius = r;
    }
    
    boolean contains(Qoint p) {//
    	double x = p.getX() - o.getX();
    	double y = p.getY() - o.getY();
    	if(x*x + y*y > radius * radius) return false;
    	else return true;
    }
       
    public void setO(double x, double y) {
        o.setX(x); 
        o.setY(y);
    }
    public Qoint getO() { return o; }//���ص���һ��Qoint�Ķ���
    public double getRadius() { return radius;}
    public void setRadius(double r) { radius = r;}
    public double area() { //��Բ���
        return 3.14 * radius * radius;
    }
}

public class TestCircle {
    public static void main(String args[]) {
        Circle c1 = new Circle(new Qoint(1.0,2.0), 2.0); //������M
        Circle c2 = new Circle(5.0);//������Z
        System.out.println("c1:("+c1.getO().getX()+","
            +c1.getO().getY()+"),"+c1.getRadius());//��1.0��2.0����2.0
        System.out.println("c2:("+c2.getO().getX()
            +","+c2.getO().getY()+"),"+c2.getRadius());//��0.0��0.0����5.0
        System.out.println("c1 area = "+c1.area());//p*4
        System.out.println("c1 area = "+c2.area());//p*25
        
        c1.setO(5,6);
        c2.setRadius(9.0);
        System.out.println("c1:("+c1.getO().getX()+","
            +c1.getO().getY()+"),"+c1.getRadius());//��5.0��6.0����2.0��
        System.out.println("c2:("+c2.getO().getX()+","
            +c2.getO().getY()+"),"+c2.getRadius());//��0.0��0.0����9.0
        System.out.println("c1 area = "+c1.area());//p*4
        System.out.println("c1 area = "+c2.area());//p*81
        
        Qoint p1 = new Qoint(5.2, 6.3);
        System.out.println(c1.contains(p1));//true
        System.out.println(c1.contains(new Qoint(10.0,9.0)));//false
        
    }
}
