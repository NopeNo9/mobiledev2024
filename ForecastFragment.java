package vn.edu.usth.weather.mobiledev2024;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import vn.edu.usth.weather.R;

public class ForecastFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public ForecastFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            // TODO: Rename and change types of parameters
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        TextView day = new TextView(getContext());
        day.setText("Thursday");

        ImageView img = new ImageView(getContext());
        img.setImageResource(R.drawable.sunny);
        img.setImageResource(R.drawable.cloudy);
        img.setImageResource(R.drawable.rain);
        img.setImageResource(R.drawable.thunder);
        img.setImageResource(R.drawable.snow);

        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_forecast, container, false);
        LinearLayout view = null;
        view.setBackgroundColor(0x20FF0000);
        view = new LinearLayout(getContext());
        view.setOrientation(LinearLayout.VERTICAL);
        view.addView(day);
        view.addView(img);
        view.addView(v);
        return v;
    }
}