package sg.edu.rp.c346.id21000243.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
    TextView tvAnswer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvAnswer2 = findViewById(R.id.textView2);
        Intent intentRecieved = getIntent();
        char character = intentRecieved.getCharExtra("character", 'a');
        tvAnswer2.setText("Character value received is: " + character);
    }
}