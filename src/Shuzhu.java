public class Shuzhu {
		public static void main(String args[]) throws ArrayIndexOutOfBoundsException{
			
			int[] l=new int[3];
			l[0]=0;l[1]=1;l[2]=3;//l[2]=2;l[3]=3;l[4]=4;l[5]=5;
			
			try{
			Zhongguo c=new Zhongguo();
			c.Enjob(l);
			}catch(ArrayIndexOutOfBoundsException v){
				System.out.println("我错了0");
			}finally{
				
			}
			 
			try{
			Beijing2 d=new Beijing2();
			d.Enjob(l);
			}catch(ArrayIndexOutOfBoundsException z){
				System.out.println("我错了1");
			}finally{
				
			}
			
			try{
			Beijing1 f=new Beijing1();
			f.Enjob(l);
			}catch(ArrayIndexOutOfBoundsException x){
				System.out.println("我错了2");
			}finally{
				
			}
		}
}
class Zhongguo{
	int[] s=new int[5];
	Zhongguo(){
		System.out.println(".....");
		}
	void Enjob(int[] e)throws ArrayIndexOutOfBoundsException{
		for(int i=0;i<s.length;i++){
			s[i]=e[i];
			System.out.println("....."+s[i]);
		}
		
	}
}
class Beijing1 extends Zhongguo {
	private int[] j=new int[4];
	void Enjob( int [] a)throws ArrayIndexOutOfBoundsException{
		for(int i=0;i<j.length;i++){
			s[i]=a[i];
			System.out.println("-----"+s[i]);
	}
	}
	
}
class Beijing2 extends Zhongguo{
	private int[] j=new int[3];
	void Enjob( int [] a)throws ArrayIndexOutOfBoundsException{
		for(int i=0;i<j.length;i++){
			s[i]=a[i];
			System.out.println("|||||||"+s[i]);
	}
	}}

			/*File1 c=null;
			try{
				c=new File1(16,8,4);
				c.Open1(0);
				c.Open1(1);
			}catch(ArithmeticException e){
				System.out.println("0不能是被除数");
				System.out.println(e.getMessage());
				//System.out.print(e.printStackTrace());
			   }
			catch(IOException ae){
				ae.printStackTrace();
				System.out.println(ae.getMessage());
			}
			finally{ 
		         }
			}
Shuzhu mer=new Shuzhu();
	try{
		mer.meput1();
	}catch(ArithmeticException n){
		n.getMessage();}
	}
	
public void meput1()throws ArithmeticException{
	meput2();
	}
public void meput2()throws ArithmeticException{
	meput3();
	}
public void meput3()throws ArithmeticException{
	int w=1;
	int e=0;
	System.out.println(".........");

	int t=w/e;
	System.out.println("........."+t);
	}
}
class File1{
int i,j,k;
File1(int i,int j,int k){
	this.i=i;
	this.j=j;
	this.k=k;		
}
public File1() {
	// TODO Auto-generated constructor stub
}
public void Open1(int m)throws ArithmeticException,IOException{
	System.out.println(i/m);
}
}		
		

		}*/

