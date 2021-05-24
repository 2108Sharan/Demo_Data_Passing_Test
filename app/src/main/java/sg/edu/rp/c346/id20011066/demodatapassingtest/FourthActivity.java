package sg.edu.rp.c346.id20011066.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tvAnswer = findViewById(R.id.textView4);

        Intent i = getIntent();
        double value2 = i.getDoubleExtra("value", 0.0);
        tvAnswer.setText("Double value received is: " + value2);

    }
}