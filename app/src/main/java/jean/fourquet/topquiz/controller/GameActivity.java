package jean.fourquet.topquiz.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

import jean.fourquet.topquiz.R;
import jean.fourquet.topquiz.model.Question;
import jean.fourquet.topquiz.model.QuestionBank;

public class GameActivity extends AppCompatActivity {

   private TextView    mQuestion;
   private Button      mAnswer1;
   private Button      mAnswer2;
   private Button      mAnswer3;
   private Button      mAnswer4;

    private QuestionBank mQuestionBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        mQuestionBank = this.generateQuestions();

        mQuestion = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswer1 = (Button) findViewById(R.id.acitivy_game_answer1_btn);
        mAnswer2 = (Button) findViewById(R.id.acitivy_game_answer2_btn);
        mAnswer3 = (Button) findViewById(R.id.acitivy_game_answer3_btn);
        mAnswer4 = (Button) findViewById(R.id.acitivy_game_answer4_btn);
    }

    private QuestionBank generateQuestions(){
        Question question1 = new Question("Who is the creator of Android?",
                Arrays.asList("Andy Rubin",
                        "Steve Wozniak",
                        "Jake Wharton",
                        "Paul Smith"),
                0);

        Question question2 = new Question("When did the first man land on the moon?",
                Arrays.asList("1958",
                        "1962",
                        "1967",
                        "1969"),
                3);

        Question question3 = new Question("What is the house number of The Simpsons?",
                Arrays.asList("42",
                        "101",
                        "666",
                        "742"),
                3);

        return new QuestionBank(Arrays.asList(question1,
                question2,
                question3));
    }
}
