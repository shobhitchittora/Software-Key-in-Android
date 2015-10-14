package com.example.software_keys;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		
		startService(new Intent(MainActivity.this,OverdrawService.class));
		Toast.makeText(getBaseContext(), "Service started.", Toast.LENGTH_LONG).show();
		finish();
		/*
		Button start=new Button(this);
		start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startService(new Intent(MainActivity.this,test.class));
			}
		});
		
		Button stop = new Button(this);
		stop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				stopService(new Intent(MainActivity.this,test.class));
			}
		});
		*/
	}
	@Override
	protected void onResume() {
		
			startService(new Intent(MainActivity.this, OverdrawService.class));
		
		super.onResume();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
}
