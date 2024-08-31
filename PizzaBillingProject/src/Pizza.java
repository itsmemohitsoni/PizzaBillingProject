public class Pizza {
    int pizzaType = 0; // 1 - Veg Pizza, 2 - Non-Veg Pizza, 3 - Delux Veg Pizza, 4 - Delux Non-Veg Pizza
    boolean extraCheese = false;
    boolean extraTopping = false;
    boolean toDeliver = false;;

    Pizza(int type, boolean cheese, boolean topping, boolean delivery){
        this.pizzaType = type;
        this.extraCheese = cheese;
        this.extraTopping = topping;
        this.toDeliver = delivery;
    }
}
