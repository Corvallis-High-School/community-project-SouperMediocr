class Main {

  public static void main(String[] args) {
    McDonaldsMenu item = new McDonaldsMenu("CheeseBurger", 4.20, 13.2, 800);
     Combo item2 = new Combo ("Cheeseburger Combo", 11.20, 24, 1300, 3);
     Drink item3 = new Drink ("Coca Cola", 2.0, 16.0, 350, "Medium");

    System.out.println(item.getCalories());
    System.out.println(item.getName());
    System.out.println(item.getPrice());
    System.out.println(item.getWeight());
    item.setCalories(100);
    item.setName("boragar");
    item.setPrice(9999);
    item.setWeight(5);
    item.discountedItem(50);
    
    System.out.println(item2.getCalories());
    System.out.println(item2.getName());
    System.out.println(item2.getPrice());
    System.out.println(item2.getWeight());
    item2.setCalories(1000);
    item2.setName("numba 7");
    item2.setPrice(9);
    item2.setWeight(500);
    item2.discountedItem(12);
    System.out.println(item2.getItemsInCombo());

    System.out.println(item3.getCalories());
    System.out.println(item3.getName());
    System.out.println(item3.getPrice());
    System.out.println(item3.getWeight());
    item3.setCalories(4530);
    item3.setName("peppi");
    item3.setPrice(1);
    item3.setWeight(50);
    item3.discountedItem(40);
    System.out.println(item3.getSize());
    item3.setSize("small");


  }
}