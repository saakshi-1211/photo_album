package com.example.photoalbum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    int[] images={R.drawable.ichi,R.drawable.ni,R.drawable.san,R.drawable.yon,R.drawable.go};
    ImageView photoFrame;
    int currImage=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        photoFrame=findViewById(R.id.photoFrame);
        photoFrame.setImageResource(images[currImage]);
    }

    public void nextImg(View view){
        currImage++;

        if(currImage>=images.length){
            currImage=0;
        }
        photoFrame.setImageResource(images[currImage]);
    }
    public void prevImg(View view){
        currImage--;

        if(currImage<0){
            currImage=images.length-1;
        }
        photoFrame.setImageResource(images[currImage]);
    }
}