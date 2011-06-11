package com.example.tabs;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainMenuActivity extends Activity {
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.main_menu, menu);
	    return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.refresh:
	    	Toast.makeText(MainMenuActivity.this, "Refreshing...", Toast.LENGTH_SHORT).show();
	        
	    	return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}

}
