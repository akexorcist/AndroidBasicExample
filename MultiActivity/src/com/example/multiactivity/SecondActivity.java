package com.example.multiactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity implements OnClickListener {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_second);
		
		// Get intent that sent from MainActivity
		Intent i = getIntent();
		
		// Pull value by keywork name "INT_X"
		// and store in "z" variable
		int z = i.getExtras().getInt("INT_X");
		
		// Check value on "z" by print to LogCat
		Log.i("Check", "Value : " + z);
		

        // Declare and initial Button
		Button btnBack = (Button)findViewById(R.id.btnBack);
		
        // Set listener to Button and implement to "this" activity 
		btnBack.setOnClickListener(this);
	}

    // When user click on some object that has declare OnClickListener
	public void onClick(View v) {

		// Get object id that was clicked
		int id = v.getId();

		// If btnBack was clicked
		if(id == R.id.btnBack) {
			
			// Close this activity
			finish();
		}
	}
}
