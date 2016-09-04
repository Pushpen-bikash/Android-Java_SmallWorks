package com.com.bd;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button callbt=(Button) findViewById(R.id.button1);
        
        callbt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				Intent callint=new Intent(Intent.ACTION_CALL);
				callint.setData(Uri.parse("tel:+8801738060455"));
				startActivity(callint);
			}
		});
    }
}