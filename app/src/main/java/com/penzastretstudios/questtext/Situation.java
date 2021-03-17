package com.penzastretstudios.questtext;

import com.penzastretstudios.questtext.abstarcts.AbstractSituation;

import java.util.ArrayList;

public class Situation extends AbstractSituation {

    public Situation(int id, String title, String history) {
        super(id, title, history);
    }

    @Override
    public void onEnter() {

    }
}
