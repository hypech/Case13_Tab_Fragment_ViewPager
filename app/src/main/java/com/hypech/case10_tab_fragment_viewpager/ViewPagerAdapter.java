package com.hypech.case10_tab_fragment_viewpager;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    Context mContext;

    public ViewPagerAdapter(@NonNull FragmentManager fm, Context context)    {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)    {
        Fragment fragment = null;
        if (position == 0)
            fragment = new BlankFragment1();
        else if (position == 1)
            fragment = new BlankFragment2();
        else if (position == 2)
            fragment = new BlankFragment3();
        return fragment;
    }

    @Override
    public int getCount()
    {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position)    {
        String title = null;
        if (position == 0)
            title = mContext.getResources().getString(R.string.chart_tab1);
        else if (position == 1)
            title = mContext.getResources().getString(R.string.chart_tab2);
        else if (position == 2)
            title = mContext.getResources().getString(R.string.chart_tab3);
        return title;

    }
}
