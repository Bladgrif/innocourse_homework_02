package ru.inno.course.tasks.task_1;

import java.util.Scanner;

public class MarkCard {


    public static void main(String[] args) {
        Card card = new Card();
        System.out.println("Введите номер карты: ");
        Scanner scanner = new Scanner(System.in);
        String cardNumber = scanner.nextLine();
        card.MarkingOfCards(cardNumber);

    }
}
