package com.example.amco1.week4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

Intent intent2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent resultIntent=getIntent();

        String name=resultIntent.getStringExtra("Name");
        String age=resultIntent.getStringExtra("Age");

        Toast.makeText(this,"이름:"+name+", 나이:"+age,Toast.LENGTH_LONG).show();

        Button button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(this);

    }

    @Override
    public void onBackPressed() {

        intent2 = new Intent(SecondActivity.this, FirstActivity.class);
        intent2.putExtra("send", "잘 받았습니다.");
        setResult(RESULT_OK,intent2);
        super.onBackPressed();


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button1) {
           FrameLayout frame = (FrameLayout) findViewById(R.id.image);
            LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(LAYOUT_INFLATER_SERVICE);
            // attachToRoot . true
            //inflater.inflate(R.layout.main_image, frame, true);
            // attachToRoot . false
            View itemView = inflater.inflate(R.layout.main_image, frame, true);
            ImageView mImage = (ImageView) itemView.findViewById(R.id.mainImage);
        }
    }

}
