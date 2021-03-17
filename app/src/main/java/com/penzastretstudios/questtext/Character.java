package com.penzastretstudios.questtext;

public class Character {
    // Класс персонажа
    private static Character person = null;
    public int respect;
    public String name;

    private Character(String name) {
        respect = 0;
        this.name = name;
    }

    public static Character getPerson() {
        if (person == null)
            person = new Character("Player");
        return person;
    }
}
