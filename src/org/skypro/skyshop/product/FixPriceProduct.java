package org.skypro.skyshop.product;

public class FixPriceProduct extends Product {

    private static final int FIXED_PRICE_PRODUCT = 123;

    public FixPriceProduct(String name) {
        super(name);
    }

    @Override
    public int getPrice() {
        return FIXED_PRICE_PRODUCT;
    }

    @Override
    public String toString() {
        return getName() + " с фиксированной ценой: Фиксированная цена " + FIXED_PRICE_PRODUCT;
    }

    @Override
    public boolean isSpecial() {
        return true;
    }
}
