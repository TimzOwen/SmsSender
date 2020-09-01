package com.owen.smssender;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.net.URI;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //step 2. after UI XML design, we now create a function to send the sms
    public void sendMessage(View view)
    {
        //Step 3. get the sms and send over an intent
        EditText mMessageEt = findViewById(R.id.etMessage);
        String message = mMessageEt.getText().toString();

        //step 5. declare the destination using URI
        Uri destination = Uri.parse("smsto:5556");

        //Step 4.
        //create an Implicit intent and specify the destination
        Intent smsIntent = new Intent(Intent.ACTION_SEND,destination);
        smsIntent.putExtra("sms_field",message);
        startActivity(smsIntent);

        //final step:
        //create two emulator and test the sms .CONGRATULATIONS !!!!!
    }
}