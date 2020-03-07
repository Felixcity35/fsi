package com.teamjcf.sterling.Verification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.teamjcf.sterling.MainActivity;
import com.teamjcf.sterling.R;

public class PassVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pass_verification);


        EditText passwrdedt ;
        Button paswrdconfrmbtn ;

        passwrdedt = findViewById(R.id.passwrdedit);

        paswrdconfrmbtn = findViewById(R.id.passconfirmbtn);



        paswrdconfrmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
