package javahomework;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		int coke,milk,choclate;
		Double priceofcoke,priceofmilk,totalpricemilk,totalpricecoke,priceofchoc,totalpricechoc,tax;
		
	Scanner keyboard=new Scanner(System.in);
	System.out.print("Qunatity of coke: ");
	coke=keyboard.nextInt();
	System.out.print("price of coke per unit: ");
	priceofcoke=keyboard.nextDouble();
	
	totalpricecoke=(coke*priceofcoke);
	
	
	System.out.print("Qunatity of milk: ");
	milk=keyboard.nextInt();
	System.out.print("price of milk per unit: ");
	priceofmilk=keyboard.nextDouble();;
	
	totalpricemilk=(milk*priceofmilk);
	
	
	System.out.print("Qunatity of choclate: ");
	choclate=keyboard.nextInt();
	System.out.print("price of choclate per unit: ");
	priceofchoc=keyboard.nextDouble();
	
	totalpricechoc=(choclate*priceofchoc);
	
	 tax= 10.00;
	
	
	double saleswithtax= ((totalpricecoke+totalpricemilk+totalpricechoc)*tax);
	double totalsales=(totalpricecoke+totalpricemilk+totalpricechoc);
	
	double netsales= ((totalpricecoke+totalpricemilk+totalpricechoc)-saleswithtax);

	
	
	
	
	
	
	System.out.println("                   WELCOME TO    ");
	System.out.println("                   OUR STORE      ");
	System.out.println("              ******************     ");
	System.out.println("                  GRAND SLAM     ");
	System.out.println("                640 Conduit Blvd      ");
	System.out.println("                Brooklyn ny 11208     ");
	
	System.out.println();
	System.out.println(    "\tDescription"+"\tQty"+"\tAmount");
	System.out.println(    "\t-----------"+"\t------"+"\t-----");
	System.out.println();
	System.out.println(    "\t  coke"+"\t"+"\t"+coke+"\t"+totalpricecoke);
	System.out.println(    "\t  milk"+"\t"+"\t"+milk+"\t"+totalpricemilk);	
	System.out.println(    "\t choclate"+"\t"+choclate+"\t"+totalpricechoc);
	System.out.println(    "                        -------------");
	System.out.println();
	System.out.println(    "\t\t Subtotal: "+"\t"+totalsales);
	System.out.println(    "\t\t   Tax"+"\t\t"+totalsales*tax/100);
	System.out.println("                        -------------");
	System.out.println(    "\t\t   Total"+"\t"+(totalsales+totalsales*tax/100));
	
	System.out.println();
	System.out.println();
	
	System.out.println("**************Thanks for shoping****************    ");
	
	
	
		
		
		
		
		
		
		
		
		

	}

}
