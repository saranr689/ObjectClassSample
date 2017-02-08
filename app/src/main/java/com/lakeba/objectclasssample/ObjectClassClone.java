package com.lakeba.objectclasssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lakeba01 on 6/2/17.
 */

public class ObjectClassClone extends AppCompatActivity  {

    Student student = new Student(186,"raj",20);
    TextView stu1_name,stu1_rollno,stu1_age,stu1_mark,stu2_name,stu2_rollno,stu2_age,stu2_mark;
    Button get_result,extracuricullar;
    private Student student2,student3;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activvity_clone_example);

        stu1_name = (TextView)findViewById(R.id.stu1_name);
        stu1_rollno = (TextView)findViewById(R.id.stu1_rollno);
        stu1_age = (TextView)findViewById(R.id.stu1_age);
        stu1_mark = (TextView)findViewById(R.id.stu1_mark);

        get_result = (Button) findViewById(R.id.get_result);
        extracuricullar = (Button) findViewById(R.id.extracuricullar);

        stu2_name = (TextView)findViewById(R.id.stu2_name);
        stu2_rollno = (TextView)findViewById(R.id.stu2_rollno);
        stu2_age = (TextView)findViewById(R.id.stu2_age);
        stu2_mark = (TextView)findViewById(R.id.stu2_mark);

        stu1_name.setText(student.name);
        stu1_rollno.setText(student.rollno+"");
        stu1_age.setText(student.age+"");
        stu1_mark.setText(student.getMark1()+"");

        try {
             student2 = (Student) student.clone();
             student3 = (Student) student.clone();
             student2.setMark1(80);
              student3.setSports("Cricket");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        get_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stu2_name.setText(student2.name);
                stu2_rollno.setText(student2.rollno+"");
                stu2_age.setText(student2.age+"");
                stu2_mark.setText(student2.getMark1()+"");
            }
        });
        extracuricullar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stu2_name.setText(student2.name);
                stu2_rollno.setText(student2.rollno+"");
                stu2_age.setText(student2.age+"");
                stu2_mark.setText(student3.getSports()+"");
            }
        });
    }
}
