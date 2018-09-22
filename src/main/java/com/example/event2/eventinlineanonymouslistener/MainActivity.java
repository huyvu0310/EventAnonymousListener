package com.example.event2.eventinlineanonymouslistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnKetqua= (Button) findViewById(R.id.btnTong);
        btnKetqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edita = (EditText)
                        findViewById(R.id.edtSoa);
                int a=Integer.parseInt(edita.getText()+"");
                EditText editb=(EditText) findViewById(R.id.edtSob);
                int b=Integer.parseInt(editb.getText()+"");
                TextView edtKq = (TextView) findViewById(R.id.edtKq);
                edtKq.setText((a+b) + "");
            }
        });
    }
}
