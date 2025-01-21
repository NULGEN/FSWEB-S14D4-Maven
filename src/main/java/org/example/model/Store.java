package org.example.model;



public class Store {
    public static void main(String[] args) {
        Chocolate chocolate = new Chocolate("bitter", 10, "Ülker" );
        Coke coke = new Coke("light", 20, "bottle");
        Bread bread = new Bread("ekşi maya", 30, "lezzetli");
        ProductForSale[] productForSale = {chocolate, coke, bread};
        listProducts(productForSale);
    }

    public static void listProducts(ProductForSale[] products) {
        for(int i=0; i<products.length; i++ ){
            products[i].showDetails();
        }
    }
}