package com.example.amco1.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by amco1 on 2017-03-11.
 */

public class MyAdapter extends BaseAdapter {


    ArrayList<Student> students;
    private Context context;

    public MyAdapter(ArrayList<Student> list,Context context)
    {
    this.students= list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {


        convertView= LayoutInflater.from(context).inflate(R.layout.my_view_layout,parent,false);

        TextView name=(TextView)convertView.findViewById(R.id.stu_name);
        TextView number=(TextView) convertView.findViewById(R.id.stu_number);
  //aaaaaaaaaaaaaaa
        final Student s=(Student)getItem(position);
        name.setText(s.getName());
        number.setText(s.getNumber()+"");

        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,s.getName(),Toast.LENGTH_LONG).show();
            }
        });
        return convertView;





    }
}
