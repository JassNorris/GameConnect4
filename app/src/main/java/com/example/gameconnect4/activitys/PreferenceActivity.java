package com.example.gameconnect4.activitys;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gameconnect4.R;
import com.example.gameconnect4.fragments.PreferenceFragment;

public class PreferenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        if(findViewById(R.id.prefFrag)!= null){
            if (savedInstanceState != null){
                return;
            }
            getFragmentManager().beginTransaction().add(R.id.prefFrag, new PreferenceFragment()).commit();
        }
    }

}
