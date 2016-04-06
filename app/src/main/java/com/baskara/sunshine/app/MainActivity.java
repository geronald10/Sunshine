package com.baskara.sunshine.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String[] dataDummy = {
        "Senin - Badai",
        "Selasa - Cerah",
        "Rabu - Berawan",
        "Kamis - Cerah",
        "Jumat - Hujan",
        "Sabtu - Cerah",
        "Minggu - Cerah"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Seperti Kelas pengganti JFrame Layout
        ForecastFragment forecastFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, forecastFragment)
                .commit();
    }
}
