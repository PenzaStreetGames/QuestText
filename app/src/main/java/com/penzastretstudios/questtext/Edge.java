package com.penzastretstudios.questtext;

public class Edge {

    int id;
    public String variant;
    public Situation sit_from;
    public Situation sit_into;
    int deltaRespect;

    public Edge(int id, String variant, int deltaRespect,
                Situation sit_from, Situation sit_into) {
        this.id = id;
        this.variant = variant;
        this.deltaRespect = deltaRespect;
        this.sit_from = sit_from;
        this.sit_into = sit_into;
        sit_from.addEdge(this);
    }
}
