package com.baskara.sunshine.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Goronald on 4/3/2016.
 */
public class ForecastFragment extends android.support.v4.app.Fragment {
    private String[] fakeData = {
            "Senin - Badai",
            "Selasa - Cerah",
            "Rabu - Berawan",
            "Kamis - Cerah",
            "Jumat - Hujan",
            "Sabtu - Cerah",
            "Minggu - Cerah"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        List<String> weekForecast = new ArrayList<>(Arrays.asList(fakeData));
        ForecastAdapter forecastAdapter = new ForecastAdapter(getActivity(), R.layout.list_item_forecast , weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(forecastAdapter);

        return rootView;
    }
}
