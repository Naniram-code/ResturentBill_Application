package resturentbill;

import java.util.Scanner;


public class RestaurentClient {

	public static void main(String[] args) {
		

		Scanner ss=new Scanner(System.in);
		while(true)
		{
System.out.println("======================================================");
System.out.println("                Main Menu                             ");
System.out.println("                1)Biryani                             ");
System.out.println("                2)Ice Cream                           ");
System.out.println("                3)Drinks                              ");
System.out.println("                4)PayBill                             ");
System.out.println("                5)Exit                                ");
System.out.println("======================================================");
System.out.print("Enter the choice 1 to 5 =");
int choice=ss.nextInt();
switch (choice) {
	case 1:
		BiryaniDetails.biryanimenuDetails();
		break;
	case 2:
		IceCream_Detalils.ice_cream_menuDetails();
		break;

	case 3:
		DrinksDetails.drinksMenuDetails();
		break;
	case 4:
		PayBill.main(null);
		break;
	case 5:
		System.out.println("*********** Thanks  for using App ********************");
		System.exit(0);
			default:
				System.out.println("Choose 1 to 5 Between");
}}}}








