 public class Test1{
		public static void main(String[] args){
			Dog1 d=new Dog1("d","blue");
			Cat1 c=new Cat1("c","black");
			//Bird b=new Bird("b","red");
		    Laye Lili=new Laye("lili",c);
		    Laye Mimi=new Laye("mimi",d);
		    //Laye baby=new laye("baby",b);
		    Lili.Haha();
		    Mimi.Haha();
		    //babi.Haha();
		}
 }
 /*
  * class Animals{
		String name;
		Animals(String name){
			this.name=name;
		}
		public void Enjob(){
			System.out.println("动物叫。。。");
		}
	}
	*/
abstract class Animals{//抽象类
	String name;
	Animals(String name){
		this.name=name;
	}
	public abstract void Enjob();//抽象方法
}	
class Dog1 extends Animals{
	   String dogcolor;
		Dog1(String n,String l) {
		super(n);
		dogcolor=l;
	}
	    public void Enjob(){//父类抽象方法必须重写
			System.out.println(" 猫叫。。。 ");		
   }
}
 class Cat1 extends Animals{
	   String catcolor;
	   Cat1(String n,String l){
	    	super(n);
	    	catcolor=l;
	    }	
	   public void Enjob(){//父类抽象方法必须重写
			System.out.println(" 狗叫。。。 ");		
  }
	}
 
/*
    class Bird extends Animals{
	   String catcolor;
	   Bird(String n,String l){
	    	super(n);
	    	catcolor=l;
	    }	
	   public void Enjob(){//父类抽象方法必须重写
			System.out.println(" 狗叫。。。 ");		
}
	}
	*/
 class Laye{
	 String name;
	 Animals pet;
	 Laye(String name,Animals pet){
		 this.pet=pet;
	 }
	 public void Haha(){
	         pet.Enjob();
	 }	
 }
 