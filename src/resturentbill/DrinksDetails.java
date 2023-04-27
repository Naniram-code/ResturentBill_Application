package resturentbill;

import java.util.Scanner;

public class DrinksDetails {
	static int hotdrinks_price=5;
	static int softdrinks_price=6;
	static int total_bill=0;
	static int totalAmpount=0;

	
	public static void softDrinks()
	{   Scanner ss=new Scanner(System.in);
		System.out.println("Welcome to Soft Drink");
		System.out.print("How many pic Do you want=");
		int pics= ss.nextInt();
		total_bill=pics*softdrinks_price;
		System.out.println("\t "+pics+" pic of soft Drink price ="+total_bill);
		totalAmpount+= total_bill;
		
	}
	public static void hotDrinks()
	{   Scanner ss=new Scanner(System.in);
		System.out.println("Welcome to Hot Drinks");
		System.out.print("How many pic Do you want=");
		int pics= ss.nextInt();
		total_bill=pics*hotdrinks_price;
		System.out.println("\t"+pics+" pic of soft Drink price="+total_bill);
		totalAmpount+= total_bill;
	}
	public static void total_Bill()
	{
		  System.out.println("\tTotal Bill:" +totalAmpount);
		    System.out.println("*******Do you wanna more********");}
	
		
		
		public  static void drinksMenuDetails()
		    {
			Scanner sc=new Scanner(System.in);
			while(true)
			{
			System.out.println("=============================================");
			System.out.println("              1)Soft Drinks                   ");
			System.out.println("              2)Hot  Drinks                    ");
			System.out.println("              3)Back main                     ");
			
			System.out.println("=============================================");
			
			System.out.print("Enter the choice 1 to 3=");
			int choice= sc.nextInt();
			
			switch(choice)
			{
			
			case 1:
				 softDrinks();
				 total_Bill();
				 drinksMenuDetails();
				break;
			
			case 2:
				hotDrinks();
				total_Bill();
				drinksMenuDetails();
				break;
			case 3:
				
				RestaurentClient.main(null);
				break;
				default:
					System.out.println("Choose 1 to 3 Between");
			}}}}
			
			
		
		
		
		
		
		

