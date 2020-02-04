package com.example.lulin.todolist.assignment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.lulin.todolist.Activity.MainActivity;
import com.example.lulin.todolist.R;

import java.util.Locale;

public class language2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language2);

        Contants.activityList.add(this);

        final RadioGroup radio = (RadioGroup) findViewById(R.id.radio);
        final RadioButton btn = (RadioButton) findViewById(R.id.radio_en);
        final RadioButton btn2 = (RadioButton) findViewById(R.id.radio_cn);

        if (Contants.language.equals("cn")) {
            btn2.setChecked(true);
        } else {
            btn.setChecked(true);
        }

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radio_cn) {
                    Contants.language = "cn";
                    btn.setChecked(false);
                } else {
                    btn2.setChecked(false);
                    Contants.language = "en";

                }
                ;
            }
        });
    }
    public void onClick(View view){
        Locale locale =new Locale(Contants.language);
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        Resources resources = getResources();
        resources.updateConfiguration(config,resources.getDisplayMetrics());

        for (Activity activity: Contants.activityList){
            activity.finish();
        }
        startActivity(new Intent(this, MainActivity.class));


    }
}
