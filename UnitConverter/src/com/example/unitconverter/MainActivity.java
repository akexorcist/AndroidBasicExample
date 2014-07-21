package com.example.unitconverter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

// Implement OnClickListener class into this activity
public class MainActivity extends Activity implements OnClickListener {
	
	// Declare TextView, Button and EditText
	TextView tvResult;
	Button btnKM;
	Button btnFeet;
	Button btnInch;
	EditText edtM;
	
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initial TextView, Button and EditText
        tvResult = (TextView)findViewById(R.id.tvResult);
        edtM = (EditText)findViewById(R.id.edtM);
        btnKM = (Button)findViewById(R.id.btnKM);
        btnFeet = (Button)findViewById(R.id.btnFeet);
        btnInch = (Button)findViewById(R.id.btnInch);
        
        // Set listener to Button and implement to "this" activity 
        btnKM.setOnClickListener(this);
        btnInch.setOnClickListener(this);
        btnFeet.setOnClickListener(this);
    }
    
    // When user click on some object that has declare OnClickListener
	public void onClick(View v) {
		
		// Get text from EditText and convert to string
		String str = edtM.getText().toString();

		// Get length of text from string
		int size = str.length();
		
		// If string is existed (length is more than 0)
		if(size > 0) {
			// Convert string to Float
			float m = Float.parseFloat(str);
			
			// Get object id that was clicked
			int id = v.getId();
			
			if(id == R.id.btnKM){
				// If btnKM was clicked
				
				// Convert unit from meter to kilometer 
				float result = m / 1000f;
				
				// Convert result float to String
				String strResult = result + " km";
				
				// Set result string to TextView
				tvResult.setText(strResult);
				
			} else if(id == R.id.btnInch){
				// If btnInch was clicked
				
				// Convert unit from meter to inch
				float result = m * 39.3701f;
				
				// Convert result float to String
				String strResult = result + " inch";
				
				// Set result string to TextView
				tvResult.setText(strResult);
				
			}else if(id == R.id.btnFeet){
				// If btnFeet was clicked
				
				// Convert unit from meter to feet
				float result = m * 3.28084f;
				
				// Convert result float to String
				String strResult = result + " feet";

				// Set result string to TextView
				tvResult.setText(strResult);
				
			} 
		} else {
			// If string length is 0
			
			// Show message on screen
			Toast.makeText(MainActivity.this
					, "Please Insert number"
					, Toast.LENGTH_SHORT).show();
		}
				
	}
	
}
