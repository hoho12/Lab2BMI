package my.edu.tarc.lab2bmi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String TAG_MESSAGE = "my.edu.tarc.lab2BMI.MESSAGE";
    private EditText editTextWMessage;
    private EditText editTextHMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextWMessage = findViewById(R.id.textViewWMessage);
        editTextHMessage = findViewById(R.id.textViewHMessage);
    }

    public void calculateBMI(View view){
        double stringWMessage;
        double stringHMessage;
        double bmi;
        if(TextUtils.isEmpty(editTextWMessage.getText())){
            editTextWMessage.setError("Please enter your weight!");
            return;
        }
        if(TextUtils.isEmpty(editTextHMessage.getText())){
            editTextHMessage.setError("Please enter your height!");
            return;
        }
        stringWMessage = Integer.parseInt(editTextWMessage.getText().toString());
        stringHMessage = Integer.parseInt(editTextHMessage.getText().toString());

        //This - mainActivity
        Intent intent = new Intent(this,SecondActivity.class);
        bmi = stringWMessage/((stringHMessage/100)*(stringHMessage/100));
        intent.putExtra(TAG_MESSAGE,bmi);
        startActivity(intent);
    }
}
