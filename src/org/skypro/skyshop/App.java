package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;

public class App {
    public static void main(String[] args) {
        System.out.println("Shop Application");
        //initial values
        Product product1 = new SimpleProduct("Футболка", 1500);
        Product product2 = new SimpleProduct("Шорты", 2100);
        Product product3 = new DiscountedProduct("Рубашка", 1900, 30);
        Product product4 = new FixPriceProduct("Кепка");
        Product product5 = new DiscountedProduct("Брюки", 2500, 15);
        Product product6 = new SimpleProduct("Ремень", 900);
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
