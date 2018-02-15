package com.example.matt.currencyconv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick (View view)
    {
        TextView textView = (TextView) findViewById(R.id.currencyTextView);

        Double doubleText = Double.parseDouble(textView.getText().toString());

        Double euroAmount = doubleText * .86;

        Toast.makeText(this, "€" + String.format("%.2f", euroAmount), Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
