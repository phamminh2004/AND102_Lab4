package com.minhpt.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        FragmentManager fr = getSupportFragmentManager();
        Fragment3 fr3 = new Fragment3();
        fr.beginTransaction().add(R.id.container_1, fr3).commit();
        Fragment4 fr4 = new Fragment4();
        fr.beginTransaction().add(R.id.container_2, fr4).commit();
    }
}