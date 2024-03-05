package com.edubridge.factorydesignpattern;

import java.util.Scanner;

public class CullularPlanExecutor {

	public static void main(String[] args) {
		SelectNetworkPlan s2 = new SelectNetworkPlan();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the network for which part you want");
		String networkname = sc.next();
		
		System.out.println("enter the number of min :");
		int min = sc.nextInt();
		
		CellularPlan p = s2.getPlan(networkname);
		System.out.println("Bill amount for "+networkname+ " of " + min);
		
		p.getRate();
		p.processBill(min);
		
		sc.close();

	}

}
