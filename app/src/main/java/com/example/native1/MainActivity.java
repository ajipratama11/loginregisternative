package com.example.native1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvname,tvemail, tvtelp;
    private Button btnlogout;
    private PreferenceHelper preferenceHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferenceHelper = new PreferenceHelper(this);

        tvemail = (TextView) findViewById(R.id.tvemail);
        tvname = (TextView) findViewById(R.id.tvname);
        tvtelp = (TextView) findViewById(R.id.tvtelp);
        btnlogout = (Button) findViewById(R.id.btn);

        tvname.setText("Hallo "+preferenceHelper.getName());
        tvemail.setText("Emailmu adalah : "+preferenceHelper.getEmail());
        tvtelp.setText("Ini Nomor Telponmu : "+preferenceHelper.getTelp());
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                preferenceHelper.putIsLogin(false);
                Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                MainActivity.this.finish();
                Toast.makeText(MainActivity.this, "Logout Berhasil!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    }

