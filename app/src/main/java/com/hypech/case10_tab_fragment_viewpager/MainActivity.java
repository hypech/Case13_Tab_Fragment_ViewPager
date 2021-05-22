package com.hypech.case10_tab_fragment_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the reference of ViewPager and TabLayout
        ViewPager mViewPager = findViewById(R.id.l_tab_view_pager);
        TabLayout mTabLayout = findViewById(R.id.l_tabLayout);

        // 2.inject the adapter into the viewpager.
        ViewPagerAdapter mViewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), getApplicationContext());
        mViewPager.setAdapter(mViewPagerAdapter);

        // 3. find tablayout in main layout. It is used to join TabLayout with ViewPager.
        mTabLayout.setupWithViewPager(mViewPager);
        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
            mTabLayout.getTabAt(i).setIcon(R.drawable.ic_launcher_foreground);
        }
    }
}