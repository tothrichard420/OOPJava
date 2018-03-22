package hu.iit.uni.miskolc.oop;

import java.awt.SecondaryLoop;

public class Main {
	public static void main(String[] args){
		Rectangle firstRectangle = new Rectangle(86,42);
		Rectangle secundRectangle = new Rectangle(17);
		Rectangle thirdRectangle = firstRectangle;
		System.out.println("1." + firstRectangle);
		System.out.println("2." + secundRectangle);
		System.out.println("3." + thirdRectangle);
		System.out.println();
		firstRectangle.setBoth(56,60);
		System.out.println("1." + firstRectangle);
		System.out.println("2." + secundRectangle);
		System.out.println("3." + thirdRectangle);
		firstRectangle.setBoth(5,10);
		secundRectangle.setBoth(5,10);
		if(firstRectangle.equals(secundRectangle)){
			System.out.println("Egyezik a kettõ.");
		}
		else {
			System.out.println("Nem egyezik a kettõ");
		}
		if (firstRectangle.equals(thirdRectangle)) {
			System.out.println("Egyezik a kettõ.");
		} else {
			System.out.println("Nem egyezik a kettõ.");
		}
	}
}
 