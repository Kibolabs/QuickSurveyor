package com.example.android.quicksurveyor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.id;
import static android.R.attr.value;

public class MainActivity extends AppCompatActivity {
 String name=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayChoice("NOw new i dont");
    }
    public void displayChoice(){
        TextView answerTextView = (TextView) findViewById(R.id.answer_txt);
        answerTextView.setText(String.valueOf(name));
    }
    public void choice(View view){
        int id=view.getId();
                if(id==R.id.yes_ans_btn){
                    name="YES";
                    displayChoice();
                }else if(id==R.id.no_ans_btn){
                    name="NO";
                    displayChoice();

                }else if(id==R.id.maybe_ans_btn){
                    name="MAY BE!";
                    displayChoice();
                }else if(id==R.id.idk_ans_btn){
                    name="I DONT KNOW";
                    displayChoice();

                }else if(id==R.id.likeIcare_ans_btn){
                    //like
                    name="I PREFER NOT TO ANSWER";
                    displayChoice();
                }
                else{
                    // no choice
                }
    }
    public void resetAnswer(View v){
        TextView answerText = (TextView) findViewById(R.id.answer_txt);
        answerText.setText(null);
    }
    public void nextQuestion(View qnView){

    }
}
