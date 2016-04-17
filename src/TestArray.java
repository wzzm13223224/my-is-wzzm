public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] s={2,5,3,8,1,7,9,0,4,6};
           for(int i=0;i<s.length;i++){
        	   for(int j=i+1;j<s.length;j++){
            	   if(s[i]>s[j]){
            		   int d;
            		   d=s[i];
            		   s[i]=s[j];
            		   s[j]=d;
            		   //System.out.print(s[i]+"  ");
            	   }
            	   else{}            		   
               }System.out.print(s[i]+"  ");
        	   
           }
	}

}
