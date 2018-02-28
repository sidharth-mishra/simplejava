package datastructure;

class IncrementDecOpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y = x-- + x-- + ++x + x-- + x++; // 1) x = 9, y =10 2) x = 8, y = 19
int z = y + x;  // z = 27
System.out.println("Z :"+z);
System.out.println("X :"+x);
System.out.println("Y :"+y);
System.out.println("X :"+x);
	}

}
