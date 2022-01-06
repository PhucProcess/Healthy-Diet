package com.example.healthyfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edt1, edt2;
    ConnectDataBase dbHelper;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt1 = findViewById(R.id.editText);
        edt2 = findViewById(R.id.editText2);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        dbHelper = new ConnectDataBase(this);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivityForResult(intent, 100);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sukienDangNhap();
            }
        });
    }
    public void sukienDangNhap() {
        String username = edt1.getText().toString();
        String password = edt2.getText().toString();

        if (username.equals("") || password.equals("")) {
            Toast.makeText(LoginActivity.this, "Please fill full information", Toast.LENGTH_SHORT).show();
        } else {
            Boolean kiemtraTaiKhoan = dbHelper.CheckAccount(username, password);
            if (kiemtraTaiKhoan == true) {
                Toast.makeText(LoginActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                Intent login = new Intent(LoginActivity.this, MainPage.class);
                startActivity(login);
            } else {
                Toast.makeText(LoginActivity.this, "Incorrect account or password", Toast.LENGTH_SHORT).show();
            }
        }
    }
}