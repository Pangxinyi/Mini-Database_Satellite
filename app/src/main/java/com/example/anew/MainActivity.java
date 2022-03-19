package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    TextView output;
    TextView word;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        output = findViewById(R.id.output);
        word = findViewById(R.id.word);

        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = word.getText().toString();
                String information = word.getText().toString();
                Objects d = new Objects(name,information);
                String final2 = d.getInformation();
                String final1 = d.getName();
                output.setText(final1 + final2);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();

            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, lottery.class);
        startActivity(intent);
    }
}