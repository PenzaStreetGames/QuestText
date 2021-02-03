package com.penzastretstudios.questtext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Character person = new Character("player");
    Story story;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        story = new Story();
        makeView();
    }

    public void makeView() {
        TextView textField = (TextView) findViewById(R.id.text);
        textField.setText(story.current_situation.subject + "\n" + story.current_situation.text + "\n" +
                "Уважение:" + story.current_situation.deltaRespect);
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

    public void checkEnd() {
        if (story.isEnd()) {
            TextView textField = (TextView) findViewById(R.id.text);
            textField.setText(textField.getText().toString() +
                    "\nКонец истории");
        }
    }
}