package com.penzastretstudios.questtext;

public class Story {

    private Situation start_story;
    public Situation current_situation;

    int[] parents = {
            0, 1, 1, 3, 3, 5, 5, 7, 7
    };
    String[] subjects = {
            "Поступление",
            "Не МИРЭА",
            "Занятие",
            "Проц прога",
            "Идти на пару",
            "Не на паре",
            "Делать квест",
            "Не делать квест",
            "Сделать квест"
    };
    String[] texts = {
            "Вот и кончилось егэ. Куда поступать?\n" +
                    "1) В любой вуз\n" +
                    "2) В МИРЭА",
            "И это было вашей последней ошибкой. Дизреспект (\n" +
                    "1) Заново\n",
            "Вот и славно. Но чем бы заняться в МИРЭА?\n" +
                    "1) Делать проект по проц. проге\n" +
                    "2) Пойти на мобилдев в самсунг",
            "Вот вам заняться больше нечем, безнадёжный ботан. Дизреспект (\n" +
                    "1) Заново",
            "В самсунге хорошо. На дворе 19 декабря. Идти на пару?\n" +
                    "1) Не идти\n" +
                    "2) Идти",
            "Фу, прогульщик. Уважение-\n" +
                    "1) Заново",
            "Пришёл такой на пару, а тут надо делать квест. Делать?\n" +
                    "1) Не делать\n" +
                    "2) Делать",
            "Ну вы и лентяй. Стыд и срам.\n" +
                    "1) Заново",
            "Ну и запилил текстовый квест, фигле. Уважение автора )\n" +
                    "1) Ура (заново)"
    };
    int[] variants = {
            2, 1, 2, 1, 2, 1, 2, 1, 1
    };
    int[] deltaRespects = {
            0, -1000000, 100, -1000, 100, -500, 100, -400, 1000
    };

    Story() {
        start_story = new Situation(
                subjects[0],
                texts[0],
                variants[0],
                deltaRespects[0]);
        start_story.direction[0] = new Situation(
                subjects[1],
                texts[1],
                variants[1],
                deltaRespects[1]);
        start_story.direction[0].direction[0] = start_story;
        start_story.direction[1] = new Situation(
                subjects[2],
                texts[2],
                variants[2],
                deltaRespects[2]);
        start_story.direction[1].direction[0] = new Situation(
                subjects[3],
                texts[3],
                variants[3],
                deltaRespects[3]);
        start_story.direction[1].direction[0].direction[0] = start_story;
        start_story.direction[1].direction[1] = new Situation(
                subjects[4],
                texts[4],
                variants[4],
                deltaRespects[4]);
        start_story.direction[1].direction[1].direction[0] = new Situation(
                subjects[5],
                texts[5],
                variants[5],
                deltaRespects[5]);
        start_story.direction[1].direction[1].direction[0].direction[0] = start_story;
        start_story.direction[1].direction[1].direction[1] = new Situation(
                subjects[6],
                texts[6],
                variants[6],
                deltaRespects[6]);
        start_story.direction[1].direction[1].direction[1].direction[0] = new Situation(
                subjects[7],
                texts[7],
                variants[7],
                deltaRespects[7]);
        start_story.direction[1].direction[1].direction[1].direction[0].direction[0] = start_story;
        start_story.direction[1].direction[1].direction[1].direction[1] = new Situation(
                subjects[8],
                texts[8],
                variants[8],
                deltaRespects[8]);
        start_story.direction[1].direction[1].direction[1].direction[1].direction[0] = start_story;
        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
