package com.baskara.sunshine.app;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by Goronald on 4/3/2016.
 */
public class ForecastAdapter extends ArrayAdapter<String> {

    public ForecastAdapter(Context context, int resource, List<String>fakeData) {
        super(context, resource, fakeData);
    }
}
