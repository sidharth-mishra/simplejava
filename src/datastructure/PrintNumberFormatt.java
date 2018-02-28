package datastructure;

public class PrintNumberFormatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int result[][]=	printFormatt(5);
	
	for(int i=0;i<result.length;i++){  
		 for(int j=0;j<result.length;j++){ 
		   
		   System.out.print(result[i][j]+" "); 

		 }  
		 i++;
			 System.out.println();
			 

		
		}  
	if(result.length%2==0){
		for(int i=result.length-1;i>0;i--){  
			 for(int j=0;j<result.length;j++){ 
			   
			   System.out.print(result[i][j]+" "); 

			 }  
			 i--;
				 System.out.println();
				 

			
			}  
		}
	
	else{
	for(int i=result.length-2;i>0;i--){  
		 for(int j=0;j<result.length;j++){ 
		   
		   System.out.print(result[i][j]+" "); 

		 }  
		 i--;
			 System.out.println();
			 

		
		}  
	}
	
	
	}
	
	
		
	
	
	
	
	
public static int[][] printFormatt(int num){	
	int[][] arr=new int[num][num];
	int temp=1;

	for(int i=0;i<arr.length;i++){

		 for(int j=0;j<arr.length;j++){  
			 arr[i][j]=temp;
		   temp++;
		 }  
		}  
	return arr;
	
}

}
