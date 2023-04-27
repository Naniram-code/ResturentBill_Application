package resturentbill;
import java.util.Scanner;

public class BiryaniDetails {
	
	Scanner ss=new Scanner(System.in);
	static int checken_briyani_price=15;
	static int veg_briyani_price=12;
	static int total_bill=0;
	static int totalAmpount=0;
	
	public static void chickenBiryani()
	{    Scanner ss=new Scanner(System.in);
		System.out.print("How many Chicken Biryani Do you want=");
		int plates= ss.nextInt();
		total_bill=plates*checken_briyani_price;
		System.out.print("\t"+plates+" Plates of chicken Biryani price="+total_bill);
		totalAmpount+= total_bill;     //same tA=tA+tb;
	}
	public static void VegBiryani()
	{
		Scanner ss=new Scanner(System.in);
		System.out.print("How many Veg Biryani Do you want=");
		int plates= ss.nextInt();
		total_bill=plates*veg_briyani_price;
		System.out.println("\t"+plates+" Plates of Veg Biryani price="+total_bill);
		totalAmpount+= total_bill;
	}
	public static void TotalBill()
	{
	    System.out.println("\tTotal Bill:" +totalAmpount);
	    System.out.println("*******Do you wanna more ********");}
	
	    public  static void biryanimenuDetails()
	    {
			Scanner ss=new Scanner(System.in);
		    while(true)
		     {
			System.out.println("=============================================");
			System.out.println("              1)Chicken Biryani              ");
			System.out.println("              2)Veg   Biryani                ");
			System.out.println("              3)Back  main                   ");
			System.out.println("=============================================");
			
			System.out.print("Enter the choice=");
			int choice= ss.nextInt();
		
		switch(choice)
		{
		
		case 1:
			chickenBiryani();
			TotalBill();
			biryanimenuDetails();
			break;
			
		case 2:
			VegBiryani();
			TotalBill();
			biryanimenuDetails();
			break;
		
		case 3:
			
			RestaurentClient.main(null);
			break;
			default:
				System.out.println("Choose 1 to 3 Between");
		
		
		}}}}
		
		
		

