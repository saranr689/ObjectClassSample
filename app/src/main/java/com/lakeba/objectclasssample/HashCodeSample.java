package com.lakeba.objectclasssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by lakeba01 on 6/2/17.
 */

public class HashCodeSample extends AppCompatActivity {

    Button w_hashcode,wo_hashcode;
    private Student student,student2;
    private Teacher teacher,teacher2;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hashcodesample);
        w_hashcode = (Button)findViewById(R.id.w_hashcode);
        wo_hashcode = (Button)findViewById(R.id.wo_hashcode);

         student = new Student(101,"ram",22);
         student2 = new Student(101,"ram",22);

         teacher = new Teacher(1001,"anas",28);
         teacher2 = new Teacher(1001,"anas",28);

        wo_hashcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HashCodeSample.this, "Result: "+student.equals(student2), Toast.LENGTH_SHORT).show();
            }
        });
        w_hashcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HashCodeSample.this, "Result: "+teacher.equals(teacher2), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
