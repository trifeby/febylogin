package com.feby.febylogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignInActivity extends AppCompatActivity {
    private static final String TAG = "SignInActivity";
    private EditText txt_email, txt_password;
    private Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        txt_email = findViewById(R.id.txt_email);
        txt_password = findViewById(R.id.txt_password);

        Log.i(TAG, "OnCreate");
    }

    private boolean adaError(){
        boolean ada = false;
        if(TextUtils.isEmpty(txt_email.getText().toString())){
            txt_email.setError("harus di isi!");
        }

        if(TextUtils.isEmpty(txt_password.getText().toString())){
            txt_password.setError("harus di isi!");
        }
        return ada;

    }

    public void login(View v){
        if(!adaError()){
            Toast.makeText(
                    getApplicationContext(),
                    "Button daftar clicked",
                    Toast.LENGTH_SHORT).show();

            Bundle bundle = new Bundle();
            bundle.putString("email", txt_email.getText().toString());

            Intent i = new Intent(this, DashboardActivity.class);
            /*i.putExtras(bundle);*/
            startActivity(i);
        }
    }
}