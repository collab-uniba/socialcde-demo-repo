package com.acme.home_automation_app;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TimePicker;

public class LightsAndFans extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights_and_fans);
        
        // Otteniamo il riferimento al TabHost
        TabHost tabHost = (TabHost) findViewById(R.id.myTabHost);
        tabHost.setup();               
        // Aggiungiamo il Tab associato alla prima view
        tabHost.addTab(tabHost.newTabSpec("ADJUST").setContent(R.id.tabview1).setIndicator("ADJUST"));
        // Aggiungiamo il Tab associato alla seconda view
        tabHost.addTab(tabHost.newTabSpec("SCENES").setContent(R.id.tabview2).setIndicator("SCENES"));
        // Aggiungiamo il Tab associato alla terza view
        tabHost.addTab(tabHost.newTabSpec("ZONES").setContent(R.id.tabview3).setIndicator("ZONES"));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.lights_and_fans, menu);
        return true;
    }
    
}
