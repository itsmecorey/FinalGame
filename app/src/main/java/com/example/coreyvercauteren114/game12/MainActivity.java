package com.example.coreyvercauteren114.game12;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public int random ()
    {
        int colour = (int) (Math.random () * (4 - 1 + 1) + 1);

        return colour;
    }

    public void colourChange (int array [] [], int r, int c, Button button)
    {
        if (array [r] [c] == 1 )
        {
            button.setBackgroundColor(button.getContext().getResources().getColor(R.color.colorOne));
        }

    }


    public void arrayCreate (View view)
    {
        int grid [] [] = new int [7] [5];

        int count = 0;

        Button button1 = (Button) findViewById(R.id.button1);
        grid [0] [0] = random ();

        // button.setBackground(R.color.colorOne);




    }






}


