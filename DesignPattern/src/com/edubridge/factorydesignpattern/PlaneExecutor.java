package com.edubridge.factorydesignpattern;

class BOI implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		System.out.println("rate of intreast for BOI : " + rate);
		
	}
}
	class SBI implements Plan{

		@Override
		public void getRoi(double rate) {
			// TODO Auto-generated method stub
			System.out.println("rate of intreast for SBI : " + rate);
			
		}
	}
	class BOB implements Plan{

		@Override
		public void getRoi(double rate) {
			// TODO Auto-generated method stub
			System.out.println("rate of intreast for BOB : " + rate);
			
		}
	}
	
	public class PlaneExecutor
	{
		public static void main(String[] args) {
			BOI b1 = new BOI();
			b1.getRoi(55.3);
			
			SBI s1 = new SBI();
			s1.getRoi(9.2);
			
		}
		
	}
