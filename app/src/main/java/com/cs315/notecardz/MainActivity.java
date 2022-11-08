package com.cs315.notecardz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button trueButton;
    private Button falseButton;
    private Button nextButton;
    private TextView questionView;

    private Question[] questionBank = new Question[]
            {
                    new Question(R.string.question_games, true),
                    new Question(R.string.question_dessert, false),
                    new Question(R.string.question_onion, false)
            };

    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        questionView = (TextView) findViewById(R.id.questions);

        trueButton = (Button) findViewById(R.id.true_button);
        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(true);
            }
        });

        falseButton = (Button) findViewById(R.id.false_button);
        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswer(false);
            }
        });

        nextButton = (Button) findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextQuestion();
            }
        });
        nextQuestion();
    }

    private void nextQuestion()
    {
        int question = questionBank[index].getTxt();
        questionView.setText(question);
    }

    private void checkAnswer(boolean userPress)
    {
        boolean aTrue = questionBank[index].getAnswer();
        int messageId = 0;
        if(userPress == aTrue)
        {
            messageId = R.string.correct_toast;
        }
        else
        {
            messageId = R.string.incorrect_toast;
        }
        Toast.makeText(this, messageId, Toast.LENGTH_SHORT).show();
    }
}