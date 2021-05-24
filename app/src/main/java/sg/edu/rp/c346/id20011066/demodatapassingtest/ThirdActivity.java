package sg.edu.rp.c346.id20011066.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        tvAnswer = findViewById(R.id.textView3);

        Intent i = getIntent();
        char value1 = i.getCharExtra("value", 'z');
        tvAnswer.setText("Char value received is: " + value1);
    }
}