package com.acme.home_automation_app;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class LightsAndFans extends Activity {
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lights_and_fans );
        
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
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch(item.getItemId()) {
    		case R.id.action_switch:
    			Intent myIntent = new Intent(this, WrongLayoutActivity.class);    	
    			this.startActivity(myIntent);
    			return true;
    		
    	}
    	return super.onContextItemSelected(item);
    }
}
