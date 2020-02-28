package btes;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {3,5,1,7,2};int i,x=10;
		sort(arr);
		int y=add(x);//actual
		System.out.println("x="+x+"y="+y);
//		for(i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	}
	private static int add(int x) {// x is formal
		x=20;
		return x;
		
	}
	static void sort(int[] a) {
		int i,j,temp;
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
			}
		}
		
		}
	}
	


