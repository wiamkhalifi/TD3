package com.example.td3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton= (Button) findViewById(R.id.roolBTN);
        final TextView textView=(TextView) findViewById(R.id.textView);
        final TextView textView1=(TextView) findViewById(R.id.textView2);
        final EditText editText=(EditText) findViewById(R.id.nmbFace);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString()!=null){
                    int nbFace=Integer.parseInt(editText.getText().toString());
                    if (nbFace >= 1 && nbFace <= 6) {
                        Toast toast=Toast.makeText(MainActivity.this,"Dé lancé",Toast.LENGTH_LONG);
                        toast.show();
                        Random random=new Random();
                        String number=Integer.toString(random.nextInt(nbFace)+1);
                        Random random1=new Random();
                        String number1=Integer.toString(random1.nextInt(nbFace)+1);
                        textView.setText(number);
                        textView1.setText(number1);
                        editText.setText("");
                    }else{
                        Toast toast=Toast.makeText(MainActivity.this,"nombre incorrect",Toast.LENGTH_LONG);
                        toast.show();
                        editText.setText("");
                    }
                }
                else{
                    Toast toast=Toast.makeText(MainActivity.this,"choose a number",Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
