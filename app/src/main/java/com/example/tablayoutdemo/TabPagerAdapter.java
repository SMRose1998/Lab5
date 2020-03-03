package com.example.tablayoutdemo;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.example.tablayoutdemo.TabFrag2;
import com.example.tablayoutdemo.TabFrag3;
import com.example.tablayoutdemo.TabFrag4;

public class TabPagerAdapter extends FragmentPagerAdapter {

    int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0: return new TabFrag1();
            case 1: return new TabFrag2();
            case 2: return new TabFrag3();
            case 3: return new TabFrag4();
            default: return null;
        }
    }

    @Override
    public int getCount() { return tabCount; }

}
