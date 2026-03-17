class Main {

  public static void main(String[] args) {
    McDonaldsMenu item = new McDonaldsMenu("CheeseBurger", 4.20, 13.2, 800);
    McDonaldsMenu item2 = new McDonaldsMenu("FiletOFish", 4.70, 9.76, 612);

    System.out.println(item2.getCalories());
    item.setCalories(400);
    System.out.println(item.getCalories());

  }
}