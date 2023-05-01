/**
 * Created by: Ken
 * Created on: 01/05/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class TestGoods {
    public static void main(String[] args) {
        Goods goods = new Goods("Bubble Bath", 1.40);
        Food food = new Food("Ox Tails", 4.45, 1500.0);
        Toy toy = new Toy("Legos", 54.45, 8);
        Book book = new Book("Emma", 24.95, "Austin");

        goods.print();
        System.out.println();
        food.print();
        System.out.println();
        toy.print();
        System.out.println();
        book.print();
    }// Method - main
}// Class - TestGoods
