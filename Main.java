class Main {

  public static void main(String[] args) {
    McDonaldsMenu item = new McDonaldsMenu("CheeseBurger", 4.20, 13.2, 800);
     Combo item2 = new Combo ("Cheeseburger Combo", 11.20, 24, 1300, 3);
     Drink item3 = new Drink ("Coca Cola", 2.0, 16.0, 350, "Medium");

    System.out.println(item2.getCalories());
    item.setCalories(400);
    System.out.println(item.getCalories());
    item2.discountedItem(50);
    System.out.println(item3.getSize());
    System.out.println(item3.toString());

  }
}