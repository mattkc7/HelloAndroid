package com.matthewchan.helloAndroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Date;

import com.matthewchan.helloAndroid.R; //.yamba.R;

public class HelloAndroidActivity extends Activity implements View.OnClickListener{
    Button btn;
    Button sizeBtn;
    Boolean tf = true;
    EditText editText;
    //ImageView img;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(this);
        
        sizeBtn =  (Button)findViewById(R.id.button1);
        sizeBtn.setOnClickListener(this);
        updateTime();
        
        //img = (ImageView) findViewById(R.id.icon);
        editText = (EditText) findViewById(R.id.field);
//        btn = new Button(this);
//        btn.setTextSize(30);
//        btn.setOnClickListener(this);
//        updateTime();
//        setContentView(btn);
    }
    
    public void onClick(View v){
    	if (v == btn){
    		updateTime();
    	} else {
    		changeColor(v);
    	}
    }
    
    private void updateTime(){
    	btn.setText(new Date().toString());

    }
    
    private void changeColor(View theBtn){
    	if (tf){
    		btn.setHeight(220);
    	} else {
    		btn.setHeight(150);
    	}
    	
    	tf = !tf;
    }
}