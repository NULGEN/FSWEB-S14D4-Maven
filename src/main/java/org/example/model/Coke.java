package org.example.model;

public class Coke extends ProductForSale {
    private  double miliLiter;

    public Coke(String type, double price, String description) {
        super(type, price, description);

    }

    public Coke(String type, double price, String description, double miliLiter) {
        super(type, price, description);
        this.miliLiter = miliLiter;
    }

    public double getMiliLiter() {
        return miliLiter;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "miliLiter=" + miliLiter +
                '}';
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }

}
