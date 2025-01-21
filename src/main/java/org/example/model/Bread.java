package org.example.model;

public class Bread extends ProductForSale {

    private String breadType;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.breadType = breadType;
    }

    public Bread(String type, double price, String description, String breadType) {
        super(type, price, description);
        this.breadType = breadType;
    }

    @Override
    public void showDetails() {
        System.out.println("\"Bread{\" +\n" +
                                "breadType='\" + breadType + '\\'' +\n" +
                "                \"type='\" + type + '\\'' +\n" +
                "                \", price=\" + price +\n" +
                "                \", description='\" + description + '\\'' +\n" +
                "                '}';");
    }


}
