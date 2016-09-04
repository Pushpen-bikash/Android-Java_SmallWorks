package com.com.bd;

import java.util.Scanner;

import android.app.Activity;
import android.graphics.Canvas.EdgeType;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {
   
static int find(String str){
		
		int sum=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)-64>0 && str.charAt(i)-64<27){
				sum=sum+str.charAt(i)-64;
			}
		}
		int result=0;
		result=digit_sum(sum);
		return result;
	}

static int digit_sum(int temp) {
	
	 int sum=temp;
	 int result=0;
	 
	 while(sum>0){
		 result=result+sum%10;
		 sum=sum/10;
	 }
	 
	 if(result>9){
		 result=digit_sum(result);
	 }
	return result;
}
	
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b= (Button) findViewById(R.id.button1);
        
        b.setOnClickListener(new OnClickListener() {
			
		
			public void onClick(View v) {
				
				EditText et1=(EditText) findViewById(R.id.editText1);
				EditText et2=(EditText) findViewById(R.id.editText2);
				EditText et3=(EditText) findViewById(R.id.editText3);
				
				String x=et1.getText().toString();
				String y=et2.getText().toString();
				
				x=x.toUpperCase();
				y=y.toUpperCase();
				
				int X=find(x);
				int Y=find(y);
				
				//StringBuilder str=new StringBuilder("");
				
				if(X>Y){
					int temp=(Y*100)/X;
					//System.out.printf("%.2f %c\n",temp,'%');
					//str.append("%.2f %c\n",temp,'%');
					et3.setText(temp+" %");
			}
				else{
					int temp=(X*100)/Y;
					//System.out.printf("%.2f %c\n",temp,'%');
					//str.append("%.2f %c\n",temp,'%');
					et3.setText(temp+" %");
				}
				
				
			}
		});
        
    }
}