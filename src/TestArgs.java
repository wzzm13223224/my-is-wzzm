public class TestArgs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<3){
			System.out.println("args ..");
			System.exit(-1);
		}
		double d1=Double.parseDouble(args[0]);
		double d2=Double.parseDouble(args[2]);
		double d=0;
		if(args[1].equals("+"))d=d1+d2;
		else if(args[1].equals("-"))d=d1-d2;
		else if(args[1].equals("x"))d=d1*d2;
		else if(args[1].equals("/"))d=d1/d2;
		else
			System.exit(-1);
		System.out.println("d="+d);
	}
}
