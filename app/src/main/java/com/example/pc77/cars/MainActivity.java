package com.example.pc77.cars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioButton rb;
    RadioGroup rg;
    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup)findViewById(R.id.radioGroup2);
        t=(TextView)findViewById(R.id.textView2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                int selectedId=rg.getCheckedRadioButtonId();
                rb=(RadioButton)findViewById(selectedId);
                t.setText(rb.getText());
            }
        });

    }
}
