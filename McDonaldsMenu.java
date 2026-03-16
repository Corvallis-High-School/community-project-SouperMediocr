public class McDonaldsMenu {
    private String itemName;
    private double itemPrice;
    private double itemWeight;
    private int itemCalories;

    public McDonaldsMenu(String name, double price, double weight, int calories)
    {
        itemName = name;
        itemPrice = price;
        itemWeight = weight;
        itemCalories = calories;
    }

    public void print()
    { 
        System.out.println(itemName + " " + itemPrice + " " + itemWeight + " " + itemCalories);
    }

    public String getName()
    {
        return(itemName);
    }
    public double getPrice()
    {
        return(itemPrice);
    }
    public double getWeight()
    {
        return(itemWeight);
    }
    public int getCalories()
    {
        return(itemCalories);
    }
    
    public void setName(String n)
    {
        itemName = n;
    }
    public void setPrice(double d)
    {
        itemPrice = d;
    }
    public void setWeight(double d)
    {
        itemWeight = d;
    }
    public void setCalories(int i)
    {
        itemCalories = i;
    }
    public String toString()
    {
        return (itemName + " " + itemPrice + " " + itemWeight + " " + itemCalories);
    }

     public void discountedItem(int discountPercent)
     {
        System.out.print(itemName + " Is " + discountPercent + "% Off, and costs only " + itemPrice * ((100 - discountPercent) / 100) + " Dollars");
        itemPrice = itemPrice * ((100 - discountPercent) / 100);
     }

    



}
