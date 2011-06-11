package com.example.tabs;

import android.os.Bundle;

public class AlbumsActivity extends MainMenuActivity {	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		        
        new AsyncTasksWrapper(this).getUrl();
	}
	
}
