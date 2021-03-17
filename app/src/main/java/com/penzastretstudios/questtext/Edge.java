package com.penzastretstudios.questtext;

import com.penzastretstudios.questtext.abstarcts.AbstractSituation;

public class Edge {

    int id;
    public String variant;
    public AbstractSituation sit_from;
    public AbstractSituation sit_into;
    int deltaRespect;

    public Edge(int edge_id, String variant, int deltaRespect,
                AbstractSituation sit_from, AbstractSituation sit_into) {
        this.id = edge_id;
        this.variant = variant;
        this.deltaRespect = deltaRespect;
        this.sit_from = sit_from;
        this.sit_into = sit_into;
        sit_from.addEdge(this);
    }
}
