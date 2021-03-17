package com.penzastretstudios.questtext;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Character person = Character.getPerson();
    Story story = Story.getStory();
    TextView title;
    TextView storyText;
    TextView characterText;
    ArrayList<Button> buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.textTitle);
        storyText = (TextView) findViewById(R.id.story);
        characterText = (TextView) findViewById(R.id.character);
        buttons.add((Button) findViewById(R.id.button));
        buttons.add((Button) findViewById(R.id.button2));
        makeView();
    }

    @SuppressLint("SetTextI18n")
    public void makeView() {
        TextView textField = (TextView) findViewById(R.id.story);
        textField.setText(story.current_situation.subject + "\n" + story.current_situation.text + "\n" +
                "Уважение:" + story.current_situation.deltaRespect);
    }

    public void update(int move) {
        story.go(move);
    }

    public void firstButton(View v) {
        story.go(1);
        person.respect += story.current_situation.deltaRespect;
        makeView();
        checkEnd();
    }

    public void secondButton(View v) {
        story.go(2);
        person.respect += story.current_situation.deltaRespect;
        makeView();
        checkEnd();
    }

    @SuppressLint("SetTextI18n")
    public void checkEnd() {
        if (story.isEnd()) {
            TextView textField = (TextView) findViewById(R.id.story);
            textField.setText(textField.getText().toString() +
                    "\nКонец истории");
        }
    }
}