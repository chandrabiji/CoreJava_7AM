package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer Array Size ?");
		int size = sc.nextInt();
		int[] arr = new int[size];//array created
		System.out.println("Enter Array Elements ?");
		for(int i=0;i<size;++i)
		{
		   arr[i]=sc.nextInt();
		}
		System.out.println("without sorting array elements");
		for(int k:arr)
		{
			System.out.println(k);
		}
		Arrays.sort(arr);//array elements sorting 
		System.out.println("After sorting array elements");
		for(int k:arr)
		{
			System.out.println(k);
		}
		System.out.println("Array Minimum value = "+arr[0]);
		System.out.println("Array Maximum value = "+arr[size-1]);
		System.out.println("Array 2nd Highest value = "+arr[size-2]);

	}

}
