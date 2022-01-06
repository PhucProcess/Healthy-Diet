package com.example.healthyfitness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    EditText edt1, edt2, edt3;
    ConnectDataBase dbHelper;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edt1 = findViewById(R.id.reg_username);
        edt2 = findViewById(R.id.reg_email);
        edt3 = findViewById(R.id.reg_pass);
        btn1 = findViewById(R.id.reg_btn);
        btn2 = findViewById(R.id.reg_login_btn);
        dbHelper = new ConnectDataBase(this);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sukienLuuThongTin();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (RegisterActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        }

    public void sukienLuuThongTin(){
        String username = edt1.getText().toString();
        String email = edt2.getText().toString();
        String password = edt3.getText().toString();

        if(username.equals("") || password.equals("")){
            Toast.makeText(RegisterActivity.this, "Please fill information", Toast.LENGTH_SHORT).show();
        }
        else{
            Boolean kiemtraTaiKhoan = dbHelper.CheckAccount(username, password);
            if(kiemtraTaiKhoan == true){
                Toast.makeText(RegisterActivity.this, "Already have an account", Toast.LENGTH_SHORT).show();
            }
            else{
                Boolean luuThongTin = dbHelper.AddUser(username, email ,password);
                if(luuThongTin){
                    Toast.makeText(RegisterActivity.this, "Create account successful", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(RegisterActivity.this, "Create account fail", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}