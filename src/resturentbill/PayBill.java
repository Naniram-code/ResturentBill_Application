package resturentbill;


import java.util.Scanner;

public class PayBill {
    public static void main(String[] args) {
        int totalBill=0;
        totalBill=BiryaniDetails.totalAmpount+DrinksDetails.totalAmpount+IceCream_Detalils.total_Ampount;
        System.out.println("Total Bill="+totalBill);
          {
            Scanner sc=new Scanner(System.in);
            while(true)
            {
                System.out.println("\n============================================");
                System.out.println("              1)PayBill                       ");
                System.out.println("              2)Back main                     ");
                System.out.println("============================================= ");
                System.out.print("Enter the choice 1 to 2 =");
                int choice= sc.nextInt();

                switch(choice) {
                    case 1:
                        System.out.println("************Thanks for Payment**********");
                        RestaurentClient.main(null);
                        break;

                    case 2:
                        RestaurentClient.main(null);
                        break;
                    default:
                        System.out.println("Choose 1 to 2 Between");
                }}}}}

