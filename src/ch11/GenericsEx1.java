package ch11;

import java.util.ArrayList;

class Product{}
class Tv extends Product{}
class Audio extends Product{}

class GenericsEx1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvList = new ArrayList<Tv>();

        productList.add(new Tv());
        productList.add(new Audio());

        tvList.add(new Tv());
        tvList.add(new Tv());

        printAll(productList);
//        printAll(tvList);

        printAll2(productList);
        printAll2(tvList);
    }

    public static void printAll(ArrayList<Product> list) {
        for(Product p : list) {
            System.out.println(p);
        }
    }

//    public static void printAll2(ArrayList<Product> list) {}
    public static <T extends Product> void printAll2 (ArrayList<T> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }
}
