package com.suma.array;

public class ArraySorting {

	public static void main(String[] args) {
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=0;
		arr[2]=1;
		arr[3]=0;
		arr[4]=1;
		System.out.println("======Before Sorting======");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=i+1;j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		System.out.println("======After Sorting======");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
