package com.penzastretstudios.questtext;

import com.penzastretstudios.questtext.abstarcts.AbstractSituation;

public class DataFiller {

    static void createStory(Story story) {
        createSituations(story);
        createEdges(story);
        AbstractSituation begin = story.getById(1);
        story.setCurrentSituation(begin);
    }

    static void createSituations(Story story) {
        story.addSituation("Задание", "Необходимо реализовать текстовый квест, используя изученные выше темы, " +
                "такие как шаблоны проектирования одиночка и абстрактная фабрика и анонимные классы");
        story.addSituation("Бездействие", "Время всё идёт, а дела не делаются. Уважение медленно тает");
        story.addSituation("Шаблоны", "Прекрасно, пора начинать работу. Будете ли вы " +
                "использовать шаблоны в своём квесте?");
        story.addSituation("Без шаблонов", "Спорное решение. " +
                "Может быть всё-таки послушаться совету препода и применить их?");
        story.addSituation("Шаблоны будут", "Ожидаемое решение. А имеете ли вы хоть малейшее понятие, " +
                "какие шаблоны будут использоваться?");
        story.addSituation("До сих пор без шаблонов", "Времени на раздумия не осталось. " +
                "Другие говорят какие-то умные слова и пытаются реализовать фабричный метод. Так как же писать код?");
        story.addSituation("Какие шаблоны", "Хорошо, а какие шаблоны бывают вообще?");
        story.addSituation("Точно ли шаблоны", "Путь вроде бы правильный, но может стоит " +
                "спросить одногруппников, делающих это же задание?");
        story.addEndSituation("Миссия провалена", "Кажется, придётся переделывать этот квест и сдавать на следующей паре.");
        story.addEndSituation("Так себе", "Попытки вставить в проект фабрику конечно были, но преподу не зашло.");
        story.addEndSituation("Норм квест", "Квест вышел то, что надо. И шаблоны, и сюжет.");
    }

    static void createEdges(Story story) {
        story.addEdge(1, 2, "Подождите, я не готов", -1);
        story.addEdge(1, 3, "Ну давайте, куда деваться", 1);
        story.addEdge(2, 1, "Да, хватит тупить", 0);
        story.addEdge(3, 4, "Шаблонов не будет, я сказал", -5);
        story.addEdge(3, 5, "Ну раз сказали, значит будут", 5);
        story.addEdge(3, 2, "А можно подумать?", -1);
        story.addEdge(4, 6, "Ничего не понятно, пытаться не буду", -10);
        story.addEdge(4, 7, "Ну, может быть, всё-таки они нужны", 5);
        story.addEdge(5, 7, "Вообще-то нет", -5);
        story.addEdge(5, 8, "Вроде бы препод объяснял...", 5);
        story.addEdge(6, 9, "Структурным стилем", -1000000000);
        story.addEdge(6, 10, "Написать кучу классов и интерфейсов", 5);
        story.addEdge(7, 9, "Ну, стереотипы там всякие", -1000000000);
        story.addEdge(7, 10, "Одиночный метод и фабрика", -1000000);
        story.addEdge(7, 11, "Фабричный метод и одиночка", 100);
        story.addEdge(8, 10, "Сделаю как-нибудь сам", -100);
        story.addEdge(8, 11, "Одногрупы фигни не скажут", 100);
    }
}
