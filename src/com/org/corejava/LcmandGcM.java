package com.org.corejava;

public class LcmandGcM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getHcf(24, 46));
		System.out.println(getLcm(24, 46));


	}

	private static int getHcf(int a, int b) {

		int c = (a < b) ? a : b;
		int hcf = 0;
		for (int i = 2; i <= c; i++) {
			if (a % i == 0 && b % i == 0)
				hcf = i;

		}

		return hcf;

	}

	private static int getLcm(int a, int b) {
		int h = (a > b) ? a : b;
		int lcm = 0;
        for(int i=h;i<=a*b;i++){
        	if(i%a==0 && i%b==0){
        		lcm=i;
        		break;
        	}
        }
        return lcm;
	}

}
