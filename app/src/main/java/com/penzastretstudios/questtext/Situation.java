package com.penzastretstudios.questtext;

public class Situation {
    Situation[] direction;
    String subject, text;
    int deltaRespect;
    public Situation (String subject, String text, int variants, int deltaRespect) {
        this.subject = subject;
        this.text = text;
        this.deltaRespect = deltaRespect;
        direction = new Situation[variants];
    }

    public void addSituation(String subject, String text, int variants, int deltaRespect) {
        for (int i = 0; i < direction.length; i++) {
            if (direction[i].text.equals("")) {
                direction[i] = new Situation(subject, text, variants, deltaRespect);
                break;
            }
        }
    }
}
