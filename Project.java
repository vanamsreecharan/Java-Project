package Pack8;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project {
void meth1() {
	int Bill=0;
	int rate=0;
	int totalbill=0;
	Scanner sc=new Scanner(System.in);
	ArrayList<String> Ordereditemnames=new ArrayList<String>();
	ArrayList<Integer>itemquantity=new ArrayList<Integer>();
	ArrayList<Integer>itemrate=new ArrayList<Integer>();
	ArrayList<Integer>itembill=new ArrayList<Integer>();
	while(true) {
	System.out.println("====>>>>☕☕☕☕ Welcome to Margins World ☕☕☕☕<<<<===");
	System.out.println("--------------------------------------------------");
	System.out.println("");
	System.out.println("--------------------");
	System.out.println("====>>> Main Menu <<<====");
	System.out.println("--------------------");
	System.out.println("Please choose your order");
	System.out.println("1.chai(Tea)🥫🥫🥫🥫🥫");
	System.out.println("2.Coffee☕☕☕☕☕☕");
	System.out.println("3.Icecream🍦🍦🍦🍦🍦🍦🍦🍦🍦");
	System.out.println("4.snacks🥯🥯🍚🍜🍜🥓🥓");
	System.out.println("5.pizzas🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕");
	System.out.println("6.cooldrinks🍸🍹🍸🍸🥃🥃🥤🥤🍷🍷");
	System.out.println("7.Main Menu");
	System.out.println("=========================");
	int option=sc.nextInt();
	System.out.println("--------------------------");
	String itemname="";
	  switch(option) {
	  case 1:
		  while(true) {
		System.out.println("---->Chai🥫🥫🥫🥫🥫🥫🥫🥫<----");
		System.out.println("-------------------------");
		System.out.println("1.Dum Tea..................12 ₹");
		System.out.println("2.Lemon Tea................20 ₹");
		System.out.println("3.Special Tea..............15 ₹");
		System.out.println("4.Ginger Tea...............17 ₹");
		int subchoice=sc.nextInt();
		switch(subchoice){
		case 1:rate=12; itemname = "Dum Tea";
		System.out.println("How many Dum Tea's do you want?");
		break;
		case 2:rate=20; itemname="Lemon Tea";
		System.out.println("How many Lemon Tea's do you want?");
		break;
		case 3: rate=15; itemname="Special Tea";
		System.out.println("How many Special Tea's do you want?");
		break;
		case 4: rate=17;itemname="Ginger Tea";
		System.out.println("How many Ginger Tea's do you want?");break;
		default:System.out.println("Enter Only provided options!!!!😊😊"); break;
		}
	 if(subchoice>5) {
		   break;
		}
			System.out.println("Enter quantity");
			System.out.println("------------------------------");
			int quantity=sc.nextInt();
			Bill=rate*quantity;
			totalbill+=Bill;
			Ordereditemnames.add(itemname);
			itemquantity.add(quantity);
			itemrate.add(rate);
			itembill.add(Bill);
			System.out.println("Your Bill for the item is: "+Bill+" ₹");
			System.out.println("If you any other item in this menu press 1");
			System.out.println("In Main Menu press 2");
			System.out.println("Go to total Bill press 3");
			int choice=sc.nextInt()	;
			if(choice==1) {
				continue;
			}
			else if(choice==2 )
				break;
			if(choice==3) {
				System.out.println();
				System.out.println(" S.NO     ItemName         Quantity       rate        bill" );
				System.out.println("------    ---------       --------       ------      --------");
				for(int i=0;i<Ordereditemnames.size();i++) {
				System.out.println("  "+(i+1)+"        "+Ordereditemnames.get(i)+"              "+  itemquantity.get(i) +  "              "+  itemrate.get(i)  + "              "  +  itembill.get(i));
				}
				System.out.println("                              ====================================");
				System.out.println();
				System.out.println("                                    Total Bill is = "+ totalbill  +" ₹");
				System.out.println();
				System.out.println("                             ======================================");
				System.out.println(" Please take your Order and pay the bill at cash counter ");
				System.out.println();
				System.out.println("😊😊😊😊  Thank you for your Order 😊😊😊😊😊");
				System.out.println("*-----------------------*--------------------------*");
				System.out.println("☕☕☕☕☕☕=====> Please Visit Again <=====☕☕☕☕☕☕ ");
				System.out.println("*-----------------------*--------------------------*");
			
				return;
			}
		}
		break;
	  case 2:
		  while(true) {
			  System.out.println("---->coffee<----");
			  System.out.println("-----------------------------");
				System.out.println("1.Cold Coffee..............35₹");
				System.out.println("2.Coffee...................15₹");
				System.out.println("3.cappuccino...............90₹");
				System.out.println("4.espresso.................120₹");
				System.out.println("5.Chocolate Coffee........150₹");
		int subchoice=sc.nextInt();
		switch(subchoice){
		case 1:rate=35; itemname = "Cold Coffee";
		System.out.println("How many Cold Coffee's do you want?");
		break;
		case 2:rate=15; itemname="Coffee";
		System.out.println("How many Coffee's do you want?");
		break;
		case 3: rate=90; itemname="cappuccino";
		System.out.println("How many cappuccino's do you want?");
		break;
		case 4: rate=120;itemname="espresso";
		System.out.println("How many espresso's do you want?");
		break;
		case 5: rate=150; itemname="Chocolate coffee";
		System.out.println("How many Chocolate coffee's do you want? ");
		break;
		default:System.out.println("Enter Only provided options!!!!😊😊"); 
		break;
		}
	 if(subchoice>5) {
		   break;
		}
			System.out.println("Enter quantity");
			System.out.println("------------------------------");
			int quantity=sc.nextInt();
			Bill=rate*quantity;
			totalbill+=Bill;
			Ordereditemnames.add(itemname);
			itemquantity.add(quantity);
			itemrate.add(rate);
			itembill.add(Bill);
			System.out.println("Your Bill for the item is: "+Bill+" ₹");
			System.out.println("If you any other item in this menu press 1");
			System.out.println("In Main Menu press 2");
			System.out.println("Go to total Bill press 3");
			int choice=sc.nextInt()	;
			if(choice==1) {
				continue;
			}
			else if(choice==2 )
				break;
			if(choice==3) {
				System.out.println();
				System.out.println("S.NO     ItemName          Quantity        rate       bill" );
				System.out.println("------   ---------        --------       ------       ------");
				for(int i=0;i<Ordereditemnames.size();i++) { 
				System.out.println("  "+(i+1)+"       "+Ordereditemnames.get(i)+"           "+itemquantity.get(i)+ "          "+itemrate.get(i)+"            "+itembill.get(i));
				}
				System.out.println("                            ====================================");
				System.out.println();
				System.out.println("                               Total Bill is = "+ totalbill  +" ₹");
				System.out.println();
				System.out.println("                            ======================================");
				System.out.println(" Please take your Order and pay the bill at cash counter ");
				System.out.println();
				System.out.println("😊😊😊😊  Thank you for your Order 😊😊😊😊😊");
				System.out.println("*-----------------------*--------------------------*");
				System.out.println("☕☕☕☕☕☕=====> Please Visit Again <=====☕☕☕☕☕☕ ");
				System.out.println("*-----------------------*--------------------------*");
			
				return;
			}
		}
		break;
	  case 3:
		  while(true) {
	    System.out.println("---->Icecream🍦🍦🍦🍦🍦🍦🍦🍦🍦<----");
		System.out.println("-------------------------");
		System.out.println("1.Chocolate icecream..................40 ₹");
		System.out.println("2.vanilla icecream....................25 ₹");
		System.out.println("3.strawberry icecream.................45 ₹");
		System.out.println("4.Butterscotch icecream...............20 ₹");
		System.out.println("5.Mango icecream......................30 ₹");
		int subchoice=sc.nextInt();
		switch(subchoice){
		case 1:rate=40; itemname = "chocolate icecream";
		System.out.println("How many chocolate icecream's do you want?");
		break;
		case 2:rate=25; itemname="vanilla icecream";
		System.out.println("How many vanilla icecream's do you want?");
		break;
		case 3: rate=45; itemname="strawberry icecream";
		System.out.println("How many strawberry icecream's do you want?");
		break;
		case 4: rate=20;itemname="Butterscotch icecream";
		System.out.println("How many Butterscotch icecream's do you want?");break;
		case 5: rate=30; itemname="Mango icecream";
		System.out.println("How many Mango icecream's do you want?");
		break;
		default:System.out.println("Enter Only provided options!!!!😊😊"); break;
		}
	 if(subchoice>5) {
		   break;
		}
			System.out.println("Enter quantity");
			System.out.println("------------------------------");
			int quantity=sc.nextInt();
			Bill=rate*quantity;
			totalbill+=Bill;
			Ordereditemnames.add(itemname);
			itemquantity.add(quantity);
			itemrate.add(rate);
			itembill.add(Bill);
			System.out.println("Your Bill for the item is: "+Bill+" ₹");
			System.out.println("If you any other item in this menu press 1");
			System.out.println("In Main Menu press 2");
			System.out.println("Go to total Bill press 3");
			int choice=sc.nextInt()	;
			if(choice==1) {
				continue;
			}
			else if(choice==2 )
				break;
			if(choice==3) {
				System.out.println();
				System.out.println(" S.NO     ItemName          Quantity       rate      bill" );
				System.out.println(" -----    ---------         --------      ------    --------");
				for(int i=0;i<Ordereditemnames.size();i++) {
				System.out.println("  "+(i+1)+"      "+Ordereditemnames.get(i) + "            " +  itemquantity.get(i) +"          "  + itemrate.get(i) + "         "  + itembill.get(i));
				}
				System.out.println("                              ====================================");
				System.out.println();
				System.out.println("                                    Total Bill is = "+ totalbill  +" ₹");
				System.out.println();
				System.out.println("                             ======================================");
				System.out.println(" Please take your Order and pay the bill at cash counter ");
				System.out.println();
				System.out.println("😊😊😊😊  Thank you for your Order 😊😊😊😊😊");
				System.out.println("*-----------------------*--------------------------*");
				System.out.println("☕☕☕☕☕☕=====> Please Visit Again <=====☕☕☕☕☕☕ ");
				System.out.println("*-----------------------*--------------------------*");
			
				return;
			}
		}
		break;
	  case 4:
		  while(true) {
		System.out.println("---->snacks🥯🥯🍚🍜🍜🥓🥓<----");
		System.out.println("-------------------------");
		System.out.println("1.French fries.............90  ₹");
		System.out.println("2.Donuts...................120 ₹");
		System.out.println("3.Samosa...................20  ₹");
		System.out.println("4.Sandwich.................70  ₹");
		int subchoice=sc.nextInt();
		switch(subchoice){
		case 1:rate=90; itemname = "French fries";
		System.out.println("How many Pack of French fries do you want?");
		break;
		case 2:rate=120; itemname="Donuts";
		System.out.println("How many Donuts do you want?");
		break;
		case 3: rate=20; itemname="Samosa";
		System.out.println("How many Samosa's do you want?");
		break;
		case 4: rate=70;itemname="Sandwich";
		System.out.println("How many Sandwich's do you want?");break;
		default:System.out.println("Enter Only provided options!!!!😊😊"); break;
		}
	 if(subchoice>5) {
		   break;
		}
			System.out.println("Enter quantity");
			System.out.println("------------------------------");
			int quantity=sc.nextInt();
			Bill=rate*quantity;
			totalbill+=Bill;
			Ordereditemnames.add(itemname);
			itemquantity.add(quantity);
			itemrate.add(rate);
			itembill.add(Bill);
			System.out.println("Your Bill for the item is: "+Bill+" ₹");
			System.out.println("If you any other item in this menu press 1");
			System.out.println("In Main Menu press 2");
			System.out.println("Go to total Bill press 3");
			int choice=sc.nextInt()	;
			if(choice==1) {
				continue;
			}
			else if(choice==2 )
				break;
			if(choice==3) {
				System.out.println();
				System.out.println(" S.NO     ItemName         Quantity       rate        bill" );
				System.out.println("------    ---------       --------       ------      --------");
				for(int i=0;i<Ordereditemnames.size();i++) {
				System.out.println("  "+(i+1)+"        "+Ordereditemnames.get(i)+"              "+  itemquantity.get(i) +  "              "+  itemrate.get(i)  + "              "  +  itembill.get(i));
				}
				System.out.println("                              ====================================");
				System.out.println();
				System.out.println("                                    Total Bill is = "+ totalbill  +" ₹");
				System.out.println();
				System.out.println("                             ======================================");
				System.out.println(" Please take your Order and pay the bill at cash counter ");
				System.out.println();
				System.out.println("😊😊😊😊  Thank you for your Order 😊😊😊😊😊");
				System.out.println("*-----------------------*--------------------------*");
				System.out.println("☕☕☕☕☕☕=====> Please Visit Again <=====☕☕☕☕☕☕ ");
				System.out.println("*-----------------------*--------------------------*");
			
				return;
			}
		}
		break;
	  case 5:
		  while(true) {
		System.out.println("---->pizzas🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕🍕<----");
		System.out.println("-------------------------");
		System.out.println("1.Veg Pizza...................110  ₹");
		System.out.println("2.Mushroom Pizza..............130  ₹");
		System.out.println("3.Chicken Pizza...............190  ₹");
		System.out.println("4.Paneer Pizza................125  ₹");
		System.out.println("5.Italian Pizza...............210  ₹");
		int subchoice=sc.nextInt();
		switch(subchoice){
		case 1:rate=110; itemname = "Veg Pizza";
		System.out.println("How many Veg Pizza's do you want?");
		break;
		case 2:rate=130; itemname="Mushroom Pizza";
		System.out.println("How many Mushroom Pizza's do you want?");
		break;
		case 3: rate=190; itemname="Chicken Pizza";
		System.out.println("How many Chicken Pizza's do you want?");
		break;
		case 4: rate=125;itemname="Paneer Pizza";
		System.out.println("How many Paneer Pizza's do you want?");break;
		case 5: rate=210;itemname="Italian Pizza";
		System.out.println("How many Italian Pizza's do you want?");break;
		default:System.out.println("Enter Only provided options!!!!😊😊"); break;
		}
	 if(subchoice>5) {
		   break;
		}
			System.out.println("Enter quantity");
			System.out.println("------------------------------");
			int quantity=sc.nextInt();
			Bill=rate*quantity;
			totalbill+=Bill;
			Ordereditemnames.add(itemname);
			itemquantity.add(quantity);
			itemrate.add(rate);
			itembill.add(Bill);
			System.out.println("Your Bill for the item is: "+Bill+" ₹");
			System.out.println("If you any other item in this menu press 1");
			System.out.println("In Main Menu press 2");
			System.out.println("Go to total Bill press 3");
			int choice=sc.nextInt()	;
			if(choice==1) {
				continue;
			}
			else if(choice==2 )
				break;
			if(choice==3) {
				System.out.println();
				System.out.println(" S.NO     ItemName         Quantity       rate        bill" );
				System.out.println("------    ---------       --------       ------      --------");
				for(int i=0;i<Ordereditemnames.size();i++) {
				System.out.println("  "+(i+1)+"        "+Ordereditemnames.get(i)+"              "+  itemquantity.get(i) +  "              "+  itemrate.get(i)  + "              "  +  itembill.get(i));
				}
				System.out.println("                              ====================================");
				System.out.println();
				System.out.println("                                    Total Bill is = "+ totalbill  +" ₹");
				System.out.println();
				System.out.println("                             ======================================");
				System.out.println(" Please take your Order and pay the bill at cash counter ");
				System.out.println();
				System.out.println("😊😊😊😊  Thank you for your Order 😊😊😊😊😊");
				System.out.println("*-----------------------*--------------------------*");
				System.out.println("☕☕☕☕☕☕=====> Please Visit Again <=====☕☕☕☕☕☕ ");
				System.out.println("*-----------------------*--------------------------*");
			
				return;
			}
		}
		break;
	  case 6:
		  while(true) {
			  System.out.println("---->cooldrinks🍸🍹🍸🍸🥃🥃🥤🥤🍷🍷<----");
		System.out.println("-------------------------");
		System.out.println("1.Lemon-lime Drink..............20 ₹");
		System.out.println("2.Coca Cola.....................30 ₹");
		System.out.println("3.Sprite........................25 ₹");
		System.out.println("4.Pepsi.........................20 ₹");
		System.out.println("5.Thumbs up.....................20 ₹");
		int subchoice=sc.nextInt();
		switch(subchoice){
		case 1:rate=20; itemname = "Lemon-lime Drink";
		System.out.println("How many bottles do you want?");
		break;
		case 2:rate=30; itemname="Coca Cola";
		System.out.println("How many bottles do you want?");
		break;
		case 3: rate=25; itemname="Sprite";
		System.out.println("How many bottles do you want?");
		break;
		case 4: rate=20;itemname="Pepsi";
		System.out.println("How many bottles  do you want?");break;
		case 5: rate=20;itemname="Thumbs up";
		System.out.println("How many bottles  do you want?");break;
		default:System.out.println("Enter Only provided options!!!!😊😊"); break;
		}
	 if(subchoice>5) {
		   break;
		}
			System.out.println("Enter quantity");
			System.out.println("------------------------------");
			int quantity=sc.nextInt();
			Bill=rate*quantity;
			totalbill+=Bill;
			Ordereditemnames.add(itemname);
			itemquantity.add(quantity);
			itemrate.add(rate);
			itembill.add(Bill);
			System.out.println("Your Bill for the item is: "+Bill+" ₹");
			System.out.println("If you any other item in this menu press 1");
			System.out.println("In Main Menu press 2");
			System.out.println("Go to total Bill press 3");
			int choice=sc.nextInt()	;
			if(choice==1) {
				continue;
			}
			else if(choice==2 )
				break;
			if(choice==3) {
				System.out.println();
				System.out.println(" S.NO     ItemName         Quantity       rate        bill" );
				System.out.println("------    ---------       --------       ------      --------");
				for(int i=0;i<Ordereditemnames.size();i++) {
				System.out.println("  "+(i+1)+"        "+Ordereditemnames.get(i)+"              "+  itemquantity.get(i) +  "              "+  itemrate.get(i)  + "              "  +  itembill.get(i));
				}
				System.out.println("                              ====================================");
				System.out.println();
				System.out.println("                                    Total Bill is = "+ totalbill  +" ₹");
				System.out.println();
				System.out.println("                             ======================================");
				System.out.println(" Please take your Order and pay the bill at cash counter ");
				System.out.println();
				System.out.println("😊😊😊😊  Thank you for your Order 😊😊😊😊😊");
				System.out.println("*-----------------------*--------------------------*");
				System.out.println("☕☕☕☕☕☕=====> Please Visit Again <=====☕☕☕☕☕☕ ");
				System.out.println("*-----------------------*--------------------------*");
				return;
			}
		}
		break;
	  }
	}	
	}

public static void main(String[] args) {
	new Project().meth1();
}

}
