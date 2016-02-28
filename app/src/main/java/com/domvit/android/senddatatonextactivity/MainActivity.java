package com.domvit.android.senddatatonextactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by HiMan on 27.02.2016.
 */
public class MainActivity extends Activity {

    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
    }

    public void sendData(View view){
        Intent intent = new Intent(getApplicationContext(),LastActivity.class);
        intent.putExtra("login",login.getText().toString());
        intent.putExtra("password",password.getText().toString());
        startActivity(intent);
    }
}
