package com.test.apk.theme;

import java.io.BufferedReader;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {
  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/*��������*/
		setTheme(android.R.style.Theme_Holo);
		setContentView(R.layout.activity_main);
		
		
	}

	
	
}
