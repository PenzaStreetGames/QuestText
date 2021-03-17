package com.penzastretstudios.questtext;

import android.widget.Toast;

import com.penzastretstudios.questtext.abstarcts.AbstractSituation;

public class EndSituation extends AbstractSituation {

    public EndSituation(int id, String title, String history) {
        super(id, title, history);
    }

    @Override
    public void onEnter() {

    }
}
