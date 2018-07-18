package com.example.user.myapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.myapplication.R;
import com.example.user.myapplication.model.LoginModel;
import com.example.user.myapplication.presenter.LoginPresenter;
import com.example.user.myapplication.view.LoginView;
import com.example.user.myapplication.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView{
    EditText username, password;
    Button button;
    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.login);
        loginPresenter=new LoginModel(this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                loginPresenter.PerformLogin(user,pass);

            }
        });

    }

    @Override
    public void LoginValidation() {
        Toast.makeText(this,"Input correctly",Toast.LENGTH_SHORT).show();


    }

    @Override
    public void LoginSuccess() {
        Toast.makeText(this,"Right",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void LoginError() {
        Toast.makeText(this,"Wrong",Toast.LENGTH_SHORT).show();
    }
}
