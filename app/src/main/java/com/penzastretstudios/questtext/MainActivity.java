package com.penzastretstudios.questtext;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.penzastretstudios.questtext.abstarcts.AbstractSituation;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Character person = Character.getPerson();
    Story story = Story.getStory();
    TextView title;
    TextView storyText;
    TextView characterText;
    ArrayList<Button> buttons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.textTitle);
        storyText = (TextView) findViewById(R.id.story);
        characterText = (TextView) findViewById(R.id.character);
        buttons.add((Button) findViewById(R.id.button));
        buttons.add((Button) findViewById(R.id.button2));
        buttons.add((Button) findViewById(R.id.button3));
        for (int i = 0; i < buttons.size(); i++) {
            int finalI = i;
            buttons.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    update(finalI);
                }
            });
        }
        DataFiller.createStory(story);
        makeView();
    }

    @SuppressLint("SetTextI18n")
    public void makeView() {
        AbstractSituation situation = Story.getStory().current_situation;
        title.setText(situation.title);
        storyText.setText(situation.history);
        characterText.setText(person.name + "\n" + "Уважение: " + person.respect);
        for (int i = 0; i < buttons.size(); i++) {
            Button button = buttons.get(i);
            if (i < situation.edges.size()) {
                button.setText(situation.edges.get(i).variant);
            }
            button.setVisibility((i < situation.edges.size() ? View.VISIBLE : View.INVISIBLE));
            button.setClickable(i < situation.edges.size());
        }
    }

    public void update(int move) {
        story.go(move);
        makeView();
        checkEnd();
    }

    @SuppressLint("SetTextI18n")
    public void checkEnd() {
        boolean end = story.isEnd();
        if (end) {
            Toast.makeText(getApplicationContext(), "Конец истории", Toast.LENGTH_SHORT).show();
        }
    }
}