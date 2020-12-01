package com.boss.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Declaring Widgets
    EditText editText;
    TextView textView,textView2,textView4,Pounds;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instantiating Widgets
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        Pounds = findViewById(R.id.Pounds);
        editText = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.button);

        // Click Event For Convert Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Calling ConvertfromKilotoPound
                ConvertfromKilotoPound();
            }
        });
    }

    private void ConvertfromKilotoPound() {
        // This method will convert the values
        try {
            String ValueinKilo = editText.getText().toString();
            double kilo = Double.parseDouble(ValueinKilo);
            double pounds = kilo * 2.205;
            Pounds.setText("" + pounds);
        }
        catch (Exception e){
            System.out.println("enter a number ");
        }

    }

    private void func ()
    {

    };
}