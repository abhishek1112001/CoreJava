package com.edubridge.finaldemo;
//parent class
//public final class Card{}
//we cannot inherit the final class 
public class Card {

	private String cardName;
	
	final int x =15;
	
	/*final var must be initialize
	private final String issuer; */
	//we cannot change  or set the value of final variable
	private final String issuer="GOI";

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getIssuer() {
		return issuer;
	}

	@Override
	public String toString() {
		return "Card [cardName=" + cardName + ", issuer=" + issuer + "]";
	}
	/*final void print() 
	{
		System.out.println("Final Method");
	}*/
	
	final void print() 
	{
		
		//x=12;
		System.out.println("Final method"+x);
	}
	
}
