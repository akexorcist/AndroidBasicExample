package com.example.simplewidget;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	// Declare TextView and Button
	TextView tv;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial TextView
    	tv = (TextView)findViewById(R.id.tv);
    	
    	// Set new text on TextView
        tv.setText("Hello");

        // Initial Button
        Button b1 = (Button)findViewById(R.id.b1);

        // Create green color and store in integer variable
        int color = Color.RED;
        
        // Set new color on text of button 
        b1.setTextColor(color);
       
        // Create listener for OnClickListener
        OnClickListener listener = new OnClickListener() {
        	
        	// If user click on target
			public void onClick(View v) {
				
				// Set new text on TextView if user click on target
				tv.setText("Message");
			}
		};
		
		// Set "listener" to Button for OnClickListener
		b1.setOnClickListener(listener);		
		
    }
}
