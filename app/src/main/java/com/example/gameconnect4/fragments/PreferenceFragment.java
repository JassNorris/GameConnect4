package com.example.gameconnect4.fragments;

import android.os.Bundle;

import com.example.gameconnect4.R;

public class PreferenceFragment extends android.preference.PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }
}
