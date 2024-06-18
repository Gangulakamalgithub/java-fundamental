package com.kamal.java;

public class SwitchStatement {
    public static void main(String[] args) {
        String brand = "DEll";
        int productPrice;
        productPrice = 35000;
        int discount;
        int discountPercentage;
        discountPercentage = 1;
        char membership;
        membership = 'G';
        switch (brand){
            case "Samsung":
                if(membership == 'D'){
                    discountPercentage = 20;
                }else if(membership == 'G'){
                    discountPercentage = 15;
                }else if (membership == 'S'){
                    discountPercentage = 10;
                }else {
                    discountPercentage = 5;
                }

                break;
            case "DELL":
                if(membership == 'D'){
                    discountPercentage = 30;
                }else if(membership == 'G'){
                    discountPercentage = 15;
                }else if (membership == 'S'){
                    discountPercentage = 10;
                }else {
                    discountPercentage = 5;
                }
                break;
            default:
                discountPercentage = 5;
        }
        discount = productPrice * discountPercentage / 100;
        System.out.println("Discount $ : " + discount);
        System.out.println("Final Price : $ " + (productPrice - discount));
    }
}
