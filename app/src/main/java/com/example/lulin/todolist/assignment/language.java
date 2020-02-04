package com.example.lulin.todolist.assignment;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;

import com.bumptech.glide.load.engine.Resource;
import com.example.lulin.todolist.R;

import java.util.Locale;

public class language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        Contants.activityList.add(this);
        switchLanguage(Contants.language);
    }
    public void onclick(View view){
        startActivity(new Intent(this,language2.class));
    }
    protected void switchLanguage(String language){
        Resources resources = getResources();
        Configuration config = resources.getConfiguration();
        DisplayMetrics dm = resources.getDisplayMetrics();
        switch (language){
            case"cn":
                config.locale = Locale.CHINESE;
                resources.updateConfiguration(config, dm);
                break;
            case"en":
                config.locale = Locale.ENGLISH;
                resources.updateConfiguration(config, dm);
             default:
                 config.locale = Locale.US;
                 resources.updateConfiguration(config, dm);
                 break;
        }
    }
}
