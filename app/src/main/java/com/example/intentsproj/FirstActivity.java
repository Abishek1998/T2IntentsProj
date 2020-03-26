package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class FirstActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.intentsproj";
    EditText editText1,editText2;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence message = "Toast Successfull";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.setGravity(Gravity.BOTTOM|Gravity.CENTER_HORIZONTAL,0,0);
                toast.show();

                Intent intent = new Intent (FirstActivity.this,SecondActivity.class);
                editText1 = (EditText)findViewById(R.id.editText1);
                String message2 = editText1.getText().toString();
                intent.putExtra(EXTRA_MESSAGE,message2);

                editText2 = (EditText)findViewById(R.id.editText2);
                String message3 = editText2.getText().toString();
                intent.putExtra(EXTRA_MESSAGE,message3);
                startActivity(intent);
            }
        });
    }


}
