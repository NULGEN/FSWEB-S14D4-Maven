package org.example.model;

public class Chocolate extends  ProductForSale{
    private String chocolateType;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public Chocolate(String type, double price, String description, String chocolateType) {
        super(type, price, description);
        this.chocolateType = chocolateType;
    }

    @Override
    public void showDetails() {
        System.out.println("\"Coke{\" +\n" +
                "ChocolateType='\" + chocolateType + '\\'' +\n" +
                "                \"type='\" + type + '\\'' +\n" +
                "                \", price=\" + price +\n" +
                "                \", description='\" + description + '\\'' +\n" +
                "                '}';");
    }
}
