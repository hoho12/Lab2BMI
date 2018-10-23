package my.edu.tarc.lab2bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //define local variable
        TextView textViewMessage;
        textViewMessage = findViewById(R.id.textViewMessage);

        //Retrieve intent data
        Intent intent = getIntent();//Who called me?
        //check
        if(intent.hasExtra(MainActivity.TAG_MESSAGE)){
            Double stringMsg = intent.getDoubleExtra(MainActivity.TAG_MESSAGE,0);
            textViewMessage.setText(String.valueOf(stringMsg));
        }
    }
}
