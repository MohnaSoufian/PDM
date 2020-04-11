package com.example.myfirstapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG= "prueba";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d( TAG,  "estoy en onCreate()" );   // debug
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // button en programa
        Button wordSizeBtn = (Button) findViewById(R.id.wordSizeBtn);
        wordSizeBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Log.d( TAG,  "onClick function");
                EditText editText = (EditText) findViewById(R.id.editText);
                Log.d( TAG,  editText.getText().toString());
                TextView textView= (TextView) findViewById(R.id.textView);

                int result= editText.getText().toString().length();
                Log.d(TAG,  editText.getText().toString().length()+"" );
                textView.setText(result+"");
            }
        });
    }
    // button declarativo
    public void clickOnSize2Btn(View view) {
        Log.d( TAG,  "clickOnSize2Btn function");
        EditText editText = (EditText) findViewById(R.id.editText);
        Log.d( TAG,  editText.getText().toString() );
        TextView textView= (TextView) findViewById(R.id.textView);

        int result= editText.getText().toString().length();
        Log.d(TAG ,  editText.getText().toString().length()+"" );
        textView.setText(result+"");
    }
}
