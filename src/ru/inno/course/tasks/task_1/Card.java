package ru.inno.course.tasks.task_1;

public class Card {

    public void MarkingOfCards(String card) {
        String marking = "**** **** **** ";
        System.out.println(marking + card.substring(card.length() - 4, card.length()));
    }

}
