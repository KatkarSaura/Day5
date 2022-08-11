package com.bridgelabz;

public class FlipCoin {

	public static void main(String[] args) {
	FlipCoin t = new FlipCoin();
	int heads = 0;
	int tails = 0;
	int chances =10;
	 
	 for (int i = 1; i <= chances; i++) {
		if(t.chanceFunc().equals("tails")) {
			tails++;
		   }
		else {
			heads++;
		}
	}
	System.out.println("Chances = " + chances);
	System.out.println("Heads: = " + heads);
	System.out.println("Tails: = " + tails);

	}

}
