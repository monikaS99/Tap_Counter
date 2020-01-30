package edu.miracosta.cs134.smonika.tapcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button tapCounterButton;
    private Button reset;
    private TextView countTextView;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tapCounterButton = findViewById(R.id.tapButton);
        countTextView = findViewById(R.id.countText);
        reset = findViewById(R.id.resetButton);
    }

    public void incrementCount(View v)
    {
        counter++;
        countTextView.setText(String.valueOf(counter));
        //countTextView.setText(Integer.toString(counter));
    }

    public void resetCount(View v)
    {
        counter = 0;
        countTextView.setText(String.valueOf(counter));
    }
}
