package com.example.amco1.week4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity  implements View.OnClickListener{

    EditText editName;
    EditText editAge;
    Button btnSummit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        init();
    }
    public void init(){
        editName=(EditText)findViewById(R.id.edit_name);
        editName.setOnClickListener(this);
        editAge=(EditText)findViewById(R.id.edit_age);
        editAge.setOnClickListener(this);
        btnSummit=(Button)findViewById(R.id.btn_summit);
        btnSummit.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){

            case R.id.btn_summit:
                Intent intent=new Intent(FirstActivity.this,SecondActivity.class); //인텐트 객체 생성
                intent.putExtra("Name",editName.getText().toString());
                intent.putExtra("Age", editAge.getText().toString());

               // startActivity(intent);
             startActivityForResult(intent,1001);
                break;





        }


    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1001:
                if(resultCode == RESULT_OK){
                    Toast.makeText(FirstActivity.this,data.getStringExtra("send"),Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
