package com.teamjcf.sterling;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.teamjcf.sterling.Verification.PassVerificationActivity;

public class AccVerification extends AppCompatActivity {

    TextView recieversName, recieversAcc ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification2);


        recieversName = findViewById(R.id.receiverName);
        recieversAcc = findViewById(R.id.receiverAccno);

        Button nextbtn = findViewById(R.id.nextbtn);

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PassVerificationActivity.class);
                startActivity(intent);
            }
        });

    }
}
