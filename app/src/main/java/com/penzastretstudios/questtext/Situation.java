package com.penzastretstudios.questtext;

public class Situation {
    public Situation[] direction;
    public String subject, text;
    public int deltaRespect;

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
