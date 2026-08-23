package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    //Basket contains 5 items
    private final Product[] products = new Product[5];

    //Method for adding a product to the basket
    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        //no free cells = message
        System.out.println("Невозможно добавить продукт");
    }

    //Method for obtaining the total basket cost
    public int getTotalBasketCost() {
        int totalCost = 0;
        for (Product product : products) {
            if (product != null) {
                totalCost += product.getPrice();
            }
        }
        return totalCost;
    }

    //Method counts special products
    public int countSpecialProducts() {
        int iCount = 0;
        for (Product product : products) {
            if (product != null && product.isSpecial()) {
                iCount++;
            }
        }
        return iCount;
    }

    //Method prints the basket contents
    public void printBasketContents() {
        boolean emptybasket = true;
        for (Product product : products) {
            if (product != null) {
                System.out.println(product.toString());
                emptybasket = false;

            }
        }
        if (emptybasket) {
            System.out.println("В корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalBasketCost());
            System.out.println("Специальных товаров: " + countSpecialProducts());
        }

    }

    //Method for checking a product in the basket by name
    public boolean checkProductName(String productName) {
        for (Product product : products) {
            if (product != null && product.getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    //Method for clearing the basket
    public void clearBasket() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }
}
