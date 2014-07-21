package com.example.multiactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	// Declare Button
	Button btnNext;

	// Declare integer variable with 200
    int x = 200;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial Button
        btnNext = (Button)findViewById(R.id.btnNext);
        
        // Set listener to Button and implement to "this" activity 
        btnNext.setOnClickListener(this);
       
    }

    // When user click on some object that has declare OnClickListener
	public void onClick(View v) {
		
		// Get object id that was clicked
		int id = v.getId();
		
		// If btnKM was clicked
		if(id == R.id.btnNext) {
			
			// Create intent for open new activity 
			// and set target to SecondActivity
			Intent i = new Intent(MainActivity.this, SecondActivity.class);
			
			// Send x variable to SecondActivity with keyword name "INT_X"  
			i.putExtra("INT_X", x);
			
			// Open new activity by depending on intent
			startActivity(i); 
		} 
	}
}
