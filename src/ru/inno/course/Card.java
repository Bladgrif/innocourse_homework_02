package ru.inno.course;

public class Card {

    public void MarkingOfCards(String card) {
        String marking = "**** **** **** ";
        System.out.println(marking + card.substring(card.length() - 4, card.length()));
    }

}
