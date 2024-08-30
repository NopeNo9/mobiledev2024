package vn.edu.usth.weather.mobiledev2024;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import vn.edu.usth.weather.R;


public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather2);
        Log.i(TAG, "=== APP CREATED ===");
        ForecastFragment firstFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "=== APP CREATED ===");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "=== APP CREATED ===");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "=== APP CREATED ===");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "=== APP CREATED ===");
    }
}