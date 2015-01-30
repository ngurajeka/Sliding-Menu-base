package com.bugisdev.slidingmenubase;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class Splash extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_splash);
		
		new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent main = new Intent(Splash.this, SlidingMenuBase.class);
                Splash.this.startActivity(main);
                Splash.this.finish();
            }
        }, 3000);
	}
}
