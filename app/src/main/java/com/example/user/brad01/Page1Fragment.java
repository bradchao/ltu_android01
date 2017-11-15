package com.example.user.brad01;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashSet;


public class Page1Fragment extends Fragment {
    private View mainView;
    private View b1;
    private TextView tv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (mainView == null) {
            mainView = inflater.inflate(R.layout.fragment_page1, container, false);
            tv1 = (TextView)mainView.findViewById(R.id.p1tv1);
            b1 = mainView.findViewById(R.id.p1b1);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showLottery();
                }
            });

        }

        return mainView;
    }

    private void showLottery(){
        HashSet<Integer> set = new HashSet<>();
        while (set.size()<6){
            set.add((int)(Math.random()*49+1));
        }

        tv1.setText(set.toString());
    }




}
