public class TestCats {
	public static void main(String[] args){
		
		Cats c1=new Cats(1,1,1);
		Cats c2=new Cats(1,1,1);
		System.out.println(c1==c2);
		System.out.println(c1.equals(c2));
		
		String s1=new String("1");
		String s2=new String("1");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}

}
class Cats{
	int color;
	int height,weight;
	public Cats(int color,int height,int weight){
		this.color=color;
		this.height=height;
		this.weight=weight;
	}
	public boolean equals(Object obj){
		if(obj==null)return false;
		else 
			if(obj instanceof Cats){
				Cats c=(Cats)obj;
				if(c.color==this.color && c.height==this.height && c.weight==this.weight){
					return true;
				}
			}
	return false;
		}	
	}