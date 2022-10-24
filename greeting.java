import java.util.Scanner;
class greeting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Get  greetings form sharma famly. Choose option below ");
         System.out.println("1 = yes  ");
         System.out.println("2 = no");
         int a = input.nextInt();
         if (a==1) {
         	System.out.println(" ---->[Wish you a  Festival of lights , blow many more crackers each and every year] ");
         	System.out.println(" ---->[ Regards  from Tushar Sharma ]");

         	
         }
         else
         {
         	System.out.println(" ---->[wish nhi chahiye to bhi rakhni padhegi ]");
         	System.out.println(" ---->[Happy Diwali to you and your family]");
         	System.out.println(" ---->[Regards  from Tushar Sharma ]");

         }


	}
}