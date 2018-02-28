package datastructure;

public class BubblesortExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={2,10,12,9,7,8,4};
		for (int i : bubbleSorting(arr)) {
			System.out.print(i+",");

		}
		
	}
	
	
	private static int[] bubbleSorting(int[] x){
		
		int temp=0;
		for(int i=0;i<x.length;i++){
			for(int j=i+1;j<x.length;j++){
				if(x[i]<x[j]){
					temp=x[j];
					x[j]=x[i];
					x[i]=temp;
				}
			}
		}
		
		return x;
		
		
	}
	
	

}
