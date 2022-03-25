package Week1Day1;

public class FibonacciSeries {
	
public static void main(String[] args) {
	int range =8;
	int num1=0;
	int num2 = 1;
	int sum=0;
	System.out.println(num1);
for (num1 = 0;  num1 <= range; num1++)
    {
		
	num1=num2;
	num2=sum;
	sum = num1 + num2;	
	
System.out.println(sum);
	
	
		
	}
	// TODO Auto-generated method stub

}

}


