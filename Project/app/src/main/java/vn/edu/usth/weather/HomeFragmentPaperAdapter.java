package vn.edu.usth.weather;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;

public class HomeFragmentPaperAdapter extends FragmentPagerAdapter {
    private final String[] titles = new String[]{"Hanoi", "Paris", "New York"};

    public HomeFragmentPaperAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Fragment getItem(int page) {
        switch (page) {
            case 0:
            case 1:
            case 2:
                return new WeatherAndForecastFragment();
        }
        return null;
    }


    @Override
    public CharSequence getPageTitle(int page) {
        return titles[page];
    }
}
