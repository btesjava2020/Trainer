package btes;

import java.util.Scanner;
class ArrayDemo
{
	public static void main(String args[]){
		int[] arr;//declaring
		int i,j,k,temp;
		arr=new int[10];//creating
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter elements in array");
		for(i=0;i<arr.length;i++){
			arr[i]=s.nextInt();
			for(j=0;j<=i;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			for(k=0;k<arr.length;k++){
				System.out.print(arr[k]+"\t");
			}
		}
	}
}