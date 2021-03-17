package com.penzastretstudios.questtext;

import java.util.ArrayList;

public class Situation {
    public int id;
    public String title;
    public String history;
    public ArrayList<Edge> edges = new ArrayList<>();

    Situation[] direction;
    String subject, text;
    int deltaRespect;

    public Situation (int id, String title, String history) {
        this.title = title;
        this.history = history;
        this.id = id;
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }
    /*
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
    }*/
}
