package oopsconcepts;

public class PrintStars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		int n=5;
		
		for(int i=0;i<n;i++){
			for (int j=0;j<i+1;j++){
				System.out.print("*");
				Thread.sleep(1000);
			}
			System.out.println();
		}
		for(int i=n;i>=0;i--){
			for (int j=i;j>0;j--){
				System.out.print("*");
				Thread.sleep(1000);

			}
			System.out.println();
		}
		
	}

}
