package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // member variables

    private TextView storyTextView;
    private Button storyTopButton;
    private Button storyBottomButton;
    private int storyIndex=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initialised/Assigned variables
        storyTextView=findViewById(R.id.storyTextView);
        storyTopButton=findViewById(R.id.buttonTop);
        storyBottomButton=findViewById(R.id.buttonBottom);



        //  listener on the top, continues the story from the top button(T3)
        storyTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(storyIndex==1) {
                    storyTextView.setText(R.string.T3_Story);
                    //updates the button
                    storyTopButton.setText(R.string.T3_Ans1);
                    storyBottomButton.setText(R.string.T3_Ans2);
                    storyIndex=3;
                }else {
                    storyTextView.setText(R.string.T6_End);
                    storyTopButton.setVisibility(View.GONE);
                    storyBottomButton.setVisibility(View.GONE);

                }
            }
        });

        //listener on bottombutton, continues the story from the bottombutton(T2)
        storyBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(storyIndex==1||storyIndex==2){
                storyTextView.setText(R.string.T2_Story);
                //updates the button
                storyTopButton.setText(R.string.T2_Ans1);
                storyBottomButton.setText(R.string.T2_Ans2);
                storyIndex=2;
                } //second part of the story
                else if(storyIndex==2){
                    storyTextView.setText(R.string.T4_End);
                    //Story finishes, T4_endpoint
                    storyTopButton.setVisibility(View.GONE);
                    storyBottomButton.setVisibility(View.GONE);
                }
                else{
                    storyTextView.setText(R.string.T4_End);
                    storyTopButton.setVisibility(View.GONE);
                    storyBottomButton.setVisibility(View.GONE);
                }
            }

        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
