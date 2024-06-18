package com.kamal.java;

public class ConditionalStatement {
    public static void main(String[] args) {
        int productPrice;
        productPrice = 35000;
        int discount;
        int discountPercentage;
        char membership;
        membership = 'S';
        String brand = "Dell";
        if(membership == 'D' && brand == "Dell"){
             discountPercentage = 20;
        }else if(membership == 'G'){
            discountPercentage = 15;
        }else if (membership == 'S'){
            discountPercentage = 10;
        }else {
            discountPercentage = 5;
        }
        discount = productPrice * discountPercentage / 100;
        System.out.println("Discount $ : " + discount);
        System.out.println("Final Price : $ " + (productPrice - discount));





    }

}
