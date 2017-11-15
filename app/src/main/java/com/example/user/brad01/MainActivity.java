package com.example.user.brad01;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fmgr;
    private FragmentTransaction tran;
    private Page1Fragment f1;
    private Page2Fragment f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        f1 = new Page1Fragment();
        f2 = new Page2Fragment();

        fmgr = getSupportFragmentManager();

        tran = fmgr.beginTransaction();
        tran.add(R.id.container, f1);
        tran.commit();

    }

    public void test1(View view){
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, f1);
        tran.commit();
    }
    public void test2(View view){
        tran = fmgr.beginTransaction();
        tran.replace(R.id.container, f2);
        tran.commit();
    }
    public void test3(View view){

    }
    public void test4(View view){

    }

}
