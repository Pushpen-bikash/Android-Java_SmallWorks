package com.biswa;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Day_FinderActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
       final EditText e1 = (EditText) findViewById(R.id.editText1);
       final EditText e2 = (EditText) findViewById(R.id.editText2);
       Button b1 = (Button) findViewById(R.id.button1);
       
       b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			try {
				  String input_date=e1.getText().toString();
		      	  SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
		      	  java.util.Date dt1=  format1.parse(input_date);
		      	  DateFormat format2=new SimpleDateFormat("EEEE"); 
		      	  String finalDay=format2.format(dt1);
		      	  e2.setText(finalDay);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	});
    }
}