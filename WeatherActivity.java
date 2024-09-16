package vn.edu.usth.weather.mobiledev2024;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import vn.edu.usth.weather.R;


public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather2);
        Log.i("onCreate", "=== APP CREATED ===");

        ViewPager viewPager = findViewById(R.id.weather_pager);
        HomeFragmentPaperAdapter adapter = new HomeFragmentPaperAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

//        ForecastFragment firstFragment = new ForecastFragment();
//        WeatherFragment secondFragment = new WeatherFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.main2, secondFragment).commit();
//        getSupportFragmentManager().beginTransaction().add(R.id.main1, firstFragment).commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("onStart ", "=== APP STARTED ===");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("onResume ", "=== APP CREATED ===");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i("onPause", "=== APP CREATED ===");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i("onStop ", "=== APP CREATED ===");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("onDestroy", "=== APP CREATED ===");
    }
}