/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);



        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        earthquakes = QueryUtils.extractEarthquakes();

       /* earthquakes.add(new Earthquake("7.8", "Aleska", "Apr 16, 2017"));
        earthquakes.add(new Earthquake("4.9", "Washington", "Jun 23, 2013"));
        earthquakes.add(new Earthquake("2.9", "London", "Aug 19, 2014"));
        earthquakes.add(new Earthquake("6.2", "Paris", "Feb 3, 2012"));
        earthquakes.add(new Earthquake("3.8", "Tokyo", "oct 11, 2014"));
        earthquakes.add(new Earthquake("5.3", "Mexico", "Dec 20, 2015"));

        */

        ListView listView = (ListView) findViewById(R.id.list);

        EarthquakeAdapter adapter = new EarthquakeAdapter(this,  earthquakes);

        listView.setAdapter(adapter);

    }
}
