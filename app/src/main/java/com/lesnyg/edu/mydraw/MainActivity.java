package com.lesnyg.edu.mydraw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private ImageButton currentPaint;
    SingleTiuchView singleTouchView;
    ImageButton currentImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        singleTouchView =(SingleTiuchView)findViewById(R.id.singleTouchView);
        LinearLayout paintLayout = (LinearLayout)findViewById(R.id.llPaint);
        currentImageButton = (ImageButton)paintLayout.getChildAt(0);
    }
    public void Clicked(View view){
        if(view != currentPaint){
            String color = view.getTag().toString();
            singleTouchView.SetColor(color);
            currentPaint = (ImageButton)view;
        }
    }
}
