package ru.inno.course.tasks;

import ru.inno.course.Card;

public class MarkCard {


    public static void main(String[] args) {
        Card card = new Card();

        String cardNumber = "1234 5678 9012 3456";
        String cardNumber2 = "1234567890123456";

//        1*. Маскировать номер карты.
        card.MarkingOfCards(cardNumber);
        card.MarkingOfCards(cardNumber2);

    }
}
