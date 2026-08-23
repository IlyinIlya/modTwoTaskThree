package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        System.out.println("Shop Application");
        //initial values
        Product product1 = new Product("Футболка", 1500);
        Product product2 = new Product("Шорты", 2100);
        Product product3 = new Product("Рубашка", 1900);
        Product product4 = new Product("Кепка", 750);
        Product product5 = new Product("Брюки", 2500);
        Product product6 = new Product("Ремень", 900);
        ProductBasket basket = new ProductBasket();

        //Adding product to the basket
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);

        //Adding product to a full basket (no free space)
        basket.addProduct(product6);

        //Printing a basket (few products)
        basket.printBasketContents();

        //Total cost of a basket (few products)
        System.out.println("Общая стоимость: " + basket.getTotalBasketCost());

        //Searching product is in the basket
        System.out.println("Шорты в корзине?: " + basket.checkProductName("Шорты"));

        //Searching product is not in the basket
        System.out.println("Ремень в корзине?: " + basket.checkProductName("Ремень"));

        //Clean the basket
        basket.clearBasket();

        //Printing empty basket
        System.out.println("Сейчас в корзине:");
        basket.printBasketContents();

        //Total cost (empty basket)
        System.out.println("Общая стоимость: " + basket.getTotalBasketCost());

        //Searching by name (empty basket)
        System.out.println("Шорты в корзине?: " + basket.checkProductName("Шорты"));
    }

}
