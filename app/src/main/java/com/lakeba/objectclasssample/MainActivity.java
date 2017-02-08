package com.lakeba.objectclasssample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button clone,hashcode,equals,notify,notifyall,wait,tostring,finalize;
    Intent intent;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clone = (Button)findViewById(R.id.clone);
        hashcode = (Button)findViewById(R.id.hashcode);
        equals = (Button)findViewById(R.id.equals);
        notify = (Button)findViewById(R.id.notify);
        notifyall = (Button)findViewById(R.id.notifyall);
        wait = (Button)findViewById(R.id.wait);
        tostring = (Button)findViewById(R.id.tostring);
        finalize = (Button)findViewById(R.id.get_class);


        clone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this,ObjectClassClone.class);
                startActivity(intent);
            }
        });
    }
}
