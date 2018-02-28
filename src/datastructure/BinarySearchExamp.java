package datastructure;

public class BinarySearchExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr={2,4,8,10,12,16};
	 int startElement=0;
	 int endElement=arr.length-1;
	 int findElement=10;
	 
		
	int result =  binarySearch(arr, startElement, endElement, findElement);
		
		System.out.println(result);
		
	}
	
	public static int binarySearch(int[] x,int start,int end,int find){
		
		if(end>0){
			 
			int mid=   (start + end)/2;
			 
			 if(x[mid]==find){
				 return  x[mid];
			 }
			//left 
			 if(x[mid]>find){
				 return binarySearch(x,start,mid - 1, find);
			 }
			 //right
			 if(x[mid]<find){
				 return binarySearch(x,mid + 1,end ,find);

			 }
		 }
		return -1;
	}

}
