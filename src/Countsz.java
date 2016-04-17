public class Countsz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] s=new int[5000];
			for(int i=0;i<s.length ;i++){s[i]=1;}
			int m=s.length;
			int sum=0;
			int cout=0;
			while(m>1){
				if(s[sum]==1){
				cout++;
				if(cout==3){
					cout=0;
					s[sum]=0;
					m--;}			
				}
			sum++;
			if(sum==s.length){sum=0;}
			}			
	for(int i=0;i<s.length;i++){
		if(s[i]==1){
			System.out.print(i);
			}
	}
	}
	}

