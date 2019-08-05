package com.example.user.weatherreport;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout= (TabLayout) findViewById(R.id.tabLayout);
        viewPager= (ViewPager) findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("CURRENT"));

        tabLayout.addTab(tabLayout.newTab().setText("7 DAYS FORECAST"));
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#525e5e"));
        tabLayout.setTabTextColors(Color.parseColor("#727272"),Color.parseColor("#ffffff"));



    }
}
