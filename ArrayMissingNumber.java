package JavaBasic;

public class ArrayMissingNumber {

	public static void main(String[] args) {
		
		//Array should not have duplicates
		//Array no need to be sorted order
		//Value should be in range
		
		int a[]= {1,2,4,5};
		
		//1+2+4+5= 12  sum1
		//1+2+3+4+5= 15  sum2
		//sum2-sum1= 15-12= 3 missing
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("total of sum1...."+ sum1);
		
		int sum2=0;
		for(int i=1;i<=5;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("Total of sum2..."+ sum2);
		System.out.println("the missing number is.."+(sum2-sum1));
		

	}

}
