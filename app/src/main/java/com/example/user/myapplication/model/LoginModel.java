package com.example.user.myapplication.model;

import android.text.TextUtils;

import com.example.user.myapplication.presenter.LoginPresenter;
import com.example.user.myapplication.view.LoginView;

/**
 * Created by User on 7/17/2018.
 */

public class LoginModel implements LoginPresenter {
    LoginView mloginview;
    public LoginModel(LoginView loginview) {
        mloginview=loginview;
    }

    @Override
    public void PerformLogin(String user, String pass) {
        if(TextUtils.isEmpty(user)|| TextUtils.isEmpty(pass)){
            mloginview.LoginValidation();
        }
        else if (user.equals("jony") && pass.equals("jony")) {
                mloginview.LoginSuccess();

            } else {
                mloginview.LoginError();
            }
        }

    }

