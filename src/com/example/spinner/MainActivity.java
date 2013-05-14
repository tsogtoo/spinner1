package com.example.spinner;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity implements OnItemSelectedListener {
    /** Called when the activity is first created. */
	private TextView userSelection;
	
	private static final String[] items={"Android","Bluetooth","Chrome","Docs","Email",
        "Facebook","Google","Hungary","Iphone","Korea","Machintosh",
        "Nokia","Orkut","Picasa","Singapore","Turkey","Windows","Youtube"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        userSelection=(TextView)findViewById(R.id.user_selection);
        
        Spinner my_spin=(Spinner)findViewById(R.id.my_spinner);
        
        my_spin.setOnItemSelectedListener(this);
        
        ArrayAdapter aa=new ArrayAdapter(this, android.R.layout.simple_spinner_item,items);
        
        aa.setDropDownViewResource(android.R.layout.simple_spinner_item);
        
        my_spin.setAdapter(aa);
    }
	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int pos,
			long arg3) {
		userSelection.setText(items[pos]);
	}
	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		userSelection.setText("");
	}
}

