package com.minhpt.lab4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {
    Button btn_fr1, btn_fr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabLayout tabs = findViewById(R.id.tabs);
        ViewPager2 pagers = findViewById(R.id.pagers);
        Adapter adapter = new Adapter(this);
        pagers.setAdapter(adapter);
        new TabLayoutMediator(tabs, pagers, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setText("TABLAYOUT THỨ " + (position + 1));
            }
        }).attach();


//        btn_fr1 = findViewById(R.id.btn_fr1);
//        btn_fr2 = findViewById(R.id.btn_fr2);
//        FragmentManager fr = getSupportFragmentManager();
//        btn_fr1.setOnClickListener(v -> {
//            Fragment1 fr1 = new Fragment1();
//            fr.beginTransaction().replace(R.id.container, fr1).commit();
//        });
//        btn_fr2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Fragment2 fr2 = new Fragment2();
//                fr.beginTransaction().replace(R.id.container, fr2).commit();
//            }
//        });
    }
}