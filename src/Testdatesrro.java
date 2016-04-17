public class Testdatesrro {
	public static void main(String[] args){
		Data[] d=new Data[6];
		d[0]=new Data(2012,5,12);
		d[1]=new Data(2012,5,14);
		d[2]=new Data(2014,5,22);
		d[3]=new Data(2011,8,12);
		d[4]=new Data(2011,5,23);
		d[5]=new Data(1912,9,19);
		Data s=null;
		
		for(int i=0;i<d.length;i++){
			for(int j=i+1;j<d.length;j++){
				if(d[i].Ymd(d[j])>=0){
					s=d[i];
					d[i]=d[j];
					d[j]=s;
				}
				else{}
			}
			//1.System.out.println(d[i].years+"-"+d[i].months+"-"+d[i].days);
		    //2.d[i].getDatas();
			d[i].getDatas(d[i]);//3.
		}
	}

}
 class Data{
	 int years,months,days;
	 Data(int y,int m,int d){
		 years=y;
		 months=m;
		 days=d;	 
	 }
	 public void getDatas() {//2
		// TODO Auto-generated method stub
		System.out.println(years+"-"+months+"-"+days);
	}
	public void getDatas(Data f){//3
		System.out.println(f.years+"-"+f.months+"-"+f.days);
	 }
	 public int Ymd(Data data){//用于比较大小
		 return years>data.years?1:
			    years<data.years?-1:
			    months>data.months?1:
			    months<data.months?-1:
			    days>data.days?1:
			    days<data.days?-1:0;
			 	 }
 }