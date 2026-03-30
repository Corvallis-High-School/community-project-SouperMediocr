class McDonaldsMenu {
    public String itemName;
    public double itemPrice;
    public double itemWeight;
    public int itemCalories;

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

class Drink extends McDonaldsMenu
{
    String size;
    public Drink(String n, double d, double d2, int i, String size)
    {
        super(n, d, d2, i);
        this.size = size;               
    }
    public String getSize()
    {
        return size;
    }
    public void setSize(String s)
    {
        size = s;
    }
    public String toString()
    {
        return itemName + " " + itemPrice + " " + itemWeight + " " + itemCalories + " " + size;
    }
}

class Combo extends McDonaldsMenu
{
    public int itemsInCombo;
    public Combo(String n, double d, double d2, int i, int i2)
    {
        super(n, d, d2, i);
        itemsInCombo = i2;
    }
    public int getItemsInCombo()
    {
        return itemsInCombo;
    }
    public void setItemsInCombo(int i)
    {
        itemsInCombo = i;
    }
    public void discountedItem(int discountPercent)
    {
        itemPrice = itemPrice * (100 - discountPercent) / 100;
        System.out.println("the Combo discount was " + discountPercent + " and it now costs only " + itemPrice + " dollars");
    }
    public String toString()
    {
        return itemName + " " + itemPrice + " " + itemWeight + " " + itemCalories + " " + itemsInCombo;
    }
}