package com.londonappbrewery.destini;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    public TextView storyText;
    public Button redButton;
    public Button greenButton;
    private int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        storyText = (TextView) findViewById(R.id.storyTextView);
        redButton = (Button) findViewById(R.id.buttonTop);
        greenButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        redButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1) {
                    storyText.setText(getString(R.string.T3_Story));
                    redButton.setText(getString(R.string.T3_Ans1));
                    greenButton.setText(getString(R.string.T3_Ans2));
                    mStoryIndex = 3;
                } else if (mStoryIndex == 2){
                    storyText.setText(getString(R.string.T3_Story));
                    redButton.setText(getString(R.string.T3_Ans1));
                    greenButton.setText(getString(R.string.T3_Ans2));
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3){
                    redButton.setVisibility(View.GONE);
                    greenButton.setVisibility(View.GONE);
                    storyText.setText(getString(R.string.T6_End));


                }
            }
        });






        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mStoryIndex == 1) {
                    storyText.setText(getString(R.string.T2_Story));
                    redButton.setText(getString(R.string.T2_Ans1));
                    greenButton.setText(getString(R.string.T2_Ans2));
                    mStoryIndex = 2;
                }
                else if(mStoryIndex == 2){
                    redButton.setVisibility(View.GONE);
                    greenButton.setVisibility(View.GONE);
                    storyText.setText(getString(R.string.T4_End));
                }
                else if (mStoryIndex == 3){
                    redButton.setVisibility(View.GONE);
                    greenButton.setVisibility(View.GONE);
                    storyText.setText(getString(R.string.T5_End));
                }
            }
        });


    }
}
