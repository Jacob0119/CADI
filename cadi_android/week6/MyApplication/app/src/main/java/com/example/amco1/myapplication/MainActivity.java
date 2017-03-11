package com.example.amco1.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        students=new ArrayList<Student>();
        students.add(new Student("가나다",122));
        students.add(new Student("배고프",105));
        students.add(new Student("삼겹살",140));
        students.add(new Student("소고기",130));
        students.add(new Student("떡볶이",101));



        listview=(ListView)findViewById(R.id.list);

        listview.setAdapter(new MyAdapter(students,this));


    }
}
