package com.debug;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Going to debugb our Java Application.");
		
		int myarr[] = {2,5,7,81};
		
		int sum = getSum(myarr);
		
		System.out.println("sum = "+ sum);
	}
	
	public static int getSum(int arr[])
	{
		int s=0;
		for(int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
		}
		
		s = s+3;
		
		return s ;
	}

}
