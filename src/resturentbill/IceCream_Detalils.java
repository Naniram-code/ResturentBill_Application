package resturentbill;


import java.util.Scanner;

public class IceCream_Detalils {

	static int kulfi_price=10;
	static int Gelato_price=12;
	static int total_bill;
	static int total_Ampount=0;
	public static void kulfi()
	{   Scanner ss=new Scanner(System.in);
		System.out.println("Welcome to  Kulfi");
		System.out.print("How many Plate Do you want=");
		int pic= ss.nextInt();
		total_bill=pic*kulfi_price;
		System.out.println("\t "+pic+" pic of Kulfi price ="+total_bill);
		total_Ampount+= total_bill;
	}
	public static void Gelato()
	{   Scanner ss=new Scanner(System.in);
        System.out.println("Welcome to  Gelato");
		System.out.print("How many pic Do you want=");
		int pic= ss.nextInt();
		total_bill=pic*Gelato_price;
		System.out.println("\t"+pic+" pic of Gelato price ="+total_bill);
		total_Ampount+= total_bill;
	}
	public static void Total_Bill()
	{
		  System.out.println("\tTotal Bill:" +total_Ampount);
		    System.out.println("***************Do you wanna more**************");}
		
	
		
		public  static void ice_cream_menuDetails()
		    {
			Scanner sc=new Scanner(System.in);
			while(true)
			{
			System.out.println("\n============================================");
			System.out.println("              1)Kulfi                         ");
			System.out.println("              2)Gelato                        ");	                      
			System.out.println("              3)Back main                     ");
			System.out.println("============================================= ");
			System.out.print("Enter the choice 1 to 3 =");
			int choice= sc.nextInt();
			
			switch(choice)
			{
				case 1:
				   kulfi();
				   Total_Bill();
				   ice_cream_menuDetails();
				break;
			
			    case 2:
				  Gelato();
				  Total_Bill();
				  ice_cream_menuDetails();
				break;
			
			case 3:
				RestaurentClient.main(null);
				break;
				default:
					System.out.println("Choose 1 to 3 Between");
			
			
			}}}
			
			}
			
			
		
		
		
		
		
		


