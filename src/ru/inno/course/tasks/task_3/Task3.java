package ru.inno.course.tasks.task_3;

import ru.inno.course.tasks.task_2.Item;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        Item unknownItem = new Item();
        Item pan = new Item(66666);
        Item chocolate = new Item(123321, "BLack chocolate");
        Item glass = new Item(632123, "Glass for work", 4500);
        Item paper = new Item(12312, "Paper", 1000, 100);
        Item iphone = new Item(12345, "iPhone Max Pro", 129000, 1, "black");

        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(unknownItem);
        itemList.add(pan);
        itemList.add(chocolate);
        itemList.add(glass);
        itemList.add(paper);
        itemList.add(iphone);

        for (Item item : itemList) {
            System.out.print(item.articleNumber + " ");
            System.out.print(item.title + " ");
            System.out.print(item.price + " ");
            System.out.print(item.count + " ");
            System.out.println(item.colour);
        }

    }
}
