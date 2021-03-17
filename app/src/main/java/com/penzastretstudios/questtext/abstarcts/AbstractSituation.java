package com.penzastretstudios.questtext.abstarcts;

import com.penzastretstudios.questtext.Edge;
import com.penzastretstudios.questtext.Situation;

import java.util.ArrayList;

public abstract class AbstractSituation {
    public int id;
    public String title;
    public String history;
    public ArrayList<Edge> edges = new ArrayList<>();

    Situation[] direction;
    String subject, text;
    int deltaRespect;

    public AbstractSituation (int id, String title, String history) {
        this.title = title;
        this.history = history;
        this.id = id;
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    abstract public void onEnter();
}
