package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ImageView bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;

    TextView  TV1,TV2;
    Button  reset;
    int pos[]=new  int[10];
    int player1=0,player2=0, i, winner,x=0;
    String game="x";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(x=0;x<10;x++)
        {
            pos[x]=x*10;
        }

        bt1=findViewById(R.id.btn1);
        bt2=findViewById(R.id.btn2);
        bt3=findViewById(R.id.btn3);
        bt4=findViewById(R.id.btn4);
        bt5=findViewById(R.id.btn5);
        bt6=findViewById(R.id.btn6);
        bt7=findViewById(R.id.btn7);
        bt8=findViewById(R.id.btn8);
        bt9=findViewById(R.id.btn9);
        TV1=findViewById(R.id.text1);
        TV2=findViewById(R.id.text2);
        reset=findViewById(R.id.button);
        bt1.setImageDrawable(null);
        bt2.setImageDrawable(null);
        bt3.setImageDrawable(null);
        bt4.setImageDrawable(null);
        bt5.setImageDrawable(null);
        bt6.setImageDrawable(null);
        bt7.setImageDrawable(null);
        bt8.setImageDrawable(null);
        bt9.setImageDrawable(null);
        TV1.setText("Score X :- " + String.valueOf(player1));
        TV2.setText("Score Y :- " + String.valueOf(player2));
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bt1.setImageDrawable(null);
                bt2.setImageDrawable(null);
                bt3.setImageDrawable(null);
                bt4.setImageDrawable(null);
                bt5.setImageDrawable(null);
                bt6.setImageDrawable(null);
                bt7.setImageDrawable(null);
                bt8.setImageDrawable(null);
                bt9.setImageDrawable(null);
                resetAll();
                player1 =0;
                player2=0;
                TV1.setText("Score X :- "+String.valueOf(player1));
                TV2.setText("Score Y :- "+String.valueOf(player2));

            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pos[1]==10) {
                    if (game.equals("x")) {
                        bt1.setImageResource(R.drawable.cross);
                        pos[1] = 1;
                        i++;
                    } else {
                        bt1.setImageResource(R.drawable.circle);
                        pos[1] = 0;
                        i++;
                    }

                    if (win() == 1) {
                        if (game.equals("x")) {
                            Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                            player1++;
                            TV2.setText("Score X :-  " + String.valueOf(player1));
                        } else {
                            Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                            player2++;
                            TV2.setText("Score y :- " + String.valueOf(player2));

                        }
                        resetAll();
                    }

                    choosePlayer();
                }
                else
                {
                    Toast.makeText(MainActivity.this," already  fill ",Toast.LENGTH_SHORT).show();
                }

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pos[2]==20) {
                    if (game.equals("x")) {
                        bt2.setImageResource(R.drawable.cross);
                        pos[2] = 1;
                        i++;
                    } else {
                        bt2.setImageResource(R.drawable.circle);
                        pos[2] = 0;
                        i++;
                    }
                    if (win() == 1) {
                        if (game.equals("x")) {
                            Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                            player1++;
                            TV1.setText("Score X :- " + String.valueOf(player1));
                        } else {
                            Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                            player2++;
                            TV2.setText("Score y :- " + String.valueOf(player2));

                        }
                        resetAll();
                    }

                    choosePlayer();
                }
                else
                {
                    Toast.makeText(MainActivity.this," already  fill ",Toast.LENGTH_SHORT).show();
                }

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pos[3]==30) {
                    if (game.equals("x")) {
                        bt3.setImageResource(R.drawable.cross);
                        pos[3] = 1;
                        i++;
                    } else {
                        bt3.setImageResource(R.drawable.circle);
                        pos[3] = 0;
                        i++;
                    }
                    if (win() == 1) {
                        if (game.equals("x")) {
                            Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                            player1++;
                            TV1.setText("Score X :- " + String.valueOf(player1));
                        } else {
                            Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                            player2++;
                            TV2.setText("Score y :- " + String.valueOf(player2));

                        }
                        resetAll();
                    }

                    choosePlayer();
                }
                else
                {
                    Toast.makeText(MainActivity.this," already  fill ",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pos[4]==40) {
                    if (game.equals("x")) {
                        bt4.setImageResource(R.drawable.cross);
                        pos[4] = 1;
                        i++;
                    } else {
                        bt4.setImageResource(R.drawable.circle);
                        pos[4] = 0;
                        i++;
                    }
                    if (win() == 1) {
                        if (game.equals("x")) {
                            Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                            player1++;
                            TV1.setText("Score X :- " + String.valueOf(player1));
                        } else {
                            Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                            player2++;
                            TV2.setText("Score y :- " + String.valueOf(player2));

                        }
                        resetAll();
                    }

                    choosePlayer();
                }
                else
                {
                    Toast.makeText(MainActivity.this," already  fill ",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pos[5]==50) {
                    if (game.equals("x")) {
                        bt5.setImageResource(R.drawable.cross);
                        pos[5] = 1;
                        i++;
                    } else {
                        bt5.setImageResource(R.drawable.circle);
                        pos[5] = 0;
                        i++;
                    }

                    if (win() == 1) {
                        if (game.equals("x")) {
                            Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                            player1++;
                            TV1.setText("Score X :- " + String.valueOf(player1));
                        } else {
                            Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                            player2++;
                            TV2.setText("Score y :- " + String.valueOf(player2));

                        }
                        resetAll();
                    }

                    choosePlayer();
                }
                else
                {
                    Toast.makeText(MainActivity.this," already  fill ",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pos[6]==60) {
                    if (game.equals("x")) {
                        bt6.setImageResource(R.drawable.cross);
                        pos[6] = 1;
                        i++;
                    } else {
                        bt6.setImageResource(R.drawable.circle);
                        pos[6] = 0;
                        i++;
                    }
                    if (win() == 1) {
                        if (game.equals("x")) {
                            Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                            player1++;
                            TV1.setText("Score X :- " + String.valueOf(player1));
                        } else {
                            Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                            player2++;
                            TV2.setText("Score y :- " + String.valueOf(player2));

                        }
                        resetAll();
                    }

                    choosePlayer();
                }
                else
                {
                    Toast.makeText(MainActivity.this," already  fill ",Toast.LENGTH_SHORT).show();
                }
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (pos[7] == 70) {
                    if (game.equals("x")) {
                        bt7.setImageResource(R.drawable.cross);
                        pos[7] = 1;
                        i++;
                    } else {
                        bt7.setImageResource(R.drawable.circle);
                        pos[7] = 0;
                        i++;
                    }

                    if (win() == 1) {
                        if (game.equals("x")) {
                            Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                            player1++;
                            TV1.setText("Score X :- " + String.valueOf(player1));
                        } else {
                            Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                            player2++;
                            TV2.setText("Score y :- " + String.valueOf(player2));

                        }
                        resetAll();
                    }

                    choosePlayer();
                }
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pos[8]==80){
                if(game.equals("x"))
                {
                    bt8.setImageResource(R.drawable.cross);
                    pos[8]=1;
                    i++;
                }
                else
                {
                    bt8.setImageResource(R.drawable.circle);
                    pos[8]=0;
                    i++;
                }

                if(win()==1)
                {
                    if(game.equals("x"))
                    {
                        Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                        player1++;
                        TV1.setText("Score X :- "+String.valueOf(player1));
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                        player2++;
                        TV2.setText("Score y :- "+String.valueOf(player2));

                    }
                    resetAll();
                }

                choosePlayer();}
                else
                {
                    Toast.makeText(MainActivity.this," already  fill ",Toast.LENGTH_SHORT).show();
                }

            }
        }); bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(pos[9]==90) {
                    if (game.equals("x")) {
                        bt9.setImageResource(R.drawable.cross);
                        pos[9] = 1;
                        i++;
                    } else {
                        bt9.setImageResource(R.drawable.circle);
                        pos[9] = 0;
                        i++;
                    }
                    if (win() == 1) {
                        if (game.equals("x")) {
                            Toast.makeText(MainActivity.this, "Player X Win ", Toast.LENGTH_LONG).show();
                            player1++;
                            TV1.setText("Score X :- " + String.valueOf(player1));
                        } else {
                            Toast.makeText(MainActivity.this, "Player O Win ", Toast.LENGTH_LONG).show();
                            player2++;
                            TV2.setText("Score y :- " + String.valueOf(player2));

                        }
                        resetAll();
                    }

                    choosePlayer();
                }
                else
                {
                    Toast.makeText(MainActivity.this," already  fill ",Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
    void choosePlayer()
    {
         if(game.equals("x"))
         {
             game="o";
         }
         else {
             game = "x";
         }
    }
    int  win() {


        if (pos[1] == pos[2] && pos[2] == pos[3])
            return 1;

        else if (pos[1] == pos[4] && pos[4] == pos[7])
            return 1;

        else if (pos[1] == pos[5] && pos[5] == pos[9])
            return 1;

        else if (pos[2] == pos[5] && pos[5] == pos[8])
            return 1;

        else if (pos[3] == pos[6] && pos[6] == pos[7])
            return 1;

        else if (pos[3] == pos[5] && pos[5] == pos[7])
            return 1;

        else if (pos[4] == pos[5] && pos[5] == pos[6])
            return 1;

        else if (pos[7] == pos[8] && pos[8] == pos[9])
            return 1;
        else if (i == 9) {
            Toast.makeText(MainActivity.this, "Draw ", Toast.LENGTH_SHORT).show();
            resetAll();
        return  0;}
        else if (pos[1] != '1' && pos[2] != '2' && pos[3] != '3' && pos[4] != '4' && pos[5] != '5' && pos[6] != '6' && pos[7] != '7' && pos[8] != '8' && pos[9] != '9')
            // Toast.makeText(MainActivity.this, "Draw ", Toast.LENGTH_SHORT).show();
            return 0;
        else
            return -1;

    }

    void resetAll()
    {
        for(x=0;x<10;x++)
        {
            pos[x]=(x)*10;
        }
        i=0;
        bt1.setImageDrawable(null);
        bt2.setImageDrawable(null);
        bt3.setImageDrawable(null);
        bt4.setImageDrawable(null);
        bt5.setImageDrawable(null);
        bt6.setImageDrawable(null);
        bt7.setImageDrawable(null);
        bt8.setImageDrawable(null);
        bt9.setImageDrawable(null);

    }
}