package com.penzastretstudios.questtext;

import com.penzastretstudios.questtext.abstarcts.AbstractSituation;
import com.penzastretstudios.questtext.creators.EdgeCreator;
import com.penzastretstudios.questtext.creators.EndSituationCreator;
import com.penzastretstudios.questtext.creators.SituationCreator;

import java.time.Period;
import java.util.ArrayList;

public class Story {

    private AbstractSituation start_story;
    public AbstractSituation current_situation;
    public EdgeCreator edgeCreator;
    public SituationCreator situationCreator;
    public EndSituationCreator endSituationCreator;
    public ArrayList<AbstractSituation> situations = new ArrayList<>();
    public ArrayList<Edge> edges = new ArrayList<>();
    private static Story story = null;

    public static Story getStory() {
        if (story == null)
            story = new Story();
        return story;
    }

    private Story() {
        edgeCreator = new EdgeCreator();
        situationCreator = new SituationCreator();
        endSituationCreator = new EndSituationCreator();
    }

    public void go(int num) {
        Character.getPerson().respect += current_situation.edges.get(num).deltaRespect;
        current_situation = current_situation.edges.get(num).sit_into;
    }

    public void addSituation(String title, String history) {
        AbstractSituation situation = situationCreator.createSituation(title, history);
        situations.add(situation);
    }

    public void addEndSituation(String title, String history) {
        AbstractSituation situation = situationCreator.createSituation(title, history);
        situations.add(situation);
    }

    public void addEdge(int id_from, int id_into, String variant, int deltaRespect) {
        AbstractSituation sit_from = getById(id_from);
        AbstractSituation sit_into = getById(id_into);
        if (sit_from == null || sit_into == null) {
            System.out.println("Связь не добавлена");
            return;
        }
        Edge edge = edgeCreator.createEdge(sit_from, sit_into, variant, deltaRespect);
        edges.add(edge);
    }

    public AbstractSituation getById(int id) {
        for (AbstractSituation situation : situations) {
            if (situation.id == id)
                return situation;
        }
        return null;
    }

    public void setCurrentSituation(AbstractSituation situation) {
        this.current_situation = situation;
    }

    public boolean isEnd() {
        return current_situation instanceof EndSituation;
    }
}
