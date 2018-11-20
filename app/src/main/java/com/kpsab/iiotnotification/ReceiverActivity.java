package com.kpsab.iiotnotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        TextView title = (TextView) findViewById(R.id.txtTitle);
        TextView message = (TextView) findViewById(R.id.txtBody);

        title.setText("Alert : The Unit In Berlin Is Down");


        message.setText("Please Contact Oliver Schwarz");
    }
}
