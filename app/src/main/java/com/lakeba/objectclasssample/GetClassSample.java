package com.lakeba.objectclasssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by lakeba01 on 6/2/17.
 */

public class GetClassSample extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_class_sample_layout);
        GetClassSample g = new GetClassSample();
        Student student = new Student(00,"abc",0);
        TextView getclassname = (TextView)findViewById(R.id.getclassname);
        getclassname.setText(student.getClass()+"");
        Log.e("GetClassMethod_tostring", g.toString()+"");
        Log.e("GetClassMethod", "onCreate: "+g.getClass());

    }


}
