class Main {

  public static void main(String[] args) {
    McDonaldsMenu item = new McDonaldsMenu("Burger", 7.99, 13.2, 800);
    McDonaldsMenu item2 = new McDonaldsMenu("FiletOFish", 4.25, 9.76, 612);

    System.out.print(item2.getCalories());
  }
}