public class Cat {
    private static int sid = 0;
    private String name; 
    int id;
    Cat(String name) {
        this.name = name;  
        id = sid++;
    }
    public void info(){
        System.out.println
               ("My name is "+name+" No."+id+sid);
    }
    public static void main(String arg[]){
        Cat.sid = 100;
        Cat mimi = new Cat("mimi"); 
       
        //mimi.sid = 2000;
        Cat pipi = new Cat("pipi");
 //       Cat oo=new Cat("oo");
        mimi.info();
        pipi.info();
//        oo.info();
    }
}

