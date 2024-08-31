import java.util.Scanner;

public class App {

    public static void displaymenu(){
        System.out.println("\n--------------------------------------------Welcome to Pizzamania--------------------------------------------\n");
        System.out.print("Select Pizza type: (1. Veg Pizza   2. Non-Veg Pizza   3. Delux Veg Pizza   4. Delux Non-Veg Pizza) ==> ");
    }

    public static void printNormalPizza(Pizza pizza){
        int total = 0;
        System.out.println("\nOrder Details: ");
        if(pizza.pizzaType == 1){
            total += 300;
            System.out.println("Pizza : 300");
        }else{
            total += 400;
            System.out.println("Pizza : 400");
        }

        if(pizza.extraCheese){
            System.out.print("Extra Cheese : ");
            System.out.println(100);
            total += 100;
        }

        if(pizza.extraTopping){
            System.out.print("Extra Topping : ");
            System.out.println(150);
            total += 150;
        }

        if(pizza.toDeliver){
            System.out.print("Take Away : ");
            System.out.println(20);
            total += 20;
        }

        System.out.println("\nTotal Amount is - " + total);

        System.out.println("\n\n\nThank You!!!! Visit Again.....\n--------------------------------------------------------------------");
    }

    public static void printDeluxPizza(Pizza pizza){
        int total = 0;
        System.out.println("\nOrder Details: ");
        if(pizza.pizzaType == 3){
            total += 550;
            System.out.println("Pizza : 550");
        }else{
            total += 650;
            System.out.println("Pizza : 650");
        }

        if(pizza.toDeliver){
            System.out.print("Take Away : ");
            System.out.println(20);
            total += 20;
        }

        System.out.println("\nTotal Amount is - " + total);

        System.out.println("\n\n\nThank You!!!! Visit Again.....\n--------------------------------------------------------------------");
    }

    public static void main(String[] args) throws Exception {
        displaymenu();

        int pizzaType;
        boolean topping = false, cheese = false, delivery = false;
        char choice;
        Scanner scan = new Scanner(System.in);
        pizzaType = scan.nextInt();

        if(pizzaType == 1 || pizzaType == 2){
            System.out.print("\nWant extra Toppings (y/n)? => ");
            choice = scan.next().charAt(0);
            if(choice == 'y' || choice == 'Y')
                topping = true;
            else topping = false;

            System.out.print("Want extra Cheese (y/n)? => ");
            choice = scan.next().charAt(0);
            if(choice == 'y' || choice == 'Y')
                cheese = true;
            else cheese = false;
        }

        System.out.print("Want TakeAway (y/n)? => ");
        choice = scan.next().charAt(0);
        if(choice == 'y' || choice == 'Y')
            delivery = true;
        else delivery = false;

        scan.close();

        Pizza pizza = new Pizza(pizzaType, cheese, topping, delivery);

        if(pizza.pizzaType == 1 || pizza.pizzaType == 2){
            printNormalPizza(pizza);
        }else if(pizza.pizzaType == 3 || pizza.pizzaType == 4){
            printDeluxPizza(pizza);
        }else{
            System.out.println("Incorrect Pizza Choice");
        }
    }
}
