package com.example.kbc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Start_Game extends AppCompatActivity {
    ImageView imgview2;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    private ConstraintLayout myconlayout;
    private ConstraintSet myconset = new ConstraintSet();

    MediaPlayer mp2;
    CountDownTimer mytimer;
    CountDownTimer mytimer2;
    char correctanswer = 'E';
    int correct = 2;
    int q=0;
    int timer=0;
    float tick = 0.00000000f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);
        myconlayout = (ConstraintLayout) findViewById(R.id.conlayout);
        imgview2 = (ImageView) findViewById(R.id.iv2);
        button2 = (Button) findViewById(R.id.btn2);
        button3 = (Button) findViewById(R.id.btn3);
        button4 = (Button) findViewById(R.id.btn4);
        button5 = (Button) findViewById(R.id.btn5);
        button6 = (Button) findViewById(R.id.btn6);
        button7 = (Button) findViewById(R.id.btn7);
        button8 = (Button) findViewById(R.id.btn8);
        button9 = (Button) findViewById(R.id.btn9);
        button10 = (Button) findViewById(R.id.btn10);
        button11 = (Button) findViewById(R.id.btn11);
        button12 = (Button) findViewById(R.id.btn12);
        mp2 = MediaPlayer.create(this,R.raw.kbc_theme1);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);
        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        button2.setClickable(false);
        button3.setClickable(false);
        button4.setClickable(false);
        button5.setClickable(false);
        button6.setClickable(false);
        readcsv();
        correctanswer = startgame(q);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setClickable(false);
                button4.setClickable(false);
                button5.setClickable(false);
                button6.setClickable(false);
                timer(0);
                button3.setBackgroundResource(R.drawable.rounder_corners_2_pressed);
                mytimer2 = new CountDownTimer(2000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }
                    @Override
                    public void onFinish() {

                        correct = checkans('A',correctanswer);
                        if (correct == 1){
                            button3.setBackgroundResource(R.drawable.rounded_corners);
                            Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT).show();
                            q++;
                            correctanswer = startgame(q);
                        } else if (correct == 0){
                            button3.setBackgroundResource(R.drawable.wrong_answer);
                            Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG).show();
                        }
                    }
                }.start();


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setClickable(false);
                button4.setClickable(false);
                button5.setClickable(false);
                button6.setClickable(false);
                timer(0);
                button4.setBackgroundResource(R.drawable.rounder_corners_2_pressed);
                mytimer2 = new CountDownTimer(2000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }
                    @Override
                    public void onFinish() {

                        correct = checkans('B',correctanswer);
                        if (correct == 1){
                            button4.setBackgroundResource(R.drawable.rounded_corners);
                            Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT).show();
                            q++;
                            correctanswer = startgame(q);
                        } else if (correct == 0){
                            button4.setBackgroundResource(R.drawable.wrong_answer);
                            Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG).show();
                        }
                    }
                }.start();

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setClickable(false);
                button4.setClickable(false);
                button5.setClickable(false);
                button6.setClickable(false);
                timer(0);
                button5.setBackgroundResource(R.drawable.rounder_corners_2_pressed);
                mytimer2 = new CountDownTimer(2000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }
                    @Override
                    public void onFinish() {

                        correct = checkans('C',correctanswer);
                        if (correct == 1){
                            button5.setBackgroundResource(R.drawable.rounded_corners);
                            Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT).show();
                            q++;
                            correctanswer = startgame(q);
                        } else if (correct == 0){
                            button5.setBackgroundResource(R.drawable.wrong_answer);
                            Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG).show();
                        }
                    }
                }.start();

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button3.setClickable(false);
                button4.setClickable(false);
                button5.setClickable(false);
                button6.setClickable(false);
                timer(0);
                button6.setBackgroundResource(R.drawable.rounder_corners_2_pressed);
                mytimer2 = new CountDownTimer(2000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {

                    }
                    @Override
                    public void onFinish() {

                        correct = checkans('D',correctanswer);
                        if (correct == 1){
                            button6.setBackgroundResource(R.drawable.rounded_corners);
                            Toast.makeText(getApplicationContext(),"Correct Answer",Toast.LENGTH_SHORT).show();
                            q++;
                            correctanswer = startgame(q);
                        } else if (correct == 0){
                            button6.setBackgroundResource(R.drawable.wrong_answer);
                            Toast.makeText(getApplicationContext(),"Wrong Answer",Toast.LENGTH_LONG).show();
                        }
                    }
                }.start();

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setVisibility(View.VISIBLE);
                button11.setVisibility(View.VISIBLE);
                button12.setVisibility(View.VISIBLE);
                button10.setClickable(false);
                button11.setClickable(false);
                button12.setClickable(false);
                timer(0);
                button9.setClickable(false);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button5.setVisibility(View.INVISIBLE);
                button6.setVisibility(View.INVISIBLE);
                tick = 0.03000000f;
                myconset.clone(myconlayout);
                mytimer2 = new CountDownTimer(1350,50) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        tick = tick + 0.01000000f;
                        if (tick <= 0.30f){
                            myconset.setVerticalBias(R.id.btn12,tick);
                            myconset.applyTo(myconlayout);
                            //Log.d("Value of tick",String.valueOf(Float.valueOf(tick)));
                        }
                        if (tick <= 0.22f){
                            myconset.setVerticalBias(R.id.btn11,tick);
                            myconset.applyTo(myconlayout);
                        }
                        if (tick <= 0.12f) {
                            myconset.setVerticalBias(R.id.btn10,tick);
                            myconset.applyTo(myconlayout);
                        }


                    }

                    @Override
                    public void onFinish() {

                    }
                }.start();

            }
        });

    }

    private int checkans(char ans, char correctans) {
        if (ans == correctans){
            return 1;
        }else{
            return 0;
        }
    }

    private List<QuestionGet> QuestionsGet = new ArrayList<>();
    private void readcsv(){
        InputStream is = getResources().openRawResource(R.raw.questions);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );
        String line = "";
        try {
            while ((line = reader.readLine()) != null){
                String[] tokens = line.split(",");
                QuestionGet sample = new QuestionGet();
                sample.setQues(tokens[0]);
                sample.setOptiona(tokens[1]);
                sample.setOptionb(tokens[2]);
                sample.setOptionc(tokens[3]);
                sample.setOptiond(tokens[4]);
                sample.setCorrectoption(tokens[5].charAt(0));
                //Log.d("CSV READING",tokens[0]);
                QuestionsGet.add(sample);
                //Log.d("CSV TO LIST",QuestionsGet.get(0).getQues());

            }



        } catch (IOException e) {
                Log.wtf("Start_Game","Error reading Questions CSV file");
                e.printStackTrace();
        }


    }

    private void timer(int t){
        if (t == 1){
            mytimer = new CountDownTimer(30000,1000){
                @Override
                public void onTick(long millisUntilFinished) {
                    button8.setText(String.valueOf(timer));
                    timer++;
                }

                @Override
                public void onFinish() {
                    timer=0;
                    button3.setClickable(false);
                    button4.setClickable(false);
                    button5.setClickable(false);
                    button6.setClickable(false);
                    button3.setBackgroundResource(R.drawable.rounder_corners_2_pressed);
                    button4.setBackgroundResource(R.drawable.rounder_corners_2_pressed);
                    button5.setBackgroundResource(R.drawable.rounder_corners_2_pressed);
                    button6.setBackgroundResource(R.drawable.rounder_corners_2_pressed);
                    Toast.makeText(getApplicationContext(),"TIME UP, YOU LOSE",Toast.LENGTH_LONG).show();
                }
            }.start();
        } else if (t==0){
            mytimer.cancel();
            timer = 0;
            //button8.setText(String.valueOf(timer));
        }

    }

    private char startgame(int a){
        if (a<15){
            button2.setVisibility(View.VISIBLE);
            button3.setVisibility(View.VISIBLE);
            button4.setVisibility(View.VISIBLE);
            button5.setVisibility(View.VISIBLE);
            button6.setVisibility(View.VISIBLE);
            button3.setClickable(true);
            button4.setClickable(true);
            button5.setClickable(true);
            button6.setClickable(true);
            char correctans = 'E';
            button2.setText(QuestionsGet.get(a).getQues());
            button3.setText(QuestionsGet.get(a).getOptiona());
            button4.setText(QuestionsGet.get(a).getOptionb());
            button5.setText(QuestionsGet.get(a).getOptionc());
            button6.setText(QuestionsGet.get(a).getOptiond());
            correctans = QuestionsGet.get(a).getCorrectoption();
            timer(1);
            return correctans;
        }else{
            Toast.makeText(getApplicationContext(),"GAME OVER !!",Toast.LENGTH_LONG).show();
            return 'E';
        }


    }

    private void playmusic(int track){
        stopmusic();
        mp2 = MediaPlayer.create(this,R.raw.kbc_theme1);
        mp2.start();
    }
    private void stopmusic(){
        if (mp2.isPlaying()){
            mp2.stop();
            //mp2.release();
        }
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(getApplicationContext(),"NOT ALLOWED",Toast.LENGTH_SHORT).show();
    }
}


