package com.buaa.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Administrator on 2016/5/12.
 */
public class MyPagerAdapter extends PagerAdapter {
    private List<View> allViews;
    public MyPagerAdapter(List<View> allViews){
        this.allViews = allViews;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(allViews.get(position));
        return allViews.get(position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeViewAt(position);
    }

    @Override
    public int getCount() {
        return allViews.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
                return view ==object;
    }
}
